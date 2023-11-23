package com.neyser.spinnerimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner sp1;
    String[] items = {"Item 1", "Item 2", "Item 3"};
    int[] operaciones = {R.drawable.espana, R.drawable.francia, R.drawable.italia}; // IDs de las imágenes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.sp1);


        //Utilizamos  el objeto ArrayAdapter para leer los datos
        /*ArrayAdapter<String> adaptador1 =new ArrayAdapter(this, android.R.layout.simple_spinner_item,operaciones);
        sp1.setAdapter(adaptador1);*/

        CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(this, R.layout.spinner_list, items,operaciones);
        sp1.setAdapter(adapter);



    }
}