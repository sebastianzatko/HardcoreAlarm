package com.example.alarm;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class NewAlarmActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_alarm_activity);

        Button buttonCancelNewAlarm=findViewById(R.id.btn_cancelAlarm);
        buttonCancelNewAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeDialog(v);
            }
        });


        Button buttonCreateNewAlarm=findViewById(R.id.btn_confirmAlarm);
        buttonCreateNewAlarm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });



        ToggleButton.OnCheckedChangeListener onCheckedChangeListener= new ToggleButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.as_rounded_button));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.colorOnBackground));
                    buttonView.setTextColor(getResources().getColor(R.color.colorOnFont));
                }else{

                    buttonView.setBackgroundColor(getResources().getColor(R.color.colorOffBackground));
                    buttonView.setTextColor(getResources().getColor(R.color.colorOffFont));
                }
            }
        };

        ToggleButton btn_Monday=findViewById(R.id.btn_dayMonday);
        btn_Monday.setOnCheckedChangeListener(onCheckedChangeListener);

    }



    public void closeDialog(View view){
        finish();;
    }
}
