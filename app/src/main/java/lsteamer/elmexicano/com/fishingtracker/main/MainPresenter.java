package lsteamer.elmexicano.com.fishingtracker.main;

import android.view.View;

/**
 * Handles actions from the View and updating the UI as required
 */
public class MainPresenter implements MainContract.Presenter{


    private MainContract.MvpView mvpView;

    MainPresenter(MainContract.MvpView view){
        mvpView = view;

    }


    /// Presenter methods ///
    @Override
    public void handleSignInButtonClick(View view) {
        mvpView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick(View view) {
        mvpView.showSignUpScreen();
    }
}
