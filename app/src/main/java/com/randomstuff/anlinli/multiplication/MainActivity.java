package com.randomstuff.anlinli.multiplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final int num = new Random().nextInt(10);
    final int num2 = new Random().nextInt(10);
    final int num3 = new Random().nextInt(10);
    final int num4 = new Random().nextInt(10);
    final int num5 = new Random().nextInt(10);
    final int num6 = new Random().nextInt(10);
    final int num7 = new Random().nextInt(10);
    final int num8 = new Random().nextInt(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void start(View view) {
        displayoneA(num);
        displayoneB(num2);
        displaytwoA(num3);
        displaytwoB(num4);
        displaythreeA(num5);
        displaythreeB(num6);
        displayfourA(num7);
        displayfourB(num8);

    }
    public void next(View view) {
        displayoneA(num);
        displayoneB(num2);
        displaytwoA(num3);
        displaytwoB(num4);
        displaythreeA(num5);
        displaythreeB(num6);
        displayfourA(num7);
        displayfourB(num8);

    }


    public void displayoneA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.oneA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayoneB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.oneB);
        scoreView.setText(String.valueOf(score));
    }

    public void displaytwoA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.twoA);
        scoreView.setText(String.valueOf(score));
    }

    public void displaytwoB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.twoB);
        scoreView.setText(String.valueOf(score));
    }

    public void displaythreeA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.threeA);
        scoreView.setText(String.valueOf(score));
    }

    public void displaythreeB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.threeB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfourA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fourA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfourB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fourB);
        scoreView.setText(String.valueOf(score));
    }


}
