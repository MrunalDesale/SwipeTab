package com.example.myfirst.swipedemo;

import android.app.Fragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by bridgelabz3 on 19/12/15.
 */

public class Pick extends Fragment
{
    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View Pick = inflater.inflate(R.layout.pick_frag, container, false);
        //((TextView)pick.findViewById(R.id.textView)).setText("iOS");
        TimePicker tp = null;
        tp=(TimePicker) tp.findViewById(R.id.timePicker);
        tp.setIs24HourView(true);
        tp.setCurrentMinute(10);
        tp.setCurrentHour(13);

        TimePickerDialog.OnTimeSetListener mTimeSetListener =new TimePickerDialog.OnTimeSetListener()
        {
            public void onTimeSet(TimePicker view, int hourOfDay,int minute)
            {
                TextView tv= null;
                tv= (TextView) tv.findViewById(R.id.editText);
                tv.setText(Integer.toString(hourOfDay)+" : "+Integer.toString(minute));

            }
        };
        /*TimePickerDialog.OnTimeSetListener onTimeChanged=new TimePickerDialog().OnTimeChangedListener()
        {

            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute)
            {
                TextView tv= null;
                tv= (TextView) tv.findViewById(R.id.editText);
                tv.setText(Integer.toString(hourOfDay)+" : "+Integer.toString(minute));

            }
        };*/
        tp.setOnTimeChangedListener((TimePicker.OnTimeChangedListener) mTimeSetListener);

        return Pick;
    }
}
