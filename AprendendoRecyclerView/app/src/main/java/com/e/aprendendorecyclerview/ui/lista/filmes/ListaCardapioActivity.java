package com.e.aprendendorecyclerview.ui.lista.filmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.e.aprendendorecyclerview.R;
import com.e.aprendendorecyclerview.ui.lista.filmes.conexao.ApiService;
import com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response.CardapioResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaCardapioActivity extends AppCompatActivity {

    RecyclerView RecyclerFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cardapio);
        RecyclerFilmes = findViewById(R.id.recycler_filmes);


        ApiService.getINSTANCE()
                .obterListaCardapio("xUgw0FzvFWapdX3Tms3du6t5VVp9JZgz3nvYWehS")
                .enqueue(new Callback<CardapioResult>() {
                    @Override
                    public void onResponse(Call<CardapioResult> call, Response<CardapioResult> response) {
                        if (response.isSuccessful()){
                            RecyclerView.LayoutManager LinearLayoutManager = new LinearLayoutManager(ListaCardapioActivity.this);

                            RecyclerFilmes.setLayoutManager(LinearLayoutManager);
                            RecyclerFilmes.setAdapter(new ListaCardapioAdapter(response.body().getResultadoCardapio()));

                        }

                    }

                    @Override
                    public void onFailure(Call<CardapioResult> call, Throwable t) {

                    }
                });


    }
}