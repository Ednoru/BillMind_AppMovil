package pe.edu.upc.billmind.ui.shared

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.upc.billmind.R

@Composable
fun BottomNavBar(
    onDebtsClick: () -> Unit,
    onAlertsClick: () -> Unit,
    onBalanceClick: () -> Unit,
    onProfileClick: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color(0xFF0D47A1))
                .padding(4.dp), Arrangement.SpaceBetween, Alignment.Bottom
        ) {
            IconButton(
                onClick = onDebtsClick,
                modifier = Modifier
                    .size(70.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_accounts),
                        contentDescription = "Cuentas",
                        modifier = Modifier.size(40.dp),
                        tint = Color.White
                    )
                    Text("Cuentas", fontSize = 10.sp, color = Color.White, textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            IconButton(
                onClick = onAlertsClick,
                modifier = Modifier
                    .size(70.dp) // Tamaño adecuado para cada ícono
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_alerts),
                        contentDescription = "Alertas",
                        modifier = Modifier.size(40.dp),
                        tint = Color.White
                    )
                    Text("Alertas", fontSize = 10.sp, color = Color.White, textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            IconButton(
                onClick = onBalanceClick,
                modifier = Modifier
                    .size(70.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_calculate),
                        contentDescription = "Balance",
                        modifier = Modifier.size(40.dp),
                        tint = Color.White
                    )
                    Text("Balance", fontSize = 10.sp, color = Color.White, textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            IconButton(
                onClick = onProfileClick,
                modifier = Modifier
                    .size(70.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_account),
                        contentDescription = "Perfil",
                        modifier = Modifier.size(40.dp),
                        tint = Color.White
                    )
                    Text("Perfil", fontSize = 10.sp, color = Color.White, textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Preview
@Composable
fun BottomNavBarPreview() {
    BottomNavBar({}, {}, {}, {})
}