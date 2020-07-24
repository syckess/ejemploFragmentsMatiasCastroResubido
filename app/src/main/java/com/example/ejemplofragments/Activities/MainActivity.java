package com.example.ejemplofragments.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.ejemplofragments.Fragments.DataFragment;
import com.example.ejemplofragments.Fragments.DetailsFragment;
import com.example.ejemplofragments.R;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(text);
    }
}
