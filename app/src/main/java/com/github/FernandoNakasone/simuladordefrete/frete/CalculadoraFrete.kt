package com.github.FernandoNakasone.simuladordefrete.frete

import com.github.FernandoNakasone.simuladordefrete.model.ResultadoFrete
import com.github.FernandoNakasone.simuladordefrete.model.TipoFrete

class CalculadoraFrete {

    fun calcular(
        tipo: TipoFrete,
        pesoKg: Double
    ) : ResultadoFrete {

        val resultado = when(tipo){

            TipoFrete.ECONOMICO -> ResultadoFrete(
                valor = 10 + 3 * pesoKg,
                prazoDias = 5
            )

            TipoFrete.EXPRESSO -> ResultadoFrete(
                valor = 20 + 5 * pesoKg,
                prazoDias = 2
            )

            TipoFrete.RETIRADA -> ResultadoFrete(
                valor = 0.0,
                prazoDias = 1
            )

        }

        return resultado

    }

}