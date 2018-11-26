package phucduong.testingapp.presenter;

import javax.inject.Inject;

import phucduong.testingapp.contract.ListContract;
import phucduong.testingapp.contract.SplashContract;
import phucduong.testingapp.data.source.MetaRepository;

public class SplashPresenter implements SplashContract.Presenter {
    MetaRepository metaRepository;
    ListContract.View mView;
    @Inject
    public SplashPresenter(MetaRepository metaRepository) {
        this.metaRepository = metaRepository;
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
