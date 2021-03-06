package com.example.adrianzabdiel.actvidad_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Parcel;
import android.os.Parcelable;

import android.content.Intent;

public class Main2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_);

        String datos = new String();
        Bundle extras = getIntent().getExtras();
        Usuario usuario= extras.getParcelable("usuario");
        if(usuario != null)
        {
            TextView nombre = (TextView)findViewById(R.id.name);
            nombre.setText(usuario.nombre);
            TextView apellido = (TextView)findViewById(R.id.lastname);
            apellido.setText(usuario.apellido);
            TextView edad = (TextView)findViewById(R.id.age);
            edad.setText(usuario.edad);
        }

    }

}
