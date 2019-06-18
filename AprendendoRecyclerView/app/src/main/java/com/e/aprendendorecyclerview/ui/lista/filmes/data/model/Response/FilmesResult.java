package com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response;

import com.squareup.moshi.Json;

import java.util.List;

public class FilmesResult {
    @Json(name = "android")
    private final List<FilmesResponse> resultadoFilmes;

    public FilmesResult(List<FilmesResponse> resultadoFilmes) {
        this.resultadoFilmes = resultadoFilmes;
    }

    public List<FilmesResponse> getResultadoFilmes() {
        return resultadoFilmes;
    }




}
