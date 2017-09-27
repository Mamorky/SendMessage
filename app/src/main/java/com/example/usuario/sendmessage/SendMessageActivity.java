package com.example.usuario.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edtMessage=(EditText)(findViewById(R.id.edtMessage));
    }

    private EditText edtMessage;

    public void getOnClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnOk:
                //1. Recoger el mensaje
                //2. Crear un objeto Budle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("message",edtMessage.getText().toString());
                //3. Crear un objeto Intent
                Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);
                //4. Añadir el Bundle
                intent.putExtras(bundle);
                //5. Iniciar la Activity ViewMessage
                startActivity(intent);
                break;
        }
    }
}
