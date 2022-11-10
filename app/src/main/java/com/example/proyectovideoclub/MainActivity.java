package com.example.proyectovideoclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;//Importamos esta libreria
import android.view.View;// Importamos esta libreria
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    EditText ed1, ed2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btn_iniciarSesion);
        ed1 = (EditText)findViewById(R.id.etxt_usuario);
        ed2 = (EditText)findViewById(R.id.etxt_contrasena);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("bomby") &&
                        ed2.getText().toString().equals("bomby")) {
                    startActivity(new Intent(getApplicationContext(), menuAdmin.class));
                    ed1.getText().clear();
                    ed2.getText().clear();
                }else if (ed1.getText().toString().equals("trompy") && ed2.getText().toString().equals("trompy")){
                    startActivity(new Intent(getApplicationContext(), menuEstandar.class));
                    ed1.getText().clear();
                    ed2.getText().clear();
                }
            }
        });

    }


    public void  menuRegistrar (View view){
        Intent menuRegistrar = new Intent (this, menuRegistrar.class);
        startActivity(menuRegistrar);
        finish();
    }

}