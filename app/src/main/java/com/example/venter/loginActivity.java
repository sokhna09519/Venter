package com.example.venter;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.venter.model.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class loginActivity extends AppCompatActivity
{ private EditText identifiant,mot_de_passe;
private Button Soumettre;
    private ProgressDialog message;
    public  String indent;
    public String mdp;
    private String utilisateur="Users";
    FirebaseAuth se_loger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Soumettre = (Button) findViewById(R.id.Soumettre);
        identifiant = (EditText) findViewById(R.id.identifiant);
        mot_de_passe = (EditText) findViewById(R.id.mot_de_passe);
        se_loger=FirebaseAuth.getInstance();
        message=new ProgressDialog(this);


        Soumettre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indent = identifiant.getText().toString();
                mdp = mot_de_passe.getText().toString();

                message.setMessage("veiller patienter...");
                message.show();
                if (indent.isEmpty()) {
                    identifiant.setError("resseyer");
                    identifiant.requestFocus();
                } else if (mdp.isEmpty()) {
                    mot_de_passe.setError("resseyer");
                    mot_de_passe.requestFocus();
                } else if (indent.isEmpty() && mdp.isEmpty()) {
                    Toast.makeText(loginActivity.this, "vide vide ", Toast.LENGTH_SHORT).show();
                } else if (!(indent.isEmpty() && mdp.isEmpty())) {
                    se_loger.createUserWithEmailAndPassword(indent, mdp).addOnCompleteListener(loginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                                startActivity(new Intent(loginActivity.this, AcceuilboutiqueActivity.class));
                            


                        }
                    });

                } else {
                    Toast.makeText(loginActivity.this, "erreur ", Toast.LENGTH_SHORT).show();
                }

            } });
    }



}



