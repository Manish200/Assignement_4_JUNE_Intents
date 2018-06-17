package com.example.dell.assignment_4_june_events_intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.login);
        b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.signup);
        b2.setOnClickListener(this);


        setTitle("LOGIN");
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.login :
                Toast.makeText(MainActivity.this," Please SignUp First ",Toast.LENGTH_SHORT);
                break;
            case R.id.signup :
                Intent io = new Intent(MainActivity.this, SignUp_Activity.class);
                Toast.makeText(MainActivity.this," Sign Up activity ",Toast.LENGTH_SHORT);
                startActivity(io);
                break;
            default:break;
        }
        }

}
