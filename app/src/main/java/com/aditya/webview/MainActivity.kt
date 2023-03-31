package com.aditya.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.*
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    //deklarasi webview
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        window.setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN)

        webView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://upiyptk.ac.id/")

        //web settings
        val webSettings = webView.settings

        //mengaktifkan javascrip
        webSettings.javaScriptEnabled = true

        //mengaktifkan tool seperti bootsrap
        webSettings.domStorageEnabled = true

    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        }else{
            super.onBackPressed()
        }

        super.onBackPressed()
    }
}