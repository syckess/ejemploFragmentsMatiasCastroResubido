package com.example.ejemplofragments.model;

import com.example.ejemplofragments.BaseApplication;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class FragmentCorreo extends RealmObject {
    @PrimaryKey
    private int Id;
    private String Asunto;
    private RealmList<Correo> Correos;

    public FragmentCorreo() {}

    public FragmentCorreo(String asunto)
    {
        Id = BaseApplication.AsuntoID.incrementAndGet();
        Asunto = asunto;
        Correos = new RealmList<Correo>();
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String asunto) {
        Asunto = asunto;
    }

    public RealmList<Correo> getCorreos() {
        return Correos;
    }

    public void setCorreos(RealmList<Correo> correos) {
        Correos = correos;
    }
}
