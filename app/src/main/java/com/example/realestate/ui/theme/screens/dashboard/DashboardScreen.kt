package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ADD_PRODUCTS_URL
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_SIGNUP
import com.example.realestate.navigation.VIEW_PRODUCTS_URL
import com.example.realestate.ui.theme.PurpleGrey80

@Composable
fun DashboardScreen(navController: NavController){

    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.monitor),
            contentDescription = "monitor",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Manage your properties with ease",
            fontSize = 18.sp

        )

        Spacer(modifier = Modifier.height(15.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            //main card
            Card(modifier = Modifier
                .height(700.dp)
                .fillMaxWidth(),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(PurpleGrey80)
            ) {

            //row 1
                Row(modifier = Modifier.padding(20.dp)) {

                    //card 1
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_HOME) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)) {

                        Column {

                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center ){

                                Image(painter = painterResource(id = R.drawable.img_2),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp) )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "HOME",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //end of card

                    Spacer(modifier = Modifier.width(30.dp))

                    //card 2
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_DETAIL) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)) {

                        Column {

                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center ){

                                Image(painter = painterResource(id = R.drawable.img_14),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp) )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "DETAILS",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //end of card

                }
                //end of row 1

                //row 1
                Row(modifier = Modifier.padding(20.dp)) {

                    //card 1
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_SIGNUP) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)) {

                        Column {

                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center ){

                                Image(painter = painterResource(id = R.drawable.img_12),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp) )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "ACCOUNT",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //end of card

                    Spacer(modifier = Modifier.width(30.dp))

                    //card 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)) {

                        Column {

                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center ){

                                Image(painter = painterResource(id = R.drawable.img_13),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp) )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "SETTINGS",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //end of card

                }
                //end of row 1

                //row 1
                Row(modifier = Modifier.padding(20.dp)) {

                    //card 1
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_SIGNUP) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)) {

                        Column {

                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center ){

                                Image(painter = painterResource(id = R.drawable.img_12),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp) )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "ACCOUNT",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //end of card

                    Spacer(modifier = Modifier.width(30.dp))

                    //card 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)) {

                        Column {

                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center ){

                                Image(painter = painterResource(id = R.drawable.img_13),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp) )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "SETTINGS",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //end of card

                }
                //end of row 1


                //row 1
                Row(modifier = Modifier.padding(20.dp)) {

                    //card 1
                    Card(modifier = Modifier
                        .clickable { navController.navigate(VIEW_PRODUCTS_URL) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)) {

                        Column {

                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center ){

                                Image(painter = painterResource(id = R.drawable.img_16),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp) )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "VIEW PRODUCT",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //end of card

                    Spacer(modifier = Modifier.width(30.dp))

                    //card 2
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ADD_PRODUCTS_URL) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(30.dp)) {

                        Column {

                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center ){

                                Image(painter = painterResource(id = R.drawable.img_15),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp) )
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "ADD PRODUCT",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //end of card

                }
                //end of row 1


            }
            //end of main card

        }
    }

}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())



}
