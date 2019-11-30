package com.example.edittext_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        Button bt1, bt2;
        EditText et1, et2;
        TextView tv1;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            et1 = (EditText) findViewById(R.id.editText);
            et2 = (EditText) findViewById(R.id.editText2);
            tv1 = (TextView) findViewById(R.id.textView3);
            bt1 = (Button) findViewById(R.id.button);
            bt2 = (Button) findViewById(R.id.button2);

            View.OnClickListener OCL = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int id = ((Button) v).getId();
                    switch (id) {
                        case R.id.button:
                            String s1 = et1.getText().toString();  //透過Editable這個物件呼叫tostring,getText拿取et1的文字,透過to string 轉成字串
                            double h = Double.parseDouble(s1);    //將tostring的字串轉成浮點數字 身高
                            String s2 = et2.getText().toString();
                            double w = Double.parseDouble(s2);
                            double bmi=w/(h/100*h/100);
                            tv1.setText("身高"+h+"cm\n體重:"+w+"kg\n BMI:"+bmi);
                            break;
                        case R.id.button2:
                            et1.setText(" ");    //將et1,2,tv1 內容清除
                            et2.setText(" ");
                            tv1.setText(" ");
                            break;
                    }
                }
            };
            bt1.setOnClickListener(OCL);
            bt2.setOnClickListener(OCL);
        }
    }
