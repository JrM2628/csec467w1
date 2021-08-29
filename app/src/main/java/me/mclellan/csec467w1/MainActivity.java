/*
Jake McLellan
CSEC 467 HW1: Basic Android App Architecture
3 Sept. 2021
*/

package me.mclellan.csec467w1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Main activity responsible for collecting user input and launching second activity
public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.mybutton);
    }

    // Responsible for launching second activity and passing parameter EXTRA_MESSAGE to it
    // Linked to R.id.mybutton
    public void launchAct2(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextBox);
        String editTextContent = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, editTextContent);
        startActivity(intent);
    }
}