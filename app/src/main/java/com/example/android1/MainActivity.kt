package com.example.android1

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import com.example.android1.ui.theme.Android1Theme
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android1Theme {

                startApp()


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun startApp() {
   // prevPage2()
    //prevPage3()
    //prevPage4()

    Android1()



}
@Composable
fun loginpage(iconId: Int, text: String) {
    Row (
        modifier = Modifier.padding(20.dp)
    ){
        Image(
            painter = painterResource(id = iconId),
            contentDescription = "Icon",
            modifier = Modifier
                .padding(vertical = 20.dp)
                .size(25.dp)
        )
        Text(
            text = text,
            color = Color.White,
            modifier = Modifier
                .padding(6.dp)
                .width(120.dp),
            maxLines = 4,
            softWrap = true
        )

    }
}

@Composable
fun Page1(navController: NavHostController){



    Column(
        modifier = Modifier
            .fillMaxSize()
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )
            )
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF12AA73),
                        Color(0xCF135B46)
                    )
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        Spacer(Modifier.padding(bottom = 100.dp))
        Image(
            painter = painterResource(id = R.drawable.smartr),
            contentDescription = "Smartr",
            modifier = Modifier
                .size(130.dp, 50.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.man),
            contentDescription = "Signup Man",
            modifier = Modifier
                .size(200.dp, 211.dp)
                .padding(15.dp)
        )
        Text(
            text = "Fresh look, same login.",
            color = Color.White,
            fontSize = 25.sp

        )
        loginpage(
            iconId = R.drawable.iconup,
            text = "SmartRecruiters candidate portal is now Smartr."
        )

        loginpage(
            iconId = R.drawable.iconlogin,
            text = "Enter the same login info used for your SmartrProfile"
        )

        loginpage(
            iconId = R.drawable.iconrefresh,
            text = "If login details were saved, you may need to re-save."
        )

        Text(
            text = "Why Smartr? Read here",
            color = Color.White,
            fontSize = 10.sp
        )
        Button(
            onClick = { navController.navigate("second")},
            modifier = Modifier
                .padding(10.dp)
                .size(274.dp, 42.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFBFDBD1))

        ) {
            Text(
                text = "GET STARTED"
            )
        }
    }



}

@Composable
fun Page2(navController: NavHostController){
    val scrollState = rememberScrollState()
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )
            )
            .background(Color(0xFFBFDBD1))

    ){
        Row(
            horizontalArrangement = Arrangement.Center
        ){

            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "avatar",
                modifier = Modifier
                    .padding(top = 40.dp, start = 20.dp)
                    .size(45.dp)

            )

            Spacer(Modifier.padding(horizontal = 140.dp))

            Image(
                painter = painterResource(id = R.drawable.notification),
                contentDescription = "notification",
                modifier = Modifier
                    .padding(top = 53.dp, end = 20.dp)
                    .size(25.dp)
            )

        }
        Spacer(Modifier.padding(vertical = 20.dp))

        Text(
            text = "Designer",
            modifier = Modifier
                .size(width = 210.dp, height = 20.dp)
                .padding(start = 20.dp),
            color = Color(0xFF434545)

        )


        CanvaCards("Junior UX Designer", "Canva", "nothing",  )

        CanvaCards("Junior Product Designer", "Canva","Applied");
        CanvaCards("Middle motion Designer", "Canva","Expires Soon");



        Spacer(Modifier.padding(vertical = 10.dp))

        Text(
            text = "Android",
            modifier = Modifier
                .size(width = 210.dp, height = 20.dp)
                .padding(start = 20.dp),
            color = Color(0xFF434545)

        )

        CanvaCards("Junior Android developer", "Kotlin, Java", "nothing");
        CanvaCards("Middle Android developer", "Kotlin, Java", "Expires Soon");
        CanvaCards("Junior UX Designer", "Canva", "Expires Soon")


    }


}

@Composable
fun Android1() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "first") {
        composable("first") { Page1(navController) }
        composable("second") { Page2(navController) }
        composable("third") { Page3(navController) }
    }
}

@Composable
fun prevPage2(){
    val scrollState = rememberScrollState()
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )
            )
            .background(Color(0xFFBFDBD1))

    ){
        Row(
            horizontalArrangement = Arrangement.Center
        ){

            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "avatar",
                modifier = Modifier
                    .padding(top = 40.dp, start = 20.dp)
                    .size(45.dp)

            )

            Spacer(Modifier.padding(horizontal = 140.dp))

            Image(
                painter = painterResource(id = R.drawable.notification),
                contentDescription = "notification",
                modifier = Modifier
                    .padding(top = 53.dp, end = 20.dp)
                    .size(25.dp)
            )

        }
        Spacer(Modifier.padding(vertical = 20.dp))

        Text(
            text = "DESIGNER",
            modifier = Modifier
                .size(width = 210.dp, height = 20.dp)
                .padding(start = 20.dp),
            color = Color(0xFF434545),
            fontWeight = FontWeight.Bold

        )




