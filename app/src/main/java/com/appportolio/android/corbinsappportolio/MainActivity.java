package com.appportolio.android.corbinsappportolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Button Code, each one passes a string to the displayToast method
    public void butSpotStream (View view) {
        displayToast("This Button will launch the Spotify Streamer");
    }

    public void butSupDuo (View view) {
        displayToast("This Button will launch the Super Duo");
    }

    public void butBuildBig (View view) {
        displayToast("This Button will launch Build It Bigger");
    }

    public void butXYZReader (View view) {
        displayToast("This Button will launch the XYZ Reader");
    }

    public void butCapstone (View view) {
        displayToast("This Button will launch the Capstone Project");
    }

    //displayToast ( toast = popup message ) takes in the string to be displayed in the toast
    public void displayToast(String message) {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
