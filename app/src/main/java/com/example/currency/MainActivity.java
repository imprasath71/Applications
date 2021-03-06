package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void buttonClick(View view){
        EditText editText= (EditText) findViewById(R.id.editTextTextPersonName);
        String sum = editText.getText().toString();
        int s = Integer.parseInt(sum);
        int r= s*73;
        Toast.makeText(getApplicationContext(), "Amount in  Indian Rupees is "+r+"/-",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}