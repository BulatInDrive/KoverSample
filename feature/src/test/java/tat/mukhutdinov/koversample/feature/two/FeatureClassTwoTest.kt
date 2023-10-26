package tat.mukhutdinov.koversample.feature.two

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class FeatureClassTwoTest {
    private lateinit var feature: FeatureClassTwo

    @Before
    fun setup() {
        feature = FeatureClassTwo()
    }

    @Test
    fun sum_isCorrect() {
        val actual = feature.multiply(2, 2)
        assertEquals(4, actual)
    }
}