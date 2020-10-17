package br.usjt.ads20.atividaded1;

import java.util.ArrayList;
import java.util.Arrays;
/**
 Vinicius Braconi Solis 818123641
 */
public class Dados {
    private static ArrayList<Universidade> universidades;

    public static void setUniversidades(ArrayList<Universidade> pUniversidades) {
        universidades = pUniversidades;
    }

    public static Universidade[] buscarUniversidades(String chave) {
        ArrayList<Universidade> lista = universidades;
        ArrayList<Universidade> filtro;
        Universidade[] universidades;
        if (chave == null || chave.length() == 0) {
            filtro = lista;
        } else {
            filtro = new ArrayList<>();
            for (Universidade universidade : lista) {
                String nome = universidade.getName();

                if (nome.toUpperCase().contains(chave.toUpperCase())) {
                    filtro.add(universidade);
                }
            }
        }
        universidades = filtro.toArray(new Universidade[0]);
        Arrays.sort(universidades);
        return universidades;
    }
}
