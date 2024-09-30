package com.interview.testimport;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.interview.testimport.publicc.FeatureFlagFetcher;

public class MainActivity extends AppCompatActivity {

    private val featureFlagFetcher: FeatureFlagFetcher by koin()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        val key isNewScreenAvailableFlag = "isNewScreenAvailableFlag"

        // first usage
        featureFlagFetcher.updateAllFlags()

        featureFlagFetcher.getFeatureFlag(key)
    }
}
