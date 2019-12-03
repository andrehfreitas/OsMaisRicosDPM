package br.edu.ifsp.scl.osmaisricos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RicosAdapter extends RecyclerView.Adapter <RicosAdapter.GuardadorItemRico> {

    // Atributo com a lista das pessoas mais ricas do mundo
    private ArrayList<Ricos> pessoasRicas;


    // Construtor recebendo e armazenado dados da lista
    public RicosAdapter (ArrayList<Ricos> pessoasRicas){
        this.pessoasRicas = pessoasRicas;
    }


    // Classe interna para reciclar as views dos itens da lista
    class GuardadorItemRico extends RecyclerView.ViewHolder{
        private TextView tvPosicao;
        private TextView tvNome;
        private TextView tvFortuna;
        private TextView tvPais;
        private ImageView imgFoto;

        // Construtor
        public GuardadorItemRico(View itemView) {
            super(itemView);

            // Recuperando as referências para os objetos gráficos
            tvPosicao = itemView.findViewById(R.id.tvPosicao);
            tvNome = itemView.findViewById(R.id.tvNome);
            tvFortuna = itemView.findViewById(R.id.tvFortuna);
            tvPais = itemView.findViewById(R.id.tvPais);
            imgFoto = itemView.findViewById(R.id.imgFoto);
        }
    }


    @NonNull
    @Override
    public GuardadorItemRico onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Recuperando objeto inflador
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        // Inflando a view a partir do layout dos itens da lista
        View itemLista = inflater.inflate(R.layout.item_lista, parent, false);

        // Cria o ViewHolder e retorna sua referência
        return new GuardadorItemRico(itemLista);
    }


    @Override
    public void onBindViewHolder(@NonNull GuardadorItemRico holder, int position) {

        // Recuperando o objeto Ricos na posição desejada da lista
        Ricos ricos = pessoasRicas.get(position);

        // Colocando os dados recuperados do objeto Ricos nos componentes
        holder.tvPosicao.setText(ricos.getPosicao());
        holder.tvNome.setText(ricos.getNome());
        holder.tvFortuna.setText(ricos.getFortuna());
        holder.tvPais.setText(ricos.getPais());

        // Imagem colocada vem do drawable
        holder.imgFoto.setImageResource(ricos.getFoto());
    }

    @Override
    public int getItemCount() {
        return pessoasRicas.size();
    }

}
