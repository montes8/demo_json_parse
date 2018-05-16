package com.example.eddymontesinos.demojson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            String arrayLista=Json.getStringFromRawFile(getApplicationContext());
            Gson gson=new Gson();

            Type animalesType = new TypeToken<List<ListaAnimal>>() {}.getType();

            List<ListaAnimal> lista = gson.fromJson(arrayLista, animalesType);


            for (ListaAnimal i:lista){
                List<Domestico> listaAnimales =i.getValues();
                for(Domestico domestico: listaAnimales){
                    String a=domestico.getAnimal();
                    Log.d("domestico", a);
                }
            }
            Log.d("tipos",lista.size()+"");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
