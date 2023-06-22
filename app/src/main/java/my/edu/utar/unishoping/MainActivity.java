package my.edu.utar.unishoping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView cat1;
    private TextView cat2;
    private TextView cat3;
    private TextView cat4;
    private Button filter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filter = findViewById(R.id.Filter_button);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button to a new activity for user to enter location information
                Intent intent = new Intent(MainActivity.this, Filter.class);
                startActivity(intent);
            }
        });

        cat1 = findViewById(R.id.cat1);
        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button to a new activity for user to enter location information
                Intent intent = new Intent(MainActivity.this, MiniMarket.class);
                startActivity(intent);
            }
        });
        cat2 = findViewById(R.id.cat2);
        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button to a new activity for user to enter location information
                Intent intent = new Intent(MainActivity.this, Healthcare.class);
                startActivity(intent);
            }
        });
        cat3 = findViewById(R.id.cat3);
        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button to a new activity for user to enter location information
                Intent intent = new Intent(MainActivity.this, Stationary.class);
                startActivity(intent);
            }
        });
        cat4 = findViewById(R.id.cat4);
        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button to a new activity for user to enter location information
                Intent intent = new Intent(MainActivity.this, Tech.class);
                startActivity(intent);
            }
        });
    }
}