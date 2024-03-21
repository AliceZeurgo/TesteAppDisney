package br.senai.sp.jandira.disneyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.disneyapp.ui.theme.DisneyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisneyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

fun Icon(ImageVector: ImageVector, contentDescription: Any?) {

}

@Composable
fun Greeting() {

    Image(
        painterResource(id = R.drawable.torre),
        contentDescription = "Torre",
        contentScale = ContentScale.Crop,
    )
    Surface(
        color = Color(0x801D2020)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            OutlinedTextField(value ="", onValueChange ={},
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Buscar Personagem...",
                        color = Color.White)
                },
                shape = RoundedCornerShape(16.dp),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(imageVector = Icons.Default.Search, contentDescription = "Botao Buscar...",
                            tint = Color.White
                            )
                    }
                }
            )
            Text(text = "Personagens",
                fontWeight = FontWeight.Bold,
                color = Color(0xFFCFA7F1),
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(12.dp))
            LazyRow{
                items(20){
                        Card(
                            modifier = Modifier
                                .width(300.dp)
                                .height(700.dp)
                                .padding(end = 8.dp),
                                colors = CardDefaults
                                    .cardColors(
                                        containerColor = Color(0x529783BB)
                                    ),
                            border = BorderStroke(width = 2.dp,
                                brush = Brush.horizontalGradient(listOf(Color(0xFFA27DCC), Color(
                                    0xFF38314B
                                )
                                )))
                        ) {
                            Row (modifier = Modifier.fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                ){
                                Card(
                                    shape = CircleShape
                                ) {
                                    Image(painter = painterResource(id = R.drawable.rapiunzelll),
                                        contentDescription = "",
                                        Modifier.size(70.dp)
                                        )
                                }
                                Column {
                                 Text(
                                     text = "Rapunzel",
                                     fontSize = 20.sp,
                                     modifier = Modifier,
                                     color = Color(0xFFCAB6E7)
                                 )
                                    Text(text = "A melhor princesa do mundo inteiroooo, a mais mais do universo",
                                        color = Color(0xFFCCB0E0),
                                        modifier = Modifier
                                            .padding(10.dp)
                                        )
                                }
                            }
                        }
                    }
                }
            }

        }
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    DisneyAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting()
        }
    }
}