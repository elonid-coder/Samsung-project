package com.example.buttontap20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstSetting extends AppCompatActivity {
    TextView RIGHT,LEFT;
    Button Lf, Rf;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_setting);
        Lf = (Button) findViewById(R.id.Lf);
        Rf = (Button) findViewById(R.id.Rf);
LEFT= (TextView) findViewById(R.id.LEFT);
        RIGHT= (TextView) findViewById(R.id.RIGHT);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.Lf:
                        i = new Intent(FirstSetting.this, MainMenuLeft.class);
                       // String clb = LEFT.getText().toString();
                      // int LfN=0;
                       // i.putExtra("et", clb);
                        startActivity(i);
                        break;
                    case R.id.Rf:
                        i = new Intent(FirstSetting.this, MainMenuRight.class);
                      //  String crb = RIGHT.getText().toString();
                       // int RfN=1;
                       // i.putExtra("et", crb);
                        startActivity(i);
                        break;

                    default:
                        return;
                }
            }
        };
        Lf.setOnClickListener(listener);
        Rf.setOnClickListener(listener);
    }
}
