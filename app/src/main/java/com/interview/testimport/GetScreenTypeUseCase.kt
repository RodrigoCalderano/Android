package com.interview.testimport

import com.interview.testimport.publicc.FeatureFlagFetcher

internal class GetScreenTypeUseCase(private val featureFlagFetcher: FeatureFlagFetcher) {
    private val isNewScreenAvailable: String = "isNewScreenAvailable"

    operator fun invoke(): ScreenType {
        return if (featureFlagFetcher.getFeatureFlag(isNewScreenAvailable))
            ScreenType.Available
        else ScreenType.Disabled
    }
}
