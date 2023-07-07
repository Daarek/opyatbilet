package com.example.poezduck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button button;
    TextView id;
    TextView in;
    TextView out;
    TextView price;
    TextView place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle intentbundle = getIntent().getExtras();
        id = findViewById(R.id.id2);
        in = findViewById(R.id.in2);
        out = findViewById(R.id.out2);
        price = findViewById(R.id.price2);
        place = findViewById(R.id.place2);

        button = findViewById(R.id.button2);
        id.setText(intentbundle.getString("id"));
        in.setText(intentbundle.getString("in"));
        out.setText(intentbundle.getString("out"));
        place.setText(intentbundle.getString("place"));
        price.setText(intentbundle.getString("price"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}