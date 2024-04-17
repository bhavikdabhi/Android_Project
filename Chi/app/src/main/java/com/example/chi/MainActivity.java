package com.example.chi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show(Void v){
        Switch s=findViewById(R.id.s1);
        String m=s.getText().toString();
        Toast.makeText(this, "The toggle button is"+m, Toast.LENGTH_SHORT).show();
    }
}