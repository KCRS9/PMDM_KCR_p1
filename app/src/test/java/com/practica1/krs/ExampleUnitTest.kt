package com.practica1.krs

import com.practica1.krs.ui.theme.Persona
import org.junit.Test

import org.junit.Assert.*

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
    fun iguales_KR() {

        val p1: Persona = Persona(nombre = "Paco", edad = 34)
        val p2: Persona = Persona(nombre = "Paco", edad = 34)

        assertEquals(p1, p2)
    }
}