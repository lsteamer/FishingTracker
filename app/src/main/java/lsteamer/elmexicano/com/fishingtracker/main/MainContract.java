package lsteamer.elmexicano.com.fishingtracker.main;

import android.view.View;

/**
 * Defines the contract between the View {@link MainActivity} and the Presenter {@link MainPresenter}.
 */
public interface MainContract {

    interface MvpView {
        void showSignInScreen();

        void showSignUpScreen();
    }

    interface Presenter {
        void handleSignInButtonClick(View view);

        void handleSignUpButtonClick(View view);
    }


}
