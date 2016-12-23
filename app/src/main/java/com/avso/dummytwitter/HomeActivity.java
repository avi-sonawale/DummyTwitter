package com.avso.dummytwitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textView = (TextView) findViewById(R.id.tv_username);


        String username = "";
        Long userid = 0L;


        Intent recieveUserDetailIntent = getIntent();
        username = recieveUserDetailIntent.getStringExtra("username");
        userid = recieveUserDetailIntent.getLongExtra("userid", 0L);

        textView.setText("Hi " + username + "\n\nUserID = " + userid);

    }
}
