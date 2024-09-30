package com.interview.testimport.impl.data.datasource

import androidx.datastore.core.DataStore
import com.interview.testimport.publicc.FeatureFlag

internal class GetFeatureFlagLocalDataSource(private val dao: DataStore) {

    fun getFeatureFlag(key: String): FeatureFlag {
        return dao.get(key)
    }

    fun updateLocalFlags(featureFlags: List<FeatureFlag>): Boolean { // should be scheme
        return try {
            dao.insertAll(featureFlags)
            true
        } catch (e: Exception) {
            // log the exception
            false
        }
    }
}