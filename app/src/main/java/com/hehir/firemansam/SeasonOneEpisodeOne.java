package com.hehir.firemansam;

import android.app.Activity;
import com.hehir.firemansam.R;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class SeasonOneEpisodeOne extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season_one_episode_one);

        final VideoView videoView = (VideoView)
                findViewById(R.id.videoViewSeason1Episode1);

        videoView.setVideoPath(
                "http://www.gurugossip.net/fs-s1e1.mp4");

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }

}