package phucduong.testingapp.base;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import phucduong.testingapp.R;

public abstract class BaseActivity extends DaggerAppCompatActivity {
    private ProgressDialog progressDialog;
    @BindView(R.id.successView)
    TextView succesView;

    @BindView(R.id.errorView)
    TextView errorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initView();
        ButterKnife.bind(this);
        setupView();
    }

    protected void initView() {
        LinearLayout content = findViewById(R.id.content);
        View inflater = getLayoutInflater().inflate(getLayoutId(), null);
        content.addView(inflater);
    }

    protected void setupView() {

    }

    protected abstract int getLayoutId();

    protected void showErrorView(String message) {
        succesView.setVisibility(View.GONE);
        errorView.setVisibility(View.VISIBLE);
        errorView.setText(message);
    }

    protected void hideStateView() {
        errorView.setVisibility(View.GONE);
        succesView.setVisibility(View.GONE);
    }

    protected void showSuccessView(String message) {
        errorView.setVisibility(View.GONE);
        succesView.setVisibility(View.VISIBLE);
        succesView.setText(message);
    }

    protected void showProgressDialog() {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setMessage("Its loading....");
            progressDialog.setTitle("ProgressDialog");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setIndeterminate(true);
        }
        progressDialog.show();
    }

    protected void hideProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_base, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
