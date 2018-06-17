package com.example.dell.assignment_4_june_events_intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Dell on 17-06-2018.
 */

public class SignUp_Activity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button b1 = (Button)findViewById(R.id.submit);
        b1.setOnClickListener(this);


        setTitle("SIGN UP");
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.submit :
                Intent io = new Intent(SignUp_Activity.this, MainActivity.class);
                Toast.makeText(SignUp_Activity.this," SignUP Succesfully ",Toast.LENGTH_SHORT);
                startActivity(io);
                break;

            default: break;
        }
    }

}
