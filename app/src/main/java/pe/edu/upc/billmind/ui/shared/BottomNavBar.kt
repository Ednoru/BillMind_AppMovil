package pe.edu.upc.billmind.ui.shared

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavBar(
    onCuentasClick: () -> Unit,
    onAlertasClick: () -> Unit,
    onBalanceClick: () -> Unit,
    onPerfilClick: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = onCuentasClick) {
                Text("Cuentas")
            }
            Button(onClick = onAlertasClick) {
                Text("Alertas")
            }
            Button(onClick = onBalanceClick) {
                Text("Balance")
            }
            Button(onClick = onPerfilClick) {
                Text("Perfil")
            }
        }
    }
}

@Preview
@Composable
fun PreviewBottomNavBar() {
    MaterialTheme {
        BottomNavBar(
            onCuentasClick = {},
            onAlertasClick = {},
            onBalanceClick = {},
            onPerfilClick = {}
        )
    }
}