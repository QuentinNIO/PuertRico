package com.example.cronos.puerto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random ;
import java.util.Collections ;
import java.util.Arrays ;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView bat11,bat12,bat13,bat14,bat15,bat16,bat21,bat22,bat23,bat24,bat25,bat26,bat27,bat31,bat32,bat33,bat34,bat35,bat36,grbat11,grbat12,grbat21,grbat22,grbat31,grbat32,num1,num2,num3,num4,num5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);
        bat11= new TextView(this);
        bat11=(TextView)findViewById(R.id.BatA1);
        bat12= new TextView(this);
        bat12=(TextView)findViewById(R.id.BatA2);
        bat13= new TextView(this);
        bat13=(TextView)findViewById(R.id.BatA3);
        bat14= new TextView(this);
        bat14=(TextView)findViewById(R.id.BatA4);
        bat15= new TextView(this);
        bat15=(TextView)findViewById(R.id.BatA5);
        bat16= new TextView(this);
        bat16=(TextView)findViewById(R.id.BatA6);
        bat21= new TextView(this);
        bat21=(TextView)findViewById(R.id.BatB1);
        bat22= new TextView(this);
        bat22=(TextView)findViewById(R.id.BatB2);
        bat23= new TextView(this);
        bat23=(TextView)findViewById(R.id.BatB3);
        bat24= new TextView(this);
        bat24=(TextView)findViewById(R.id.BatB4);
        bat25= new TextView(this);
        bat25=(TextView)findViewById(R.id.BatB5);
        bat26= new TextView(this);
        bat26=(TextView)findViewById(R.id.BatB6);
        bat27= new TextView(this);
        bat27=(TextView)findViewById(R.id.BatB7);
        bat31= new TextView(this);
        bat31=(TextView)findViewById(R.id.BatC1);
        bat32= new TextView(this);
        bat32=(TextView)findViewById(R.id.BatC2);
        bat33= new TextView(this);
        bat33=(TextView)findViewById(R.id.BatC3);
        bat34= new TextView(this);
        bat34=(TextView)findViewById(R.id.BatC4);
        bat35= new TextView(this);
        bat35=(TextView)findViewById(R.id.BatC5);
        bat36= new TextView(this);
        bat36=(TextView)findViewById(R.id.BatC6);
        grbat11= new TextView(this);
        grbat11=(TextView)findViewById(R.id.GrBatA1);
        grbat21= new TextView(this);
        grbat21=(TextView)findViewById(R.id.GrBatB1);
        grbat31= new TextView(this);
        grbat31=(TextView)findViewById(R.id.GrBatC1);
        grbat12= new TextView(this);
        grbat12=(TextView)findViewById(R.id.GrBatA2);
        grbat22= new TextView(this);
        grbat22=(TextView)findViewById(R.id.GrBatB2);
        grbat32= new TextView(this);
        grbat32=(TextView)findViewById(R.id.GrBatC2);
        num1= new TextView(this);
        num1=(TextView)findViewById(R.id.NumPlayer1);
        num2= new TextView(this);
        num2=(TextView)findViewById(R.id.NumPlayer2);
        num3= new TextView(this);
        num3=(TextView)findViewById(R.id.NumPlayer3);
        num4= new TextView(this);
        num4=(TextView)findViewById(R.id.NumPlayer4);
        num5= new TextView(this);
        num5=(TextView)findViewById(R.id.NumPlayer5);


    }

    @Override
    public void onClick(View v) {
        Random rand = new Random();
        int rand11 = rand.nextInt(2)+1;
        int rand12 = rand.nextInt(6)+1;
        int rand16 = rand.nextInt(2)+1;
        bat14.setText("Cadastre");
        bat15.setText("Chapelle");
        bat16.setText(String.valueOf(rand16));

        switch(rand11) {
            case 1:
                bat11.setText("Pt. Marché");
                break;
            case 2:
                bat11.setText("Aqueduc");
                break;
            default:
                bat11.setText("Unkown");
        }
        switch(rand12) {
            case 1:
                bat12.setText("B. Chantier");
                bat13.setText("B. Forestière");
                break;
            case 2:
                bat12.setText("B. Chantier");
                bat13.setText("Marché Noir");
                break;
            case 3:
                bat12.setText("B. Chantier");
                bat13.setText("Hacienda");
                break;
            case 4:
                bat12.setText("B. Forestière");
                bat13.setText("Marché Noir");
                break;
            case 5:
                bat12.setText("B. Forestière");
                bat13.setText("Hacienda");
                break;
            case 6:
                bat12.setText("Marché Noir");
                bat13.setText("Hacienda");
                break;
            default:
                bat12.setText("Unkown");
                bat13.setText("Unkown");
        }
        switch(rand16) {
            case 1:
                bat16.setText("Pt. Entrepot");
                break;
            case 2:
                bat16.setText("Boutique");
                break;
            default:
                bat16.setText("Unkown");
        }

        int rand21 = rand.nextInt(2)+1;
        int rand22 = rand.nextInt(6)+1;
        int rand26 = rand.nextInt(2)+1;
        bat24.setText("P. Chasse");
        bat25.setText("Architecte");
        bat27.setText("Fournisseur");

        switch(rand21) {
            case 1:
                bat21.setText("Hospice");
                break;
            case 2:
                bat21.setText("Pension");
                break;
            default:
                bat21.setText("Unkown");
        }
        switch(rand22) {
            case 1:
                bat22.setText("Comptoir");
                bat23.setText("Gd. Marché");
                break;
            case 2:
                bat22.setText("Comptoir");
                bat23.setText("Commerce");
                break;
            case 3:
                bat22.setText("Comptoir");
                bat23.setText("Église");
                break;
            case 4:
                bat22.setText("Gd. Marché");
                bat23.setText("Commerce");
                break;
            case 5:
                bat22.setText("Gd. Marché");
                bat23.setText("Église");
                break;
            case 6:
                bat22.setText("Église");
                bat23.setText("Commerce");
                break;
            default:
                bat22.setText("Unkown");
                bat23.setText("Unkown");
        }
        switch(rand26) {
            case 1:
                bat26.setText("Gd. Entrepot");
                break;
            case 2:
                bat26.setText("Pt. Quai");
                break;
            default:
                bat26.setText("Unkown");
        }

        int rand31 = rand.nextInt(2)+1;
        int rand32 = rand.nextInt(6)+1;
        int rand36 = rand.nextInt(2)+1;
        bat34.setText("Villa");
        bat35.setText("Joaillerie");

        switch(rand31) {
            case 1:
                bat31.setText("Manufacture");
                break;
            case 2:
                bat31.setText("Phare");
                break;
            default:
                bat31.setText("Unkown");
        }
        switch(rand32) {
            case 1:
                bat32.setText("Université");
                bat33.setText("Port");
                break;
            case 2:
                bat32.setText("Université");
                bat33.setText("Atelier");
                break;
            case 3:
                bat32.setText("Université");
                bat33.setText("Bibliothèque");
                break;
            case 4:
                bat32.setText("Port");
                bat33.setText("Atelier");
                break;
            case 5:
                bat32.setText("Port");
                bat33.setText("Bibliothèque");
                break;
            case 6:
                bat32.setText("Atelier");
                bat33.setText("Bibliothèque");
                break;
            default:
                bat32.setText("Unkown");
                bat33.setText("Unkown");
        }
        switch(rand36) {
            case 1:
                bat36.setText("Quai");
                break;
            case 2:
                bat36.setText("Syndicat");
                break;
            default:
                bat36.setText("Unkown");
        }
        String[] test = new String[8];
        String[] players = new String[5];
        test[0]="Forteresse";
        test[1]="Hotel De V.";
        test[2]="Résidence";
        test[3]="Douane";
        test[4]="Statue";
        test[5]="Cloitre";
        test[6]="Jardin Roy.";
        test[7]="Guilde";
        players[0]="1";
        players[1]="2";
        players[2]="3";
        players[3]="4";
        players[4]="5";
        Collections.shuffle(Arrays.asList(test));
        Collections.shuffle(Arrays.asList(players));
        grbat11.setText(String.valueOf(test[0]));
        grbat12.setText(String.valueOf(test[1]));
        grbat21.setText(String.valueOf(test[2]));
        grbat22.setText(String.valueOf(test[3]));
        grbat31.setText(String.valueOf(test[4]));
        grbat32.setText(String.valueOf(test[5]));
        num1.setText(String.valueOf(players[0]));
        num2.setText(String.valueOf(players[1]));
        num3.setText(String.valueOf(players[2]));
        num4.setText(String.valueOf(players[3]));
        num5.setText(String.valueOf(players[4]));





        return;

    }
}
