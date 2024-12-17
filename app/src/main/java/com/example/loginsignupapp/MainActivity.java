package com.example.loginsignupapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText emailField, passwordField;
    private TextInputLayout emailInput, passwordInput;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailField = findViewById(R.id.emailField);
        passwordField = findViewById(R.id.passwordField);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginButton = findViewById(R.id.loginButton);

        // Login Button OnClick
        loginButton.setOnClickListener(view -> {
            if (emailField.getText().toString().isEmpty() || passwordField.getText().toString().isEmpty()) {
            } else {
                // Go to next screen if login is successful
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(intent);
            }
        });
    }

    // Go to Signup Page
    public void goToSignupPage(View view) {
        Intent intent = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(intent);
    }
}
