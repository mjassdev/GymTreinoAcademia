package br.com.matheus.appacad;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListaAdapterAvaliacao extends RecyclerView.Adapter<ListaAdapterAvaliacao.ViewHolderAvaliacao>{

    private List<Avaliacao> lista;

    public ListaAdapterAvaliacao(Context context, int custom_list_layout_avaliacao, List<Avaliacao> lista){
        this.lista = lista;

    }

    @NonNull
    @Override
    public ListaAdapterAvaliacao.ViewHolderAvaliacao onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_list_layout_avaliacao, parent, false);


        //LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        //View view = layoutInflater.inflate(R.layout.custom_list_layout_avaliacao, parent, false);

        ViewHolderAvaliacao holderAvaliacao = new ViewHolderAvaliacao(itemView);

        return holderAvaliacao;

    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdapterAvaliacao.ViewHolderAvaliacao holder, int position) {



            Avaliacao avaliacao = lista.get(position);

            holder.tvtipo.setText(avaliacao.Tipo);
            holder.tvanterior.setText(avaliacao.Anterior);
            holder.tvseparador.setText(avaliacao.Separador);
            holder.tvatual.setText(avaliacao.Atual);


    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolderAvaliacao extends RecyclerView.ViewHolder{

        public TextView tvtipo;
        public TextView tvanterior;
        public TextView tvseparador;
        public TextView tvatual;

        public ViewHolderAvaliacao(View itemView) {
            super(itemView);

            tvtipo = (TextView) itemView.findViewById(R.id.tvtipo);
            tvanterior = (TextView) itemView.findViewById(R.id.tvanterior);
            tvseparador = (TextView) itemView.findViewById(R.id.tvseparador);
            tvatual = (TextView) itemView.findViewById(R.id.tvatual);
        }
    }

}
