package pe.edu.upc.billmind.ui.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import pe.edu.upc.billmind.domain.model.Client
import pe.edu.upc.billmind.factories.AuthServiceFactory
import retrofit2.Call
import retrofit2.Response

class AuthViewModel : ViewModel() {
    private val authService = AuthServiceFactory.getInstance()

    fun login(email: String, password: String, onResult: (Boolean) -> Unit) {
        authService.signIn(email, password).enqueue(object : retrofit2.Callback<List<Client>> {
            override fun onResponse(call: Call<List<Client>>, response: Response<List<Client>>) {
                if (response.isSuccessful) {
                    val clients = response.body() as List<Client>
                    onResult(clients.isNotEmpty())
                }
            }

            override fun onFailure(p0: Call<List<Client>>, t: Throwable) {
                t.message?.let {
                    Log.d("AuthViewModel", it)
                }
            }
        })
    }
}