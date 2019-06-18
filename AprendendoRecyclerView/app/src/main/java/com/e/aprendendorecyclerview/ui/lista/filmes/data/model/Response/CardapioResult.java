package com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response;

import com.squareup.moshi.Json;

import java.util.List;

public class CardapioResult {
    @Json(name = "android")
    private final List<CardapioResponse> ResultadoCardapio;

    public CardapioResult(List<CardapioResponse> ResultadoCardapio) {
        this.ResultadoCardapio = ResultadoCardapio;
    }

    public List<CardapioResponse> getResultadoCardapio() {
        return ResultadoCardapio;
    }

}
