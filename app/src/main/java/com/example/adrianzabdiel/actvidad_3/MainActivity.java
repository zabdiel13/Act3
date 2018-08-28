package com.example.adrianzabdiel.actvidad_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nombre= (EditText) findViewById(R.id.editText);
        final EditText apellido= (EditText) findViewById(R.id.editText2);
        final EditText edad= (EditText) findViewById(R.id.editText4);
        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {
            Usuario user = new Usuario(nombre.getText() .toString(), apellido.getText().toString(), edad.getText().toString());
            intent.putExtra("usuario", usuario);
            startActivity(intent);
            }
        });

    }
}
