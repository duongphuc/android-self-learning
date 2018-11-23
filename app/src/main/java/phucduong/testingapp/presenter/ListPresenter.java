package phucduong.testingapp.presenter;

import javax.inject.Inject;

import phucduong.testingapp.contract.ListContract;

public class ListPresenter implements ListContract.Presenter {
    private ListContract.View mView;

    @Inject
    public ListPresenter() {

    }

    @Override
    public void takeView(ListContract.View view) {
        mView = view;
    }

    @Override
    public void dropView() {
        mView = null;
    }
}
