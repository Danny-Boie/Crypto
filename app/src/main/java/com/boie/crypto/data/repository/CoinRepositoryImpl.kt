package com.boie.crypto.data.repository

import com.boie.crypto.data.remote.CoinPaprikaApi
import com.boie.crypto.data.remote.dto.CoinDetailDto
import com.boie.crypto.data.remote.dto.CoinDto
import com.boie.crypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}