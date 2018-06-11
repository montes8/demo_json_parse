package com.example.eddymontesinos.demojson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView nombreAnimal;
    TextView colorAnimal;
    TextView edadAnimal;
    ArrayList<String> listaanimales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreAnimal=(TextView) findViewById(R.id.text_nombre);
        colorAnimal=(TextView) findViewById(R.id.text_color);
        edadAnimal=(TextView) findViewById(R.id.text_edad);


        try {
            String arrayLista=Json.getStringFromRawFile(getApplicationContext());
            Gson gson=new Gson();

            Type animalesType = new TypeToken<List<ListaAnimal>>() {}.getType();

            List<ListaAnimal> lista = gson.fromJson(arrayLista, animalesType);

            Log.d("listaanimales", String.valueOf(lista));
            for (ListaAnimal i:lista) {
                List<Tipos> listaAnimales = i.getValues();
                //otorgamos los valore de tipo de animales a la variable v
                String v=i.getTipos();

                //imprimiemos los los datos del primer animal domestico
               if(v.equals("domestico")) {
                   String animal = i.getValues().get(0).getAnimal();
                   String color = i.getValues().get(0).getColor();
                   String edad = i.getValues().get(0).getEdad().toString();

                   nombreAnimal.setText(animal);
                   colorAnimal.setText(color);
                   edadAnimal.setText(edad + " años");

               }

                 //Traemos ña lista de los nombres de los animales
                for (Tipos tipo : listaAnimales) {
                    String a =tipo.getAnimal();
                    Log.d("domestico", a);

                }


            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
