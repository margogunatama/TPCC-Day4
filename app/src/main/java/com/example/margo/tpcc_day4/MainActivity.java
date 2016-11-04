package com.example.margo.tpcc_day4;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener mOnClickListener;

    Button btnPage2;
    Button btnPage3;

    EditText editText;
    TextView txtView;
    String eText;

    final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.mainLayout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPage2 = (Button) findViewById(R.id.btnPage2);
        btnPage3 = (Button) findViewById(R.id.btnPage3);

        txtView = (TextView) findViewById(R.id.viewPage1);

        editText = (EditText) findViewById(R.id.editText);



        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PageTwoActivity.class);

                eText = editText.getText().toString();

                intent.putExtra("name", eText);
                System.out.println(eText);

                Snackbar snackbar = Snackbar.make(relativeLayout, "Snaaaaak", Snackbar.LENGTH_LONG).setAction("Undo", mOnClickListener);
                snackbar.setActionTextColor(Color.RED);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.DKGRAY);
                TextView txtView = (TextView) snackbarView.findViewById(R.id.btnPage2);
                txtView.setTextColor(Color.DKGRAY);
                snackbar.show();


                startActivity(intent);
                finish();
            }
        });

        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PageThreeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
