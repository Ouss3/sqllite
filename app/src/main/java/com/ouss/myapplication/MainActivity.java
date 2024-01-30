package com.ouss.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button writeButton, readButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.ediText);
        readButton = findViewById(R.id.readExternalButton);




        Button readExternalButton;

readExternalButton = findViewById(R.id.readExternalButton);

readExternalButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        File sdcard = Environment.getExternalStorageDirectory();
        Toast.makeText(getBaseContext(),Environment.getExternalStorageDirectory().toString(), Toast.LENGTH_SHORT).show();
        File file = new File(sdcard,"chaine.txt");
        StringBuilder text = new StringBuilder();

//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                text.append(line);
//                text.append('\n');
//            }
//            br.close();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }


    }
});
    }
}