package phucduong.testingapp.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import javax.inject.Inject;

import butterknife.BindView;
import phucduong.testingapp.R;
import phucduong.testingapp.adapter.ListAdapter;
import phucduong.testingapp.base.BaseActivity;
import phucduong.testingapp.contract.ListContract;
import phucduong.testingapp.presenter.ListPresenter;

public class ListActivity extends BaseActivity implements ListContract.View {
    @Inject
    ListPresenter presenter;

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_list;
    }

    @Override
    protected void setupView() {
        initialRecyclerView();
        presenter.takeView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dropView();
    }

    private void initialRecyclerView() {
        ListAdapter adapter = new ListAdapter(presenter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new android.support.v7.widget.DividerItemDecoration(this,
                android.support.v7.widget.DividerItemDecoration.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
