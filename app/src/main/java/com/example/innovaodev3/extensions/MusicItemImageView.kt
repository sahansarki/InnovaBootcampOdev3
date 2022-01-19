package com.example.innovaodev3.extensions

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import com.example.innovaodev3.R

class MusicItemImageView: LinearLayout {

    constructor(context: Context, attrs: AttributeSet): super(context,attrs){ parseAttributes(attrs)}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr){ parseAttributes(attrs)}

    private fun parseAttributes(attrs: AttributeSet) {

        inflate(context, R.layout.music_item_imageview, this)

        val values = context.obtainStyledAttributes(attrs, R.styleable.MusicItemImageView)
        val musicPicture = values.getResourceId(R.styleable.MusicItemImageView_picture, 0)
        val musicDescription = values.getString(R.styleable.MusicItemImageView_description)

        val picture = findViewById<ImageView>(R.id.musicPicture)
        val description = findViewById<TextView>(R.id.musicDescription)
        picture.setImageDrawable(AppCompatResources.getDrawable(context, musicPicture))
        description.text = musicDescription

        values.recycle()

    }

}