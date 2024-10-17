package com.example.d3bober;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int n = 0;
    TextView textBottom;
    TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textBottom = findViewById(R.id.textBottom);
        textTitle = findViewById(R.id.textTop);
    }

    public void tapBober(View view) {
        n += 1;
        textBottom.setText("Вы потапали " + n + " раз");
        switch (n){
            case 10: textTitle.setText("Тапай, не останавливайся."); break;
            case 21: case 22: case 23: case 24:
            case 25: textTitle.setText("Тапай, не останавливайся."); break;
            case 30: textTitle.setText("Тапай, не останавливайся."); break;
            default: textTitle.setText("Потапай бобра!");
        }
    }
}