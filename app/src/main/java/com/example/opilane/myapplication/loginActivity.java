package com.example.opilane.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {
    EditText epost, salasõna;
    Button btn_login;
    TextView registeeri, unustatud;

    int loendaja = 3;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        epost = findViewById(R.id.epost);
        btn_login = findViewById(R.id.btnLogin);
        registeeri = findViewById(R.id.registeeri);
        unustatud = findViewById(R.id.unustatud);
    }
}
