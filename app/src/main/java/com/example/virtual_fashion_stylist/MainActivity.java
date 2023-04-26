package com.example.virtual_fashion_stylist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Views declaration
    TextView createAccount;
    EditText email, password;
    Button buttonLogin;
    ImageView imageView2;

    // Email pattern for validation
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    // Progress dialog for displaying loading message
    ProgressDialog progressDialog;

    // Firebase Authentication objects
    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        createAccount=findViewById(R.id.createNewAccount);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        progressDialog=new ProgressDialog(this);
        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();
        buttonLogin=findViewById(R.id.buttonLogin);

        // Click listener for create account text view
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        // Click listener for login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performLogin();
            }
        });
    }

    // Function to validate user input and initiate login process
    private void performLogin() {
        String inputEmail = email.getText().toString();
        String inputPassword = password.getText().toString();

        if (!inputEmail.matches(emailPattern)) {
            email.setError("Enter correct Email");
        } else if (inputPassword.isEmpty() || password.length() < 6) {
            password.setError("Enter correct Password");
        } else {
            // Display progress dialog while logging in
            progressDialog.setMessage("Please wait while Login....");
            progressDialog.setTitle("Logged in!!");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            // Authenticate user using Firebase Authentication
            mAuth.signInWithEmailAndPassword(inputEmail, inputPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        progressDialog.dismiss();
                        // Redirect user to next activity
                        sendUserToNextActivity();
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    } else {
                        progressDialog.dismiss();
                        Toast.makeText(MainActivity.this, ""+task.getException(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    // Function to redirect user to next activity on successful login
    private void sendUserToNextActivity() {
        Intent intent= new Intent(MainActivity.this, MainPageActivity.class);
        // Clear all previous activities from stack
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
