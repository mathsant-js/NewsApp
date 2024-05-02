package com.example.appnoticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appnoticias.ui.theme.AppNoticiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNoticiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Tudo que estiver no Surface, írá rodar no aparelho
                    App()
                }
            }
        }
    }
}
@Composable
fun App(){
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.Gray)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.White),
            Arrangement.Center
        ) {
            Text(text = "App Notícias",
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        ) {

        }
        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Titulo")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {

            }
        }
        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Titulo")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {

            }
        }
        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Titulo")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {
            }
        }
        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Titulo")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {

            }
        }
        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Titulo")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {

            }
        }
        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Titulo")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {

            }
        }
        Column(
            Modifier
                .fillMaxWidth()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Titulo")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {

            }
        }
    }
}

@Composable
@Preview
fun AppPreview(){
    AppNoticiasTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}