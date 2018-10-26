package com.example.raymond.myapplication;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class agilescrum extends YouTubeBaseActivity {

    private static final String TAG_AGILE = "Agile Scrum Youtube";
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agilescrum);

        TextView title;
        TextView description;

        title = findViewById(R.id.agilescrumHeading);
        description = findViewById(R.id.agilescrumDesc);

        String mytitle = getResources().getString(R.string.agilescrumtitle);
        String mydescription = getResources().getString(R.string.agilescrumdesc);

        title.setText(mytitle);
        description.setText(mydescription);
        Log.d(TAG_AGILE, "onCreate: Starting.");

        btnPlay = findViewById(R.id.btnPlayagile);
        mYoutubePlayerView = findViewById(R.id.youtubePlayagile);
        //Initialize YouTube Player
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTuberPlayer, boolean b) {
                Log.d(TAG_AGILE, "onClick: Done initializing");
                youTuberPlayer.loadVideo("9TycLR0TqFA");

            }

            @Override

            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG_AGILE, "onClick: Failed to initialize");
            }

        };
        //Button plays youtube video
        btnPlay.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {


                Log.d(TAG_AGILE, "Onclick; initializing Youtube player");

                mYoutubePlayerView.initialize(YouTubeActivity.getApiKey(), mOnInitializedListener);

            }

        });

    }


}


