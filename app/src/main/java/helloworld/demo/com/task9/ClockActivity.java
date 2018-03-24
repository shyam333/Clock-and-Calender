package helloworld.demo.com.task9;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;
import android.support.annotation.Nullable;
import android.widget.TimePicker;

import java.util.*;

/**
 * Created by shyamramesh on 04/12/17.
 */

public class ClockActivity extends AppCompatActivity{
    public static final String TAG = "ClockActivity";
    TimePicker mTimePicker;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clock_layout);
        mTimePicker =findViewById(R.id.view2);

        mTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                String time = i + "/" + i1;
                Log.d(TAG, "OnSelectedDayChange: h/m:" + time);

                Intent intent2 = new Intent(ClockActivity.this, MainActivity.class);
                intent2.putExtra("time", time);
                startActivity(intent2);
            }



        });
    }}