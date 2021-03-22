package com.seif.mvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seif.mvp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MovieView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter = MoviePresenter(this)
        // When click button we call the presenter to get the movie name from data
        btn_movieName.setOnClickListener {
            presenter.getMovieName()
        }

    }

    override fun onGetMovieName(movieName: String) {
        // After the presenter pass data to interface the interface will shoe the data in TextView.
        super.onGetMovieName(movieName)
        txt_moviename.text = movieName
    }

    // this activity is for handle events as "onClick" and show data as in TextView.

}