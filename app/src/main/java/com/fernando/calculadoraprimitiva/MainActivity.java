package com.fernando.calculadoraprimitiva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2, n3, n4, n5, n6, n7, n8;
    TextView t1, t2, t3, t4;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adicao
        n1 = (EditText) findViewById(R.id.edtAdicao1);
        n2 = (EditText) findViewById(R.id.edtAdicao2);
        t1 = (TextView) findViewById(R.id.txtResultadoAdicao);

        //Subtracao
        n3 = (EditText) findViewById(R.id.edtSubtracao1);
        n4 = (EditText) findViewById(R.id.edtSubtracao2);
        t2 = (TextView) findViewById(R.id.txtResultadoSubtracao);

        //Divisao
        n5 = (EditText) findViewById(R.id.edtDivisao1);
        n6 = (EditText) findViewById(R.id.edtDivisao2);
        t3 = (TextView) findViewById(R.id.txtResultadoDivisao);

        //Multiplicacao
        n7 = (EditText) findViewById(R.id.edtMultiplicacao1);
        n8 = (EditText) findViewById(R.id.edtMultiplicacao2);
        t4 = (TextView) findViewById(R.id.txtResultadoMultiplicacao);

        //Botao Calcular
        Button btnCalc = (Button) findViewById(R.id.btnCalcular);

        btnCalc.setOnClickListener(new Button.OnClickListener(){
            public  void  onClick(View view){
                //Adicao

                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();

                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);

                t1.setText(String.valueOf(i1 + i2));

                //Subtracao

                String s3 = n3.getText().toString();
                String s4 = n4.getText().toString();

                int i3 = Integer.parseInt(s3);
                int i4 = Integer.parseInt(s4);

                t2.setText(String.valueOf(i3 - i4));

                //Divisao

                String s5 = n5.getText().toString();
                String s6 = n6.getText().toString();

                double i5 = Double.parseDouble(s5);
                double i6 = Double.parseDouble(s6);

                t3.setText(String.valueOf(i5 / i6));

                //Multiplicacao

                String s7 = n7.getText().toString();
                String s8 = n8.getText().toString();

                int i7 = Integer.parseInt(s7);
                int i8 = Integer.parseInt(s8);

                t4.setText(String.valueOf(i7 * i8));

            }
        });

    }
}
