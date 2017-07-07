package com.sample.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sample.R;

import java.net.HttpURLConnection;

import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2017/6/6 login
                //username passwd
                //................
                login("xx","xx");
            }
        });

    }

    /**
     * login
     * @param username
     * @param passwd
     */
    public void login(String username,String passwd){
        //todo login。
        //login success

        //save use()

        //save passwd


    }



}
