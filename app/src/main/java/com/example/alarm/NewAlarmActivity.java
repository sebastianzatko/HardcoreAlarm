package com.example.alarm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewAlarmActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_new_alarm_dialog);

        Button buttonCancelNewAlarm=findViewById(R.id.btn_cancelAlarm);
        buttonCancelNewAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeDialog(v);
            }
        });

    }
    public void closeDialog(View view){
        finish();;
    }
}
