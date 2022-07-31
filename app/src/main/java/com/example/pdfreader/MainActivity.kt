package com.example.pdfreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
	
	// first add your pdf file in assets folder
        var pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromAsset("Syllabus.pdf").load() // add your pdf file name instead of syllabus.pdf

    }
}