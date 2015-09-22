package com.hehir.firemansam;

import android.app.Activity;
import android.content.Intent;
import com.hehir.firemansam.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;




/**
 * Created by David on 30/07/2015.
 */
public class AllSeriesHomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.series_all_home);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        final Button button1 = (Button) findViewById(R.id.season1);
        final Button button2 = (Button) findViewById(R.id.season2);
        final Button button3 = (Button) findViewById(R.id.season3);
    }


    public void onClickSeason1(View view) {

        Intent intent1 = new Intent(AllSeriesHomeActivity.this, SeasonOneActivity.class);
        startActivity(intent1);
        Toast.makeText(AllSeriesHomeActivity.this, "Taking you to Season 1!", Toast.LENGTH_SHORT).show();

    }


    public void onClickSeason2(View view) {

        Intent intent2 = new Intent(AllSeriesHomeActivity.this, SeasonTwoActivity.class);
        startActivity(intent2);
        Toast.makeText(AllSeriesHomeActivity.this, "Season 2 coming right up!", Toast.LENGTH_SHORT).show();

    }


    public void onClickSeason3(View view) {

        Intent intent3 = new Intent(AllSeriesHomeActivity.this, SeasonThreeActivity.class);
        startActivity(intent3);
        Toast.makeText(AllSeriesHomeActivity.this, "Season 3 loading!!", Toast.LENGTH_SHORT).show();

    }
}
