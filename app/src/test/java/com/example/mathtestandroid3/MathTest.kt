package com.example.mathtestandroid3

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    private var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun simpleAddCase() {
        assertEquals("4", math?.add("2","2"))
    }

    @Test
    fun letterAddCase() {
        assertEquals("Символы нельзя вводить", math?.add("2", "marsel"))
    }

    @Test
    fun symbolsAddCase() {
        assertEquals("Символы нельзя вводить", math?.add("2", "^"))
    }

    @Test
    fun emptyAddCase() {
        assertEquals("Символы нельзя вводить", math?.add("2", ""))
    }

    @Test
    fun simpleDivideCase() {
        assertEquals("2", math?.divide("4", "2"))
    }

    @Test
    fun zeroDivideCase() {
        assertEquals("На ноль делить нельзя!", math?.divide("4", "0"))
    }

    @Test
    fun doubleAddCase() {
        assertEquals("5", math?.add("3.0", "2.0"))
    }

    @After
    fun detach() {
        math = null
    }
}