package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SayHello(View view) {
        EditText editTextName1 = findViewById(R.id.editTextName1); //EditText
        EditText editTextName2 = findViewById(R.id.editTextName2); //EditText
        EditText editTextName3 = findViewById(R.id.editTextName3); //EditText
        EditText editTextName4 = findViewById(R.id.editTextName4); //EditText
        EditText editTextName5 = findViewById(R.id.editTextName5); //EditText
        EditText editTextName6 = findViewById(R.id.editTextName6); //EditText
        EditText editTextName7 = findViewById(R.id.editTextName7); //EditText

        TextView textView1 = findViewById(R.id.textView1); //TextView
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);
        TextView textView7 = findViewById(R.id.textView7);

        textView1.setText(editTextName1.getText());
        textView2.setText(editTextName2.getText());
        String Id = editTextName3.getText().toString();
        textView3.setText("Intern Id:" + Id);
        textView4.setText(editTextName4.getText());
        textView5.setText(editTextName5.getText());
        textView6.setText(editTextName6.getText());
        String CGPA = editTextName7.getText().toString();
        textView7.setText("CGPA:" + CGPA);


    }
}