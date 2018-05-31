package com.example.a18237.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class HttpActivity extends AppCompatActivity {

   private HttpActivityComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);

        component=  DaggerHttpActivityComponent.builder().httpActivityModule(new HttpActivityModule(100))
                .build();

    }


    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction().replace(R.id.frg,new HttpFragment())
                .commit();
    }

    public HttpActivityComponent getComponent() {
        return component;
    }
}
