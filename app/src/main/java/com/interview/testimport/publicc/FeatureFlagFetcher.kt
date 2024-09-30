package com.interview.testimport.publicc

interface FeatureFlagFetcher {
    fun getFeatureFlag(key: String): FeatureFlag
}