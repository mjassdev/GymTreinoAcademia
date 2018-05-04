package br.com.matheus.appacad;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class AdaptadorAvaliacao extends ArrayAdapter<Avaliacao> {


    ArrayList<Avaliacao> avaliacoes;
    Context context;
    int resource;


    public AdaptadorAvaliacao(Context context, int resource, ArrayList<Avaliacao> avaliacoes) {
        super(context, resource, avaliacoes);
        this.avaliacoes = avaliacoes;
        this.context = context;
        this. resource = resource;

    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_layout_avaliacao, null, true);
        }


        Avaliacao avaliacao = getItem(position);

        TextView txtTipo = (TextView) convertView.findViewById(R.id.tvtipo);
        txtTipo.setText(avaliacao.Tipo.toString());

        TextView txtAnterior = (TextView) convertView.findViewById(R.id.tvanterior);
        txtAnterior.setText(avaliacao.Anterior.toString());

        TextView txtSeparador = (TextView) convertView.findViewById(R.id.tvseparador);
        txtSeparador.setText(avaliacao.Separador.toString());

        TextView txtAtual = (TextView) convertView.findViewById(R.id.tvatual);
        txtAtual.setText(avaliacao.Atual.toString());


        return convertView;
    }


}