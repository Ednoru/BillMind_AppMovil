package pe.edu.upc.billmind.ui.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.upc.billmind.R

@Composable
fun WelcomeScreen(
    onSignIn: () -> Unit,
    onSignUp: () -> Unit
) {
    Image(
        painter = painterResource(id = R.drawable.fondo), // Asegúrate de tener una imagen llamada 'Fondo' en tu carpeta 'res/drawable'
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop // Esto hará que tu imagen se redimensione para llenar el tamaño máximo manteniendo su relación de aspecto
    )
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "BILLMIND",
            fontSize = 32.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onSignIn,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
                .height(48.dp)
        ) {
            Text(text = "Sign in")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Don't have an account? Sign up",
            color = Color.Green,
            modifier = Modifier.clickable(onClick = onSignUp)
        )
    }
}