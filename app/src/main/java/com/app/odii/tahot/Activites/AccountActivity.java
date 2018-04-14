package com.app.odii.tahot.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.app.odii.tahot.R;


public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }
    public void sub(View v){
        Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG).show();
        Intent loginform = new Intent(AccountActivity.this, LoginActivity.class);
        startActivity(loginform);
    }
}
