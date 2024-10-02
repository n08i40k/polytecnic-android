package ru.n08i40k.polytechnic.next.model

import kotlinx.serialization.Serializable

@Serializable
class Group(
    val name: String,
    val days: ArrayList<Day?>
)