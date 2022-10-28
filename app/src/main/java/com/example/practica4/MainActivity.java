package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mes;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mes = findViewById(R.id.gMes);
        resultado = findViewById(R.id.gResultado);

    }

    public void aceptar(View view) {
        int num;
        if (mes.getText().length() > 0) {
            num = Integer.parseInt(mes.getText().toString());
            switch (num) {
                case 1:
                    resultado.setText("Enero");
                    break;
                case 2:
                    resultado.setText("Febrero");
                    break;
                case 3:
                    resultado.setText("Marzo");
                    break;
                case 4:
                    resultado.setText("Abril");
                    break;
                case 5:
                    resultado.setText("Mayo");
                    break;
                case 6:
                    resultado.setText("Junio");
                    break;
                case 7:
                    resultado.setText("Julio");
                    break;
                case 8:
                    resultado.setText("Agosto");
                    break;
                case 9:
                    resultado.setText("Septiembre");
                    break;
                case 10:
                    resultado.setText("Octubre");
                    break;
                case 11:
                    resultado.setText("Noviembre");
                    break;
                case 12:
                    resultado.setText("Diciembre");
                    break;
                default:
                    Toast.makeText(this, "Ese número de mes no existe", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Debes ingresar un número de mes.", Toast.LENGTH_SHORT).show();
        }
    }

}