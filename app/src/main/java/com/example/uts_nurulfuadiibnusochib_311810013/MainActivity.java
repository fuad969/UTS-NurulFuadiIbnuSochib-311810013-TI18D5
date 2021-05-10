package com.example.uts_nurulfuadiibnusochib_311810013;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);

        Button startBtn = (Button) findViewById(R.id.sendEmail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sendEmail(); }
        });
    }

    public void panggil(View view) {
        String nomor = "089504311289";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts( "tel", nomor, "null"));
        startActivity(panggil);
    }

    public void buka(View view) {
        String url = "https://www.tokopedia.com";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }

    public void Liat(View view) {
        String url = "https://www.google.co.id/maps/@-7.2721003.107.3257549.24z";
        Intent maps = new Intent(Intent.ACTION_VIEW);
        maps.setData(Uri.parse(url));
        startActivity(maps);
    }

    protected void sendEmail() {
        Log.i( "send email", "");
        String[] To = {""};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, To);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
        startActivity(emailIntent);
    }
}