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

public class usecases extends YouTubeBaseActivity {

    private static final String TAG ="Use Cases";
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usecases);

        TextView title;
        TextView description;

        title = findViewById(R.id.usecaseHeading);
        description = findViewById(R.id.usecaseDesc);

        String mytitle = getResources().getString(R.string.usecasetitle);
        String mydescription = getResources().getString(R.string.usecasedescription);

        title.setText(mytitle);
        description.setText(mydescription);

        Log.d(TAG, "onCreate: Starting.");

        btnPlay =findViewById(R.id.btnPlayuse);
        mYoutubePlayerView = findViewById(R.id.youtubePlayuse);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTuberPlayer, boolean b) {
                Log.d(TAG, "onClick: Done initializing");
                youTuberPlayer.loadVideo("nN7lTDWKP6g");

            }

            @Override

            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failed to initialize");
            }

        };

        btnPlay.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {


                Log.d(TAG, "Onclick; initializing Youtube player");

                mYoutubePlayerView.initialize(YouTubeActivity.getApiKey(), mOnInitializedListener);

            }

        });
    }
}
