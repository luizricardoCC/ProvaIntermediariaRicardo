package br.usjt.provaintermediaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static br.usjt.provaintermediaria.MainActivity.EXTRA_N;
import static br.usjt.provaintermediaria.MainActivity.EXTRA_TABUADA;
/**
 * @author Ricardo Silva de Almeida 201518467
 */
public class ListActivity extends Activity {

    /**
     * @author Ricardo Silva de Almeida 201518467
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();

        try {

            int tabuada, numero;
            tabuada = intent.getIntExtra(EXTRA_TABUADA, 1);
            numero = intent.getIntExtra(EXTRA_N, 1);

            ArrayList<String> resultado = new ArrayList<String>(1);

            for (int ini = 1; ini <= numero; ini++) {

                resultado.add(tabuada + "X" + ini + " = " + tabuada * ini);
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, resultado);

            ListView lv = (ListView) findViewById(R.id.listView);
            lv.setAdapter(adapter);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
