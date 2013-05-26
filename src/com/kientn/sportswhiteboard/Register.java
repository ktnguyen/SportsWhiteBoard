package com.kientn.sportswhiteboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: kien326
 * Date: 25.05.13
 * Time: 16:51
 * To change this template use File | Settings | File Templates.
 */
public class Register extends Activity {
    EditText addBlue, addRed;
    Button bConfirm;
    Player player = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist);

        bConfirm = (Button) findViewById(R.id.button_confirm);
        addBlue = (EditText) findViewById(R.id.blue_name);
        addRed = (EditText) findViewById(R.id.red_name);

        bConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.setBluePlayer(addBlue.getText().toString());
                player.setRedPlayer(addRed.getText().toString());

                Intent openMainAct = new Intent("com.kientn.sportswhiteboard.MAINACTIVITY");
                startActivity(openMainAct);
            }
        });
    }


}
