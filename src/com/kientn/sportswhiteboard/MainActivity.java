package com.kientn.sportswhiteboard;

import android.os.Bundle;
import android.app.Activity;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int counterBlue;
    int counterRed;
    int gameBlue;
    int gameRed;
	TextView blueText, redText, gameRedText, gameBlueText;
	Button bpBlue, bpRed;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		counterBlue = 0;
		counterRed = 0;
        gameBlue = 0;
        gameRed = 0;
		bpBlue = (Button) findViewById(R.id.BlueButton);
		bpRed = (Button) findViewById(R.id.RedButton);
		blueText = (TextView) findViewById(R.id.BluePlayer);
		redText = (TextView) findViewById(R.id.RedPlayer);
        gameBlueText = (TextView) findViewById(R.id.GamePointBlue);
        gameRedText = (TextView) findViewById(R.id.GamePointRed);
		
		bpBlue.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

                if(counterBlue > 11 && (counterBlue - counterRed) == 2 && counterRed > 11) {
                    gameBlue++;
                    counterBlue = 0;
                    counterRed = 0;
                }

                else if (counterBlue == 11 && counterRed < 10)  {
                    gameBlue++;
                    counterBlue = 0;
                    counterRed = 0;
                }
                else
                    counterBlue++;

                blueText.setText(counterBlue + " ");
                gameBlueText.setText(gameBlue + " ");
			}
		});
		
		bpRed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
                if(counterRed > 11 && (counterRed - counterBlue) == 2 && counterBlue > 11)
                    gameRed++;
                else if (counterRed == 11 && counterBlue < 10)
                    gameRed++;
                else
                    counterRed++;
				redText.setText(" " + counterRed);
                gameRedText.setText(" " + gameRed);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
