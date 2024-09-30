package com.interview.testimport.impl.data.repository

import com.interview.testimport.impl.data.datasource.GetFeatureFlagLocalDataSource
import com.interview.testimport.impl.data.datasource.GetFeatureFlagRemoteDataSource
import com.interview.testimport.impl.domain.repo.FeatureFlagFetcherRepository
import com.interview.testimport.publicc.FeatureFlag

internal class FeatureFlagFetcherRepositoryImpl(
    private val featureFlagRemoteDataSource: GetFeatureFlagRemoteDataSource,
    private val featureFlagLocalDataSource: GetFeatureFlagLocalDataSource,
    private val dispatcher: Dispatcher = DispatcherIO
): FeatureFlagFetcherRepository {
    override fun getFeatureFlag(key: String): FeatureFlag {
        // Change dispatcher
        // Try to get Locally, if not -> call getFeatureFlags, then call locally again
        // Make getFeatureFlag default value false
        return featureFlagLocalDataSource.getFeatureFlag(key)
    }

    override fun getFeatureFlags(): List<FeatureFlag> {
        // Change my dispatcher
        val flagList = featureFlagRemoteDataSource.getFeatureFlagList()
        featureFlagLocalDataSource.updateLocalFlags(flagList)
        return flagList
    }
}