package com.github.FernandoNakasone.simuladordefrete.frete

import com.github.FernandoNakasone.simuladordefrete.model.TipoFrete
import junit.framework.TestCase.assertEquals
import org.junit.Test


class CalculadoraFreteTest {

    private val calculadoraFrete = CalculadoraFrete()

    @Test
    fun `frete economico deve calcular valor pelo peso` (){
        //ARRANGE - Preparar
        val peso = 2.0

        //ACT
        val resultado = calculadoraFrete.calcular(
            TipoFrete.EXPRESSO,
            peso)

        //ASSERT - Verificar
        assertEquals(
            16.0,
            resultado.valor,
            0.01
        )
    }

}