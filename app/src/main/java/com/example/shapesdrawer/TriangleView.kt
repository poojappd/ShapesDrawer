package com.example.shapesdrawer

import android.content.Context
import android.graphics.*
import android.graphics.Path.FillType
import android.view.View


class TriangleView(context: Context) :View(context) {
    val paint = Paint()
    val path = Path()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint = Paint()

        paint.color = Color.BLACK
        canvas.drawPaint(paint)

        paint.strokeWidth = 4f
        paint.color = Color.RED
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.isAntiAlias = true

        val a = Point(0, 0)
        val b = Point(0, 100)
        val c = Point(87, 50)

        val path = Path()
        path.fillType = FillType.EVEN_ODD
        path.moveTo(a.x.toFloat(), a.y.toFloat())
        path.lineTo(b.x.toFloat(), b.y.toFloat())
        path.moveTo(b.x.toFloat(), b.y.toFloat())
        path.lineTo(c.x.toFloat(), c.y.toFloat())
        path.moveTo(c.x.toFloat(), c.y.toFloat())
        path.lineTo(a.x.toFloat(), a.y.toFloat())
        path.close()

        canvas.drawPath(path, paint)
    }

    private fun getHeight(width: Double): Float {
        return Math.sqrt((Math.pow(width, 2.0) - Math.pow((width / 2), 2.0))).toFloat()
    }

    private fun configurePaint(paint: Paint): Paint {
        paint.color = android.graphics.Color.WHITE
        paint.isAntiAlias = true

        return paint
    }

    fun configurePath(width: Float, path: Path): Path {
        path.lineTo((width / 2f), getHeight(width.toDouble()))
        path.lineTo(width, 0F)
        path.lineTo(0f, 0f)

        return path
    }
}

