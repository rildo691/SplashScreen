package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    EditText et_numero;
    Button btn_verificar;
    TextView txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        et_numero = (EditText) findViewById(R.id.et_numero);
        btn_verificar = (Button) findViewById(R.id.btn_verificar);
        txt_resultado = (TextView) findViewById(R.id.textView2);

        btn_verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor = Integer.parseInt(et_numero.getText().toString());

                if (valor % 2 == 0){
                    txt_resultado.setText("O número" + " " + valor + " " + "é par.");
                    et_numero.setText("");
                } else {
                    txt_resultado.setText("O número" + " " + valor + " " + "é ímpar.");
                    et_numero.setText("");
                }
            }
        });
    }
}