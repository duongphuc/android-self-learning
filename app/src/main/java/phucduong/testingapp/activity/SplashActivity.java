package phucduong.testingapp.activity;

import javax.inject.Inject;

import phucduong.testingapp.R;
import phucduong.testingapp.base.BaseActivity;
import phucduong.testingapp.presenter.SplashPresenter;

public class SplashActivity extends BaseActivity {
    @Inject
    SplashPresenter presenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void setupView() {

    }
}
