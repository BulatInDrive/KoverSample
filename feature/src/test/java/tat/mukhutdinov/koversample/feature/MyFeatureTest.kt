package tat.mukhutdinov.koversample.feature

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class MyFeatureTest {
    private lateinit var feature: MyFeature

    @Before
    fun setup() {
        feature = MyFeature()
    }

    @Test
    fun sub_isCorrect() {
        val actual = feature.sub(5, 2)
        assertEquals(3, actual)
    }
}