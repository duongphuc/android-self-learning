package phucduong.testingapp.base;

public interface BasePresenter<T> {
    void takeView(T view);
    void dropView();
}
