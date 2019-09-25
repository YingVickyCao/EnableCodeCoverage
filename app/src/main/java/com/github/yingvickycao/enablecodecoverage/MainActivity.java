package com.github.yingvickycao.enablecodecoverage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.pageB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pageB();
            }
        });


    }

    private void pageB(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
