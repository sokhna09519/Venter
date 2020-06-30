package com.example.venter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button boutton_s_incrire,boutton_se_connecter,tester;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 tester=(Button)findViewById(R.id.test);
        boutton_s_incrire=(Button)findViewById(R.id.s_inscrirecrire);
        boutton_se_connecter=(Button)findViewById(R.id.se_connecter);
        boutton_se_connecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,loginActivity.class);
                startActivity(intent);

            }
        });
        boutton_s_incrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,InscriptionActivity.class);
                startActivity(intent);

            }
        });

        tester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,AcceuilboutiqueActivity.class);
                startActivity(intent);

            }
        });
    }
}
