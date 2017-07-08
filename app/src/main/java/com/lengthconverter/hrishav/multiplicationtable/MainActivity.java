package com.lengthconverter.hrishav.multiplicationtable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static SeekBar seek_bar;
    private static TextView text_view;
    int progress = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar();
        /*
        List<String> list = new ArrayList<String>();

        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        String b = "";
        for(int i = 1; i<=10; i++)
        {
            for(int j = 1; j<= 10; j++)
            {
                int a = i*j;

                b = i + "*" + j + "=" + i * j;
                list.add(b);
            }

        }
        */
    }
    int progress_val;
    public void seekBar() {
        seek_bar = (SeekBar) findViewById(R.id.seekBar);
        text_view = (TextView) findViewById(R.id.textView);

        seek_bar.setMax(10);

        text_view.setText("Covered : " + seek_bar.getProgress() + " / " + seek_bar.getMax());




        seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                List<String> list = new ArrayList<String>();

                ArrayAdapter adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,list);

                ListView listView = (ListView) findViewById(R.id.listView);
                listView.setAdapter(adapter);

                String b = "";
                /*
                for(int i = 1; i<=10; i++)
                {
                    for(int j = 1; j<= 10; j++)
                    {
                        int a = i*j;

                        b = i + "*" + j + "=" + i * j;
                        list.add(b);
                    }

                }
                */

                progress_val = progress + 1;

                text_view.setText("Covered : " + progress + " / " + seek_bar.getMax());

                Toast.makeText(MainActivity.this,"Seekbar In progress",Toast.LENGTH_SHORT);

                if (progress_val == 1)
                {
                    for(int i = 1; i<=1; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 2)
                {
                    for(int i = 2; i<=2; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 3)
                {
                    for(int i = 3; i<=3; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 4)
                {
                    for(int i = 4; i<=4; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 5)
                {
                    for(int i = 5; i<=5; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 6)
                {
                    for(int i = 6; i<=6; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 7)
                {
                    for(int i = 7; i<=7; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 8)
                {
                    for(int i = 8; i<=8; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 9)
                {
                    for(int i = 9; i<=9; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 10)
                {
                    for(int i = 10; i<=10; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

                if (progress_val == 0)
                {
                    for(int i = 0; i<=0; i++)
                    {
                        for(int j = 1; j<= 10; j++)
                        {

                            b = i + "*" + j + "=" + i * j;
                            list.add(b);
                        }

                    }
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"Seekbar In Start",Toast.LENGTH_SHORT);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                text_view.setText("Covered : " + progress_val + " / " + seek_bar.getMax());
                Toast.makeText(MainActivity.this,"Seekbar In End",Toast.LENGTH_SHORT);
            }
        });
    }
}
