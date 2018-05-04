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


//Classe utilizada para tela de perfil de usuário
public class TelaPerfil extends AppCompatActivity {

    TextView usuario = null; //Declarando nome do usuário
    Switch preferencias = null; //Declarando preferencias de usuário
    Switch avisos = null; //Declarando avisos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil); //Atribuindo a tela que será utilizada para perfil

        usuario = (TextView)findViewById(R.id.perfil); //Definindo qual item será atribuido à variavel usuário

        Bundle dicionario = this.getIntent().getExtras();

        usuario.setText(dicionario.getString("login"));



    }

    public void logout(View botao){ //metódo utilizado para acionamento do botao de sair do sistema
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setIcon(R.mipmap.ic_launcher);
        alerta.setTitle("Atenção");
        alerta.setMessage("Deseja realmente sair?"); //Solicitndo confirmacao de saida
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
