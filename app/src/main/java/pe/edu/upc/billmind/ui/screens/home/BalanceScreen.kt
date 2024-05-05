package pe.edu.upc.billmind.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import pe.edu.upc.billmind.ui.shared.BackgroundImg
import pe.edu.upc.billmind.ui.shared.BottomNavBar

@Composable
fun BalanceScreen(
    onDebtsScreen: () -> Unit = {},
    onAlertScreen: () -> Unit = {},
    onProfileScreen: () -> Unit = {}
) {
    BackgroundImg()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Balance Screen",
            fontSize = 48.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
    BottomNavBar(
        onDebtsClick = {
            onDebtsScreen()
        },
        onAlertsClick = {
            onAlertScreen()
        },
        onBalanceClick = {},
        onProfileClick = {
            onProfileScreen()
        })
}