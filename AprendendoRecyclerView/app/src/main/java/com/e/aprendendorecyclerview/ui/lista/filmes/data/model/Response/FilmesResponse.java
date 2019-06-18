package com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response;

import com.squareup.moshi.Json;

public class FilmesResponse {


    @Json( name = "nome")
    private String Nome;


    @Json( name = "id")
    private String Id;

    public FilmesResponse(String nome, String id) {
        this.Nome = nome;
        this.Id = id;
    }


    public String getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }


   /* @Json(name = "poster_path")
    private String CaminhoPoster;

    @Json(name = "original_title")
    private String TituloOriginal;

    public FilmesResponse(String caminhoPoster, String tituloOriginal) {
        this.CaminhoPoster = caminhoPoster;
        this.TituloOriginal = tituloOriginal;
    }

    public String getCaminhoPoster() {
        return CaminhoPoster;
    }

    public String getTituloOriginal() {
        return TituloOriginal;
    }
*/

}
