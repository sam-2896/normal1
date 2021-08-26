package com.sm.l2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,branch;
Button click;
String username,section;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.etName);
        branch=(EditText)findViewById(R.id.etName);
        click=(Button)findViewById(R.id.btnclick);
        username=name.getText().toString();
        section=branch.getText().toString();
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "name : " + name.getText().toString() + " Branch :" + branch.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}