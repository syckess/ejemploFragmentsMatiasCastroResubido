package com.example.ejemplofragments.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.ejemplofragments.Fragments.DataFragment;
import com.example.ejemplofragments.Fragments.DetailsFragment;
import com.example.ejemplofragments.R;
import com.example.ejemplofragments.model.Correo;

public class  MainActivity extends FragmentActivity implements DataFragment.DataListener {
    private boolean isMultiPanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMultiPanel();
    }

    @Override
    public void sendData(String text) {
        if(isMultiPanel)
        {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
            detailsFragment.renderText(text);
        }
        else
        {
            Intent intent = new Intent(this,DetailsActivity.class);
            intent.putExtra("text", text);
            startActivity(intent);
        }

    }

    private void setMultiPanel() {
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.detailsFragment) != null);
    }
    
}