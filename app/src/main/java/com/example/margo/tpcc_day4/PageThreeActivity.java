package com.example.margo.tpcc_day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageThreeActivity extends AppCompatActivity {

    Button btnPage2;
    Button btnPage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);

        btnPage2 = (Button) findViewById(R.id.btnPage2);
        btnPage1 = (Button) findViewById(R.id.btnPage1);

        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageThreeActivity.this, PageTwoActivity.class);
                startActivity(intent);
                finish();
            }
        });


        btnPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageThreeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
