package com.example.littlellamasappandroid_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout=(GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(gridLayout);

    }

    // we are setting onClickListener for each element
    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this,"Clicked at index "+ finalI,
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


}