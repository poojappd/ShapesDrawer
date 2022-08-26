package com.example.shapesdrawer

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RectShape
import android.view.View

class MyRectangle(context: Context) : View(context)  {
    private val drawable: ShapeDrawable = run {
        val x = 90
        val y = 90
        val width = 900
        val height = 500

        contentDescription = "Rectangle View"

        ShapeDrawable(RectShape()).apply {
            // If the color isn't set, the shape uses black as the default.
            paint.color = 0xff74AC23.toInt()
            // If the bounds aren't set, the shape can't be drawn.
            setBounds(x, y, x + width, y + height)
        }
    }

    override fun onDraw(canvas: Canvas) {
        drawable.draw(canvas)
    }
}