package br.usjt.ads20.atividaded1;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
Vinicius Braconi Solis 818123641
 */

public class UniversidadeNetwork {

    public static ArrayList<Universidade> buscarUniversidade(String url) throws IOException {

        ArrayList<Universidade> universidades = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();

        try {
            JSONArray lista = new JSONArray(json);
            for (int i = 0; i < lista.length(); i++) {
                Universidade universidade = new Universidade();
                JSONObject item = (JSONObject) lista.get(i);
                universidade.setName(item.getString("name"));
                universidade.setAlphaTwoCode(item.getString("alpha_two_code"));
                universidade.setCountry(item.getString("country"));
                JSONArray pages = item.getJSONArray("web_pages");
                universidade.setWebPages(pages.getString(0));
                universidades.add(universidade);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return universidades;
    }
}
