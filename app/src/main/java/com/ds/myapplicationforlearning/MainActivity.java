package com.ds.myapplicationforlearning;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText distanceEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.resultTextView);
        distanceEditText = findViewById(R.id.distanceEditText);

        FlyingTransport plane1 = new FlyingTransport(210, 850, Calculations.convertTonsToKgs(3.7d), "Самолет 1");
        FlyingTransport plane2 = new FlyingTransport(189, 900, Calculations.convertTonsToKgs(2.8d), "Самолет 2");
        FlyingTransport helicopter = new FlyingTransport(8, 250, (double) 14/100, "Вертолет");

        distanceEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() != 0) {
                    String text = generateText(plane1) + "; \n" + generateText(plane2) + "; \n" + generateText(helicopter);
                    result.setText(text);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private String generateText(FlyingTransport flyingTransport) {
        return "Для " + flyingTransport.getName() + " на " + distanceEditText.getText().toString().trim() + " км. нужно " +
                Calculations.roundNumber(flyingTransport.calculateFuelValueForDistance(Double.parseDouble(distanceEditText.getText().toString()))) + " л. и "
                + Calculations.roundNumber(flyingTransport.calculateTimeForDistance(Double.parseDouble(distanceEditText.getText().toString()))) + " ч.";
    }

}