package com.example.shapesdrawer

import android.content.Context
import android.graphics.*
import android.view.View


class MyOvalView(context:Context) :View(context) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val width = width.toFloat()

        val height = height.toFloat()

        val radius: Float


        radius = if (width > height) {
            height / 4
        } else {
            width / 4
        }


        val path = Path()

        path.addCircle(
            width / 2,
            height / 2, radius,
            Path.Direction.CW
        )


        val paint = Paint()

        paint.setColor(Color.BLACK)

        paint.setStrokeWidth(5F)


        paint.setStyle(Paint.Style.FILL)

        val center_x: Float
        val center_y: Float
        val oval = RectF()


        paint.setStyle(Paint.Style.STROKE)
        center_x = width / 2

        center_y = height / 2

        oval[center_x - radius, center_y - radius, center_x + radius] = center_y + radius

        canvas!!.drawCircle( 300F, 300F, 180F, paint)
    }
}