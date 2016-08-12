package com.timodenk.periodictabletrainer;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.BoxInsetLayout;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends WearableActivity {
    ProgressBar progressBar;
    TextView atomicNumber, element, restart;

    PeriodicTableTest test = new PeriodicTableTest();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setAmbientEnabled();

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        atomicNumber = (TextView) findViewById(R.id.textViewAtomicNumber);
        element = (TextView) findViewById(R.id.textViewElement);
        restart = (TextView) findViewById(R.id.textViewRestart);

        updateTest();
    }

    @Override 
    public void onEnterAmbient(Bundle ambientDetails) {
        super.onEnterAmbient(ambientDetails);
    }

    @Override
    public void onUpdateAmbient() {
        super.onUpdateAmbient();
    }

    @Override
    public void onExitAmbient() {
        super.onExitAmbient();
    }

    private void updateTest() {
        progressBar.setProgress((int)(test.getProgress() * 100));

        Element current = test.getCurrentElement();
        atomicNumber.setText(String.valueOf(current.getAtomicNumber()));
        element.setText(current.getElement() + " (" + current.getSymbol() + ")");
    }

    public void continueClicked(View view) {
        test.next();
        updateTest();
    }

    public void restartClicked(View view) {
        test.restart();
        updateTest();
    }
}
