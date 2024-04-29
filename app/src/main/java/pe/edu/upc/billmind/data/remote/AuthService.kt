package pe.edu.upc.billmind.data.remote

import pe.edu.upc.billmind.domain.model.Client
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthService {
    @GET("clients")
    fun signIn(@Query("email") email: String, @Query("password") password: String): Call<List<Client>>

    @POST("clients")
    fun signUp(@Body request: ClientRequest): Call<Client>
}