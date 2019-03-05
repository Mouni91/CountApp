package com.nrtec.mouni.countapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    TextView t1;
    int i;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.toast);
        b2 = (Button) findViewById(R.id.count);
        t1 = (TextView) findViewById(R.id.textcount);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome To NEC", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void countinc(View view) {

        i++;
        t1.setText(Integer.toString(i));

    }

    public void countdec(View view) {

        i--;
        t1.setText(Integer.toString(i));
    }

    public void reset(View view) {

        i = 0;
        t1.setText(Integer.toString(i));
    }
}
