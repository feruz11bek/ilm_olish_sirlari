package com.example.ilmolishsirlari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ReadActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        pdfView=(PDFView)findViewById(R.id.pdfview);
        pdfView.fromAsset("ilmolish.pdf").load();
    }
}