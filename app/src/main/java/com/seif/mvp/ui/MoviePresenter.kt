package com.seif.mvp.ui

import com.seif.mvcproject.Pojo.MoviesModel
import kotlin.random.Random

class MoviePresenter(private val view: MovieView) {

   private fun getMovieNameFromDatabase(): String {
        val movieList = ArrayList<MoviesModel>()
        movieList.add(MoviesModel("Ant Man", "2020", "Fantasy", 1))
        movieList.add(MoviesModel("Super Man", "2020", "Fantasy", 2))
        movieList.add(MoviesModel("Bat Man", "2020", "Fantasy", 3))
        movieList.add(MoviesModel("Aqua Man", "2020", "Fantasy", 4))
        movieList.add(MoviesModel("Wounder Woman", "2020", "Fantasy", 5))
        movieList.add(MoviesModel("Avengers", "2020", "Fantasy", 6))

        return movieList[Random.nextInt(0, 6)].name
    }

    fun getMovieName() {
        // the presenter will get movie name from database then return name in the interface
        view.onGetMovieName(getMovieNameFromDatabase())
    }

}