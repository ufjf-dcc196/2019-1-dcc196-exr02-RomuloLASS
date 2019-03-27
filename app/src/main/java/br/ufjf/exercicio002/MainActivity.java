package br.ufjf.exercicio002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textMensagem = findViewById(R.id.textView3);
        textMensagem.setText(R.string.resultado_final);

        final EditText numeroX = findViewById(R.id.editText3);
        final EditText numeroY = findViewById(R.id.editText4);

        Button buttonAdd = findViewById(R.id.button);
        Button buttonSub = findViewById(R.id.button3);
        Button buttonMult = findViewById(R.id.button2);
        Button buttonDiv = findViewById(R.id.button4);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMensagem.setText(getText(R.string.resultado_final)+" "+String.valueOf(Float.parseFloat(numeroX.getText().toString()) + Float.parseFloat(numeroY.getText().toString())));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMensagem.setText(getText(R.string.resultado_final)+" "+String.valueOf(Float.parseFloat(numeroX.getText().toString()) - Float.parseFloat(numeroY.getText().toString())));
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMensagem.setText(getText(R.string.resultado_final)+" "+String.valueOf(Float.parseFloat(numeroX.getText().toString()) * Float.parseFloat(numeroY.getText().toString())));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMensagem.setText(getText(R.string.resultado_final)+" "+String.valueOf(Float.parseFloat(numeroX.getText().toString()) / Float.parseFloat(numeroY.getText().toString())));
            }
        });
    }
}
