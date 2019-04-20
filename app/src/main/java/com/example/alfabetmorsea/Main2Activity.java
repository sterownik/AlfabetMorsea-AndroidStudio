package com.example.alfabetmorsea;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static com.example.alfabetmorsea.R.raw.bb;

public class Main2Activity extends AppCompatActivity {


    EditText editText;
    TextView textView;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        final TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Tu zostaną wyświetlone znaki Kodu Morse’a");
        final EditText editText = (EditText)findViewById(R.id.editText);
        editText.setText(" ");
        final TextView textView3=(TextView)findViewById(R.id.textView3);
        textView3.setVisibility(View.INVISIBLE);
        textView3.setText("Program został wykonany przez Wojciecha Gołde w dniu 5.04.2019");
        Switch switch1=(Switch)findViewById(R.id.switch1);
        Button button2 = (Button)findViewById(R.id.button2);
        setSupportActionBar(toolbar);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    textView3.setVisibility(View.VISIBLE);
                }
                else
                {
                    textView3.setVisibility(View.INVISIBLE);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    String z=" ";
                    String edit = editText.getText().toString();
                    edit=edit.toLowerCase();
                    String l=" ";
                    char znak;

                    int i=0;

                    for (int j = 0; j < edit.length(); j++) {
                        znak = edit.charAt(j);
                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.cisza);
                        AudioManager manager = (AudioManager)getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
                        mp.getCurrentPosition();
                        switch (znak) {
                               case 'a':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.aa);
                                   mp.start();
                                   z="• —";
                                   break;
                               case 'b':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.bb);
                                   mp.start();
                                   z="— • • •";
                                   break;
                               case 'c':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.cc);
                                   mp.start();
                                   z="— • — •";
                                   break;
                               case 'd':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.dd);
                                   mp.start();
                                   z="— • • ";
                                   break;
                               case 'e':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.ee);
                                   mp.start();
                                   z="• ";
                                   break;
                               case 'f':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.ff);
                                   mp.start();
                                   z="• • — • ";
                                   break;
                               case 'g':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.gg);
                                   mp.start();
                                   z="— — •  ";
                                   break;
                               case 'h':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.hh);
                                   mp.start();
                                   z="• • • • ";
                                   break;
                               case 'i':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.ii);
                                   mp.start();
                                   z="• • ";
                                   break;
                               case 'j':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.jj);
                                   mp.start();
                                   z="• — — — ";
                                   break;
                               case 'k':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.kk);
                                   mp.start();
                                   z="— • —";
                                   break;
                               case 'l':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.ll);
                                   mp.start();
                                   z="• — • • ";
                                   break;
                               case 'm':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.mm);
                                   mp.start();
                                   z="— —";
                                   break;
                               case 'n':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.nn);
                                   mp.start();
                                   z="— • ";
                                   break;
                               case 'o':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.oo);
                                   mp.start();
                                   z="— — — ";
                                   break;
                               case 'p':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.pp);
                                   mp.start();
                                   z="• — — • ";
                                   break;
                               case 'r':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.rr);
                                   mp.start();
                                   z="• — • ";
                                   break;
                               case 's':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.ss);
                                   mp.start();
                                   z="• • • ";
                                   break;
                               case 't':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.tt);
                                   mp.start();
                                   z="— ";
                                   break;
                               case 'u':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.uu);
                                   mp.start();
                                   z="• • — ";
                                   break;
                               case 'w':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.ww);
                                   mp.start();
                                   z="• — —";
                                   break;
                               case 'x':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.xx);
                                   mp.start();
                                   z="— • • —";
                                   break;
                               case 'y':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.yy);
                                   mp.start();
                                   z="— • — —";
                                   break;
                               case 'z':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.zz);
                                   mp.start();
                                   z="— — • • ";
                                   break;
                               case 'q':
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.qq);
                                   mp.start();
                                   z="— — • —";
                                   break;
                               default:
                                   mp = MediaPlayer.create(getApplicationContext(), R.raw.cisza);
                                   mp.start();
                                   break;

                           }

                        while(mp.isPlaying()){
                            i++;
                            if(i>100) i=0;
                        }

                        l=l+"   "+z;
                        textView.setText(l);





                           // Toast.makeText(getApplicationContext(),mp.getCurrentPosition(),Toast.LENGTH_SHORT).show();
                    }

            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