//        Card(
//                shape = RoundedCornerShape(
//                topStart = CornerSize(20.dp),
//                topEnd = CornerSize(20.dp),
//                bottomEnd = CornerSize(20.dp),
//                bottomStart = CornerSize(20.dp)
//            ),
//
//            modifier = Modifier
//                .padding(start = 20.dp, end = 20.dp)
//                .size(width = 360.dp, height = 103.dp)
//
//
//
//        ) {
//
//            Column(
//                modifier = Modifier.padding(16.dp)
//
//            ) {
//                Row (
//                    modifier = Modifier.fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
//
//                ){
//                    Image(
//                        painter = painterResource(id = R.drawable.rectangle),
//                        contentDescription = "rectangle",
//                        modifier = Modifier
//                            .size(30.dp),
//                        contentScale = ContentScale.Crop
//
//                    )
//                    Spacer(modifier = Modifier.width(8.dp))
//
//                    Column {
//                        Text(text = "Junior UX Designer", color = Color.Black)
//                        Text(text = "Canva",  color = Color.Gray)
//                    }
//
//                    Spacer(modifier = Modifier.width(80.dp))
//
//
//
//                }
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Row (
//                    modifier = Modifier.fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceBetween
//                ){
//
//                    Box(
//                        modifier = Modifier
//                            .clip(RoundedCornerShape(30.dp))
//                            .size(78.dp, 24.dp) // Frame size
//                            .background(Color(0xFFBFDBD1)) // Background color of the frame
//                            .padding(4.dp), // Optional padding inside the frame
//                        contentAlignment = Alignment.Center// Center content inside frame
//                    ) {
//                        Text(
//                            text = "Paystack", // Text inside the frame
//                            color = Color.Gray,
//                            fontSize = 12.sp
//                        )
//                    }
//                    Text(text = "\$40-60k/yearly", color = Color.Gray)
//
//
//                }
//            }
//
//
//
//        }
        CanvaCards("Junior UX Designer", "Canva", "nothing")

        CanvaCards("Junior Product Designer", "Canva","Applied");
        CanvaCards("Middle motion Designer", "Canva","Expires Soon");



        Spacer(Modifier.padding(vertical = 10.dp))

        Text(
            text = "ANDROID",
            modifier = Modifier
                .size(width = 210.dp, height = 20.dp)
                .padding(start = 20.dp),
            color = Color(0xFF434545),
            fontWeight = FontWeight.Bold

        )

        CanvaCards("Junior Android developer", "Kotlin, Java", "nothing");
        CanvaCards("Middle Android developer", "Kotlin, Java", "Expires Soon");
        CanvaCards("Junior UX Designer", "Canva", "Expires Soon")





    }

}


@Composable
fun CanvaCards(text: String, text2: String, text3: String){

    Spacer(Modifier.padding(vertical = 10.dp))

    Card(
        shape = RoundedCornerShape(
            topStart = CornerSize(20.dp),
            topEnd = CornerSize(20.dp),
            bottomEnd = CornerSize(20.dp),
            bottomStart = CornerSize(20.dp)
        ),

        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .size(width = 360.dp, height = 103.dp)

    ) {

        Column(


        ) {
            Row (
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp, top = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                //horizontalArrangement = Arrangement.SpaceBetween

            ){
                Image(
                    painter = painterResource(id = R.drawable.rectangle),
                    contentDescription = "rectangle",
                    modifier = Modifier
                        .size(30.dp),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.width(7.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = text, color = Color.Black, fontWeight = FontWeight.Bold)
                    Text(text = text2,  color = Color.Gray)
                }


                if(text3 == "Applied"){

                    Spacer(modifier = Modifier.width(30.dp))

                    Box(
                        modifier = Modifier
                            .size(69.dp, 20.dp)
                            .background(Color(0xFF07864B))
                            .padding(4.dp)
                            .align(Alignment.CenterVertically), // Optional padding inside the frame
                        contentAlignment = Alignment.Center// Center content inside frame
                    ) {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.vector),
                                contentDescription = "vc",
                                modifier = Modifier.size(11.dp)

                            )
                            Spacer(modifier = Modifier.width(5.dp))

                            Text(
                                text = "Applied",
                                color = Color.White,
                                fontSize = 10.sp
                            )
                        }

                    }
                }
                else if(text3 == "Expires Soon"){
                    Spacer(modifier = Modifier.width(30.dp))

                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(90.dp, 20.dp)
                            .background(Color(0xFFDAA400))
                            .padding(4.dp), // Optional padding inside the frame
                        contentAlignment = Alignment.Center// Center inside farme
                    ) {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.vector1),
                                contentDescription = "vc",
                                modifier = Modifier.size(11.dp)
                            )
                            Spacer(modifier = Modifier.width(5.dp))

                            Text(
                                text = "Expires Soon",
                                color = Color.White,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
                else{
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row (
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(30.dp))
                        .size(78.dp, 24.dp)
                        .background(Color(0xFFBFDBD1))
                        .padding(4.dp), // Optional padding inside the frame
                    contentAlignment = Alignment.Center// Center frame
                ) {
                    Text(
                        text = "Paystack",
                        color = Color.Gray,
                        fontSize = 12.sp
                    )
                }
                Text(text = "\$40-60k/yearly", color = Color.Gray)


            }
        }

    }
}

