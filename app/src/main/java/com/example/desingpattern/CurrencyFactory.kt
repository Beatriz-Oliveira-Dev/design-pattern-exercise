package com.example.desingpattern

object CurrencyFactory {


    fun currencyForCountry(country: Country): Currency =
            when(country){
                is Spain -> Currency("EUR")
                is Greece -> Currency("EUR")
                is Country.Canada -> Currency("CAD")
                is USA -> Currency("USD")
            }

}
data class USA(val someProperty: String): Country()
class Currency(val code: String)
sealed class Country {
    object Canada : Country()
}

object Spain : Country()
class Greece(val someProperty: String): Country()
//class Brazil: Country()
