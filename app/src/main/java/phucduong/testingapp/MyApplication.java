package phucduong.testingapp;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.DaggerAppCompatActivity;
import phucduong.testingapp.data.source.MetaRepository;
import phucduong.testingapp.di.DaggerAppComponent;

public class MyApplication extends DaggerApplication {
    @Inject
    MetaRepository metaRepository;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
