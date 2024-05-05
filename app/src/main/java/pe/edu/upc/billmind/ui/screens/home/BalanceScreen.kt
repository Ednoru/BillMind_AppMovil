package pe.edu.upc.billmind.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import pe.edu.upc.billmind.ui.shared.BackgroundImg
import pe.edu.upc.billmind.ui.shared.BottomNavBar

@Composable
fun BalanceScreen() {
    BackgroundImg()
    Column {
        Text(text = "Balance Screen")
    }
    BottomNavBar(
        onDebtsClick = { /*TODO*/ },
        onAlertsClick = { /*TODO*/ },
        onBalanceClick = { /*TODO*/ },
        onProfileClick = { /*TODO*/ }
    )

}