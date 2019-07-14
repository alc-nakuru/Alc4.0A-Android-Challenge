package com.owen.aboutalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{

    private Button btnProfile;
    private Button btnAboutAlc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAboutAlc = (Button) findViewById(R.id.btn_aboutAlc);
        btnProfile = (Button) findViewById(R.id.btn_MyProfile);

        btnProfile.setOnClickListener(this);
        btnAboutAlc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == btnAboutAlc)
        {
            startActivity(new Intent(this, AboutAlc4Activity.class));
        }
        if (view == btnProfile)
        {
            startActivity(new Intent(this, ProfileActivity.class));
        }

    }
}
