package com.example.buttontap20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import static android.os.AsyncTask.execute;
import static java.lang.Thread.sleep;

public class LevelVariaty1 extends AppCompatActivity {
    Button LDB, RDB, LUB, RUB;
    TextView Info;
    EditText Time;
    Intent in;
    ProgressBar PB;
    public int n,m=2,Life=3;
    public int w[] = new int[m];
 //   int par = getIntent().getIntExtra("Up");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_variaty1);

        //     ChangeSizeB(w[i]);
            //     ChangeSizeBBack(w[i]);

        //for (int i = 0; i < w.length; i++) {
          //  w[i] = (int) (Math.random() * 3);

        //}


        LDB = (Button) findViewById(R.id.LDB);
        RDB = (Button) findViewById(R.id.RDB);
        LUB = (Button) findViewById(R.id.LUB);
        RUB = (Button) findViewById(R.id.RUB);
        PB = (ProgressBar) findViewById(R.id.PB);
        Time = (EditText) findViewById(R.id.Time);//45 sec
        Info = (TextView) findViewById(R.id.Info);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.LDB://0
                        n = 0;
                        break;
                    case R.id.RDB://1
                        n = 1;
                        break;
                    case R.id.LUB://2
                        n = 2;
                        break;
                    case R.id.RUB://3
                        n = 3;
                        break;

                    default:

                }
            }
        };
        LDB.setOnClickListener(listener);
        RDB.setOnClickListener(listener);
        LUB.setOnClickListener(listener);
        RUB.setOnClickListener(listener);
        //execute();vizov potoka

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//.sleep(1000);


    }
    @Override
    protected void onStart() {
        super.onStart();}
    @Override
    protected void onResume() {
        super.onResume();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int pb = 1; pb < 4; pb++) {
            PB.setProgress(pb);

            for (int i = 0; i < w.length; i++) {
                w[i] = (int) (Math.random() * 4);
                switch (w[i]) {
                    case 0://0
                        LDB.setBackgroundColor(Color.WHITE);
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        LDB.setBackgroundColor(Color.BLACK);
                        break;
                    case 1://1
                        RDB.setBackgroundColor(Color.WHITE);
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        RDB.setBackgroundColor(Color.BLACK);
                        break;
                    case 2://2
                        LUB.setBackgroundColor(Color.WHITE);
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        LUB.setBackgroundColor(Color.BLACK);
                        break;
                    case 3://3
                        RUB.setBackgroundColor(Color.WHITE);
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        RUB.setBackgroundColor(Color.BLACK);
                        break;

                    default:

                }//показ последовательности
            }//заполнение последовательности цифр(кнопок)

           /* for(int i = 0; i < w.length; i++) {
                switch (n) {
                    case 0://0
                        if(0==w[i]){LDB.setBackgroundColor(Color.WHITE);}else{Life--; if(Life==0){reload();}}
                        break;
                    case 1://1
                        if(1==w[i]){RDB.setBackgroundColor(Color.WHITE);}else{Life--;if(Life==0){reload();}}
                        break;
                    case 2://2
                        if(2==w[i]){LUB.setBackgroundColor(Color.WHITE);}else{Life--;if(Life==0){reload();}}
                        break;
                    case 3://3
                        if(3==w[i]){RUB.setBackgroundColor(Color.WHITE);}else{Life--;if(Life==0){reload();}}
                        break;

                    default:

                }
            }*/
            //  Thread UrTime = new Thread( // создаём новый поток
            //   new Runnable() { // описываем объект Runnable в конструкторе
            //     public void run() {
            //        for(int o=0;o<45;o++) {
            //            try {
            //              sleep(1000);
            //         } catch (InterruptedException e) {
            //             e.printStackTrace();
            //        }

//if(o==10){reload();}
            //                     }

            //               }
            //         }
            //  );
            // execute(UrTime);//поток времени с editText Time
            // if(myThread.isAlive()){ myThread.interrupt(); } myThread = new MyThread(); myThread.start();//


        }


    }

    public void reload() { if(Life ==0) {
        Intent intent = getIntent();
        overridePendingTransition(0, 0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);
    }
    }
public void SecondThIF(){}
    public void ChangeSizeB(int o){

        if(o==0){
    ViewGroup.LayoutParams params = LDB.getLayoutParams();
    int sizeInPX= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics());
    params.height = sizeInPX;
    params.width = sizeInPX;
    LDB.setLayoutParams(params);

        } else  if(o==1){
            ViewGroup.LayoutParams params = RDB.getLayoutParams();
            int sizeInPX= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics());
            params.height = sizeInPX;
            params.width = sizeInPX;
            RDB.setLayoutParams(params);}else  if(o==2){
            ViewGroup.LayoutParams params = LDB.getLayoutParams();
            int sizeInPX= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics());
            params.height = sizeInPX;
            params.width = sizeInPX;
            LUB.setLayoutParams(params);} else  if(o==3){
            ViewGroup.LayoutParams params = RUB.getLayoutParams();
            int sizeInPX= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics());
            params.height = sizeInPX;
            params.width = sizeInPX;
            RUB.setLayoutParams(params);}
}
    public void ChangeSizeBBack(int p){
        if(p==0){
            ViewGroup.LayoutParams params = LDB.getLayoutParams();
            int sizeInPX= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
            params.height = sizeInPX;
            params.width = sizeInPX;
            LDB.setLayoutParams(params);} else  if(p==1){
            ViewGroup.LayoutParams params = RDB.getLayoutParams();
            int sizeInPX= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
            params.height = sizeInPX;
            params.width = sizeInPX;
            RDB.setLayoutParams(params);}else  if(p==2){
            ViewGroup.LayoutParams params = LDB.getLayoutParams();
            int sizeInPX= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
            params.height = sizeInPX;
            params.width = sizeInPX;
            LUB.setLayoutParams(params);} else  if(p==3){
            ViewGroup.LayoutParams params = RUB.getLayoutParams();
            int sizeInPX= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
            params.height = sizeInPX;
            params.width = sizeInPX;
            RUB.setLayoutParams(params);}
    }
public void GetOnClickListener(){}
}

