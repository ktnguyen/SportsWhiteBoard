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

    private Player player = new Player();
	TextView blueText, redText, gameRedText, gameBlueText, dnRed, dnBlue;
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
        dnBlue = (TextView) findViewById(R.id.display_bluename);
        dnRed = (TextView) findViewById(R.id.display_redname);

        dnBlue.setText(player.getBluePlayer().toString());
        dnRed.setText(player.getRedPlayer().toString());


		
		bpBlue.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

                if(counterBlue > 11 && (counterBlue - counterRed) == 2 && counterRed > 11) {
                    counterBlue = 0;
                    counterRed = 0;
                    gameBlue++;
                }

                else if (counterBlue == 11 && counterRed < 10)  {
                    counterBlue = 0;
                    counterRed = 0;
                    gameBlue++;
                }
                else
                    counterBlue++;

                blueText.setText(counterBlue + " ");
                gameBlueText.setText(gameBlue + " ");
                redText.setText(" " + counterRed);
                gameRedText.setText(" " + gameRed);
			}
		});
		
		bpRed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
                if(counterRed > 11 && (counterRed - counterBlue) == 2 && counterBlue > 11){
                    counterBlue = 0;
                    counterRed = 0;
                    gameRed++;
                }
                else if (counterRed == 11 && counterBlue < 10){
                    counterBlue = 0;
                    counterRed = 0;
                    gameRed++;
                }
                else
                    counterRed++;
				redText.setText(" " + counterRed);
                gameRedText.setText(" " + gameRed);
                blueText.setText(counterBlue + " ");
                gameBlueText.setText(gameBlue + " ");
				
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
