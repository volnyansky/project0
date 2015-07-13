package stanislav.volnjanskij.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= (Button) findViewById(R.id.button_spotify);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch_spotify_streamer), Toast.LENGTH_LONG).show();
            }
        });

        b= (Button) findViewById(R.id.button_scores);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,getString(R.string.this_button_will_launch_football_scores_app),Toast.LENGTH_LONG).show();
            }
        });

        b= (Button) findViewById(R.id.button_library);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,getString(R.string.this_button_will_launch_library_app),Toast.LENGTH_LONG).show();
            }
        });

        b= (Button) findViewById(R.id.button_build_it_bigger);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,getString(R.string.this_button_will_launch_build_it_bigger_app),Toast.LENGTH_LONG).show();
            }
        });

        b= (Button) findViewById(R.id.button_xyz_reader);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,getString(R.string.this_button_will_launch_xyz_reader_app),Toast.LENGTH_LONG).show();
            }
        });

        b= (Button) findViewById(R.id.button_capstone);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,getString(R.string.this_button_will_launch_capstone_app),Toast.LENGTH_LONG).show();
            }
        });

    }


}
