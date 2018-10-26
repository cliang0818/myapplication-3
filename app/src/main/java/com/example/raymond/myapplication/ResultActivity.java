package com.example.raymond.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView scoreResult;
    private ImageView rewardCat;
    private static final String TAG_RESULT = "result";
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        scoreResult = findViewById(R.id.scoreresult);
        rewardCat = findViewById(R.id.catimage);
        //Getting the score from quiz activity through intents
        Bundle extras = getIntent().getExtras();
        int sessionId= extras.getInt("Score");

        if(sessionId > 10){
            rewardCat.setVisibility(View.VISIBLE);
        }

        updateScoreresult(sessionId);
        Log.e(TAG_RESULT,"Result updated");
    }

    private void updateScoreresult(int point){
        scoreResult.setText("" + point);
    }

}

