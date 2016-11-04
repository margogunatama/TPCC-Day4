package com.example.margo.tpcc_day4;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PageTwoActivity extends AppCompatActivity {

    Button btnPage1;
    Button btnPage3;
    TextView textView;
    Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        btnPage1 = (Button) findViewById(R.id.btnPage1);
        btnPage3 = (Button) findViewById(R.id.btnPage3);
        textView = (TextView) findViewById(R.id.viewPage2);
        bundle = getIntent().getExtras();


        System.out.println("MANTAPS : "+bundle.getString("name"));
        textView.setText(bundle.getString("name"));

        btnPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageTwoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageTwoActivity.this, PageThreeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
