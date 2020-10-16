package com.example.authorization.domain

import android.content.ClipData
import android.se.omapi.Session
import androidx.lifecycle.LiveData

interface AuthoListRepository {
    fun loadSession(): LiveData<List<Session>>
}