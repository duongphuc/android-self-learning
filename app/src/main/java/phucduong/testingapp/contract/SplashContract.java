package phucduong.testingapp.contract;

import phucduong.testingapp.base.BasePresenter;
import phucduong.testingapp.base.BaseView;

public class SplashContract {
    public interface View extends BaseView<ListContract.Presenter> {

    }

    public interface Presenter extends BasePresenter<ListContract.View> {

    }
}
