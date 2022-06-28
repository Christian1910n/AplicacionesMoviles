package com.example.appregistrousuario;

import androidx.appcompat.app.AppCompatActivity;

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

        EditText txt_nombre = findViewById(R.id.txtnombre);
        EditText txtclave = findViewById(R.id.txtclave);
        EditText txtclave2 = findViewById(R.id.txtclave2);
        Button btn_registrar = findViewById(R.id.btn_registrar);
        TextView txtconfirmacion= findViewById(R.id.txt_confirmacion);


        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_nombre.getText().toString().length()>0) {
                    if (txtclave.getText().toString().length() < 5) {
                        txtconfirmacion.setText("Clave minimo 5 digitos");
                    } else {
                        if (txtclave.getText().toString().equals(txtclave2.getText().toString())) {
                            txtconfirmacion.setText("Usuario Registrado Correctamente");
                        } else {
                            txtconfirmacion.setText("Contraseñas no coinciden");
                        }
                    }
                }else {
                    txtconfirmacion.setText("Llene todos los campos");
                }
            }
        });
    }




}