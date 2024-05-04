package pe.edu.upc.billmind.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.billmind.ui.screens.signin.SignInScreen
import pe.edu.upc.billmind.ui.screens.signup.SignUpScreen
import pe.edu.upc.billmind.ui.screens.welcome.WelcomeScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home() {
    Scaffold {
        BottomAppBar(
            content = {
            }
        )
    }
}