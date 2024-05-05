package pe.edu.upc.billmind.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import pe.edu.upc.billmind.ui.shared.BackgroundImg
import pe.edu.upc.billmind.ui.shared.BottomNavBar


@Composable
fun DebtsScreen() {
    BackgroundImg()
    Column {
        Text(
            text = "Debts Screen",
            color = Color.Black
        )
    }
    BottomNavBar(
        onDebtsClick = { /*TODO*/ },
        onAlertsClick = { /*TODO*/ },
        onBalanceClick = { /*TODO*/ },
        onProfileClick = { /*TODO*/ }
    )

}