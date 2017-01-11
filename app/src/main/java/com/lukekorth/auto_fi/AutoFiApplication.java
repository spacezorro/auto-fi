package com.lukekorth.auto_fi;

import android.app.Application;

import com.lukekorth.auto_fi.models.DataMigrations;
import com.lukekorth.auto_fi.utilities.DebugUtils;
import com.lukekorth.mailable_log.MailableLog;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class AutoFiApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MailableLog.init(this, BuildConfig.DEBUG, "%date{MMM dd | HH:mm:ss.SSS} %highlight(%-5level) %msg%n");
        DebugUtils.setup(this);

        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("auto-fi.realm")
                .schemaVersion(1)
                .migration(new DataMigrations())
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

        DebugUtils.setStrictMode();
    }
}
