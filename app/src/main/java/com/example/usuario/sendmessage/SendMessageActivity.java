package com.example.usuario.sendmessage;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

/**
 * Esta clase envia un mensaje de un usuario a otro
 *
 * @author mamorky
 *         Concenptos Aprendidos:
 *         <ul>
 *         <li>Concepto Context</li>
 *         <li>Paso de mensajes entre dos actividades mediante la clase @see android.content.Intent</li>
 *         <li>Paso de parámetros mediante el objeto @see android.os.Bundle</li>
 *         </ul>
 */
public class SendMessageActivity extends AppCompatActivity {

    private EditText edtMessage;
    private EditText edtUser;
    private Button btnOk;
    com.example.usuario.sendmessage.pojo.Message msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edtMessage = (EditText) (findViewById(R.id.edtMessage));
        edtUser = (EditText) (findViewById(R.id.edtUser));
        btnOk = (Button) findViewById(R.id.btnOk);

        //1. Registrar un listener o Escuchador OnClickListener
        btnOk.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View view) {
                                         msg = new com.example.usuario.sendmessage.pojo.Message(edtMessage.getText().toString(),edtUser.getText().toString());
                                         Bundle bundle = new Bundle();
                                         bundle.putSerializable("mensaje",msg);
                                         //3. Crear un objeto Intent
                                         Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);
                                         //4. Añadir el Bundle
                                         intent.putExtras(bundle);
                                         //5. Iniciar la Activity ViewMessage
                                         startActivity(intent);
                                     }
                                 }
        );
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

    /*public void getOnClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnOk:
                //1. Recoger el mensaje
                //2. Crear un objeto Budle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("message",edtMessage.getText().toString());
                bundle.putString("user",edtUser.getText().toString());
                //3. Crear un objeto Intent
                Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);
                //4. Añadir el Bundle
                intent.putExtras(bundle);
                //5. Iniciar la Activity ViewMessage
                startActivity(intent);
                break;
        }
    }*/
}
