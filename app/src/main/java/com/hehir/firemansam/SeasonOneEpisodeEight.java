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

public class SeasonOneEpisodeEight extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season_one_episode_eight);

        final VideoView videoView = (VideoView)
                findViewById(R.id.videoViewSeason1Episode8);

        videoView.setVideoPath(
                "http://www.gurugossip.net/fs-s1e8.mp4");

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }

}
