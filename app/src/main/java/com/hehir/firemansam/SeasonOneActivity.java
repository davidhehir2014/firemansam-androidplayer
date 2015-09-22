package com.hehir.firemansam;

import android.app.Activity;
import android.content.Intent;
import com.hehir.firemansam.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeasonOneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season_one);

        final Button season_one_episode_one = (Button) findViewById(R.id.season1episode1);
        final Button season_one_episode_two = (Button) findViewById(R.id.season1episode2);
        final Button season_one_episode_three = (Button) findViewById(R.id.season1episode3);
        final Button season_one_episode_four = (Button) findViewById(R.id.season1episode4);
        final Button season_one_episode_five = (Button) findViewById(R.id.season1episode5);
        final Button season_one_episode_six = (Button) findViewById(R.id.season1episode6);
        final Button season_one_episode_seven = (Button) findViewById(R.id.season1episode7);
    }


    public void onClickSeason1Episode1(View view) {

        Intent s1ep1 = new Intent(this, SeasonOneEpisodeOne.class);
        startActivity(s1ep1);
    }

    public void onClickSeason1Episode2(View view) {

        Intent s1ep2 = new Intent(this, SeasonOneEpisodeTwo.class);
        startActivity(s1ep2);
    }

    public void onClickSeason1Episode3(View view) {

        Intent s1ep3 = new Intent(this, SeasonOneEpisodeTwo.class);
        startActivity(s1ep3);
    }

    public void onClickSeason1Episode4(View view) {

        Intent s1ep4 = new Intent(this, SeasonOneEpisodeTwo.class);
        startActivity(s1ep4);
    }

    public void onClickSeason1Episode5(View view) {

        Intent s1ep5 = new Intent(this, SeasonOneEpisodeTwo.class);
        startActivity(s1ep5);
    }

    public void onClickSeason1Episode6(View view) {

        Intent s1ep6 = new Intent(this, SeasonOneEpisodeTwo.class);
        startActivity(s1ep6);
    }

    public void onClickSeason1Episode7(View view) {

        Intent s1ep7 = new Intent(this, SeasonOneEpisodeTwo.class);
        startActivity(s1ep7);
    }

    public void onClickSeason1Episode8(View view) {

        Intent s1ep8 = new Intent(this, SeasonOneEpisodeTwo.class);
        startActivity(s1ep8);
    }
}
