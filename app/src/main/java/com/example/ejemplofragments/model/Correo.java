package com.example.ejemplofragments.model;

import com.example.ejemplofragments.BaseApplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Correo extends RealmObject {
    @PrimaryKey
    private int Id;
    private String Asunto;
    private String Emisor;
    private String Mensaje;


    public Correo () {}

    public Correo (String asunto, String emisor, String mensaje)
    {
        Id = BaseApplication.CorreoID.incrementAndGet();
        Asunto = asunto;
        Emisor = emisor;
        Mensaje = mensaje;
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

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String emisor) {
        Emisor = emisor;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

}
