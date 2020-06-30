package com.example.venter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.HashMap;

public class InscriptionActivity extends AppCompatActivity
{ private Button cree_compte;
    private EditText nom_de_la_boutique,telephone_de_la_boutique,mot_de_passe_compte;
    private ProgressDialog message;
     public  String nom_boutique;
     public String telephone_boutique ,addresse_b,ville_b,description_b,mail_b;
     public String mot_de_passe;
    public EditText addresse;
    public EditText description;
    public EditText ville;
    public EditText mail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        cree_compte=(Button) findViewById(R.id.cree_compte);
        nom_de_la_boutique=(EditText)findViewById(R.id.nom_de_la_boutique);
        addresse=(EditText)findViewById(R.id.addresse);
        ville=(EditText)findViewById(R.id.ville);
        description=(EditText)findViewById(R.id.description);
        mail=(EditText)findViewById(R.id.mail);
        telephone_de_la_boutique=(EditText)findViewById(R.id.telephone_de_la_boutique) ;
        mot_de_passe_compte=(EditText) findViewById(R.id.mot_de_passe_compte);

        message=new ProgressDialog(this);
        cree_compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Creecompte();
            }
        });}
    private void Creecompte(){

        addresse_b = addresse.getText().toString();
        description_b = description.getText().toString();
        ville_b = ville.getText().toString();
        nom_boutique = nom_de_la_boutique.getText().toString();
telephone_boutique=telephone_de_la_boutique.getText().toString();
mot_de_passe=mot_de_passe_compte.getText().toString();
mail_b=mail.getText().toString();

            message.setTitle("Creation de compte");
            message.setMessage("veiller patienter...");
            message.setCanceledOnTouchOutside(false);
            message.show();
            validation(nom_boutique,telephone_boutique,mot_de_passe,addresse_b,ville_b,description_b,mail_b);
            cree_compte.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(InscriptionActivity.this,MainActivity.class);
                    startActivity(intent);

                }
            });

    }



    private void validation(final String nom_boutique, final String telephone_boutique, final String mot_de_passe, final String addresse_b, final String ville_b, final String description_b, final String mail_b) {
        final DatabaseReference Rootref;
        Rootref= FirebaseDatabase.getInstance().getReference();
        Rootref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
              //  if(!(dataSnapshot.child("Users").exists()))
                {
                    HashMap<String,Object>utilisateurMap= new HashMap<>();
                    utilisateurMap.put("nom_boutique",nom_boutique);
                    utilisateurMap.put("telephone_boutique",telephone_boutique);
                    utilisateurMap.put("mot_de_passe",mot_de_passe);
                    utilisateurMap.put("addresse",addresse_b);
                    utilisateurMap.put("ville",ville_b);
                    utilisateurMap.put("description",description_b);
                    utilisateurMap.put("mail",mail_b);



                    Rootref.child("Users").updateChildren(utilisateurMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task)
                        {

                            if(task.isSuccessful()){
                                Toast.makeText(InscriptionActivity.this,"compte cree ",Toast.LENGTH_SHORT).show();
                                message.dismiss();
                                Intent intent = new Intent(InscriptionActivity.this,loginActivity.class);
                                startActivity(intent);
                            }

                        }
                    });
                }



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }


        });
    }

}
