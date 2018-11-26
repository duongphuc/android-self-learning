package phucduong.testingapp.di.modules;

import dagger.Binds;
import dagger.Module;
import phucduong.testingapp.contract.ListContract;
import phucduong.testingapp.contract.SplashContract;
import phucduong.testingapp.di.ActivityScope;
import phucduong.testingapp.presenter.ListPresenter;
import phucduong.testingapp.presenter.SplashPresenter;

@Module
public abstract class SplashModule {
    @ActivityScope
    @Binds
    abstract SplashContract.Presenter splashPresenter(SplashPresenter presenter);
}
