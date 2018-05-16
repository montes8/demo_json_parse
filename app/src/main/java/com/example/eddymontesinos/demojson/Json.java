package com.example.eddymontesinos.demojson;

import android.content.Context;
import android.content.res.Resources;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Json {



    public static String getStringFromRawFile(Context activity)
            throws IOException
    {
        Resources r = activity.getResources();
        InputStream is = r.openRawResource(R.raw.lista_array_json);
        String myText = convertStreamToString(is);
        is.close();
        return myText;
    }

    public static String convertStreamToString(InputStream is)
            throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i = is.read();
        while (i != -1)
        {
            baos.write(i);
            i = is.read();
        }
        return baos.toString();
    }
}
