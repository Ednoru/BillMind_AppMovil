package pe.edu.upc.billmind.ui.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.billmind.ui.screens.home.AlertsScreen
import pe.edu.upc.billmind.ui.screens.home.BalanceScreen
import pe.edu.upc.billmind.ui.screens.home.DebtsScreen
import pe.edu.upc.billmind.ui.screens.home.ProfileScreen
import pe.edu.upc.billmind.ui.screens.signin.SignInScreen
import pe.edu.upc.billmind.ui.screens.signup.SignUpScreen
import pe.edu.upc.billmind.ui.screens.welcome.WelcomeScreen
import pe.edu.upc.billmind.ui.viewmodels.AuthViewModel

@Composable
fun Routing() {
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
            val authViewModel = AuthViewModel()
            SignInScreen(
                authViewModel = authViewModel,
                onSignComplete = {
                    navController.navigate(Routes.Debts.route)
                },
                onSignUp = {
                    navController.navigate(Routes.SignUp.route)
                }
            )
        }
        composable(Routes.SignUp.route) {
            SignUpScreen()
        }
        composable(Routes.Debts.route) {
            DebtsScreen()
        }
        composable(Routes.Alerts.route) {
            AlertsScreen()
        }
        composable(Routes.Balance.route) {
            BalanceScreen()
        }
        composable(Routes.Profile.route) {
            ProfileScreen()
        }
    }
}

sealed class Routes(val route: String) {
    data object Welcome : Routes("Welcome")
    data object SignIn : Routes("SignIn")
    data object SignUp : Routes("SignUp")
    data object Debts : Routes("Debts")
    data object Alerts : Routes("Alerts")
    data object Balance : Routes("Balance")
    data object Profile : Routes("Profile")
}