package com.example.android.sunshinedioguardo;

import android.graphics.Paint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Underline the Title text for the app
        TextView tv1 = (TextView) findViewById(R.id.app_title);
        tv1.setPaintFlags(tv1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        // append temperature values to strings in resource files
        int tNow, tTodayH, tTodayL, tTomorrowH, tTomorrowL, tInTwoDaysH, tInTwoDaysL;
        TextView temp;

        tNow = 45;
        temp = (TextView) findViewById(R.id.weather_now);
        String s = getString(R.string.now);
        temp.setText(s + " " + tNow + "*");

        tTodayH = 56;
        tTodayL = 40;
        temp = (TextView) findViewById(R.id.weather_today);
        s = getString(R.string.today);
        temp.setText(s + " " + tTodayH + "*/" + tTodayL + "*");

        tTomorrowH = 70;
        tTomorrowL = 40;
        temp = (TextView) findViewById(R.id.weather_tomorrow);
        s = getString(R.string.tomorrow);
        temp.setText(s + " " + tTomorrowH + "*/" + tTomorrowL + "*");

        tInTwoDaysH = 45;
        tInTwoDaysL = 42;
        temp = (TextView) findViewById(R.id.weather_intwodays);
        String dayOfWeek = getDayOfWeek();
        temp.setText(dayOfWeek+ ": " + tInTwoDaysH + "*/" + tInTwoDaysL + "*");

    }

    public String getDayOfWeek()
    {
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        c.add(Calendar.DATE, 2);
        int d = c.get(Calendar.DAY_OF_WEEK);

        if(d == 1)
            return "Sunday";
        else if(d == 2)
            return "Monday";
        else if(d == 3)
            return "Tuesday";
        else if(d == 4)
            return "Wednesday";
        else if(d == 5)
            return "Thursday";
        else if(d == 6)
            return "Friday";
        else if(d == 7)
            return "Saturday";
        // if returned number is not 1 to 7
        else
            return " ";

    }





}
