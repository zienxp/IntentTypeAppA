package com.example.intenttypeappa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.intenttypeappa.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sharePost(View view) {
        Intent intent = new Intent(this,SharePostActivity.class);
        startActivity(intent);
    }


    public void sendEmail(View view) { //Explicit Intent
        Intent intent =new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra("message","this is a simple message");
        startActivity(intent);
    }
}
