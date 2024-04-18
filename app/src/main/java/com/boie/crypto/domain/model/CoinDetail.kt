package com.boie.crypto.domain.model

import com.boie.crypto.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tag: List<String>,
    val team: List<TeamMember>
)
