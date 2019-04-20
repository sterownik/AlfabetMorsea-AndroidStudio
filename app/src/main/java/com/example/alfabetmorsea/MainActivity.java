package com.example.alfabetmorsea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button)findViewById(R.id.button);


        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.morse);
        imageView.setVisibility(imageView.getVisibility());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new java.util.Timer().schedule(
                        new java.util.TimerTask()
                        {
                            public void run()
                            {
                                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                                startActivity(intent);
                            }
                        },500
                );

            }
        });



    }


}
