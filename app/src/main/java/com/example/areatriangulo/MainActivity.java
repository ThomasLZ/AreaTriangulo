package com.example.areatriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextBase;
    private EditText editTextAltura;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBase = findViewById(R.id.editTextBase);
        editTextAltura = findViewById(R.id.editTextAltura);

        textViewResultado = findViewById(R.id.textViewResultado);

        textViewResultado.setText("");
    }

    public void Calcular(View v) {

        String base = editTextBase.getText().toString().replace( ",", ".");
        String altura = editTextAltura.getText().toString().replace( ",", ".");


        Double baseResult = Double.parseDouble(base);
        Double alturaResult = Double.parseDouble(altura);

        if (baseResult == 0 && alturaResult == 0){
            Toast.makeText(MainActivity.this, "Os parâmetros passados no triângulos não existem!", Toast.LENGTH_SHORT).show();

        }

        Calculo calc = new Calculo();

        Double resultado = calc.Area(baseResult, alturaResult);
        String resultadoText = resultado.toString().replace( ".", ",");

        DecimalFormat df = new DecimalFormat("#.##");
        String resultadoformatter = df.format(resultado).replace( ".", ",");


        textViewResultado.setText(resultadoformatter);
        editTextBase.onEditorAction(EditorInfo.IME_ACTION_DONE);
        editTextAltura.onEditorAction(EditorInfo.IME_ACTION_DONE);


    }



}