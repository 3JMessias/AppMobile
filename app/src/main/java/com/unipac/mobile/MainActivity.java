package com.unipac.mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nomeEdt;
    Button salvarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEdt = findViewById(R.id.nomeEdt);
        salvarBtn = findViewById(R.id.salvarBtn);

        String nome = nomeEdt.getText().toString();

        salvarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = nomeEdt.getText().toString();
                Toast.makeText(MainActivity.this, "O nome é: " + nome, Toast.LENGTH_LONG).show();
            }
        });

    }
}
