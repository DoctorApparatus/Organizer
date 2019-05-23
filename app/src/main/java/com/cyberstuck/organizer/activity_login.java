package com.cyberstuck.organizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class activity_login extends AppCompatActivity implements
        View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_login = findViewById(R.id.button_login);
        button_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(
                view.getId() == R.id.button_login
        ) {

            EditText text = (EditText)findViewById(R.id.text_input_username);
            String username = text.getText().toString();

            text=(EditText)findViewById(R.id.text_input_password);
            String password = text.getText().toString();

            //send https request here and process response

            int response_code = 0;

            if(
                    response_code == -1
            ) {
                // wrong password

            } else if(
                    response_code == 1
            ) {
                // right password, right user name
            }

            int user_id = 0;

            // pull user data via user id

            // populate internals of the app

            Intent intent = new Intent(this, Activity_landing_page.class);
            startActivity(intent);
        } else if(
                view.getId() == R.id.button_register
        ) {
            // open browser with register page

        }


    }
}
