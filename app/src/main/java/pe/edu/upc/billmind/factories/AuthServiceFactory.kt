package pe.edu.upc.billmind.factories

import android.util.Log
import pe.edu.upc.billmind.data.remote.AuthService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AuthServiceFactory private constructor(){

    companion object {
        private var authService: AuthService? = null

        fun getInstance(): AuthService {
            if (authService == null) {
                authService = RetrofitFactory.getRetrofit().create(AuthService::class.java)
            }
            return authService as AuthService
        }
    }
}