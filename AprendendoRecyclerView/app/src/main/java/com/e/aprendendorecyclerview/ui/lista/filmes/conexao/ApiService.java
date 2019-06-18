package com.e.aprendendorecyclerview.ui.lista.filmes.conexao;

import com.e.aprendendorecyclerview.ui.lista.filmes.conexao.FilmeService;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ApiService {

    private static FilmeService INSTANCE;

    public static FilmeService getINSTANCE() {
        if (INSTANCE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://3.19.60.179/")
                    .addConverterFactory(MoshiConverterFactory.create())

                    .build();


            INSTANCE = retrofit.create(FilmeService.class);

        }

        return INSTANCE;
    }

}
