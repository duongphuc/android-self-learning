package phucduong.testingapp.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import phucduong.testingapp.MyApplication;
import phucduong.testingapp.data.source.MetaRepository;
import phucduong.testingapp.di.modules.MetaRepositoryModule;


/**
 * This is a Dagger component. Refer to {@link MyApplication} for the list of Dagger components
 * used in this application.
 * <p>
 * Even though Dagger allows annotating a {@link Component} as a singleton, the code
 * itself must ensure only one instance of the class is created. This is done in {@link
 * MyApplication}.
 * //{@link AndroidSupportInjectionModule}
 * // is the module from Dagger.Android that helps with the generation
 * // and location of subcomponents.
 */
@Singleton
@Component (modules = {
        MetaRepositoryModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class}
        )
public interface AppComponent extends AndroidInjector<MyApplication> {
    MetaRepository getMetaRepository();
    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);
        AppComponent build();
    }
}
