package me.mclellan.csec467w1;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String editTextContent = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Button b = (Button) findViewById(R.id.buttonAct2);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, (CharSequence) editTextContent, Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}