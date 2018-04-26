package br.com.matheus.appacad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //Atributos de classe
    Button vrBtnOk = null;
    EditText vrCampoLogin = null;
    EditText vrCampoSenha = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        vrBtnOk = (Button)findViewById(R.id.TelaLoginbotaoLogin);
    }


    //Metodo interno que utiliza para validar logine senha
    private boolean validaLogin(){
        vrCampoLogin = (EditText) findViewById(R.id.TelaLoginCampologin);
        vrCampoSenha = (EditText) findViewById(R.id.TelaLoginCamposenha);

        if (vrCampoLogin.getText().toString().equals("mj") && vrCampoSenha.getText().toString().equals("aa")){
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View vrBotao) {
        if (vrBotao.getId() == R.id.TelaLoginbotaoLogin) {
            validaLogin();
        }
    }

    //Método utilizado para tratar eventos do botão
    public void validaLogin(View vrBotao) {
        if (vrBotao.getId() == R.id.TelaLoginbotaoLogin) {
            if(validaLogin()){
                Bundle dicionario = new Bundle();
                dicionario.putString("Login", vrCampoLogin.getText().toString());
                dicionario.putInt("Idade", 45);
                dicionario.putChar("Sexo", 'M');

                Intent intentPerfil = new Intent(LoginActivity.this, MainActivity.class);

                intentPerfil.putExtras(dicionario);
                startActivityForResult(intentPerfil, 1);
            }
            else{
                if (vrCampoSenha.getText().toString() == "" && vrCampoLogin.getText().toString() == ""){
                    Toast vrToast = Toast
                            .makeText(this, "Login ou senha em branco", Toast.LENGTH_SHORT);
                    vrToast.show();
                }
                else {
                    Toast vrToast = Toast
                            .makeText(this, "Usuário ou senha inválido !", Toast.LENGTH_SHORT);
                    vrToast.show();
                }
            }
        }
    }

    public void onActivityResult(int codigo, int resultado, Intent intent){
        if (resultado == Activity.RESULT_OK){
            if (codigo == 1){
                boolean notificacoes = intent.getExtras().getBoolean("notifications");
                boolean avisos = intent.getExtras().getBoolean("preferences");

                Persistencia.salvaPreferencias(notificacoes, avisos, this);
            }
        }
    }


}
