package pe.edu.upc.billmind.ui.viewmodels

import androidx.lifecycle.ViewModel
import okhttp3.Callback
import pe.edu.upc.billmind.data.repository.AuthRepository

class AuthViewModel(private val authRepository: AuthRepository):ViewModel() {
    fun login(email: String, password:String, callback: (Boolean)->Unit){
        val success=authRepository.login(email, password)
        callback(success)
    }
}