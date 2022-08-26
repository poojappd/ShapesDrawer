package com.example.shapesdrawer

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.View
import android.graphics.drawable.shapes.RectShape

class CustomDrawableView(context: Context) : View(context) {
    private val drawable: ShapeDrawable = run {
        val x = 10
        val y = 10
        val width = 300
        val height = 50

        contentDescription = "Oval View"

        ShapeDrawable(OvalShape()).apply {
            paint.color = 0xff74AC23.toInt()
            setBounds(x, y, x + width, y + height)
        }
    }

    override fun onDraw(canvas: Canvas) {
        drawable.draw(canvas)
    }
}