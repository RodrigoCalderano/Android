package com.interview.testimport.impl.domain.repo

import com.interview.testimport.publicc.FeatureFlag

internal interface FeatureFlagFetcherRepository {
    fun getFeatureFlag(key: String): FeatureFlag
    fun getFeatureFlags(): List<FeatureFlag>
}
