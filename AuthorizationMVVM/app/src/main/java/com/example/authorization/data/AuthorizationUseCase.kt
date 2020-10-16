package com.example.authorization.domain

import android.se.omapi.Session
import androidx.lifecycle.LiveData

class AuthorizationUseCase(private val authoListRepository: AuthoListRepository) {
    fun loadSession(): LiveData<List<Session>> {
        return authoListRepository.loadSession()
    }
}