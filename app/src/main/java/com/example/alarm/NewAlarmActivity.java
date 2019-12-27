package com.example.alarm;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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


        Button buttonSelectRepeatDays=findViewById(R.id.btn_selectRepeatDays);
        buttonSelectRepeatDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
    public void closeDialog(View view){
        finish();;
    }
}
