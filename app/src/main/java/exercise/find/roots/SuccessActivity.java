package exercise.find.roots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intentCreatedMe = getIntent();

        TextView textView = findViewById(R.id.TextViewResult);
        long originalNumber = intentCreatedMe.getLongExtra("original_number", 0);
        long calculationTime = intentCreatedMe.getLongExtra("calculation_time", 0);
        String equation = intentCreatedMe.getStringExtra("equation");
        String result = "original number: "+originalNumber + "\n" + "calculation time: "+calculationTime+" sec\n" + equation;
        textView.setText(result);
    }
}