package com.gautam.medicinetime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gautam.medicinetime.medicine.MedicineActivity;

public class LoginActivity extends AppCompatActivity {

    Button button;
    TextView button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.btnLogin);
        button2 = (TextView) findViewById(R.id.lnkRegister);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MedicineActivity.class);
                startActivity(intent);
                finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, Registration.class);
                startActivity(intent);

            }
        });

    }
}