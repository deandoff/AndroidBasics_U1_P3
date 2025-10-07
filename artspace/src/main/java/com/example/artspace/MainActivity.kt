package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtApp()
        }
    }
}

@Composable
fun ArtApp() {
    val artworks = listOf(
        Triple(R.drawable.sternennacht, "Sternennacht", "Vincent Van Gogh (1889)"),
        Triple(R.drawable.cherny_kvadrat, "Black square", "Kazimir Malevich (1915)"),
        Triple(R.drawable.devochka_s_persikami, "Girl with Peaches", "Valentin Serov (1887)"),
        Triple(R.drawable.devushka_s_serejkoy, "Girl with a Pearl Earring", "Johannes Vermeer (1665)"),
        Triple(R.drawable.postoyanstvo_vremeni, "La persistance de la mémoire", "Salvador Dalí (1931)")
    )

    var artworkIndex by remember { mutableIntStateOf(0) }

    val (imageRes, title, author) = artworks[artworkIndex]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp, bottom = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Justify
            )
            Text(
                text = author,
                fontSize = 24.sp,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Justify
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                artworkIndex = if (artworkIndex == 0) artworks.lastIndex else artworkIndex - 1
            }) {
                Text(text = "Previous")
            }
            Button(onClick = {
                artworkIndex = (artworkIndex + 1) % artworks.size
            }) {
                Text(text = "Next")
            }
        }
    }
}



@Preview
@Composable
fun ArtAppPreview() {
    ArtApp()
}