package com.e.aprendendorecyclerview.ui.lista.filmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.e.aprendendorecyclerview.R;
import com.e.aprendendorecyclerview.ui.lista.filmes.conexao.ApiService;
import com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response.FilmesResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaFilmesActivity extends AppCompatActivity {

    RecyclerView RecyclerFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);
        RecyclerFilmes = findViewById(R.id.recycler_filmes);


        ApiService.getINSTANCE()
                .obterFilmesPopulares("xUgw0FzvFWapdX3Tms3du6t5VVp9JZgz3nvYWehS")
                .enqueue(new Callback<FilmesResult>() {
                    @Override
                    public void onResponse(Call<FilmesResult> call, Response<FilmesResult> response) {
                        if (response.isSuccessful()){
                            RecyclerView.LayoutManager LinearLayoutManager = new LinearLayoutManager(ListaFilmesActivity.this);

                            RecyclerFilmes.setLayoutManager(LinearLayoutManager);
                            RecyclerFilmes.setAdapter(new ListaFilmesAdapter(response.body().getResultadoFilmes()));

                        }

                    }

                    @Override
                    public void onFailure(Call<FilmesResult> call, Throwable t) {

                    }
                });


    }
}