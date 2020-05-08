package com.example.samsung_2_5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText login,password;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        login=(EditText)findViewById(R.id.login2);
        password=(EditText)findViewById(R.id.password2);
        reg =(Button)findViewById(R.id.input2);

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (R.id.input){
                    case R.id.input:
                        String Login=login.getText().toString();
                        String Password=password.getText().toString();
                        Intent intent = new Intent();
                        intent.putExtra("et",Login);
                        setResult(RESULT_OK, intent);
                        finish();
                }
            }
        };

        reg.setOnClickListener(listener);
    }


}
