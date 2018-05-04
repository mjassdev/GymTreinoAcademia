package br.com.matheus.appacad;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;


//Classe usada para persistencia dos dados
public class Persistencia {
    public static void salvaPreferencias(boolean notifications, boolean preferences, Context contexto){
        SharedPreferences favoritos =
                contexto.getSharedPreferences("favoritos", Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = favoritos.edit();

        editor.putBoolean("notifications", notifications);
        editor.putBoolean("preferences", preferences);

        editor.commit();
    }

    public static boolean getNotifications(Context contexto){
        SharedPreferences favoritos =
                contexto.getSharedPreferences("favoritos", Activity.MODE_PRIVATE);

        if(favoritos.contains("notifications")){
            return  favoritos.getBoolean("notifications", false);
        }


        return false;
    }

    public static boolean getPreferences(Context contexto){
        SharedPreferences favoritos =
                contexto.getSharedPreferences("favoritos", Activity.MODE_PRIVATE);

        if(favoritos.contains("preferences")){
            return  favoritos.getBoolean("Context contexto", false);
        }


        return false;
    }
}
