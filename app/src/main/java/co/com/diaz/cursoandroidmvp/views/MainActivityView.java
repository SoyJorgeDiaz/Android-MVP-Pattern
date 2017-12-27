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

public class MainActivityView extends AppCompatActivity {

    EditText inputData;
    Button btnSendData;
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputData = findViewById(R.id.input_data);
        btnSendData = findViewById(R.id.btn_sendData);
        tvData = findViewById(R.id.tv_data);
    }

    public void sendData(View view) {
    }
}
