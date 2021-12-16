package com.example.hometask_62

import org.junit.Assert
import org.junit.Test

class TestDataValidator {

    @Test
    fun isAllCorrectTest(){
        Assert.assertEquals(DataValidator().checkAll("olga1988","olga111@gmail.com",
            "123456789",
            "123456789",
            25,
            "Ukraine, Kyiv, Lano st., 12, 44883"),
            false)
    }

    @Test
    fun isLoginValidTest(){
        Assert.assertEquals(DataValidator().isLoginValid("olga1988"),false)
    }


    @Test
    fun isEmailValidTest(){
        Assert.assertEquals(DataValidator().isEmailValid("olga111@gmail.com"),true)
    }

    @Test
    fun isPasswordValidTest(){
        Assert.assertEquals(DataValidator().isPasswordValid("123456789","123456789"),true)
    }

    @Test
    fun isAgeValidTest(){
        Assert.assertEquals(DataValidator().isAgeValid(25),true)
    }

    @Test
    fun isAdressValid(){
        Assert.assertEquals(DataValidator().isAdressValid("Ukraine, Kyiv, Lano st., 12, 44883"),true)
    }

}