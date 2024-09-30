package com.interview.testimport.impl.data.api

import com.interview.testimport.impl.data.model.FeatureFlagListResponse


interface GetFeatureFlagListApi {

    fun getFeatureFlagList(): FeatureFlagListResponse
}