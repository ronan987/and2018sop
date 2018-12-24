package com.example.ronald.sopapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintSet
import com.example.ronald.sopapps.R.id.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_expanded.*


class MainActivity : AppCompatActivity() {

    val set1: ConstraintSet = ConstraintSet()
    val setCollapsed: ConstraintSet = ConstraintSet()

    var expanded: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_expanded)

        setExpanded.clone(root)
        setCollapsed.clone(this, R.layout.activity_main)

        time.text = "15 minutos"
        today.text = "23 de dicimebre de 2018"



        desc.text = "Rica deliciosa"
        name.text = "cocina colombiana"

        img.setImageURI("http://www.deleitese.co/sites/default/files/2017/07/07/imagen_adicionales/libro3.jpg")



        btnInfo.setOnclickListener {

            if (expanded) setCollapsed.applyTo(root)
            else setExpanded.applyTo(root)
            expanded = !expanded
        }
    }
}
