package com.brucul.bis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.brucul.bis.api.RestApi;
import com.brucul.bis.api.RetroServer;

public class MainActivity extends AppCompatActivity {
    EditText kode, nama, trayek;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kode = findViewById(R.id.kode);
        nama = findViewById(R.id.nama);
        trayek = findViewById(R.id.trayek);
        btnsave = findViewById(R.id.btnSave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skode = kode.getText().toString();
                String snama = nama.getText().toString();
                String strayek = trayek.getText().toString();

                if (skode.isEmpty()){
                    kode.setError("Isi Kode BIS");
                } else if (snama.isEmpty()) {
                    nama.setError("Isi Nama BIS");
                } else if (strayek.isEmpty()){
                    trayek.setError("Isi Trayek BIS");
                } else {
                    RestApi api = RetroServer.getClient().create(RestApi.class);
                }
            }
        });
    }
}
