package com.interview.testimport.impl.data.model

import com.interview.testimport.publicc.FeatureFlag as DomainFeatureFlag

internal data class FeatureFlagListResponse(val featureFlags: List<FeatureFlag>)

data class FeatureFlag(val key: String, val isTreated: Boolean)

internal fun FeatureFlagListResponse.toDomainLayer(): List<DomainFeatureFlag> {
    return featureFlags.map {
        DomainFeatureFlag(
            key = it.key,
            isTreated = it.isTreated
        )
    }
}