package com.capturecardfreedom;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView statusText;
    Button recordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        statusText = findViewById(R.id.statusText);
        recordButton = findViewById(R.id.recordButton);

        statusText.setText("USB Status: Ready");

        recordButton.setOnClickListener(v -> {
            statusText.setText("Recording: Starting...");
        });
    }
}
