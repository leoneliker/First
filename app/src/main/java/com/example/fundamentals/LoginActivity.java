package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button boton;
    static String MESSAGE_NOMBRE, TAG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        boton=findViewById(R.id.login);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paginaSiguiente();
            }
        });
    }



    public void paginaSiguiente(){
        Intent intent = new Intent(this, SingUpActivity.class); //This llama a la propia magina y se crea la otra
        startActivity(intent);
    }
}