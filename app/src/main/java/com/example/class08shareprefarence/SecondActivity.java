package com.example.class08shareprefarence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private static PrefConfig prefConfig;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        prefConfig = new PrefConfig(SecondActivity.this);
        logout = findViewById(R.id.logoutId);


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefConfig.writeLoginStatus(false);
                Intent mainActivity = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(mainActivity);
                finish();
            }
        });

    }
}
