package com.example.hometask_62

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val login = "luda1990"
        val email = "luda@mail.com"
        val password = "12345abc"
        val confirmPasword = "12345abc"
        val age = 12
        val adress = "Japan, Tokyo, Lano st., 12, 44883"

        val loginList = ArrayList<String>()
        loginList.add("olga1988")
        loginList.add("elena2001")
        loginList.add("ivan1990")
        loginList.add("nik2005")
        loginList.add("svetlana1957")
        loginList.add("mary2021")
        loginList.add("kolya2001")
        loginList.add("2021sofiya")
        loginList.add("2007ivan")
        loginList.add("1990dimon")

        val logList = ArrayList<String>()

//Логин должен быть уникальним
        if (loginList.equals(login)) {
            logList.add(0, "Field 'Login' was not confirmed")
            //Log.d("MyLog62","Login is not unique. Please, create a new one");
        } else {
            logList.add(0, "OK")
            //Log.d("MyLog62","Please, continue with registration");
        }


//Эмейл должен содержать @ и точку
        if (email.contains("@") && email.contains(".")) {
            logList.add(1, "OK")
            //Log.d("MyLog62","Email adress was confirmed");
        } else {
            logList.add(1, "Field 'Email adress' was not confirmed")
            //Log.d("MyLog62","Email adress was not confirmed. Please, check if you type it correctly");
        }



// Пароль и проверка – совпадать
        if (password.equals(confirmPasword)) {
            logList.add(2, "OK")
            //Log.d("MyLog62","Password was confirmed");
        } else {
            logList.add(2, "Field 'Password' was not confirmed")
            //Log.d("MyLog62","Password and Confirmed Password are not equal. Please, take a look");
        }


//Возраст – не младше 18
        if (age >= 18) {
            logList.add(3, "OK")
            //Log.d("MyLog62","Please, continue with registration");
        } else {
            logList.add(3, "Field 'Age' was not confirmed")
            //Log.d("MyLog62","You are less then 18. Sorry, but you can't log in");
        }



//Страна – Украина
        if (adress.contains("Ukraine")) {
            logList.add(4, "OK")
            //Log.d("MyLog62","Country was confirmed");
        } else {
            logList.add(4, "Field 'Country' was not confirmed")
            //Log.d("MyLog62","Country was not confirmed");
        }

        val item1 = logList[0]
        val item2 = logList[1]
        val item3 = logList[2]
        val item4 = logList[3]
        val item5 = logList[4]



        if (item1 == "OK" && item2 == "OK" && item3 == "OK" && item4 == "OK" && item5 == "OK") {
            Log.d("MyLog62", "Registration was successfully passed")
        } else {
            Log.d(
                "MyLog62",
                item1.replace("OK", "") + "| " + item2.replace(
                    "OK",
                    ""
                ) + "| " + item3.replace("OK", "") + "| " + item4.replace(
                    "OK",
                    ""
                ) + "| " + item5.replace("OK", "")
            )
        }

    }


}
