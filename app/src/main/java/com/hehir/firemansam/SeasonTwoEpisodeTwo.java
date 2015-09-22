package com.hehir.firemansam;

/**
 * Created by David on 02/09/2015.
 */
import android.app.Activity;
import com.hehir.firemansam.R;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


// android.media.session.MediaController;

public class SeasonTwoEpisodeTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season_two_episode_two);

        final VideoView videoView = (VideoView)
                findViewById(R.id.videoViewSeason2Episode2);

        videoView.setVideoPath(
                "http://www.gurugossip.net/fs-s2e2.mp4");

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }

}
