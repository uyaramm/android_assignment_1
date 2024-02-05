package com.example.assignment1_uyaramontovaneli

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1_uyaramontovaneli.ui.theme.Assignment1_uyaramontovaneliTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1_uyaramontovaneliTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFEADDFF)),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        PersonalCard(stringResource(id = R.string.full_name), stringResource(id = R.string.title))

        Spacer(modifier = Modifier.height(200.dp))

        Contact(stringResource(id = R.string.phone), stringResource(id = R.string.connect),
            stringResource(id = R.string.email))
    }
}

@Composable
fun PersonalCard(name: String,title: String, modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = null,
                    modifier = modifier
                        .height(150.dp)
                        .width(150.dp)
                )

                Text(
                    text = name,
                    fontSize = 40.sp,
                    fontFamily = FontFamily.Monospace,
                    color = (Color(0xFF7F4D7A)),
                    fontWeight = FontWeight.Bold,
                )

            Text(
                text = title,
                color = (Color(0xFF2E1A2A)),
                fontSize = 20.sp,
            )
        }
    }

@Composable
fun Contact (phone:String, connect:String,email:String, modifier: Modifier = Modifier) {
        Column(
        ) {
            Row(
                modifier = Modifier.padding(8.dp)
            ){
                Icon(imageVector = Icons.Default.Phone, contentDescription = null,tint = Color.Green)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = phone,
                    color = (Color(0xFF7F4D7A)),
                    fontSize = 20.sp,
                )
            }
            Row(
                modifier = Modifier.padding(8.dp)
            ){
                Icon(imageVector = Icons.Default.Share, contentDescription = null,tint = Color.Green)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = connect,
                    color = (Color(0xFF7F4D7A)),
                    fontSize = 20.sp,
                )
            }
            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .padding(bottom = 15.dp)
            ){
                Icon(imageVector = Icons.Default.Email, contentDescription = null,tint = Color.Green)
                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = email,
                    color = (Color(0xFF7F4D7A)),
                    fontSize = 20.sp,
                )
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment1_uyaramontovaneliTheme {
        Main()
    }
}