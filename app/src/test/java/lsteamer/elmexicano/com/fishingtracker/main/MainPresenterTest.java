package lsteamer.elmexicano.com.fishingtracker.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Local unit test for the Main Presenter.
 */
public class MainPresenterTest {

    @Mock
    private MainContract.MvpView mvpView;

    private MainPresenter mainPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mainPresenter = new MainPresenter(mvpView);

    }

    @Test
    public void handleSignInButtonClick() {

        mainPresenter.handleSignInButtonClick();
        verify(mvpView).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() {
        mainPresenter.handleSignUpButtonClick();
        verify(mvpView).showSignUpScreen();
    }
}