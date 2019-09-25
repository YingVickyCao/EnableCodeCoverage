package com.github.yingvickycao.enablecodecoverage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

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

    public void initPerson(){
        Person person = new Person("Hi");
        Log.d(TAG, "initPerson: "+person.getName());
    }
}
