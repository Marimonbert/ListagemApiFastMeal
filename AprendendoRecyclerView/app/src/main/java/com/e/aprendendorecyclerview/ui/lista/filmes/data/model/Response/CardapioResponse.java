package com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response;

import com.squareup.moshi.Json;

public class CardapioResponse {


    @Json(name = "nome")
    private String Nome;


    @Json(name = "id")
    private String Id;

    public CardapioResponse(String nome, String id) {
        this.Nome = nome;
        this.Id = id;
    }


    public String getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

}
