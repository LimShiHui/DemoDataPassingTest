package sg.edu.rp.c346.id20032316.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer = findViewById(R.id.tvChar);

        Intent intentReceived = getIntent();
        char character = intentReceived.getCharExtra("character", 'z');
        tvAnswer.setText("Character value received is: " + character);
    }
}