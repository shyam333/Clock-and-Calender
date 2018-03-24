package helloworld.demo.com.task9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private TextView theDate;
    private Button btnCalendar;
    private TextView theTime;
    private Button btnClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theDate=(TextView)findViewById(R.id.txt1);
        btnCalendar=(Button)findViewById(R.id.btn1);
        theTime=(TextView)findViewById(R.id.txt2);
        btnClock=(Button)findViewById(R.id.btn2);

        Intent incomingIntent1 = getIntent();
        String date = incomingIntent1.getStringExtra("date");
        theDate.setText(date);

        Intent incomingIntent2 = getIntent();
        String time = incomingIntent2.getStringExtra("time");
        theDate.setText(time);


        btnClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,ClockActivity.class);
                startActivity(intent2);
            }
        });
        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,CalendarActivity.class);
                startActivity(intent1);
            }
        });
    }
}
