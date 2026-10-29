package com.aulasandroid.consumoapi.service

import com.aulasandroid.consumoapi.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {
    //especificar o méto-do http que será utilizado
    @GET("{cep}/json/")
    //diz para trocar na url da api o -cep- pelo cep desejado
    fun getEnderecoByCep(@Path("cep")cep: String): Call<Endereco>

    @GET("{uf}/{cidade}/{rua}/json/")
    fun getEnderecoByUfCidadeRua(
        @Path("uf")uf: String,
        @Path("cidade")cidade: String,
        @Path("rua")rua: String
    ): Call<List<Endereco>>

}