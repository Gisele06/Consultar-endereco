package com.aulasandroid.consumoapi.model

import com.google.gson.annotations.SerializedName

//@Serializedname: notation que diz o nome que o dado tem na
// API e onde ele deve entrar no nosso json

data class Endereco(
    val cep: String = "",

    @SerializedName("logradouro")
    val rua: String = "",

    @SerializedName("localidade")
    val cidade: String = "",

    val bairro: String = "",
    val uf: String = ""
)

