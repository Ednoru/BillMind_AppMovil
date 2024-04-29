package pe.edu.upc.billmind.ui.screens.signup

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
import pe.edu.upc.billmind.data.remote.ClientRequest
import pe.edu.upc.billmind.data.repository.AuthRepository
import pe.edu.upc.billmind.ui.shared.InputTextField
import pe.edu.upc.billmind.ui.shared.PasswordTextField

@Composable
fun SignUpScreen() {
    val name = remember {
        mutableStateOf("")
    }
    val lastName = remember {
        mutableStateOf("")
    }
    val mail = remember {
        mutableStateOf("")
    }
    val phone = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val confirmPassword = remember {
        mutableStateOf("")
    }

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // SignInContent()
            InputTextField(input = name, placeholder = "First name")
            InputTextField(input = lastName, placeholder = "Last name")
            InputTextField(input = mail, placeholder = "Username")
            InputTextField(input = phone, placeholder = "Phone")
            PasswordTextField(password = password, text = "Password")
            PasswordTextField(password = confirmPassword, text = "Confirm password")
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
                onClick = {
                    AuthRepository().signUp(
                        ClientRequest(
                            name.value,
                            lastName.value,
                            mail.value,
                            phone.value,
                            password.value,
                        )
                    ) {

                    }
                }) {
                Text(text = "Sign up")
            }
        }
    }
}