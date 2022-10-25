package com.example.tb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.tugasbesar.R;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    private datePickerFragment datePickerFragment;
    private timePickerFragment timePickerFragment;
    private FragmentManager fragmentManager;
    private MainFragment mainFragment;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buatpertemuan_fragment);

        //2. Instantiate the Fragment in Activity
        this.datePickerFragment = datePickerFragment.newInstance();
        this.timePickerFragment = timePickerFragment.newInstance();
        this.fragmentManager = this.getSupportFragmentManager();

        //3. Instantiate FragmentManager
        this.fragmentManager = this.getSupportFragmentManager();

//        //4. Use Fragment transaction
//        FragmentTransaction ft = this.fragmentManager.beginTransaction();
//        ft.add(R.id.fragment_container, this.mainFragment).addToBackStack(null).commit();


        this.textView = findViewById(R.id.tv_waktu);
        this.button = findViewById(R.id.button_Waktu);

        button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 DialogFragment timePicker = new timePickerFragment();
                 timePicker.show(getSupportFragmentManager(), "time picker");
             }
         });

    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
        textView.setText("Hour: " + hourOfDay + " Minute" + minute);
    }
}