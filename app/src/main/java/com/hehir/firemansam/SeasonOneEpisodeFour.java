package com.hehir.firemansam;

import android.app.Activity;
import com.hehir.firemansam.R;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class SeasonOneEpisodeFour extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season_one_episode_four);

        final VideoView videoView = (VideoView)
                findViewById(R.id.videoViewSeason1Episode4);

        videoView.setVideoPath(
                "http://www.gurugossip.net/fs-s1e4.mp4");

        android.widget.MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}