@Composable
fun prevPage3(){
    val scrollState = rememberScrollState()
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )
            )
            .background(Color(0xFFBFDBD1))

    ){
        Column (
            modifier = Modifier
                .size(width = 400.dp, height = 250.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 30.dp,
                        bottomStart = 0.dp,
                        bottomEnd = 0.dp
                    )
                )
                .background(Color.White)
        ) {
            Column () {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, top = 30.dp, end = 20.dp, bottom = 30.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.back),
                        contentDescription = "null",
                        modifier = Modifier.size(26.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.favorite),
                        contentDescription = "favorite",
                        modifier = Modifier.size(26.dp)
                    )

                }
                Column (
                    modifier = Modifier.padding(start = 20.dp)

                ){
                    Image(
                        painter = painterResource(id = R.drawable.rectangle22),
                        contentDescription = "rectangle",
                        modifier = Modifier
                            .padding(vertical = 5.dp)
                            .size(60.dp)

                    )
                    Text(
                        text = "Junior UX Designer",
                        modifier = Modifier,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Canva",
                        fontSize = 14.sp,
                        color = Color(0xFF434545),
                        modifier = Modifier.padding(vertical = 5.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Posted on 3 March",
                        fontSize = 12.sp,
                        color = Color(0xFF434545)
                    )

                }
            }
        }

        Column (
            modifier = Modifier
                .padding(vertical = 5.dp)
                .size(width = 400.dp, height = 150.dp)
                .background(Color.White)
        ) {

            Column (
                modifier = Modifier.padding(20.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,

                ) {
                    Column {
                        Text(
                            text = "APPLY BEFORE",
                            color = Color(0xFF434545),
                            fontSize = 12.sp
                        )
                        Text(
                            text = "03 June, 2022",
                            color = Color.Black,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(vertical = 5.dp),


                        )

                    }
                    Spacer(modifier = Modifier.width(90.dp))
                    Column {
                        Text(
                            text = "JOB NATURE",
                            color = Color(0xFF434545),
                            fontSize = 12.sp
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(30.dp))
                                .size(70.dp, 20.dp)
                                .background(Color(0xFFBFDBD1))
                                .padding(vertical = 4.dp),
                            contentAlignment = Alignment.Center // Frame center
                        ) {
                            Text(
                                text = "Full-time",
                                color = Color.Black,
                                fontSize = 12.sp
                            )
                        }


                    }
                }

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column{
                    Text(
                        text = "SALARY RANGE",
                        color = Color(0xFF434545),
                        fontSize = 12.sp
                    )
                    Text(
                        text = "40k - 60k/yearly",
                        color = Color.Black,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(vertical = 5.dp)
                    )

                }
                Spacer(modifier = Modifier.width(90.dp))
                Column {
                    Text(
                        text = "JOB LOCATION",
                        color = Color(0xFF434545),
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Work from anywhere",
                        color = Color.Black,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(vertical = 5.dp)
                    )

                }



            }
        }

        Column (
            modifier = Modifier
                .padding(vertical = 0.dp)
                .size(width = 400.dp, height = 230.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "JOB DESCRIPTION",
                    fontSize = 12.sp,
                    color = Color(0xFF434545),
                    fontWeight = FontWeight.Bold

                    )
                Text(
                    text = "Can you bring creative human-centered ideas to life and make great things happen beyond what meets the eye?\n" +
                            "We believe in teamwork, fun, complex projects, diverse perspectives, and simple solutions. How about you? We're looking for a like-minded",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(vertical = 20.dp),
                    lineHeight = 23.sp
                )
                Row {
                    Text(
                        text = "See more",
                        color = Color(0xFF0FAC74),
                        fontSize = 12.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.polygon),
                        contentDescription = null,
                        modifier = Modifier.padding(horizontal = 2.dp).padding(top = 4.dp)
                    )
                }

            }

        }

        Column (
            modifier = Modifier
                .padding(vertical = 5.dp)
                .size(width = 400.dp, height = 400.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "ROLES AND RESPONSIBILITIES",
                    color = Color(0xFF434545),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "• Drive the design process with cross-functional partners and design leads.\n" +
                            "• Design new experiences and patterns in a complex ecosystem and across platforms.\n" +
                            "• Partner with UX Research and Content Strategists through the design process.\n" +
                            "• Work closely with Product and Engineering to ensure a high quality implementation.",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(vertical = 10.dp),
                    lineHeight = 23.sp

                )

            }
        }

    }

}

