package br.senai.sp.jandira.lotus.screens
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Register(controleNavegacao: NavHostController) {

    Surface(onClick = { /*TODO*/ }) {

        Surface(onClick = { /*TODO*/ }) {

            var nomeState = remember {
                mutableStateOf("")
            }
            var sobrenomeState = remember {
                mutableStateOf("")
            }
            var idadeState = remember {
                mutableStateOf("")
            }
            var pesoState = remember {
                mutableStateOf("")
            }
            var alturaState = remember {
                mutableStateOf("")
            }
            var emailState = remember {
                mutableStateOf("")
            }
            var passwordState = remember {
                mutableStateOf("")
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()

            ) {

                Text(text = "Register Lotus")

                OutlinedTextField(
                    value = nomeState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "Nome")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "",
                            tint = Color(0xffFFAEBF),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffFFAEBF),
                            unfocusedBorderColor = Color(0xffFFAEBF),
                        ),
                    shape = RoundedCornerShape(16.dp),
                    maxLines = 1
                )


                OutlinedTextField(
                    value = sobrenomeState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "Sobrenome")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "",
                            tint = Color(0xffFFAEBF),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffFFAEBF),
                            unfocusedBorderColor = Color(0xffFFAEBF),
                        ),
                    shape = RoundedCornerShape(16.dp),
                    maxLines = 1
                )

                OutlinedTextField(
                    value = idadeState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "idade")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "",
                            tint = Color(0xffFFAEBF),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffFFAEBF),
                            unfocusedBorderColor = Color(0xffFFAEBF),
                        ),
                    shape = RoundedCornerShape(16.dp),
                    maxLines = 1
                )

                OutlinedTextField(
                    value = pesoState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "peso")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "",
                            tint = Color(0xffFFAEBF),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffFFAEBF),
                            unfocusedBorderColor = Color(0xffFFAEBF),
                        ),
                    shape = RoundedCornerShape(16.dp),
                    maxLines = 1
                )

                OutlinedTextField(
                    value = alturaState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "altura")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "",
                            tint = Color(0xffFFAEBF),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffFFAEBF),
                            unfocusedBorderColor = Color(0xffFFAEBF),
                        ),
                    shape = RoundedCornerShape(16.dp),
                    maxLines = 1
                )

                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "email")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "",
                            tint = Color(0xffFFAEBF),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffFFAEBF),
                            unfocusedBorderColor = Color(0xffFFAEBF),
                        ),
                    shape = RoundedCornerShape(16.dp),
                    maxLines = 1
                )

                OutlinedTextField(
                    value = passwordState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "senha")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "",
                            tint = Color(0xffFFAEBF),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffFFAEBF),
                            unfocusedBorderColor = Color(0xffFFAEBF),
                        ),
                    shape = RoundedCornerShape(16.dp),
                    maxLines = 1
                )


                Spacer(modifier = Modifier.height(14.dp))


                Button(onClick = {

//                if (emailState.value == "julia" && passwordState.value == "12345"){
//
//                    controleDeNavegacao.navigate("home")
//
//                }else{
//                    mensagemErroState.value = "Usuario ou senha incorretos"
//                }

                },
                    shape = RoundedCornerShape(66.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color((0xffFFAEBF)))
                ) {
                    Row (
                        modifier = Modifier
                            .width(70.dp)
                            .height(28.dp)
                        ,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ){
                        Text(text = "Entrar")
                        Icon(imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "seta direita",
                            tint = Color(0xFFFFFFFF),
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(text = "Ir para o  Login", Modifier.clickable { controleNavegacao.navigate("login")})


            }

        }
        
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun RegisterPreview() {
    Register(controleNavegacao = rememberNavController())
}
