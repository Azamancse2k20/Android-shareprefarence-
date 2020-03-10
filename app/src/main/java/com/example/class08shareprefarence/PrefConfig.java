package com.example.class08shareprefarence;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefConfig {

    private SharedPreferences sharedPreferences;
    private Context context;


    public PrefConfig(Context context) {
        this.context = context;


        sharedPreferences = context.getSharedPreferences(context.getString(R.string.Pref_Config),Context.MODE_PRIVATE);
    }

    public void writeLoginStatus(boolean ststus){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getString(R.string.login_ststus),ststus);
        editor.apply();
    }

    public boolean readLoginStatus(){
        return sharedPreferences.getBoolean(context.getString(R.string.login_ststus),false);
    }
}
