package com.example.tludeliverydriver.repo

import com.example.tludeliverydriver.model.User
import com.example.tludeliverydriver.util.UiState
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun registerUser(email: String, password: String, user: User, result: (UiState<String>) -> Unit)
    fun updateUserInfo(user: User, result: (UiState<String>) -> Unit)
    fun loginUser(email: String, password: String, result: (UiState<String>) -> Unit)
    fun forgotPassword(email: String, result: (UiState<String>) -> Unit)
    fun logout(result: () -> Unit)
    fun storeSession(id: String, result: (User?) -> Unit)
    fun getSession(result: (User?) -> Unit)
    fun getSnapshotCurrentUser(userId: String): Flow<UiState<User?>>
}