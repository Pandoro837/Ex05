package com.javaex.ex05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //필드
    private TextView textTitle;
    private EditText edtDisplay;
    private Button btnGet;
    private Button btnSet;
    private Button btnVisible;
    private Button btnInVisible;
    private Button btnGone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("javaStudy", "클릭 이벤트 작동");
                Log.d("javaStudy", ""+view.getId());

                switch (view.getId()) {
                    case R.id.btnGet:
                        Log.d("javaStudy","btnGet 클릭" + R.id.btnGet);
                        String str = edtDisplay.getText().toString();
                        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
                        break;
                    case R.id.btnSet:
                        Log.d("javaStudy","btnSet 클릭" + R.id.btnSet);
                        edtDisplay.setText("안녕하세요");
                        break;
                    case R.id.btnVisible:
                        Log.d("javaStudy","btnVisible 클릭" + R.id.btnVisible);
                        break;
                    case R.id.btnInVisible:
                        Log.d("javaStudy","btnInVisible 클릭" + R.id.btnInVisible);
                        break;
                    case R.id.btnGone:
                        Log.d("javaStudy","btnGone 클릭" + R.id.btnGone);
                        break;

                }

            }
        };

        textTitle = (TextView) findViewById(R.id.textTitle);
        edtDisplay = (EditText) findViewById(R.id.edtDisplay);
        btnGet = (Button) findViewById(R.id.btnGet);
        btnSet = (Button) findViewById(R.id.btnSet);
        btnVisible = (Button) findViewById(R.id.btnVisible);
        btnInVisible = (Button) findViewById(R.id.btnInVisible);
        btnGone = (Button) findViewById(R.id.btnGone);

        btnGet.setOnClickListener(listener);
        btnSet.setOnClickListener(listener);
        btnVisible.setOnClickListener(listener);
        btnInVisible.setOnClickListener(listener);
        btnGone.setOnClickListener(listener);

    }
}