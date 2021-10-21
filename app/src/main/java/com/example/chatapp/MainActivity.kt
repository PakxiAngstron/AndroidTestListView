package com.example.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private val name = arrayOf("azzedine","denise","felix","jakop","kushagra","markus","patrice","prossesse","stefan",
        "azzedine","denise","felix","jakop","kushagra","markus","patrice","prossesse","stefan")

    private val image = arrayOf(R.drawable.azzedine,R.drawable.denise,R.drawable.felix,R.drawable.jakob,R.drawable.kushagra
            ,R.drawable.markus,R.drawable.patrice,R.drawable.possesse,R.drawable.stefan,R.drawable.azzedine,R.drawable.denise,R.drawable.felix,R.drawable.jakob,R.drawable.kushagra
        ,R.drawable.markus,R.drawable.patrice,R.drawable.possesse,R.drawable.stefan)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ListView>(R.id.list_view).adapter = ListAdapters(this, image, name)
    }
}