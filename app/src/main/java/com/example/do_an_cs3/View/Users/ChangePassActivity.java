package com.example.do_an_cs3.View.Users;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.do_an_cs3.R;
import com.example.do_an_cs3.View.MainActivity;

public class ChangePassActivity extends AppCompatActivity {
    private Button buttonHome;
    private Button buttonComback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activy_changepass);

        buttonComback = findViewById(R.id.comeback);
        buttonComback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        buttonHome = findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangePassActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
