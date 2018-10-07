package com.example.fa15_be_0028.class1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    ListView listView;
    PrintStream printStream;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        TextView txtView = (TextView) findViewById(R.id.Hello);
        Intent intent = getIntent();
        String name = intent.getStringExtra("username").toString();
        txtView.setText(name);
        */
        final ArrayList<String> arrayList = new ArrayList<String>();
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sampleaudio);
        mp.start();
        mp.stop();
        try
        {
            printStream = new PrintStream(openFileOutput("out.txt", MODE_APPEND));
            Scanner scanner = new Scanner(openFileInput("out.txt"));
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                arrayList.add(line);
                Toast.makeText(MainActivity.this, line, Toast.LENGTH_LONG).show();
            }
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }


        button = (Button) findViewById(R.id.AddListView);
        editText = (EditText) findViewById(R.id.listViewText);
        listView = (ListView) findViewById(R.id.listView);


        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String line = editText.getText().toString();
                arrayList.add(line);
                printStream.println(line);
                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}
