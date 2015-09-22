package com.hehir.firemansam;

import android.app.Activity;
import android.content.Intent;
import com.hehir.firemansam.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by David on 30/07/2015.
 */
public class SeasonThreeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season_three);

        final Button season_three_episode_one = (Button) findViewById(R.id.season3episode1);
        final Button season_three_episode_two = (Button) findViewById(R.id.season3episode2);
        final Button season_three_episode_three = (Button) findViewById(R.id.season3episode3);
        final Button season_three_episode_four = (Button) findViewById(R.id.season3episode4);
        final Button season_three_episode_five = (Button) findViewById(R.id.season3episode5);
        final Button season_three_episode_six = (Button) findViewById(R.id.season3episode6);
        final Button season_three_episode_seven = (Button) findViewById(R.id.season3episode7);
        final Button season_three_episode_eight = (Button) findViewById(R.id.season3episode8);
    }


    public void onClickSeason3Episode1(View view) {

        Intent s3e1 = new Intent(this, SeasonThreeEpisodeOne.class);
        startActivity(s3e1);
    }

    public void onClickSeason3Episode2(View view) {

        Intent s3e2 = new Intent(this, SeasonThreeEpisodeTwo.class);
        startActivity(s3e2);
    }

    public void onClickSeason3Episode3(View view) {

        Toast.makeText(SeasonThreeActivity.this, "Not available yet!", Toast.LENGTH_SHORT).show();
        //Intent s3e3 = new Intent(this, SeasonThreeEpisodeThree.class);
        //startActivity(s3e3);
    }

    public void onClickSeason3Episode4(View view) {

        Intent s3e4 = new Intent(this, SeasonThreeEpisodeFour.class);
        startActivity(s3e4);
    }

    public void onClickSeason3Episode5(View view) {

        Intent s3e5 = new Intent(this, SeasonThreeEpisodeFive.class);
        startActivity(s3e5);
    }

    public void onClickSeason3Episode6(View view) {

        Intent s3e6 = new Intent(this, SeasonThreeEpisodeSix.class);
        startActivity(s3e6);
    }

    public void onClickSeason3Episode7(View view) {

        Intent s3e7 = new Intent(this, SeasonThreeEpisodeSeven.class);
        startActivity(s3e7);
    }

    public void onClickSeason3Episode8(View view) {

        Intent s3e8 = new Intent(this, SeasonThreeEpisodeEight.class);
        startActivity(s3e8);
    }


}
