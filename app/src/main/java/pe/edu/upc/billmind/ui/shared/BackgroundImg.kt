package pe.edu.upc.billmind.ui.shared

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import pe.edu.upc.billmind.R

@Composable
fun BackgroundImg() {
    Image(
        painter = painterResource(id = R.drawable.fondo), // Asegúrate de tener una imagen llamada 'Fondo' en tu carpeta 'res/drawable'
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop // Esto hará que tu imagen se redimensione para llenar el tamaño máximo manteniendo su relación de aspecto
    )
}