package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {

    //计数器
    private int count = 0;

    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        tvCount = findViewById(R.id.textview_2);

        Button addCount = findViewById(R.id.btn_button1);
        addCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过修改textview显示，下同
                tvCount.setText("The current number is: " + Integer.toString(++count));
            }
        });

        Button reduceCount = findViewById(R.id.btn_button2);
        reduceCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(CounterActivity.this, "The current number is：" + Integer.toString(--count),
//                        Toast.LENGTH_SHORT).show();
                tvCount.setText("The current number is: " + Integer.toString(--count));
            }
        });

        Button clearCount = findViewById(R.id.btn_button3);
        clearCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                /*Toast.makeText(CounterActivity.this, "The current number is：" + Integer.toString(count),
                        Toast.LENGTH_SHORT).show();*/
                tvCount.setText("The current number is: " + Integer.toString(count));
            }
        });


    }
}