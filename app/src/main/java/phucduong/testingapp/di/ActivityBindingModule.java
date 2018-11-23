package phucduong.testingapp.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import phucduong.testingapp.activity.ListActivity;
import phucduong.testingapp.di.modules.ListModule;

@Module
public abstract class ActivityBindingModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = ListModule.class)
    abstract ListActivity listActivity();

}
