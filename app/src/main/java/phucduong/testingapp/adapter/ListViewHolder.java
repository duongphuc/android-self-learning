package phucduong.testingapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

import butterknife.ButterKnife;
import phucduong.testingapp.presenter.ListPresenter;

public class ListViewHolder extends ViewHolder {
    private final ListPresenter presenter;

    public ListViewHolder(View itemView, ListPresenter presenter) {
        super(itemView);
        this.presenter = presenter;
        ButterKnife.bind(this, itemView);
    }
}
