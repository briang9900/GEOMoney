package com.example.myapplication.ui.transfer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TransferViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Transfer Fragment"
    }
    val text: LiveData<String> = _text
}