package br.usjt.provaintermediaria;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public final static String EXTRA_TABUADA = "br.usjt.provaintermediaria.TABUADA";
    public final static String EXTRA_N = "br.usjt.provaintermediaria.N";


    public void startListActivity(View v){
        Intent i = new Intent(this, ListActivity.class);
        EditText tabuada, ate;
        tabuada = (EditText)findViewById(R.id.etxt_tabuada);
        ate = (EditText)findViewById(R.id.etxt_ate);

        int tab, n;
        tab = Integer.parseInt(tabuada.getText().toString());
        n = Integer.parseInt(ate.getText().toString());

        System.out.println(tab);
        System.out.println(n);

        i.putExtra(EXTRA_TABUADA, tab);
        i.putExtra(EXTRA_N, n);

        startActivity(i);

    }
}
