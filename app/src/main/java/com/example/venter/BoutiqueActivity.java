package com.example.venter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BoutiqueActivity extends AppCompatActivity {

    private Button makup,resto,electromenager,vetements,accessoire,habillement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boutique);


        makup = (Button) findViewById(R.id.makup);
        resto = (Button) findViewById(R.id.resto);
        electromenager = (Button) findViewById(R.id.electromenager);
        vetements = (Button) findViewById(R.id.vetements);
        accessoire = (Button) findViewById(R.id.accessoire);
        habillement = (Button) findViewById(R.id.habillement);


        makup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BoutiqueActivity.this, AddProdActivity.class);
                intent.putExtra("category", "makup");
                startActivity(intent);

            }

        });

        resto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BoutiqueActivity.this, AddProdActivity.class);
                intent.putExtra("category", "resto");
                startActivity(intent);

            }

        });

        electromenager.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BoutiqueActivity.this, AddProdActivity.class);
                intent.putExtra("category", "electromenager");
                startActivity(intent);

            }

        });

        vetements.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BoutiqueActivity.this, AddProdActivity.class);
                intent.putExtra("category", "vetements");
                startActivity(intent);

            }

        });

        accessoire.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BoutiqueActivity.this, AddProdActivity.class);
                intent.putExtra("category", "accessoire");
                startActivity(intent);

            }

        });

        habillement.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BoutiqueActivity.this, AddProdActivity.class);
                intent.putExtra("category", "accessoire");
                startActivity(intent);

            }

        });

    }
}