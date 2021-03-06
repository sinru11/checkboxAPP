package com.u1065138.checkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {

        CheckBox chk;
        TextView txvShow;
        String msg = "";

        int[] id = {R.id.chkMina, R.id.chkMomo, R.id.chkSana, R.id.chkTzuyu};

        for (int i : id){
            chk = findViewById(i);

            if (chk .isChecked())
                msg += "\n" + chk.getText();
        }

        txvShow = findViewById(R.id.txvShow);

        txvShow.setText("我喜歡的歌手有:\n" +msg);
    }
}
