package com.hehir.firemansam;

import android.app.Activity;
import android.content.Intent;
import com.hehir.firemansam.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by David on 30/07/2015.
 */
public class SeasonTwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season_two);

        final Button season_two_episode_one = (Button) findViewById(R.id.season2episode1);
        final Button season_two_episode_two = (Button) findViewById(R.id.season2episode2);
        final Button season_two_episode_three = (Button) findViewById(R.id.season2episode3);
        final Button season_two_episode_four = (Button) findViewById(R.id.season2episode4);
        final Button season_two_episode_five = (Button) findViewById(R.id.season2episode5);
        final Button season_two_episode_six = (Button) findViewById(R.id.season2episode6);
        //final Button season_two_episode_seven = (Button) findViewById(R.id.season2episode7);
        //final Button season_two_episode_eight = (Button) findViewById(R.id.season2episode8);
    }


    public void onClickSeason2Episode1(View view) {

        Intent s2e1 = new Intent(this, SeasonTwoEpisodeOne.class);
        startActivity(s2e1);
    }

    public void onClickSeason2Episode2(View view) {

        Intent s2e2 = new Intent(this, SeasonTwoEpisodeTwo.class);
        startActivity(s2e2);
    }

    public void onClickSeason2Episode3(View view) {

        Intent s2e3 = new Intent(this, SeasonTwoEpisodeThree.class);
        startActivity(s2e3);
    }

    public void onClickSeason2Episode4(View view) {

        Intent s2e4 = new Intent(this, SeasonTwoEpisodeFour.class);
        startActivity(s2e4);
    }

    public void onClickSeason2Episode5(View view) {

        Intent s2e5 = new Intent(this, SeasonTwoEpisodeFive.class);
        startActivity(s2e5);
    }

    public void onClickSeason2Episode6(View view) {

        Intent s2e6 = new Intent(this, SeasonTwoEpisodeSix.class);
        startActivity(s2e6);
    }

    public void onClickSeason2Episode7(View view) {

        Intent s2e6 = new Intent(this, SeasonTwoEpisodeSeven.class);
        startActivity(s2e6);
    }

    public void onClickSeason2Episode8(View view) {

        Intent s2e6 = new Intent(this, SeasonTwoEpisodeEight.class);
        startActivity(s2e6);
    }


}

