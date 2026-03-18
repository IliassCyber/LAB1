package com.example.app1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app1.R;

public class MainActivity extends AppCompatActivity {

    private int mScore = 0;
    private TextView mScoreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreText = findViewById(R.id.tv_counter);
        Button btnToast = findViewById(R.id.btn_show_toast);
        Button btnAdd = findViewById(R.id.btn_count_up);

        btnToast.setOnClickListener(v -> 
            Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show()
        );

        btnAdd.setOnClickListener(v -> {
            mScore++;
            mScoreText.setText(String.valueOf(mScore));
        });
    }
}
