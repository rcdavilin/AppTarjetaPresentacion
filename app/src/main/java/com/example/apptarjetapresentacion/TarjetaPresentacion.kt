package com.example.apptarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apptarjetapresentacion.ui.theme.AppTarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPersonal("640830203","rcdavilin.es","rdavilin@gmail.com","David Martin",
                        "Estudiante \n Ies virgen de la Paloma \n 2ºCurso de DAM ")
                }
            }
        }
    }
}

@Composable
fun TarjetaPersonal(telefono: String, pagina:String, email: String,
                    nombre: String, info:String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.valo)

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Red)
            .padding(20.dp)

    )

    {
       Box(modifier = modifier
           .fillMaxWidth()
           .background(Color.Black)
           .padding(20.dp)
           .align(Alignment.TopCenter)) {
           Column (
               modifier = modifier
                   .fillMaxWidth()
                   .background(Color.White)
                   .padding(16.dp)
                   .align(Alignment.TopCenter),


           ) {
               Row {
                   Text(
                       text = "Telefono: $telefono",
                       modifier = modifier
                           .fillMaxWidth()
                           .padding(16.dp),
                       fontWeight = FontWeight.Bold,
                       fontSize = 18.sp
                   )


               }

               Row {
                   Text(
                       text = "Pagina Web: $pagina",
                       modifier = modifier
                           .fillMaxWidth()
                           .padding(16.dp),
                       fontWeight = FontWeight.Bold,
                       fontSize = 18.sp
                   )


               }
               Row {
                   Text(
                       text = "Correo Electronico: $email",
                       modifier = modifier
                           .fillMaxWidth()
                           .padding(16.dp),
                       fontWeight = FontWeight.Bold,
                       fontSize = 18.sp

                   )


               }


           }
       }
        Column(
            modifier = Modifier
                .fillMaxWidth().padding(16.dp).align(Alignment.CenterStart)


            ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth

            )
        }

        Box(modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(20.dp)
            .align(Alignment.BottomCenter)) {
            Column (
                modifier = modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(16.dp)
                    .align(Alignment.BottomCenter),


                ) {

                Row {
                    Text(
                        text = "Nombre: $nombre",
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )


                }

                Row {
                    Text(
                        text = "Info personal: \n $info",
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )


                }



                }


            }
        }


    }





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTarjetaPresentacionTheme {
        TarjetaPersonal("640830203","rcdavilin.es","rdavilin@gmail.com","David Martin",
            "Estudiante \n Ies virgen de la Paloma \n 2ºCurso de DAM ")
    }
}