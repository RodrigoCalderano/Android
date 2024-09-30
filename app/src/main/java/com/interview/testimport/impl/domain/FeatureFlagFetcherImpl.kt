package com.interview.testimport.impl.domain

import com.interview.testimport.impl.domain.repo.FeatureFlagFetcherRepository
import com.interview.testimport.publicc.FeatureFlag
import com.interview.testimport.publicc.FeatureFlagFetcher


internal class FeatureFlagFetcherImpl(private val repository: FeatureFlagFetcherRepository) : FeatureFlagFetcher {
    override fun getFeatureFlag(key: String): FeatureFlag {
        return repository.getFeatureFlag(key)
    }
}
