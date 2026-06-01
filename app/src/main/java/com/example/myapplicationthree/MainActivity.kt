package com.example.myapplicationthree

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationthree.ui.theme.MyApplicationThreeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationThreeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

fun CanBuyShoe() {

    println("Please Enter Budget: ")
    var budget = readLine()!!.toDouble()

    println("Enter shoe price :")
    var price = readLine()!!.toDouble()

    if (price <= budget) {
        println("You can buy the shoe")
    }else{
        println("You cannot buy the shoe")
    }
}

fun LargestNumber(){

    println("Please Enter first Number")
    var num1 = readLine()!!.toInt()

    println("Please Enter second Number")
    var num2 = readLine()!!.toInt()

    if (num1 > num2) {
        println("First number $num1 is larger")
    }else{
     println("Second number $num2 is larger")
    }
}

fun AgeCheck() {

    println("Please Enter your age")
    var age = readLine()!!.toInt()

    if (age>=18) {
        println("Your age is $age you are an Adult")
    }else{
        println("Your age is $age you a Minor")
    }
}
//Looking at IF statements

fun main(){
    println("Enter a number : ")
    var num = readLine()!!.toInt()

    println("Enter Your Mark : ")
    var mark = readLine()!!.toInt()


    //Using the if Statement
    if(num > 0) {
        println("$num is a Positive Number ")
      }

    //Using the IF ELSE statement

    if (mark >=50 ) {
        println("Your mark is $mark you have passed")
    }else {
        println("Your mark is $mark you have failed")
    }
    CanBuyShoe()
    LargestNumber()
    AgeCheck()



}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationThreeTheme {
        Greeting("Android")
    }
}