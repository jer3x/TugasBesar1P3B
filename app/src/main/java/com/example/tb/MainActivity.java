package com.example.tb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.tugasbesar.R;

public class MainActivity extends AppCompatActivity {

    private datePickerFragment datePickerFragment;
    private FragmentManager fragmentManager;
    private MainFragment mainFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buatpertemuan_fragment);

        //2. Instantiate the Fragment in Activity
        this.datePickerFragment = datePickerFragment.newInstance();

        this.fragmentManager = this.getSupportFragmentManager();

        //3. Instantiate FragmentManager
        this.fragmentManager = this.getSupportFragmentManager();

        //4. Use Fragment transaction
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, this.mainFragment).addToBackStack(null).commit();
    }
}