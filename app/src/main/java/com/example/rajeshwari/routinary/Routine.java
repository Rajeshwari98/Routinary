package com.example.rajeshwari.routinary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Routine extends AppCompatActivity implements View.OnClickListener {

    private Button reliance;
    private Button more;
    private Button ratnadeep;
    private TextView greet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        reliance=(Button)findViewById(R.id.reliance);
        more=(Button)findViewById(R.id.more);
        ratnadeep=(Button)findViewById(R.id.ratnadeep);
        greet=(TextView)findViewById(R.id.greet);

        reliance.setOnClickListener(this);
        more.setOnClickListener(this);
        ratnadeep.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==reliance)
        {
            startActivity(new Intent(this,HomeNav.class));
        }
        if(view==more)
        {
            startActivity(new Intent(this,HomeNav.class));
        }
        if(view==ratnadeep)
        {
            startActivity(new Intent(this,HomeNav.class));
        }

    }
}
