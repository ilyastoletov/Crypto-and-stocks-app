package com.appninjas.cryptoandstocks.presentation.screens.crypto

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appninjas.cryptoandstocks.domain.model.Crypto
import com.appninjas.cryptoandstocks.domain.usecase.GetCryptoCoursesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CryptoViewModel(private val getCryptoCoursesUseCase: GetCryptoCoursesUseCase) : ViewModel() {

    private val _cryptoCourse: MutableLiveData<ArrayList<Crypto>> = MutableLiveData()
    val cryptoCourse: LiveData<ArrayList<Crypto>> = _cryptoCourse

    fun getCourses() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = getCryptoCoursesUseCase.invoke()
            _cryptoCourse.postValue(result)
        }
    }

}