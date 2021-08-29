/*
Jake McLellan
CSEC 467 HW1: Basic Android App Architecture
3 Sept. 2021
*/

package me.mclellan.csec467w1;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// Second activity responsible for displaying user-provided text as a Toast notification
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String editTextContent = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Button b = (Button) findViewById(R.id.buttonAct2);
        b.setOnClickListener(new View.OnClickListener(){
            // Button handler responsible for creating and displaying Toast notification when clicked
            public void onClick(View v){
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, (CharSequence) editTextContent, Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}