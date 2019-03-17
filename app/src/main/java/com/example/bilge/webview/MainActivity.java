package com.example.bilge.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView vebView= (WebView)findViewById(R.id.vebview);
        vebView.getSettings().setJavaScriptEnabled(true);
        vebView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr/");

    }
}
