package com.daggerlibrarysample.application;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 29-11-2016.
 */

@Module(injects = {AppApplication.class})
public class AppModule {

    private AppApplication appApplication;

    public AppModule(AppApplication appApplication) {
        this.appApplication = appApplication;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return appApplication;
    }
}
