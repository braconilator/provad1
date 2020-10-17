package br.usjt.ads20.atividaded1;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Vinicius Braconi Solis 818123641
 */
public class ViewHolder {
    private ImageView imagem;
    private TextView nome;
    private TextView pais;
    private TextView url;

    public ViewHolder(ImageView imagem, TextView nome, TextView pais, TextView url) {
        this.imagem = imagem;
        this.nome = nome;
        this.pais = pais;
        this.url = url;
    }

    public TextView getNome() {
        return nome;
    }

    public TextView getPais() {
        return pais;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public TextView getUrl() {
        return url;
    }

}
