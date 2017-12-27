package co.com.diaz.cursoandroidmvp.views;

/**
 * Created by SoyJorgeDiaz on 27/12/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import co.com.diaz.cursoandroidmvp.R;
import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityPresenter;
import co.com.diaz.cursoandroidmvp.interfaces.IMainActivityView;
import co.com.diaz.cursoandroidmvp.presenters.MainActivityPresenterImpl;

public class MainActivityView extends AppCompatActivity implements IMainActivityView{

    EditText inputData;
    Button btnSendData;
    TextView tvData;

    private IMainActivityPresenter iPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputData = findViewById(R.id.input_data);
        btnSendData = findViewById(R.id.btn_sendData);
        tvData = findViewById(R.id.tv_data);

        iPresenter = new MainActivityPresenterImpl(this);
    }

    public void sendData(View view) {
    }

    @Override
    public void showResult(String s) {

    }
}
