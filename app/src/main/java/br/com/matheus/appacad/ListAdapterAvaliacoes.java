package br.com.matheus.appacad;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


//Adaptador para lista de Avaliacoes
public class ListAdapterAvaliacoes extends ArrayAdapter<Avaliacao>{


        ArrayList<Avaliacao> avaliacoes;
        Context context;
        int resource;


        public ListAdapterAvaliacoes(Context context, int resource, ArrayList<Avaliacao> avaliacoes) {
            //Construindo Avaliacoes
            super(context, resource, avaliacoes);
            this.avaliacoes = avaliacoes;
            this.context = context;
            this. resource = resource;

        }

        @Override
        public View getView (int position, View convertView, ViewGroup parent){
            //Método para inflar os dados dentro da lista de Avaliacoes
            if(convertView == null){
                LayoutInflater layoutInflater = (LayoutInflater) getContext()
                        .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
                //Atribuindo View para receber os dados
                convertView = layoutInflater.inflate(R.layout.custom_list_layout_avaliacao, null, true);
            }


            Avaliacao avaliacao = getItem(position); //Setando a linha que receberá os dados de cada avaliaçao, pelo id da posicao

            TextView txtTipo = (TextView) convertView.findViewById(R.id.tvtipo); //Atribuindo o item de Tipo
            txtTipo.setText(avaliacao.Tipo.toString());

            TextView txtAnterior = (TextView) convertView.findViewById(R.id.tvanterior); //Atribuindo o item de medida anterior
            txtAnterior.setText(avaliacao.Anterior.toString());

            TextView txtSeparador = (TextView) convertView.findViewById(R.id.tvseparador); //colocando um separador que apresentará um indicador de desempenho
            txtSeparador.setText(avaliacao.Separador.toString());

            TextView txtAtual = (TextView) convertView.findViewById(R.id.tvatual); //Atribuindo o item de medida atual
            txtAtual.setText(avaliacao.Atual.toString());


            return convertView;
        }


    }

