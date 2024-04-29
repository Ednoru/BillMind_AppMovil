package pe.edu.upc.billmind.ui.screens.signin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pe.edu.upc.billmind.ui.shared.InputTextField
import pe.edu.upc.billmind.ui.shared.PasswordTextField

@Composable
fun SignInScreen(
    onSignUp: () -> Unit
) {
    val username = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // SignInContent()
            InputTextField(input = username, placeholder = "Username" )
            PasswordTextField(password = password, text = "Password")
            Button(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Sign in")
            }
            Button(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                onClick = {
                    // Navigate to sign up screen
                    onSignUp()
                }) {
                Text(text = "Sign up")
            }
        }
    }
}