package com.example.desingpattern

import org.junit.Assert.assertEquals
import org.junit.Test

 class FactoryMethodTest {

     @Test
    fun currencyTest(){
        val greeceCurrency = CurrencyFactory.currencyForCountry(Greece("")).code
        val usaCurrency = CurrencyFactory.currencyForCountry(USA("")).code
         println("Greece Currency: $greeceCurrency")
         println("Greece Currency: $usaCurrency")

         assertEquals(greeceCurrency, "EUR")
         assertEquals(usaCurrency, "USD")
    }
}