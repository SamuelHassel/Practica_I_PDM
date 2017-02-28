package com.ruizvilla.holamundo_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declaracion o construccion de objetos

    EditText ePesos, eDolares;
    Button bConvertir;

    // Declaracion de variables numericas
    Double pesos, dolares;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conexion con XML
        ePesos = (EditText) findViewById(R.id.ePesos);
        eDolares = (EditText) findViewById(R.id.eDolares);
        bConvertir = (Button) findViewById(R.id.bConvertir);

        // Interacción con el usuario y escuchadores , new control + space para desplegar metodos
        // Capacidad de acción del boton
        bConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //__________________________________________
                // Zona de logica a partir de if
                // eDolares agarra texto lo pasa a String y lo compara con " " vacio, el ! antes es la negacion a eso, && es OR
                // Si el campo dolares no esta vacio y el epesos si
                if (!(eDolares.getText().toString().equals("")) && ePesos.getText().toString().equals("")) {
                    dolares = Double.parseDouble(eDolares.getText().toString());
                    //pesos = Double.parseDouble(ePesos.getText().toString());
                    pesos = dolares * 3000;
                    ePesos.setText(String.valueOf(pesos));
                } else {
                    // Si edolares esta vacio y epesos no
                    if ((eDolares.getText().toString().equals("")) && !ePesos.getText().toString().equals("")) {
                        pesos = Double.parseDouble(ePesos.getText().toString());
                        dolares = pesos / 3000;
                        eDolares.setText(String.valueOf(dolares));
                    } else {
                        // Si ambos esta vacio entonces saque mensaje para que digite valor
                        if (eDolares.getText().toString().equals("") && ePesos.getText().toString().equals("")) {
                            Toast.makeText(getApplicationContext(), "Digite un valor a convertir", Toast.LENGTH_SHORT).show();
                            // Toast es el que despliega textos de gestion, LENGTH SHORT es cuanto demora mostrando
                        } else {
                            if (!ePesos.getText().toString().equals("") && !eDolares.getText().toString().equals("")) {
                                Toast.makeText(getApplicationContext(), "Error solo debe digitar un VALOR", Toast.LENGTH_SHORT).show();
                            }
                        }
//_________________________________________________________
                    }
                }
            }
        });

    }


    }

