package com.ntrackmoto.nitolniloy.custometableview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private TextView tv, tsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        tv = (TextView) findViewById(R.id.tv);
        tsl = (TextView) findViewById(R.id.tsl);

        for (int i = 0; i < CustomeAdapter.editModelArrayList.size(); i++){

            tv.setText(tv.getText() + " " + CustomeAdapter.editModelArrayList.get(i).getEditTextValue() +System.getProperty("line.separator"));
            tsl.setText(tsl.getText() + " " + CustomeAdapter.editModelArrayList.get(i).getSlValue() +System.getProperty("line.separator"));

        }


    }
}