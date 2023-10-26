package tat.mukhutdinov.koversample.feature.one

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class FeatureClassOneTest {
    private lateinit var feature: FeatureClassOne

    @Before
    fun setup() {
        feature = FeatureClassOne()
    }

    @Test
    fun sum_isCorrect() {
        val actual = feature.sum(2, 2)
        assertEquals(4, actual)
    }
}