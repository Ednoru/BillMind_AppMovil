package pe.edu.upc.billmind.ui.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.billmind.ui.screens.signin.SignInScreen
import pe.edu.upc.billmind.ui.screens.signup.SignUpScreen
import pe.edu.upc.billmind.ui.screens.welcome.WelcomeScreen
import pe.edu.upc.billmind.ui.viewmodels.AuthViewModel

@Composable
fun Routing() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            WelcomeScreen(
                onSignIn = {
                    navController.navigate(Routes.SignIn.route)
                },
                onSignUp = {
                    navController.navigate(Routes.SignUp.route)
                }
            )
        }
        composable(Routes.SignIn.route) {
            val authViewModel = AuthViewModel()
            SignInScreen(
                authViewModel = authViewModel,
                onSignUp = {
                    navController.navigate(Routes.SignUp.route)
                }
            )
        }
        composable(Routes.SignUp.route) {
            SignUpScreen()
        }
    }
}

sealed class Routes(val route: String) {
    data object Home : Routes("Home")
    data object SignIn : Routes("SignIn")
    data object SignUp : Routes("SignUp")
}