package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mButtonTop;
    Button mButtonBottom;
    boolean mButtonTopPressed;
    boolean mButtonBottomPressed;
    int mStoryIndex = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonTopPressed = true;
                updateStory();

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonBottomPressed = true;
                updateStory();

            }
        });


    }

    public void updateStory () {
        switch (mStoryIndex)
        {
            case 1:
            {
                if(mButtonTopPressed)
                {
                    mStoryIndex = 3;
                    mStoryText.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }
                else if(mButtonBottomPressed)
                {
                    mStoryIndex = 2;
                    mStoryText.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                }
                mButtonTopPressed = false;
                mButtonBottomPressed = false;
            } break;

            case 2:
            {
                if(mButtonTopPressed)
                {
                    mStoryIndex = 3;
                    mStoryText.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }
                else if(mButtonBottomPressed)
                {
                    mStoryIndex = 4;
                    mStoryText.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }

                mButtonTopPressed = false;
                mButtonBottomPressed = false;
            } break;

            case 3:
            {
                if(mButtonTopPressed)
                {
                    mStoryIndex = 6;
                    mStoryText.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
                else if(mButtonBottomPressed)
                {
                    mStoryIndex = 5;
                    mStoryText.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }

                mButtonTopPressed = false;
                mButtonBottomPressed = false;

            } break;
        }

    }
}
