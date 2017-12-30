package co.com.diaz.loginmvp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import co.com.diaz.loginmvp.R;
import co.com.diaz.loginmvp.interfaces.ILoginPresenter;
import co.com.diaz.loginmvp.interfaces.ILoginView;
import co.com.diaz.loginmvp.presenters.LoginPresenterImpl;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    private EditText inputUsername;
    private EditText inputPassword;
    private ProgressBar progressBar;
    private ILoginPresenter iLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputUsername = findViewById(R.id.inputUsername);
        inputPassword = findViewById(R.id.inputPassword);
        progressBar = findViewById(R.id.progressbar);

        iLoginPresenter = new LoginPresenterImpl(this);
    }

    public void eventLogin(View view) {
        iLoginPresenter.attempLogin(inputUsername.getText().toString(),
                inputPassword.getText().toString());
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void accessSuccessful() {
        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void accessDenied() {
        Toast.makeText(this, "Login access denied", Toast.LENGTH_SHORT).show();
    }
}
