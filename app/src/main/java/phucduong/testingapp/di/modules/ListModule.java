package phucduong.testingapp.di.modules;

import dagger.Binds;
import dagger.Module;
import phucduong.testingapp.contract.ListContract;
import phucduong.testingapp.di.ActivityScope;
import phucduong.testingapp.presenter.ListPresenter;

@Module
public abstract class ListModule {
    @ActivityScope
    @Binds
    abstract ListContract.Presenter listPresenter(ListPresenter presenter);
}
