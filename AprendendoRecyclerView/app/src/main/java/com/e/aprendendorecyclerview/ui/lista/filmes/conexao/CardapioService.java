package com.e.aprendendorecyclerview.ui.lista.filmes.conexao;

import com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response.CardapioResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CardapioService {


    @GET("fastmeal/cardapio/json/")
    Call<CardapioResult> obterListaCardapio(@Query("api_key") String chaveApi);

}
