package ru.n08i40k.polytechnic.next.network.data.profile

import android.content.Context
import com.android.volley.Response
import kotlinx.serialization.json.Json
import ru.n08i40k.polytechnic.next.model.Profile
import ru.n08i40k.polytechnic.next.network.data.AuthorizedRequest

class UsersMeRequest(
    context: Context,
    listener: Response.Listener<Profile>,
    errorListener: Response.ErrorListener?
) : AuthorizedRequest(
    context,
    Method.GET,
    "users/me",
    { listener.onResponse(Json.decodeFromString(it)) },
    errorListener
)