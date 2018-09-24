package team7.paceyourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import team7.paceyourself.CalendarQiHuang.SyllabusActivity;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button startCalendarQiHuang = (Button) findViewById(R.id.Calendar);
        startCalendarQiHuang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HomepageActivity.this, SyllabusActivity.class);
                startActivity(intent);
            }
        });
    }
}
