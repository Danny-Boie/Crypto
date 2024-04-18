package com.boie.crypto.domain.repository

import com.boie.crypto.data.remote.dto.CoinDetailDto
import com.boie.crypto.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}