package com.example.hometask_62

import java.util.ArrayList

class DataValidator  {


    fun checkAll(login: String, email: String, password: String, confirmPasword: String, age: Int, adress: String): Boolean{

        return isLoginValid(login) && isEmailValid(email) && isPasswordValid(password,confirmPasword) && isAgeValid(age) && isAdressValid(adress)

    }


     fun isLoginValid(login: String ): Boolean{

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

        return loginList.equals(login)


    }


     fun isEmailValid(email: String): Boolean {
        return email.contains("@") && email.contains(".")
    }


     fun isPasswordValid(password: String, confirmPasword: String): Boolean{
        return password.equals(confirmPasword)
    }


     fun isAgeValid(age: Int): Boolean{
        return age >= 18
    }


     fun isAdressValid(adress: String): Boolean{
        return adress.contains("Ukraine")
    }




}