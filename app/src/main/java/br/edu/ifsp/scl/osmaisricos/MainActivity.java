package br.edu.ifsp.scl.osmaisricos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Ricos> pessoasRicas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        geraRicos();

        //Criando o adapter
        RicosAdapter adapter = new RicosAdapter(pessoasRicas);
        recyclerView.setAdapter(adapter);
    }


    private void geraRicos() {

        pessoasRicas.add(
            new Ricos(1, "1ª", "Jeff Bezos e família",
                    "US$ 131 bilhões", "Estados Unidos", R.drawable.jeff)
        );

        pessoasRicas.add(
                new Ricos(2, "2ª", "Bill Gates",
                        "US$ 96,5 bilhões", "Estados Unidos", R.drawable.gates)
        );

        pessoasRicas.add(
                new Ricos(3, "3ª", "Warren Buffett",
                        "US$ 82,5 bilhões", "Estados Unidos", R.drawable.buffett)
        );

        pessoasRicas.add(
                new Ricos(4, "4ª", "Bernard Arnault e família",
                        "US$ 76 bilhões", "França", R.drawable.arnault)
        );

        pessoasRicas.add(
                new Ricos(5, "5ª", "Carlos Slim Helú e família",
                        "US$ 64 bilhões", "México", R.drawable.slim)
        );

        pessoasRicas.add(
                new Ricos(6, "6ª", "Amancio Ortega",
                        "US$ 62,7 bilhões", "Espanha", R.drawable.ortega)
        );

        pessoasRicas.add(
                new Ricos(7, "7ª", "Larry Ellison",
                        "US$ 62,5 bilhões", "Estados Unidos", R.drawable.ellison)
        );

        pessoasRicas.add(
                new Ricos(8, "8ª", "Mark Zuckerberg",
                        "US$ 62,3 bilhões", "Estados Unidos", R.drawable.zuckerberg)
        );

        pessoasRicas.add(
                new Ricos(9, "9ª", "Michael Bloomberg",
                        "US$ 55.5 bilhões", "Estados Unidos", R.drawable.bloomberg)
        );

        pessoasRicas.add(
                new Ricos(10, "10ª", "Larry Page",
                        "US$ 50,8 bilhões", "Estados Unidos", R.drawable.page)
        );

        pessoasRicas.add(
                new Ricos(11, "11ª", "Charles Koch (empate)",
                        "US$ 50,5 bilhões", "Estados Unidos", R.drawable.charles)
        );

        pessoasRicas.add(
                new Ricos(12, "11ª", "David Koch (empate)",
                        "US$ 50,5 bilhões", "Estados Unidos", R.drawable.david)
        );

        pessoasRicas.add(
                new Ricos(13, "13ª", "Mukesh Ambani",
                        "US$ 50 bilhões", "Índia", R.drawable.ambani)
        );

        pessoasRicas.add(
                new Ricos(14, "14ª", "Sergey Brin",
                        "US$ 49,8 bilhões", "Estados Unidos", R.drawable.brin)
        );

        pessoasRicas.add(
                new Ricos(15, "15ª", "Francoise Bettencourt Meyers e família",
                        "US$ 49,3 bilhões", "França", R.drawable.meyers)
        );

    }

}