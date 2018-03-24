package helloworld.demo.com.task9;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;
import android.support.annotation.Nullable;
import java.util.Calendar;

/**
 * Created by shyamramesh on 04/12/17.
 */

public class CalendarActivity extends AppCompatActivity {
    public static final String TAG = "CalendarActivity";
    CalendarView mCalendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);
        mCalendarView = findViewById(R.id.view1);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1+1) + "/" + i2 + "/"+i;
                Log.d(TAG,"OnSelectedDayChange: mm/dd/yyyy:"+date);

                Intent intent1 = new Intent(CalendarActivity.this,MainActivity.class);
                intent1.putExtra("date",date);
                startActivity(intent1);
            }

        });
    }
}