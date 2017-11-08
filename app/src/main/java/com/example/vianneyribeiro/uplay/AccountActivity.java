package com.example.vianneyribeiro.uplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        RadioButton free = findViewById(R.id.radio_free);
        free.setChecked(true);

        Button subscribe = findViewById(R.id.btn_Subscribe);
        subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton montly = findViewById(R.id.radio_montly);
                RadioButton anual = findViewById(R.id.radio_anual);

                if (!montly.isChecked() && !anual.isChecked()) {
                    Toast.makeText(AccountActivity.this, "Please Select One Plan", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent pay = new Intent(AccountActivity.this, PaymentActivity.class);
                startActivity(pay);
            }
        });
    }
}
