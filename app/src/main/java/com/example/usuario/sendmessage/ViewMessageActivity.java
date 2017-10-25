package com.example.usuario.sendmessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.usuario.sendmessage.pojo.Message;

/**
 * Esta clase recive un mensaje y lo muestra en pantalla
 * @author mamorky
 * */
public class ViewMessageActivity extends AppCompatActivity {

    private TextView txvViewMessage;
    private TextView txvViewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        txvViewMessage = (TextView) findViewById(R.id.txvViewMessage);
        txvViewUser = (TextView) findViewById(R.id.txvViewUser);

        //1. Recoger el Intent que se ha enviado
        Intent intent = getIntent();
        //2. Recoger el mensaje de Bundle
        Bundle bundle = intent.getExtras();
        //3. Mostrar el mensaje
        Message msg = (Message) bundle.getSerializable("mensaje");
        txvViewMessage.setText(msg.getMessage());
        String viewUser = String.format(getResources().getString(R.string.txvViewUser), msg.getUser());
        txvViewUser.setText(viewUser);

        //Podriamos ahorranos pasos haciendo lo siguiente lo siguiente
        //txvViewMessage.setText(getIntent().getExtras().getString("message"));
        Log.d("com.example.sendmessage","SendMessage: OnCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("com.example.sendmessage","SendMessage: OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("com.example.sendmessage","SendMessage: OnResume");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("com.example.sendmessage","SendMessage: OnStop");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("com.example.sendmessage","SendMessage: OnPause");
    }
}
