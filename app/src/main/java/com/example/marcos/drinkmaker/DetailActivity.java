package com.example.marcos.drinkmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int drinkID = 3;
        Intent it = getIntent();

        String[] drinks = new String[]{"Batida de Sonho de Valsa", "Drink dos Deuses", "Quentão"};
        String[] ingredientes = new String[]{
                "3 bombons sonho de valsa;\n1 lata de leite condensado;\n1/2 garrafa de pinga;\n1 latinha de guaraná.",
                "1 vidro (100ml) de leite de cooc;\n1 copo (100ml) de suco de maracujá;\n1 copo (100ml) de groselha;\nCerca de 1 lata de leite condensado;\n1 copo (100ml) de cachaça;\nGelo picado.",
                "1 garrafa de cachaça (600ml);\n600ml de água;\n1/2kg de açúcar;\nCasca de 2 laranjas;\nCasca de 1 limão\n50g de gengibre em pedacinhos;\nCravo-da-Índia a gosto;\nCanela de pau a gosto;\n1 maçã cortada em pedacinhos."
        };
        String[] preparos = new String[]{
                "1. Bater tudo no liquidificador, ficando os chocolates crocantes por cima;\n2. Servir gelado.",
                "1. Bater os 5 primeiros ingredientes no liquidificador e acrescentar o gelo na hora de servir.",
                "1. Colocar em uma panela grande o açúcar, as cascas de laranjas o limão e gengibre, o cravo e a canela;\n2. Quando o açúcar estiver derretendo colocar a cachaçá e a água, deixando cozinhar por 20 a 25 minutos em fogo médio;\n3. Filtre, e após coloque a maçã picadinha;\n4. Manter no fogo, após o preparo."
        };

        TextView tvNmDrink = (TextView)findViewById(R.id.tvNmDrink);
        TextView tvIngrediente = (TextView)findViewById(R.id.tvIngrediente);
        TextView tvPreparo = (TextView)findViewById(R.id.tvPreparo);

        if(it != null) {
            drinkID = it.getIntExtra("drinkID", 3);
        }

        if(drinkID == 3) {
            tvNmDrink.setText("");
            tvIngrediente.setText("");
            tvPreparo.setText("");
            Toast.makeText(this, "Drink não encontrado!", Toast.LENGTH_LONG).show();
        }
        else{
            tvNmDrink.setText(drinks[drinkID]);
            tvIngrediente.setText(ingredientes[drinkID]);
            tvPreparo.setText(preparos[drinkID]);
        }
    }
}
