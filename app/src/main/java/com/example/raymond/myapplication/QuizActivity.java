package com.example.raymond.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

        private testbank xtestbank = new testbank();

        private TextView questionView;
        private Button answer1;
        private Button answer2;
        private Button answer3;
        private Button answer4;
        private TextView hint;
        private ImageButton showhint;

        private String Answer;
        private int scoreno = 0;
        private int questionno = 0;

        private static final String TAG_QUIZ = "quiz output";

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quiz);
            questionView = findViewById(R.id.question);
            answer1 = findViewById(R.id.answer1);
            answer2 = findViewById(R.id.answer2);
            answer3 = findViewById(R.id.answer3);
            answer4 = findViewById(R.id.answer4);
            hint = findViewById(R.id.hintbox);
            showhint = findViewById(R.id.hint);

            updateQuestion();
            //Reasoning for how to determine if the answer is right
            answer1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (answer1.getText() == Answer) {
                        scoreno = scoreno + 1;
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(QuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
                        //did not let students progress if they got the answer wrong
                    }
                    Log.e(TAG_QUIZ, "First Button Output");
                }
            });

            answer2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (answer2.getText() == Answer) {
                        scoreno = scoreno + 1;
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(QuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
                    }
                    Log.e(TAG_QUIZ, "Second Button Output");
                }
            });
            answer3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (answer3.getText() == Answer) {
                        scoreno = scoreno + 1;
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(QuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
                    }
                    Log.e(TAG_QUIZ, "Third Button Output");
                }
            });

            answer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (answer4.getText() == Answer) {
                        scoreno = scoreno + 1;
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(QuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
                    }
                    Log.e(TAG_QUIZ, "Fourth Button Output");
                }
            });

            showhint.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toast.makeText(QuizActivity.this, hint.getText().toString(), Toast.LENGTH_SHORT).show();
                    Log.e(TAG_QUIZ, "Hint Button Output");
                }
            });
        }
        //Method calls strings from testbank and updates textviews and buttons
        private void updateQuestion () {
            questionView.setText(xtestbank.getQuestion(questionno));
            answer1.setText(xtestbank.getChoice1(questionno));
            answer2.setText(xtestbank.getChoice2(questionno));
            answer3.setText(xtestbank.getChoice3(questionno));
            answer4.setText(xtestbank.getChoice4(questionno));
            hint.setText(xtestbank.getHint(questionno));

            Answer = xtestbank.getAnswer(questionno);
            questionno++;
            Log.e(TAG_QUIZ, "Questions Updated");
            //If statement ensures that if user reaches the max amount of questions they would be redirected to the result screen
            if (questionno > 12) {
                Intent resultIntent = new Intent(this, ResultActivity.class);
                resultIntent.putExtra("Score", scoreno);
                startActivity(resultIntent);
                Log.e(TAG_QUIZ, "Intent called");
            }
        }
    }

