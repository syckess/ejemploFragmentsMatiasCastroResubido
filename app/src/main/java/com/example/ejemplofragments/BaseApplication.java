package com.example.ejemplofragments;

import android.app.Application;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class BaseApplication extends Application {
    public static AtomicInteger CorreoID = new AtomicInteger();
    public static AtomicInteger AsuntoID = new AtomicInteger();

    @Override
    public void onCreate() {
        super.onCreate();
        // initialize Realm
        Realm.init(getApplicationContext());

        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
        Realm realm = Realm.getInstance(config);
        CorreoID = setAtomicId(realm, CorreoID.class);
        AsuntoID = setAtomicId(realm, AsuntoID.class);

        realm.close();
    }

    private <T extends RealmObject> AtomicInteger setAtomicId(Realm realm, Class<T> anyClass) {
        RealmResults<T> results = realm.where(anyClass).findAll();
        return (results.size() > 0) ? new AtomicInteger(results.max("Id").intValue()) : new AtomicInteger();
    }
}