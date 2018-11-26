package phucduong.testingapp.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import phucduong.testingapp.activity.ListActivity;
import phucduong.testingapp.activity.SplashActivity;
import phucduong.testingapp.di.modules.ListModule;
import phucduong.testingapp.di.modules.SplashModule;

@Module
public abstract class ActivityBindingModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = ListModule.class)
    abstract ListActivity listActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = SplashModule.class)
    abstract SplashActivity splashActivity();

}
