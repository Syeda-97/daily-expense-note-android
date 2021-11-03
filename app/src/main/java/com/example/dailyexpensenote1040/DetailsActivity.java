package com.example.dailyexpensenote1040;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView typeTv,amountTV,dateTv,timeTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        init();
        Intent intent=getIntent();
        typeTv.setText(intent.getStringExtra("type"));
        amountTV.setText(String.valueOf(intent.getIntExtra("amount",0)));
        dateTv.setText(intent.getStringExtra("date"));
        timeTv.setText(intent.getStringExtra("time"));

    }

    private void init() {
        typeTv=findViewById(R.id.typeTV);
        amountTV=findViewById(R.id.amountTV);
        dateTv=findViewById(R.id.dateTV);
        timeTv=findViewById(R.id.timeTV);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
