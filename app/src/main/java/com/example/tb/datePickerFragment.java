package com.example.tb;

import static android.content.ContentValues.TAG;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tugasbesar.R;

import java.util.Calendar;

public class datePickerFragment extends Fragment{

    private TextView textView;
    private EditText editText;
    private DatePickerDialog.OnDateSetListener dateSetListener;

    public datePickerFragment(){
        //Required empty public constuctor

    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.buatpertemuan_fragment, container, false);

        this.textView = view.findViewById(R.id.tv_tanggal);
        this.editText = view.findViewById(R.id.et_Tanggal);

        textView.setOnClickListener(view1 -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_DeviceDefault, dateSetListener, year, month, day);

            dialog.show();
        });

        dateSetListener = (datePicker, year, month, day) -> {
            month = month + 1;
            Log.d(TAG,"onDataSet: dd//mm/yyyy" + day +"/" + month + "/" + year );

            String date = day + "/" + month + "/" + year;
            textView.setText(date);
        };

        return view;
    }

    public datePickerFragment newInstance() {
        datePickerFragment fragment = new datePickerFragment();
        return fragment;
    }
}




//public class datePickerFragment extends Fragment implements View.OnClickListener {
//
//    private TextView textView;
//    private EditText editText;
//
//    public datePickerFragment(){
//        //Required empty public constructor
//
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        View view = inflater.inflate(R.layout.buatpertemuan_fragment, container, false);
//
//        this.textView = view.findViewById(R.id.tv_tanggal);
//        this.editText = view.findViewById(R.id.et_Tanggal);
//
//        final Calendar calendar = Calendar.getInstance();
//        final int year = Calendar.getInstance().get(Calendar.YEAR);
//        final int month = Calendar.getInstance().get(Calendar.MONTH);
//        final int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
//
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                DatePickerDialog dialog = new DatePickerDialog(datePickerFragment.this, new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
//
//                        month = month + 1;
//                        String date = dayOfMonth + "/" + month +"/" +year;
//                        textView.setText(date);
//
//                    }
//                } , year, month, day);
//                dialog.show();
//            }
//        });
//
//        return view;
//    }
//
//    @Override
//    public void onClick(View view) {
//
//    }
//}
