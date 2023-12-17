package com.example.mythreeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
    int robotCost = 35000;
    int saving = 700;int allowance = 1700;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textResult);
       for (int i=1;i<= 60; i++) {
       saving += allowance;
      if (saving >= robotCost){
       textView.setText("Мы копили:" + i + "месяцев"); break;
}   }
    }
}