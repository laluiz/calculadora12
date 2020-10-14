package br.senai.sc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String  primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.tv_display);
     }


     public void onClickBotao0(View v) {
        primeiroNumero = "1";
        atualizarDisplay("0");
     }

     public void onClickBotao3(View v) {
        segundoNumero = "3";
        atualizarDisplay("3");
     }

     public void onClickBotao4(View v) {
       atualizarDisplay("4");
     }

     public void onClickBotao5(View v) {

        atualizarDisplay("5");
     }

     public void onClickBotao6(View v) {
        atualizarDisplay("6");
     }

      public void onClickBotao7(View v) {
         atualizarDisplay("7");
      }
     public void onClickBotao8(View v) {
        atualizarDisplay("8");
     }
      public void onClickBotao9(View v) {
        atualizarDisplay("9");
     }
     public void onClickSubtracao(View v) {
        operacao = "-";
        atualizarDisplay("-");
     }
     public void onClickMultiplicacao(View v) {
        operacao = "*";
        atualizarDisplay("*");
      }
      public void onClickDivisao(View v) {
         operacao = "/";
         atualizarDisplay("/");
      }
      public void onClickIgual(View v) {
          int numero1 = Integer.parseInt(primeiroNumero);
          int numero2 = Integer.parseInt(segundoNumero);
          if (operacao.equals("-")) {
              int resultado = numero1 + numero2;
              display.setText(String.valueOf(resultado));

          }
      }


       private void atualizarDisplay(String texto) {
             String textoDisplay = display.getText().toString();
             textoDisplay = textoDisplay + texto;
             display.setText(textoDisplay);
         }


}

