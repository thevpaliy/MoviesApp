package com.popularmovies.vpaliy.popularmoviesapp.mvp.contract;


import android.support.annotation.NonNull;

import com.popularmovies.vpaliy.domain.model.MediaCover;
import com.popularmovies.vpaliy.domain.model.MovieInfo;
import com.popularmovies.vpaliy.domain.model.Trailer;
import com.popularmovies.vpaliy.popularmoviesapp.mvp.BasePresenter;
import com.popularmovies.vpaliy.popularmoviesapp.mvp.BaseView;

import java.util.List;

public interface MovieInfoContract {

    interface View extends BaseView<Presenter> {
        void attachPresenter(@NonNull Presenter presenter);
        void showTrailers(@NonNull List<Trailer> trailers);
        void showGeneralInfo(@NonNull MovieInfo movieInfo);
        void showSimilarMovies(@NonNull List<MediaCover> similarMovies);
        void showNoInfoMessage();
    }

    interface Presenter extends BasePresenter<View> {
        void attachView(@NonNull View view);
        void start(int movieID);
        void stop();

    }
}
