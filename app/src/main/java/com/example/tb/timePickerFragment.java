package com.example.tb;

import static android.content.ContentValues.TAG;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.example.tugasbesar.R;

import java.util.Calendar;

public class timePickerFragment extends DialogFragment {

    private TextView textView;
    private EditText editText;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState){
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);


        return new TimePickerDialog(getActivity(), (TimePickerDialog.OnTimeSetListener) getActivity(), hour, minute, DateFormat.is24HourFormat(getActivity()));
    }




    public timePickerFragment(){
        //Required empty public constuctor

    }


    public timePickerFragment newInstance() {
        timePickerFragment fragment = new timePickerFragment();
        return fragment;
    }
}
