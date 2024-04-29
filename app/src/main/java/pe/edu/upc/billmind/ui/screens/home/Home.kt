package pe.edu.upc.billmind.ui.screens.home

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.billmind.ui.screens.signin.SignInScreen
import pe.edu.upc.billmind.ui.screens.signup.SignUpScreen
import pe.edu.upc.billmind.ui.screens.welcome.WelcomeScreen

@Composable
fun Home() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Welcome.route) {
        composable(Routes.Welcome.route) {
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
            SignInScreen {
                navController.navigate(Routes.SignUp.route)
            }
        }
        composable(Routes.SignUp.route) {
            SignUpScreen()
        }
    }
}

sealed class Routes(val route: String) {
    data object Welcome : Routes("Welcome")
    data object SignIn : Routes("SignIn")
    data object SignUp : Routes("SignUp")
}