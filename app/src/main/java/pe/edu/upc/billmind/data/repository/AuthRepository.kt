package pe.edu.upc.billmind.data.repository

import android.util.Log
import pe.edu.upc.billmind.data.remote.AuthService
import pe.edu.upc.billmind.data.remote.ClientRequest
import pe.edu.upc.billmind.domain.model.Client
import pe.edu.upc.billmind.factories.AuthServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AuthRepository(private val clients: List<Client>) {
//    fun signUp(userRequest: ClientRequest, callback: (Client) -> Unit) {
//        val signUp = authService.signUp(userRequest)
//        signUp.enqueue(object : Callback<Client> {
//            override fun onResponse(call: Call<Client>, response: Response<Client>) {
//                if (response.isSuccessful) {
//                    val user = response.body() as Client
//                    callback(user)
//                }
//            }
//
//            override fun onFailure(call: Call<Client>, t: Throwable) {
//                t.message?.let {
//                    Log.d("AuthRepository", it)
//                }
//            }
//        })
//    }

    fun login(email: String, password: String): Boolean {
        for (client in clients){
            if(client.mail==email && client.password==password){
                return true
            }
        }
        return false
    }
}