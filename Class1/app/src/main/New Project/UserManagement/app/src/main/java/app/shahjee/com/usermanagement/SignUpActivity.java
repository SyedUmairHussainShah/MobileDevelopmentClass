package app.shahjee.com.usermanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {


    EditText editTextUsername;
    EditText editTextEmail;
    EditText editTextNumber;
    EditText editTextPassword;
    EditText editTextConfPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextConfPassword = (EditText) findViewById(R.id.editTextConfPassword);
    }

    public void createAccount()
    {




    }
}
