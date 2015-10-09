package com.example.susanneomander.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    public void clickSpotify(View view) {
        Toast.makeText(getApplicationContext(), "Spotify Streamer is open!", Toast.LENGTH_SHORT).show();
    }

    public void clickScore(View view) {
        Toast.makeText(getApplicationContext(), "Score App is open!", Toast.LENGTH_SHORT).show();
    }

    public void clickLibrary(View view) {
        Toast.makeText(getApplicationContext(), "Library App is open!", Toast.LENGTH_SHORT).show();
    }

    public void clickBuild(View view) {
        Toast.makeText(getApplicationContext(), "Build It Bigger is open!", Toast.LENGTH_SHORT).show();
    }

    public void clickReader(View view) {
        Toast.makeText(getApplicationContext(), "XYZ Reader is open!", Toast.LENGTH_SHORT).show();
    }

    public void clickMyApp(View view) {
        Toast.makeText(getApplicationContext(), "My Own App is open!", Toast.LENGTH_SHORT).show();
    }

}
