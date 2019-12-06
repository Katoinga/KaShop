package com.example.kashop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Settings extends AppCompatActivity {
    TextView HaciaElInicio;
    TextView Politicas;
    TextView Reportar;
    TextView Equipo;
    Button Back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Back2=findViewById(R.id.Back2);
        HaciaElInicio=findViewById(R.id.txtUserClickable);
        Politicas=findViewById(R.id.txtPrivacyPolicyClickable);
        Reportar=findViewById(R.id.txtReportAProblemClickable);
        Equipo=findViewById(R.id.txtTeamClickable);

        Back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        HaciaElInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), FirstScreen.class);
                startActivityForResult(intent, 0);
            }
        });

        Politicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder politica= new AlertDialog.Builder(Settings.this);
                politica.setMessage("Todos los derechos reservados a los alumnos de Sistemitas de IHC").setCancelable(true);
                AlertDialog title=politica.create();
                title.setTitle("Políticas de Privacidad");
                title.show();
            }
        });

        Reportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder Reportar= new AlertDialog.Builder(Settings.this);
                Reportar.setMessage("Si se encuentra algún problema, rogamos comunicarnoslo al *********").setCancelable(true);
                AlertDialog title=Reportar.create();
                title.setTitle("¿Encontraste algún problema?");
                title.show();
            }
        });

        Equipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder TeamWork= new AlertDialog.Builder(Settings.this);
                TeamWork.setMessage("Somos alumnos de IHC, de Sistemas").setCancelable(true);
                AlertDialog title=TeamWork.create();
                title.setTitle("Nuestro Equipo");
                title.show();
            }
        });

    }

}
