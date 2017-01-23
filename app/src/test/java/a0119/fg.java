package a0119;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.b10718.a0119.R;

import static com.example.b10718.a0119.R.id.buttonLogin;
import static com.example.b10718.a0119.R.id.editTextEmail;
import static com.example.b10718.a0119.R.id.editTextPassword;

/**
 * Created by B10718 on 2017-01-23.
 */

public class fg {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Initializing views
        editTextEmail = (EditText) findViewById(editTextEmail);
        editTextPassword = (EditText) findViewById(editTextPassword);
        buttonLogin = (AppCompatButton) findViewById(buttonLogin);
        TextView registerButton = (TextView) findViewById(R.id.registerButton);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait...");

        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
}
