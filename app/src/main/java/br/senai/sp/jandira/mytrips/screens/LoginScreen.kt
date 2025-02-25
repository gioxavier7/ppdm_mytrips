package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
     {
         Card(
             colors = CardDefaults.cardColors(
                 Color(0xFF4F27A8)
             ),
             modifier = Modifier
                 .align(Alignment.TopEnd)
                 .width(130.dp)
                 .height(45.dp),


             shape = RoundedCornerShape(
                 topStart = 0.dp,
                 bottomStart = 15.dp,
                 topEnd = 0.dp
             )
         ){}
         Card(
             colors = CardDefaults.cardColors(
                 Color(0xFF4F27A8)
             ),
             modifier = Modifier
                 .align(Alignment.BottomStart)
                 .width(130.dp)
                 .height(45.dp),


             shape = RoundedCornerShape(
                 topStart = 0.dp,
                 topEnd = 15.dp
             )
         ){}
         Column(
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(20.dp)
                 .align(Alignment.Center),
             horizontalAlignment = Alignment.CenterHorizontally,
             verticalArrangement = Arrangement.SpaceBetween
         ) {
            Text(
                text = stringResource(R.string.login),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4F27A8),
                modifier = Modifier
                    .align(Alignment.Start)
            )
             Text(
                 text = stringResource(R.string.desc),
                 color = Color(0xFF807C7C),
                 modifier = Modifier
                     .align(Alignment.Start)
             )
             OutlinedTextField(
                 value = "",
                 onValueChange = {},
                 label = {
                     Text(text = "E-mail",
                         fontSize = 13.sp)
                 },
                 shape = RoundedCornerShape(25.dp),
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(top = 65.dp)
             )
             OutlinedTextField(
                 value = "",
                 onValueChange = {},
                 label = {
                     Text(text = "Password",
                         fontSize = 13.sp)
                 },
                 shape = RoundedCornerShape(25.dp),
                 modifier = Modifier
                     .fillMaxWidth()
             )
             Button(onClick = {},
                 shape = RoundedCornerShape(10.dp),
                 modifier = Modifier
                     .align(Alignment.End)
                     .padding(15.dp),
                 colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4F27A8)))
             {
                 Text(
                     text = stringResource(R.string.signIn),
                 )
                 Icon(
                     imageVector = Icons.Filled.ArrowForward,
                     contentDescription = ""
                 )
             }
             Row(
                 modifier = Modifier
                     .fillMaxWidth()
                     .align(Alignment.End)
             ) {
                Text(
                    text = stringResource(R.string.account)
                )

             }
         }
    }
}

@Preview
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}