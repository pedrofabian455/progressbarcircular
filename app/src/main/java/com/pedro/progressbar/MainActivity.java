package com.pedro.progressbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.pedro.progressbarcircular.R;

public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle saveInstanceState){

    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_main);
    final ProgressBar simpleProgressBar = (ProgressBar) findViewById(R.id.simpleProgressBar);
    Button btniniciar = (Button) findViewById(R.id.btnIniciar);
    btniniciar.setOnClickListener( new View.OnClickListener(){
        @Override
        public void onClick(View view) {

            simpleProgressBar.setVisibility(View.VISIBLE);
        }

    });
}

}
