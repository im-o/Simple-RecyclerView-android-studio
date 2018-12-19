package com.example.user.tes061212;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityLearnMore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);
        backme();


    }
    private void backme(){
        MaterialButton materialButton = findViewById(R.id.btn_back_me);
        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_back_me:
                        Intent moveIntent = new Intent(ActivityLearnMore.this, MainActivity.class);
                        startActivity(moveIntent);
                        break;
                }
            }
        });
    }
}
