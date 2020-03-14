package com.moringa.myinspire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {
@BindView(R.id.login) Button mLogin;
    @BindView((R.id.userName))
    EditText mUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = mUserName.getText().toString();
                Intent intent = new Intent(LoginActivity.this,QuotesHome.class);
                intent.putExtra("userName" , userName);
                startActivity(intent);
            }
        });
    }

}
