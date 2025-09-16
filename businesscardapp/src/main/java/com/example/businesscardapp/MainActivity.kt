package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HeaderContent(
            name = "Akhmetgaleev Islam",
            title = "Kotlin and Java developer"
        )

        ContactInformation(
            phoneNumber = "+7 (904) 760 95 69",
            socialMedia = "@deandoff",
            email = "deandoff@gmail.com",
            modifier = Modifier.padding(top = 60.dp)
        )
    }
}

@Composable
fun HeaderContent(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            Icons.Rounded.Person,
            tint = Color.Magenta,
            modifier = modifier.size(120.dp),
            contentDescription = "Profile"
        )
        Text(
            text = name,
            modifier = modifier.padding(top = 16.dp, bottom = 8.dp),
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = title,
            modifier = modifier.padding(bottom = 8.dp),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Gray
        )
    }
}

@Composable
fun ContactInformation(phoneNumber: String, socialMedia: String, email: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 12.dp)
        ) {
            Icon(
                Icons.Default.Phone,
                contentDescription = "Phone",
                modifier = Modifier.size(24.dp),
                tint = Color(0xFF3F51B5)
            )
            Text(
                text = phoneNumber,
                modifier = Modifier.padding(start = 16.dp),
                fontSize = 16.sp
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 12.dp)
        ) {
            Icon(
                Icons.AutoMirrored.Filled.Send,
                contentDescription = "Social Media",
                modifier = Modifier.size(24.dp),
                tint = Color(0xFF3F51B5)
            )
            Text(
                text = socialMedia,
                modifier = Modifier.padding(start = 16.dp),
                fontSize = 16.sp
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.Email,
                contentDescription = "Email",
                modifier = Modifier.size(24.dp),
                tint = Color(0xFF3F51B5)
            )
            Text(
                text = email,
                modifier = Modifier.padding(start = 16.dp),
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}