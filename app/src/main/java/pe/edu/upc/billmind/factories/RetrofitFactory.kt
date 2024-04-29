package pe.edu.upc.billmind.factories

import pe.edu.upc.billmind.network.APIClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory private constructor() {
    companion object {
        private var retrofit: Retrofit? = null

        fun getRetrofit(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl(APIClient.ApiClient.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build()
            }
            return retrofit as Retrofit
        }
    }
}