package com.example.venter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
//import InscriptionActivity;
public class AcceuilboutiqueActivity extends AppCompatActivity {
TextView a,b,c,d,e,f,g;
Button profil,poster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuilboutique);

        a=(TextView)findViewById(R.id.nom);
        b=(TextView)findViewById(R.id.des);
        c=(TextView)findViewById(R.id.ville);
        d=(TextView)findViewById(R.id.addresse);
        e=(TextView)findViewById(R.id.numb);
        f=(TextView)findViewById(R.id.passe);
        g=(TextView)findViewById(R.id.mail);
        profil=(Button)findViewById(R.id.profil);
        poster=(Button)findViewById(R.id.poster);
        poster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AcceuilboutiqueActivity.this,BoutiqueActivity.class);
                startActivity(intent);

            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference reff = FirebaseDatabase.getInstance().getReference().child("Users");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot datasnapshot) {

                        String addr=datasnapshot.child("addresse").getValue().toString();
                        String des=datasnapshot.child("description").getValue().toString();
                        String passe=datasnapshot.child("mot_de_passe").getValue().toString();
                        String nom=datasnapshot.child("nom_boutique").getValue().toString();
                        String tel=datasnapshot.child("telephone_boutique").getValue().toString();
                        String ville=datasnapshot.child("ville").getValue().toString();
                        String mail=datasnapshot.child("mail").getValue().toString();
                        a.setText(nom);
                        b.setText(des);
                        c.setText(ville);
                        d.setText(tel);
                        e.setText(passe);
                        f.setText(addr);
                        g.setText(mail);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });


    }

}
