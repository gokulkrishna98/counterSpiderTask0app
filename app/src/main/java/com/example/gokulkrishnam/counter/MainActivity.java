package com.example.gokulkrishnam.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void counter(View v)
    {   count++;
        t=(TextView)findViewById(R.id.textView2);
        t.setText(""+count);
    }

}
