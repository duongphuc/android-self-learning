package phucduong.testingapp.contract;

import phucduong.testingapp.base.BasePresenter;
import phucduong.testingapp.base.BaseView;

public class ListContract {
    public interface View extends BaseView<Presenter>{

    }

    public interface Presenter extends BasePresenter<View> {

    }
}
