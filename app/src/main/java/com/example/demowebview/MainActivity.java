package com.example.demowebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn);
        EditText editText= findViewById(R.id.etv);

        button.setOnClickListener(v -> {
            Intent intent =new Intent(MainActivity.this,WebViewAc.class);
            intent.putExtra("url",editText.getText().toString());
            startActivity(intent);
        });
    }
}