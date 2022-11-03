package com.example.fundamentals;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    Button boton;
    TextView text;
    static String MESSAGE_NOMBRE, TAG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        boton=findViewById(R.id.login);
        text=findViewById(R.id.SingIn);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paginaSiguiente();
            }
        });
    }



    public void paginaSiguiente(){
        Intent intent = new Intent(this, SingUpActivity.class); //This llama a la propia magina y se crea la otra
        activityResult.launch(intent);


    }
    ActivityResultLauncher<Intent> activityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Log.d(TAG, ""+result.getResultCode());
                                    }
            }
    );

}