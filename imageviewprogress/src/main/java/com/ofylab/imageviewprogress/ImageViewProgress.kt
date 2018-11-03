package com.ofylab.imageviewprogress

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.image_view_progress.view.*

class ImageViewProgress(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    init {
        inflate(context, R.layout.image_view_progress, this)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.ImageViewProgress)

        imageView.setImageDrawable(attributes.getDrawable(R.styleable.ImageViewProgress_src))

        attributes.recycle()
    }

}
