package com.littlespider.newtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.littlespider.mylibrary.LWebActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        textView.setOnClickListener(new MyListener());
    }

    private class MyListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            LWebActivity.intoWebActivity(MainActivity.this, "http://www.sanwen.net/subject/3665473");
        }

    }
}
