package br.senai.sp.jandira.lotus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.lotus.screens.Login
import br.senai.sp.jandira.lotus.screens.Register
import br.senai.sp.jandira.lotus.screens.RegisterDoula
import br.senai.sp.jandira.lotus.screens.RegisterGestante
import br.senai.sp.jandira.lotus.ui.theme.LotusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LotusTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Login()
                    val controleNavegacao = rememberNavController()
                    NavHost(
                        navController = controleNavegacao,
                        startDestination = "Login"
                    ) {
                        composable(route = "login") { Login(controleNavegacao) }
                        composable(route = "register") { Register(controleNavegacao) }
                        composable(route = "registerdoula") { RegisterDoula(controleNavegacao) }
                        composable(route = "registergestante") { RegisterGestante(controleNavegacao) }
                    }
                }
            }
        }
    }
}



