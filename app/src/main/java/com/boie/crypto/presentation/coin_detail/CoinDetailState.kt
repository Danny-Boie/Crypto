package com.boie.crypto.presentation.coin_detail

import com.boie.crypto.domain.model.Coin
import com.boie.crypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
