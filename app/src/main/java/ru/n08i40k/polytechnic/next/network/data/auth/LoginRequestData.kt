package ru.n08i40k.polytechnic.next.network.data.auth

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestData(val username: String, val password: String)