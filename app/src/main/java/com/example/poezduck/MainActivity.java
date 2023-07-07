package com.example.poezduck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText id;
    EditText in;
    EditText out;
    EditText price;
    EditText place;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.generate);
        id = findViewById(R.id.id);
        in = findViewById(R.id.in);
        out = findViewById(R.id.out);
        price = findViewById(R.id.price);
        place = findViewById(R.id.place);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtid = id.getText().toString();
                String txtin = in.getText().toString();
                String txtout = out.getText().toString();
                String txtprice = price.getText().toString();
                String txtplace = place.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("id", txtid);
                intent.putExtra("in", txtin);
                intent.putExtra("out", txtout);
                intent.putExtra("price", txtprice);
                intent.putExtra("place", txtplace);
                startActivity(intent);
            }
        });
    }
}