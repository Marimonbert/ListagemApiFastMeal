package com.e.aprendendorecyclerview.ui.lista.filmes.conexao;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ApiService {

    private static CardapioService INSTANCE;

    public static CardapioService getINSTANCE() {
        if (INSTANCE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://3.19.60.179/")
                    .addConverterFactory(MoshiConverterFactory.create())

                    .build();


            INSTANCE = retrofit.create(CardapioService.class);

        }

        return INSTANCE;
    }

}
