package com.example.alarm.Components.Alarm;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickerFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar currentDate= Calendar.getInstance();
        int currentHour=currentDate.get(Calendar.HOUR_OF_DAY);
        int currentMinute=currentDate.get(Calendar.MINUTE);
        return new TimePickerDialog(getActivity(),(TimePickerDialog.OnTimeSetListener) getActivity(),currentHour,currentMinute, DateFormat.is24HourFormat(getActivity()));
    }
}