@Composable
fun prevPage4(){

    Column (
        modifier = Modifier.fillMaxSize()

    ){
        Row(
            //horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 10.dp)
        ){
            Text(
                text = "9:41",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold

            )
            Spacer(modifier = Modifier.width(255.dp))

            Image(
                painter = painterResource(R.drawable.exclude1),
                contentDescription = null,

            )
            Image(
                painter = painterResource(R.drawable.exclude2),
                contentDescription = null,
                modifier = Modifier.padding(horizontal = 6.dp)
            )
            Image(
                painter = painterResource(R.drawable.group),
                contentDescription = null
            )

        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)

        ){
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 150.dp, top = 20.dp),

            ){
                Text(
                    text = "Profile",
                    fontSize = 16.sp
                )
                Image(
                    painter = painterResource(id = R.drawable.icon),
                    contentDescription = null,
                )
            }

            Row (
                modifier = Modifier.padding(vertical = 10.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ellipse),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 25.dp, horizontal = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = "2156",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold

                        )
                        Text(
                            text = "Followers",
                            fontSize = 16.sp,
                            color = Color(0xFF4E4B66),
                            modifier = Modifier.padding(vertical = 10.dp)
                        )
                    }
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = "567",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Following",
                            fontSize = 16.sp,
                            color = Color(0xFF4E4B66),
                            modifier = Modifier.padding(vertical = 10.dp)
                        )
                    }
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "23",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "News",
                            fontSize = 16.sp,
                            color = Color(0xFF4E4B66),
                            modifier = Modifier.padding(vertical = 10.dp)
                        )
                    }
                }

            }
            Column {
                Text(
                    text = "Wilson Franci",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    fontSize = 16.sp,
                    color = Color(0xFF4E4B66),
                    lineHeight = 25.sp,
                    modifier = Modifier.padding(vertical = 5.dp)
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(170.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1877F2)),
                    shape = RoundedCornerShape(6.dp)

                ) {
                    Text(
                        text = "Edit profile",
                        fontSize = 16.sp,
                        color = Color.White
                    )

                }

                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(170.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1877F2)),
                    shape = RoundedCornerShape(6.dp)

                ) {
                    Text(
                        text = "Edit profile",
                        fontSize = 16.sp,
                        color = Color.White
                    )

                }
            }

            lastPage(R.drawable.image1, "NFTs", "Minting Your First NFT: A Beginner’s Guide to Creating...", "15m ago")
            lastPage(R.drawable.image2, "Business", "5 things to know before the stock market opens Monday", "1h ago")
            lastPage(R.drawable.image3, "Travel", "Bali plans to reopen to international tourists in Septe...", "1w ago")
            lastPage(R.drawable.image4, "Health", "Healthy Living: Diet and Exercise Tips & Tools for Success.", "4h ago")


        }
    }
}

@Composable
fun lastPage(iconId: Int, text: String, text2: String, text3: String){

    Row (
        modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)

    ) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier.padding(vertical = 5.dp).size(90.dp)
                .clip(RoundedCornerShape(10.dp)),
        )
        Column(
            modifier = Modifier.padding(horizontal = 10.dp)
        ) {
            Text(
                text = text,
                fontSize = 13.sp,
                color = Color(0xFF4E4B66),
                modifier = Modifier.padding(vertical = 5.dp)
            )
            Text(
                text = text2,
                fontSize = 16.sp,
                color = Color.Black
            )
            Row (
                modifier = Modifier.padding(vertical = 4.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ellipse),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "Wilson Franci",
                    fontSize = 13.sp,
                    color = Color(0xFF4E4B66),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.clock),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(6.dp)
                        .size(15.dp)
                )
                Text(
                    text = text3,
                    fontSize = 13.sp,
                    color = Color(0xFF4E4B66),
                    modifier = Modifier.padding(vertical = 6.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.nukteler),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(vertical = 7.dp)
                        .size(15.dp)

                )
            }
        }
    }
}

