package com.example.apptarjetapresentacion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.apptarjetapresentacion.ui.theme.AppTarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    ProductoFinal()
                }
            }
        }
    }
}

@Composable
fun TarjetaPersonalVertical(
    pagina: String, email: String, nombre: String, info: String, modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.avatar)


    Box(
        modifier = modifier
            .size(750.dp)
            .background(
                Color(51, 66, 255)
            )
            .padding(20.dp)


    )

    {
        Box(
            modifier = modifier
                .size(750.dp)
                .background(
                    Color(173, 216, 230)
                )
                .padding(20.dp)
                .align(Alignment.TopCenter)
        ) {
            Column(
                modifier = modifier
                    .size(750.dp)
                    .background(Color.White)
                    .padding(16.dp)
                    .align(Alignment.BottomCenter),


                ) {
                Row {
                    Prueba()

                }

                Row {

                    Text(
                        text = "\uD83C\uDF10 $pagina",
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )


                }
                Row {

                    Text(
                        text = "\uD83D\uDCE7 $email",
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp

                    )


                }

                Column(
                    modifier = modifier.padding(16.dp)


                ) {
                    Image(
                        painter = image,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(250.dp)
                            .clip(CircleShape)


                    )
                }

                Row {
                    Text(
                        text = nombre,
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )


                }

                Row {
                    Text(
                        text = info,
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,


                        )


                }


            }
        }


    }

}

@Composable
fun TarjetaPersonalHorizontal(
    pagina: String, email: String, nombre: String, info: String, modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.avatar)

    Box(
        modifier = modifier
            .size(750.dp)
            .background(
                Color(51, 66, 255)
            )
            .padding(20.dp)


    )

    {
        Box(
            modifier = modifier
                .size(750.dp)
                .background(
                    Color(173, 216, 230)
                )
                .padding(20.dp)

        ) {
            Box(
                modifier = modifier
                    .size(750.dp)
                    .background(Color.White)
                    .padding(8.dp)


            ) {
                Column(
                    modifier = modifier

                        .align(Alignment.CenterStart)
                ) {
                    Row {
                        Prueba()
                    }
                    Row {
                        Text(
                            text = "\uD83C\uDF10 $pagina",
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    }
                    Row {
                        Text(
                            text = "\uD83D\uDCE7 $email",
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )

                    }


                }
                Column(
                    modifier = modifier

                        .align(Alignment.Center)
                ) {
                    Image(
                        painter = image,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(200.dp)
                            .clip(CircleShape).padding(8.dp)


                    )

                }
                Column(
                    modifier = modifier

                        .align(Alignment.CenterEnd).padding(3.dp)
                ) {
                    Row {
                        Text(
                            text = nombre,
                            modifier = modifier

                                .padding(8.dp),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center
                        )

                    }
                    Row {
                        Text(
                            text = info,
                            modifier = modifier

                                .padding(8.dp),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,


                            )

                    }

                }

            }

        }
    }


}


@Preview(showBackground = true)
@Composable
fun TarjetaPreview() {
    AppTarjetaPresentacionTheme {
        ProductoFinal()
    }
}

@Composable
fun Prueba() {
    val phone = "\uD83D\uDCF1 \t 640830203"
    val context = LocalContext.current
    TextButton(
        onClick = {

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse(phone)
            startActivity(context, intent, null)
        },
    ) {
        Text(
            text = phone,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            textAlign = TextAlign.Left
        )

    }
}

@Composable
fun ProductoFinal() {
    BoxWithConstraints(Modifier.size(750.dp)) {
        if (maxWidth < 500.dp) {
            TarjetaPersonalVertical(
                "davidmartin.es",
                "David@gmail.com",
                "David Martin Jiménez",
                "Estudiante \n Ies Virgen de la Paloma \n 2ºCurso de DAM "
            )
        } else {
            TarjetaPersonalHorizontal(
                "davidmartin.es",
                "David@gmail.com",
                "David Martin Jiménez",
                "Estudiante \n Ies Virgen de la Paloma \n 2ºCurso de DAM "
            )
        }
    }
}
