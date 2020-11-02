package com.example.numberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.NumberPicker;

import com.example.numberpicker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
      ActivityMainBinding amb;
    private String[] friendsPicker  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

        setUpPickerValues();
       amb.numberpicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
           @Override
           public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
               int value = amb.numberpicker.getValue();
               Log.d("Value", friendsPicker[value] + "");
           }
       });


    }

    private void setUpPickerValues() {

        //Picking the highest value
        amb.numberpicker.setMaxValue(10);
        //Picking the minimum value
        amb.numberpicker.setMinValue(0);

        //Setting the Name of Friends

        friendsPicker=new String[]{"Anavi", "Sonia", "Riya", "Tushar", "Dhiraj","Sid","Madhu","Nisha","Niteegya","Akshay","Bharti"};

        //Setting it in the Number Picker
        amb.numberpicker.setDisplayedValues(friendsPicker);




    }
}