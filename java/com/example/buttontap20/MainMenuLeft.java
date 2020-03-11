package com.example.buttontap20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenuLeft extends AppCompatActivity {
    Intent i;
    TextView MainText;
    Button Levels,LR,Exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_left);
        Levels = (Button)findViewById(R.id.Levels);
        LR = (Button)findViewById(R.id.LR);
        Exit = (Button)findViewById(R.id.Exit);
        MainText= (TextView) findViewById(R.id.MainText);


        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.Levels:
                        Intent i = new Intent(MainMenuLeft.this, LevelStructurLeft.class);

                        //i.putExtra("Up",filelist);
                        startActivity(i); break;
                    case R.id.LR: i = new Intent(MainMenuLeft.this, MainMenuRight.class);

                        // i.putExtra("Up",filelist);
                        startActivity(i); break;
                    case R.id.Exit: OnDestroy();
                        //i = new Intent(MainMenuLeft.this, LevelVariaty1.class);
                      //  int Ri=1;
                        // i.putExtra("Up",filelist);
                       // startActivity(i);

                        break;

                    default:

                }
            }
        };
        Levels.setOnClickListener(listener);
        LR.setOnClickListener(listener);
        Exit.setOnClickListener(listener);
    }

        private void OnDestroy() {
            moveTaskToBack(true);

            super.onDestroy();

            System.runFinalizersOnExit(true);
            System.exit(0);
        }

}
