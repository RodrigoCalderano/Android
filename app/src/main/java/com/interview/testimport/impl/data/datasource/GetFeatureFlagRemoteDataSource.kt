package com.interview.testimport.impl.data.datasource

import com.interview.testimport.impl.data.api.GetFeatureFlagListApi
import com.interview.testimport.impl.data.model.toDomainLayer
import com.interview.testimport.publicc.FeatureFlag

internal class GetFeatureFlagRemoteDataSource(private val getFeatureFlagListApi: GetFeatureFlagListApi) {
    fun getFeatureFlagList(): List<FeatureFlag> {
        return getFeatureFlagListApi.getFeatureFlagList().toDomainLayer()
    }
}