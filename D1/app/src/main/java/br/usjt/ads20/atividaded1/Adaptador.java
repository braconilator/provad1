package br.usjt.ads20.atividaded1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 Vinicius Braconi Solis 818123641
 */
public class Adaptador extends BaseAdapter {
    private Universidade[] universidades;
    private Context context;

    public Adaptador(Context context, Universidade[] universidades) {
        this.universidades = universidades;
        this.context = context;
    }

    @Override
    public int getCount() {
        return universidades.length;
    }

    @Override
    public Object getItem(int i) {
        if (i >= 0 && i < universidades.length) {
            return universidades[i];
        } else {
            return null;
        }
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.universidade_view, viewGroup, false);
            ImageView logoUniversidade = (ImageView) view.findViewById(R.id.imagem);
            TextView nome = (TextView) view.findViewById(R.id.nome_universidade);
            TextView pais = (TextView) view.findViewById(R.id.pais_universidade);
            TextView url = (TextView) view.findViewById(R.id.url_universidade);
            view.setTag(new ViewHolder(logoUniversidade, nome, pais, url));
        }

        ViewHolder holder = (ViewHolder) view.getTag();
        holder.getNome().setText(universidades[i].getName());
        holder.getPais().setText(universidades[i].getCountry());
        holder.getUrl().setText(universidades[i].getWebPages());
        holder.getImagem().setImageBitmap(Util.criaAvatar(context, universidades[i].getAlphaTwoCode()));
        return view;
    }
}
