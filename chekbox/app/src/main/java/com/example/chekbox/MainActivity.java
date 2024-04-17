package com.example.chekbox;

import static android.os.Build.VERSION_CODES.S;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void diaplay(View view) {
        CheckBox a = findViewById(R.id.c1);
        CheckBox b = findViewById(R.id.c2);
        CheckBox c = findViewById(R.id.c3);
        CheckBox d = findViewById(R.id.c4);
        String S = "You are selected\n";
        if (a.isChecked()) {
            S = S + a.getText().toString() + "\n";
        }
        if (b.isChecked()) {
            S = S + b.getText().toString() + "\n";
        }
        if (c.isChecked()) {
            S = S + c.getText().toString() + "\n";
        }
        if (d.isChecked()) {
            S = S + d.getText().toString() + "\n";
        }
        Toast.makeText(this, S, Toast.LENGTH_LONG).show();

    }
}