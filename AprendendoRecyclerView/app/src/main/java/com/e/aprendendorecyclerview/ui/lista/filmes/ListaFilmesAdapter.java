package com.e.aprendendorecyclerview.ui.lista.filmes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.aprendendorecyclerview.R;
import com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response.FilmesResponse;

import java.util.List;

public class ListaFilmesAdapter extends RecyclerView.Adapter<ListaFilmesAdapter.ListaFilmesViewHolder> {

    private List<FilmesResponse> filmes;
    public ListaFilmesAdapter(List<FilmesResponse> filmes) {
        this.filmes = filmes;
    }




    @NonNull
    @Override
    public ListaFilmesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filme, parent, false);
        return new ListaFilmesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaFilmesViewHolder holder, int position) {
        holder.textTituloFilme.setText(filmes.get(position).getNome());



    }

    @Override
    public int getItemCount() {
        return (filmes != null && filmes.size() > 0)? filmes.size() : 0;
    }

    static class ListaFilmesViewHolder extends RecyclerView.ViewHolder {

        private TextView textTituloFilme;

        public ListaFilmesViewHolder(@NonNull View itemView) {
            super(itemView);

            textTituloFilme = itemView.findViewById(R.id.text_Titulo_Filme);

        }
    }
}
