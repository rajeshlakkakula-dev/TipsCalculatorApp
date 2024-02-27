package com.example.tipscalculatorapp

import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun calTip_20RoundUp(){
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getNumberInstance().format(2)
        val actualTip = calculateTipAmount(amount = amount,tipPercent= tipPercent,false)
        assertEquals(expectedTip, actualTip)


    }

}