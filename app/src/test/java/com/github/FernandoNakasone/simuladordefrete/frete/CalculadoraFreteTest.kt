package com.github.FernandoNakasone.simuladordefrete.frete

import com.github.FernandoNakasone.simuladordefrete.model.TipoFrete
import junit.framework.TestCase.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test


class CalculadoraFreteTest {

    private val calculadoraFrete = CalculadoraFrete()

    @Test
    fun `frete economico deve calcular valor pelo peso e a distancia` (){
        //ARRANGE - Preparar
        val peso = 2.0
        val distanciaKm = 100.0

        //ACT
        val resultado = calculadoraFrete.calcular(
            TipoFrete.ECONOMICO,
            peso,
            distanciaKm)

        //ASSERT - Verificar
        assertEquals(
            22.0,
            resultado.valor,
            0.01
        )
        assertEquals(
            5,
            resultado.prazoDias
        )
    }

    @Test
    fun `peso zero deve gerar erro` () {
        assertThrows(IllegalArgumentException :: class.java) {
            calculadoraFrete.calcular(
                TipoFrete.ECONOMICO,
                pesoKg = 0.0,
                distanciaKm = 100.0
            )
        }
    }

}