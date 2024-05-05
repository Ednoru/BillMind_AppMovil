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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.upc.billmind.ui.shared.BackgroundImg
import pe.edu.upc.billmind.ui.shared.InputTextField
import pe.edu.upc.billmind.ui.shared.PasswordTextField
import pe.edu.upc.billmind.ui.viewmodels.AuthViewModel


@Composable
fun SignInScreen(
    authViewModel: AuthViewModel,
    onSignComplete: () -> Unit,
    onSignUp: () -> Unit
) {
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }

    var showError by remember { mutableStateOf(false) }


    Scaffold { paddingValues ->
        BackgroundImg()
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            InputTextField(
                input = email,
                placeholder = "Username" ,

            )
            PasswordTextField(
                password = password,
                text = "Password"
            )
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                onClick = {
                    authViewModel.login(email.toString(), password.toString()){ success->
                        if(success){
                            onSignComplete()
                        }
                        else{
                            //Message("Inicio de sesión fallido")
                            showError = true
                        }
                    }
                }) {
                Text(text = "Sign in")
            }
            if (showError) {
                Text(
                    text = "Inicio de sesión fallido",
                    color = Color.Red,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                onClick = {
                    onSignUp()
                }) {
                Text(text = "Sign up")
            }
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    SignInScreen(AuthViewModel(), {}, {})
}