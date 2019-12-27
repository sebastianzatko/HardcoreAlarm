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

        final DatePickerDialog.OnDateSetListener datePickerListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEE");
                Date date=new Date(year,month,dayOfMonth-1);
                String dayOfWeek=simpleDateFormat.format(date);
            }
        };

        Button buttonSelectRepeatDays=findViewById(R.id.btn_selectRepeatDays);
        buttonSelectRepeatDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar=Calendar.getInstance();
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog=new DatePickerDialog(v.getContext(),datePickerListener,year,month,day);
                datePickerDialog.show();
            }
        });

    }
    public void closeDialog(View view){
        finish();;
    }
}
