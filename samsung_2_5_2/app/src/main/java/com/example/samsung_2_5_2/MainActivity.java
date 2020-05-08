package com.example.samsung_2_5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String PASSWORD="12345678";
    String LOGIN="burtaev";
    EditText login,password;
    TextView result;
    Button input;
    private static final int REQ_C = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(EditText)findViewById(R.id.login);
        password=(EditText)findViewById(R.id.password);
        result=(TextView)findViewById(R.id.result);
        input=(Button)findViewById(R.id.input);

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (R.id.input){
                    case R.id.input:
                        String Login=login.getText().toString();
                        String Password=password.getText().toString();
                        if (Login.equals(LOGIN)&&Password.equals(PASSWORD)){
                            result.setTextColor(Color.parseColor("#FF00FF00"));
                            result.setText("Верно");
                        }
                        else{
                            password.setText("");
                            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                            startActivityForResult(intent,REQ_C);
                        }
                }
            }
        };

        input.setOnClickListener(listener);


    }

    @SuppressLint("MissingSuperCall")
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (resultCode) {
            case RESULT_OK:
                login.setText(data.getStringExtra("et"));
                break;
        }
    }

}
