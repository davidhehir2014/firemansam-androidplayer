package com.hehir.firemansam;

import android.app.Activity;
import com.hehir.firemansam.R;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


// android.media.session.MediaController;

public class SeasonThreeEpisodeFive extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season_three_episode_five);

        final VideoView videoView = (VideoView)
                findViewById(R.id.videoViewSeason3Episode5);

        videoView.setVideoPath(
                "http://www.gurugossip.net/fs-s3e5.mp4");

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }

}