package com.modernart.andrew.modernart;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class DialogActivity extends Activity {

    Button ButtonVisit;
    Button ButtonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);

        ButtonCancel = (Button)findViewById(R.id.button2);
        ButtonCancel.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                finish();
                }});

    ButtonVisit = (Button)findViewById(R.id.button1);
    ButtonVisit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.moma.org"));
            startActivity(intent);
        }

    });

        }}






