package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.models.NotaModel;
import com.example.myapplication.operations.NotaOperations;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NotaOperations operations;
    private TextView uno;
    private ArrayList<String> list;
    private Button btn_main_nuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = findViewById(R.id.uno);
        btn_main_nuevo = findViewById(R.id.btn_main_nuevo);
        operations = new NotaOperations(this);

        btn_main_nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nuevo = new Intent(MainActivity.this, RegistroActivity.class);
                startActivity(nuevo);
            }
        });

        String consolidadoMostrar = "";
        list = operations.list();

        for (int i = 0; i < list.size(); i++){
            consolidadoMostrar += list.get(i) + "\n ------------------ \n\n";
        }

        uno.setText(consolidadoMostrar);
    }
}