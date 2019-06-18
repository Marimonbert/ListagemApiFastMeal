package com.e.aprendendorecyclerview.ui.lista.filmes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.aprendendorecyclerview.R;
import com.e.aprendendorecyclerview.ui.lista.filmes.data.model.Response.CardapioResponse;

import java.util.List;

public class ListaCardapioAdapter extends RecyclerView.Adapter<ListaCardapioAdapter.ListaCardapioViewHolder> {

    private List<CardapioResponse> filmes;
    public ListaCardapioAdapter(List<CardapioResponse> filmes) {
        this.filmes = filmes;
    }




    @NonNull
    @Override
    public ListaCardapioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardapio, parent, false);
        return new ListaCardapioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaCardapioViewHolder holder, int position) {
        holder.titulo_cardapio.setText(filmes.get(position).getNome());



    }

    @Override
    public int getItemCount() {
        return (filmes != null && filmes.size() > 0)? filmes.size() : 0;
    }

    static class ListaCardapioViewHolder extends RecyclerView.ViewHolder {

        private TextView titulo_cardapio;

        public ListaCardapioViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo_cardapio = itemView.findViewById(R.id.txt_cardapio);

        }
    }
}
