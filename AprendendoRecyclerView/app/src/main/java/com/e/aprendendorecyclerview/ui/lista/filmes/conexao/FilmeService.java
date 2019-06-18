package com.e.aprendendorecyclerview.ui.lista.filmes.conexao;

import com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response.FilmesResult;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FilmeService {


    @GET("fastmeal/cardapio/json/")
    Call<FilmesResult> obterFilmesPopulares(@Query("api_key") String chaveApi);
   // Call<FilmesResult> obterFilmesPopulares();
}
