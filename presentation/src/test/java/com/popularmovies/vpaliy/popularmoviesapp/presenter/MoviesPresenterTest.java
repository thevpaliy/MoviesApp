package com.popularmovies.vpaliy.popularmoviesapp.presenter;

import com.popularmovies.vpaliy.data.utils.scheduler.BaseSchedulerProvider;
import com.popularmovies.vpaliy.data.utils.scheduler.ImmediateSchedulerProvider;
import com.popularmovies.vpaliy.domain.IMovieRepository;
import com.popularmovies.vpaliy.domain.configuration.ISortConfiguration;
import com.popularmovies.vpaliy.domain.model.MovieCover;
import com.popularmovies.vpaliy.domain.model.MovieDetails;
import com.popularmovies.vpaliy.popularmoviesapp.mvp.contract.MoviesContract;
import com.popularmovies.vpaliy.popularmoviesapp.mvp.presenter.MoviesPresenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rx.Observable;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MoviesPresenterTest extends BasePresenterTest {

  /*  @Mock
    private MoviesContract.View mockView;

    @Mock
    private IMovieRepository<MovieCover,MovieDetails> mockRepository;

    private MoviesPresenter presenter;


    @Before
    public void setUp(){
        presenter=new MoviesPresenter(mockRepository, SCHEDULER_PROVIDER);
        presenter.attachView(mockView);
        init();

    }

    @Test
    public void testStartFetchingData(){
        when(mockRepository.getCovers()).thenReturn(Observable.just(FAKE_COVER_LIST));
        presenter.start();

        verify(mockRepository).getCovers();
        verify(mockView).showMovies(FAKE_COVER_LIST);
        verify(mockView).setLoadingIndicator(true);
        verify(mockView).setLoadingIndicator(false);
    }

    @Test
    public void testStartFetchingEmptyData(){
        when(mockRepository.getCovers()).thenReturn(Observable.just(FAKE_EMPTY_COVER_LIST));
        presenter.start();

        verify(mockRepository).getCovers();
        verify(mockView).showEmptyMessage();
        verify(mockView).setLoadingIndicator(true);
        verify(mockView).setLoadingIndicator(false);
    }

    @Test
    public void testStartFetchingDataWithException(){
        when(mockRepository.getCovers()).thenReturn(Observable.error(new Exception()));
        presenter.start();

        verify(mockRepository).getCovers();
        verify(mockView).showErrorMessage();
        verify(mockView).setLoadingIndicator(true);
        verify(mockView).setLoadingIndicator(false);
    }

    @Test
    public void testRequestMoreData(){
        when(mockRepository.requestMoreCovers()).thenReturn(Observable.just(FAKE_COVER_LIST));
        presenter.requestMoreData();

        verify(mockRepository).requestMoreCovers();
        verify(mockView).appendMovies(FAKE_COVER_LIST);
        verify(mockView).setLoadingIndicator(false);
        verify(mockView).setLoadingIndicator(true);

    }

    @Test
    public void testRequestEmptyData(){
        when(mockRepository.requestMoreCovers()).thenReturn(Observable.just(FAKE_EMPTY_COVER_LIST));
        presenter.requestMoreData();

        verify(mockRepository).requestMoreCovers();
        verify(mockView,times(0)).appendMovies(FAKE_COVER_LIST);
        verify(mockView,times(0)).appendMovies(FAKE_EMPTY_COVER_LIST);
        verify(mockView).setLoadingIndicator(false);
        verify(mockView).setLoadingIndicator(true);
    }

    @Test
    public void testRequestDataWithException(){
        when(mockRepository.requestMoreCovers()).thenReturn(Observable.error(new Exception()));
        presenter.requestMoreData();

        verify(mockRepository).requestMoreCovers();
        verify(mockView,times(0)).appendMovies(FAKE_COVER_LIST);
        verify(mockView,times(0)).appendMovies(FAKE_EMPTY_COVER_LIST);
        verify(mockView).showErrorMessage();
        verify(mockView).setLoadingIndicator(false);
        verify(mockView).setLoadingIndicator(true);
    }


    @Test
    public void testSort(){
        when(mockRepository.sortBy(any(ISortConfiguration.SortType.class))).thenReturn(Observable.just(FAKE_COVER_LIST));
        presenter.sort(ISortConfiguration.SortType.TOP_RATED);
        presenter.sort(ISortConfiguration.SortType.POPULAR);
        presenter.sort(ISortConfiguration.SortType.FAVORITE);

        verify(mockRepository).sortBy(ISortConfiguration.SortType.TOP_RATED);
        verify(mockRepository).sortBy(ISortConfiguration.SortType.POPULAR);
        verify(mockRepository).sortBy(ISortConfiguration.SortType.FAVORITE);
        verify(mockView,times(3)).setLoadingIndicator(false);
        verify(mockView,times(3)).setLoadingIndicator(true);
        verify(mockView,times(3)).showMovies(FAKE_COVER_LIST);
    }

    @Test
    public void testSortEmptyData(){
        when(mockRepository.sortBy(any(ISortConfiguration.SortType.class))).thenReturn(Observable.just(FAKE_EMPTY_COVER_LIST));
        presenter.sort(ISortConfiguration.SortType.TOP_RATED);
        presenter.sort(ISortConfiguration.SortType.POPULAR);
        presenter.sort(ISortConfiguration.SortType.FAVORITE);

        verify(mockRepository).sortBy(ISortConfiguration.SortType.TOP_RATED);
        verify(mockRepository).sortBy(ISortConfiguration.SortType.POPULAR);
        verify(mockRepository).sortBy(ISortConfiguration.SortType.FAVORITE);
        verify(mockView,times(3)).setLoadingIndicator(false);
        verify(mockView,times(3)).setLoadingIndicator(true);
        verify(mockView,times(3)).showEmptyMessage();
    }


    @Test
    public void testSortWithException(){
        when(mockRepository.sortBy(any(ISortConfiguration.SortType.class))).thenReturn(Observable.error(new Exception()));
        presenter.sort(ISortConfiguration.SortType.TOP_RATED);
        presenter.sort(ISortConfiguration.SortType.POPULAR);
        presenter.sort(ISortConfiguration.SortType.FAVORITE);

        verify(mockRepository).sortBy(ISortConfiguration.SortType.TOP_RATED);
        verify(mockRepository).sortBy(ISortConfiguration.SortType.POPULAR);
        verify(mockRepository).sortBy(ISortConfiguration.SortType.FAVORITE);
        verify(mockView,times(3)).setLoadingIndicator(false);
        verify(mockView,times(3)).setLoadingIndicator(true);
        verify(mockView,times(3)).showErrorMessage();
    }

    */

}