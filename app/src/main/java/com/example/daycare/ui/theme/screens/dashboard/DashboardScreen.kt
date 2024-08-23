package com.example.daycare.ui.theme.screens.dashboard


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.daycare.R
import com.example.daycare.navigation.ADD_ACCOUNT
import com.example.daycare.navigation.ADD_EMERGENCY
import com.example.daycare.navigation.ADD_PAYMENT
import com.example.daycare.navigation.ROUT_ACTIVITY
import com.example.daycare.ui.theme.mybackground
import com.example.daycare.ui.theme.mybackground1


@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(mybackground),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription ="home",
            modifier = Modifier
                .size(100.dp)


        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text ="CHILD'S CARE MANAGEMENT SOFTWARE",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
            Spacer(modifier = Modifier.height(5.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){

            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(mybackground1)

            ) {

                Row(modifier = Modifier.padding(20.dp)){


                   Column (horizontalAlignment = Alignment.CenterHorizontally){
                       Image(
                           painter = painterResource(id = R.drawable.reg),
                           contentDescription ="home",
                           modifier = Modifier
                               .size(150.dp)
                               .clip(CircleShape),
                           contentScale = ContentScale.Crop

                       )

                       Spacer(modifier = Modifier.height(10.dp))

                       Text(
                           text ="Register Your Child",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.SansSerif,
                           color = Color.Black,
                           modifier = Modifier.clickable {
                               navController.navigate(ADD_ACCOUNT)
                           }
                       )
                   }

                    Spacer(modifier = Modifier.width(35.dp))


                    Column(horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                            painter = painterResource(id = R.drawable.contact),
                            contentDescription ="home",
                            modifier = Modifier
                                .size(150.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop

                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text ="Contact Emergency Desk",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            color = Color.Black,
                            modifier = Modifier.fillMaxWidth()
                                .clickable {
                                    navController.navigate(ADD_EMERGENCY)
                                },
                            textAlign = TextAlign.Center
                        )
                    }




                }



                Row (modifier = Modifier.padding(20.dp)){


                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                            painter = painterResource(id = R.drawable.about),
                            contentDescription ="home",
                            modifier = Modifier
                                .size(150.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop

                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text ="Daily Schedule",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            color = Color.Black,
                            modifier = Modifier.clickable {
                                navController.navigate(ROUT_ACTIVITY)
                            }
                        )
                    }

                    Spacer(modifier = Modifier.width(35.dp))


                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Image(
                            painter = painterResource(id = R.drawable.pay),
                            contentDescription ="home",
                            modifier = Modifier
                                .size(150.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop

                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text =" Make Payment",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            color = Color.Black,
                            modifier = Modifier.clickable {
                                navController.navigate(ADD_PAYMENT)
                            }
                        )


                    }




                }









            }

        }




    }


}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
