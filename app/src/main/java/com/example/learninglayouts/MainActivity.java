/*
    Martin Penberthy
    10/13/2022
 */



package com.example.learninglayouts;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private int isVisible = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get TextView for showing the count
        mShowCount =  (TextView)   findViewById(R.id.show_count);
        //Get the ButtonView for doubling the value
        Button doubleBtn = findViewById(R.id.button_double);
        //Lambda to listen for click
        doubleBtn.setOnClickListener(view -> {
            //Double the value
            mCount *= 2;
            mShowCount.setText(Integer.toString(mCount));
        });

    }

    //Function displays the toast message
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    //Increments the count value and displays it
    public void countUp(View view) {
        mCount++;

        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    //Resets the count value to 0 and displays it
    public void countReset(View view) {
        mCount = 0;

        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    //Changes the visibility of the ImageView
    public void toggleOnOff(View view)
    {
        ImageView bgndImageView =  findViewById(R.id.image_view);
        if(isVisible == 1) {
            bgndImageView.setVisibility(View.VISIBLE);
            isVisible = 0;
        }
        else {
            bgndImageView.setVisibility(View.INVISIBLE);
            isVisible = 1;
        }
    }
}