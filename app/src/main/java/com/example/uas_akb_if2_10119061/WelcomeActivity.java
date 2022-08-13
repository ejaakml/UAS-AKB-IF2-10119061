package com.example.uas_akb_if2_10119061;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Nama : Rheiza Akmal Razzaky
 * Kelas : IF2
 * NIM :10119061
 * Email : rheiza.10119061@mahasiswa.unikom.ac.id
 * **/
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    private Button started;
    private TextView have;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        started = findViewById(R.id.btnStarted);
        have = findViewById(R.id.btnHaveAccount);

        started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this, RegisterActivity.class));
            }
        });

        have.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
            }
        });

    }
}
