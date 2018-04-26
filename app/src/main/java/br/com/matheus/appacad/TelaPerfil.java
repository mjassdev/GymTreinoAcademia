package br.com.matheus.appacad;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class TelaPerfil extends AppCompatActivity {

    TextView usuario = null;
    Switch preferencias = null;
    Switch avisos = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);

        usuario = (TextView)findViewById(R.id.perfil);

        Bundle dicionario = this.getIntent().getExtras();

        usuario.setText(dicionario.getString("login"));



    }

    public void logout(View botao){
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setIcon(R.mipmap.ic_launcher);
        alerta.setTitle("Atenção");
        alerta.setMessage("Deseja realmente sair?");
        alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Bundle resultado = new Bundle();
                resultado.putBoolean("notificacoes", avisos.isChecked());
                resultado.putBoolean("preferencias", preferencias.isChecked());
                Intent intencao = new Intent();
                intencao.putExtras(resultado);

                setResult(Activity.RESULT_OK, intencao);

                finish();
            }
        });

        alerta.setNegativeButton("Não", null);
        alerta.create().show();
    }

}
