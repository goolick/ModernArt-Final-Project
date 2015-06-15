package com.modernart.andrew.modernart;

import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int MAX_COLOR = 255;
        final int MIN_COLOR = 0;

        SeekBar seekBar;
        final TextView textView1;
        final TextView textView2;
        final TextView textView3;
        textView1 = (TextView)findViewById(R.id.TextView1);
        textView2 = (TextView)findViewById(R.id.TextView2);
        textView3 = (TextView)findViewById(R.id.TextView3);

        seekBar = (SeekBar)findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView1.setBackgroundColor(Color.argb(MAX_COLOR,progress,MAX_COLOR-progress,MIN_COLOR));
                textView3.setBackgroundColor(Color.argb(MAX_COLOR,progress,MAX_COLOR-progress,MIN_COLOR));
                textView2.setBackgroundColor(Color.argb(MAX_COLOR,MAX_COLOR-progress,MAX_COLOR-progress,progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
        Intent intent = new Intent(this, DialogActivity.class);
        startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


}
