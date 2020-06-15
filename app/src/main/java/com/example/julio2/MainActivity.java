package com.example.julio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = databaseReference.child("usuarios");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario usuario = new Usuario();

        usuario.setNome("julio");
        usuario.setSobrenome("Eu sei la");
        usuario.setIdade(25);
        usuario.setSexo("MAsculino");

        usuarioReferencia.child("001").setValue(usuario);
    }
}