package com.example.buttontap20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LevelStructurRight extends AppCompatActivity {
    Intent i;
Button BVE,BE,BA,BH,BN;
TextView TVE,TE,TA,TH,TN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_structur_right);

        BVE = (Button)findViewById(R.id.BVE);
        BE = (Button)findViewById(R.id.BE);
        BA = (Button)findViewById(R.id.BA);
        BH = (Button)findViewById(R.id.BH);
        BN = (Button)findViewById(R.id.BN);

        TVE= (TextView) findViewById(R.id.TVE);
        TE= (TextView) findViewById(R.id.TE);
        TA= (TextView) findViewById(R.id.TA);
        TH= (TextView) findViewById(R.id.TH);
        TN= (TextView) findViewById(R.id.TN);


        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.BVE:
                        Intent i = new Intent(LevelStructurRight.this, LevelVariaty1.class);
                        int par1=1;
                        i.putExtra("Up",par1);
                        startActivity(i); break;
                    case R.id.BE: i = new Intent(LevelStructurRight.this, LevelVariaty1.class);
                        int par2=2;
                        i.putExtra("Up",par2);
                        startActivity(i); break;
                    case R.id.BA: i = new Intent(LevelStructurRight.this, LevelVariaty1.class);
                       // int Ri=1;
                        int par3=3;
                       i.putExtra("Up",par3);
                        startActivity(i); break;
                    case R.id.BH: i = new Intent(LevelStructurRight.this, LevelVariaty2.class);
                       // int Ri=1;
                        int par4=4;
                         i.putExtra("Up",par4);
                        startActivity(i); break;
                    case R.id.BN: i = new Intent(LevelStructurRight.this, LevelVariaty2.class);
                       // int Ri=1;
                        int par5=5;
                         i.putExtra("Up",par5);
                        startActivity(i); break;

                    default:

                }
            }
        };
        BVE.setOnClickListener(listener);
        BE.setOnClickListener(listener);
        BA.setOnClickListener(listener);
        BH.setOnClickListener(listener);
        BN.setOnClickListener(listener);
    }
}
