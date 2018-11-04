package com.ofylab.imageviewprogress

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.image_view_progress.view.*

class ImageViewProgress(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    val imageView: ImageView
        get() = imageView_

    val progressBar: ProgressBar
        get() = progressBar_

    init {
        inflate(context, R.layout.image_view_progress, this)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.ImageViewProgress)

        imageView.setImageResource(attributes.getResourceId(R.styleable.ImageViewProgress_src, 0))

        imageView.adjustViewBounds = attributes.getBoolean(R.styleable.ImageViewProgress_adjustViewBounds, false)

        imageView.scaleType = when (attributes.getInt(R.styleable.ImageViewProgress_scaleType, 0)) {
            0 -> ImageView.ScaleType.MATRIX
            1 -> ImageView.ScaleType.FIT_XY
            2 -> ImageView.ScaleType.FIT_START
            3 -> ImageView.ScaleType.FIT_CENTER
            4 -> ImageView.ScaleType.FIT_END
            5 -> ImageView.ScaleType.CENTER
            6 -> ImageView.ScaleType.CENTER_CROP
            7 -> ImageView.ScaleType.CENTER_INSIDE
            else -> ImageView.ScaleType.MATRIX
        }

//        <attr name="src" format="reference|color" />
//        <attr name="scaleType">
//        <enum name="matrix" value="0" />
//        <enum name="fitXY" value="1" />
//        <enum name="fitStart" value="2" />
//        <enum name="fitCenter" value="3" />
//        <enum name="fitEnd" value="4" />
//        <enum name="center" value="5" />
//        <enum name="centerCrop" value="6" />
//        <enum name="centerInside" value="7" />
//        </attr>
//        <attr name="adjustViewBounds" format="boolean" />
//        <attr name="maxWidth" format="dimension" />
//        <attr name="maxHeight" format="dimension" />
//        <attr name="tint" format="color" />
//        <attr name="baselineAlignBottom" format="boolean" />
//        <attr name="cropToPadding" format="boolean" />
//        <attr name="baseline" format="dimension" />
//        <attr name="drawableAlpha" format="integer" />

        attributes.recycle()
    }

    fun progressBarGone() {
        progressBar.visibility = View.GONE
    }

    fun progressBarVisible() {
        progressBar.visibility = View.VISIBLE
    }

}
