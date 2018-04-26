package br.com.matheus.appacad;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class AvaliacaoHolder extends RecyclerView.ViewHolder{
    TextView tvtipo = null;
    TextView tvanterior = null;
    TextView tvseparador = null;
    TextView tvatual = null;


    public AvaliacaoHolder(View view) {
        super(view);
        tvtipo = (TextView) view.findViewById(R.id.tvtipo);
        tvanterior = (TextView) view.findViewById(R.id.tvanterior);
        tvseparador = (TextView) view.findViewById(R.id.tvseparador);
        tvatual = (TextView) view.findViewById(R.id.tvatual);
    }

    public TextView getTvtipo() {
        return tvtipo;
    }

    public void setTvtipo(TextView tvtipo) {
        this.tvtipo = tvtipo;
    }

    public TextView getTvanterior() {
        return tvanterior;
    }

    public void setTvanterior(TextView tvanterior) {
        this.tvanterior = tvanterior;
    }

    public TextView getTvseparador() {
        return tvseparador;
    }

    public void setTvseparador(TextView tvseparador) {
        this.tvseparador = tvseparador;
    }

    public TextView getTvatual() {
        return tvatual;
    }

    public void setTvatual(TextView tvatual) {
        this.tvatual = tvatual;
    }
}
