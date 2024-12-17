package com.example.loginsignupapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import android.widget.Button;
import android.view.View;

import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private TextInputEditText fullNameField, emailField, passwordField, confirmPasswordField;
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullNameField = findViewById(R.id.fullNameField);
        emailField = findViewById(R.id.emailField);
        passwordField = findViewById(R.id.passwordField);
        confirmPasswordField = findViewById(R.id.confirmPasswordField);
        signupButton = findViewById(R.id.signupButton);

        // Sign Up Button OnClick
        signupButton.setOnClickListener(view -> {
            if (fullNameField.getText().toString().isEmpty() || emailField.getText().toString().isEmpty() ||
                    passwordField.getText().toString().isEmpty() || confirmPasswordField.getText().toString().isEmpty()) {
            } else if (passwordField.getText().toString().equals(confirmPasswordField.getText().toString())) {
                // Proceed to home page
                Intent intent = new Intent(SignupActivity.this, HomePage.class);
                startActivity(intent);
            } else {
                // Handle password mismatch
            }
        });
    }

    // Go to Login Page
    public void goToLoginPage(View view) {
        Intent intent = new Intent(SignupActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
