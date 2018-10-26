package com.example.raymond.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class designthinking extends YouTubeBaseActivity {

    private static final String TAG_DESIGN = "Design Thinking";
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designthinking);

        TextView title;
        TextView description;

        title = findViewById(R.id.designthinkingHeading);
        description = findViewById(R.id.designthinkingDesc);

        String mytitle = getResources().getString(R.string.designthinkingtitle);
        String mydescription = getResources().getString(R.string.designthinkingdesc);

        title.setText(mytitle);
        description.setText(mydescription);

        Log.d(TAG_DESIGN, "onCreate: Starting.");

        btnPlay = findViewById(R.id.DesignbtnPlay);
        mYoutubePlayerView = findViewById(R.id.youtubePlay);
        //Initialize YoutubePlayer
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTuberPlayer, boolean b) {
                Log.d(TAG_DESIGN, "onClick: Done initializing");
                youTuberPlayer.loadVideo("pXtN4y3O35M");

            }

            @Override

            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG_DESIGN, "onClick: Failed to initialize");
            }

        };
        //Button plays YouTube Video
        btnPlay.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {


                Log.d(TAG_DESIGN, "Onclick; initializing Youtube player");

                mYoutubePlayerView.initialize(YouTubeActivity.getApiKey(), mOnInitializedListener);

            }

        });
    }
}