@Composable
fun Page3(navController: NavHostController){
    val scrollState = rememberScrollState()
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )
            )
            .background(Color(0xFFBFDBD1))

    ){
        Column (
            modifier = Modifier
                .size(width = 400.dp, height = 250.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 30.dp,
                        bottomStart = 0.dp,
                        bottomEnd = 0.dp
                    )
                )
                .background(Color.White)
        ) {
            Column () {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, top = 30.dp, end = 20.dp, bottom = 30.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.back),
                        contentDescription = "null",
                        modifier = Modifier.size(26.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.favorite),
                        contentDescription = "favorite",
                        modifier = Modifier.size(26.dp)
                    )

                }
                Column (
                    modifier = Modifier.padding(start = 20.dp)

                ){
                    Image(
                        painter = painterResource(id = R.drawable.rectangle22),
                        contentDescription = "rectangle",
                        modifier = Modifier
                            .padding(vertical = 5.dp)
                            .size(60.dp)

                    )
                    Text(
                        text = "Junior UX Designer",
                        modifier = Modifier,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Canva",
                        fontSize = 14.sp,
                        color = Color(0xFF434545),
                        modifier = Modifier.padding(vertical = 5.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Posted on 3 March",
                        fontSize = 12.sp,
                        color = Color(0xFF434545)
                    )

                }
            }
        }

        Column (
            modifier = Modifier
                .padding(vertical = 5.dp)
                .size(width = 400.dp, height = 150.dp)
                .background(Color.White)
        ) {

            Column (
                modifier = Modifier.padding(20.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Column {
                        Text(
                            text = "APPLY BEFORE",
                            color = Color(0xFF434545),
                            fontSize = 12.sp
                        )
                        Text(
                            text = "03 June, 2022",
                            color = Color.Black,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(vertical = 5.dp),


                            )

                    }
                    Spacer(modifier = Modifier.width(90.dp))
                    Column {
                        Text(
                            text = "JOB NATURE",
                            color = Color(0xFF434545),
                            fontSize = 12.sp
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(30.dp))
                                .size(70.dp, 20.dp)
                                .background(Color(0xFFBFDBD1)) // Background color frame
                                .padding(vertical = 4.dp),
                            contentAlignment = Alignment.Center// Center f
                        ) {
                            Text(
                                text = "Full-time",
                                color = Color.Black,
                                fontSize = 12.sp
                            )
                        }


                    }
                }

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column{
                    Text(
                        text = "SALARY RANGE",
                        color = Color(0xFF434545),
                        fontSize = 12.sp
                    )
                    Text(
                        text = "40k - 60k/yearly",
                        color = Color.Black,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(vertical = 5.dp)
                    )

                }
                Spacer(modifier = Modifier.width(90.dp))
                Column {
                    Text(
                        text = "JOB LOCATION",
                        color = Color(0xFF434545),
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Work from anywhere",
                        color = Color.Black,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(vertical = 5.dp)
                    )

                }



            }
        }

        Column (
            modifier = Modifier
                .padding(vertical = 0.dp)
                .size(width = 400.dp, height = 230.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "JOB DESCRIPTION",
                    fontSize = 12.sp,
                    color = Color(0xFF434545),
                    fontWeight = FontWeight.Bold

                )
                Text(
                    text = "Can you bring creative human-centered ideas to life and make great things happen beyond what meets the eye?\n" +
                            "We believe in teamwork, fun, complex projects, diverse perspectives, and simple solutions. How about you? We're looking for a like-minded",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(vertical = 20.dp),
                    lineHeight = 23.sp
                )
                Row {
                    Text(
                        text = "See more",
                        color = Color(0xFF0FAC74),
                        fontSize = 12.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.polygon),
                        contentDescription = null,
                        modifier = Modifier.padding(horizontal = 2.dp).padding(top = 4.dp)
                    )
                }

            }

        }

        Column (
            modifier = Modifier
                .padding(vertical = 5.dp)
                .size(width = 400.dp, height = 400.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "ROLES AND RESPONSIBILITIES",
                    color = Color(0xFF434545),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "• Drive the design process with cross-functional partners and design leads.\n" +
                            "• Design new experiences and patterns in a complex ecosystem and across platforms.\n" +
                            "• Partner with UX Research and Content Strategists through the design process.\n" +
                            "• Work closely with Product and Engineering to ensure a high quality implementation.",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(vertical = 10.dp),
                    lineHeight = 23.sp

                )

            }
        }

    }

}
