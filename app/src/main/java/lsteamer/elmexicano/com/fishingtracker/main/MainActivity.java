package lsteamer.elmexicano.com.fishingtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import lsteamer.elmexicano.com.fishingtracker.R;

/**
 * Displays the Main Screen.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);
    }

    /// MvpView methods ///
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to the SignIn Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to the SignUp Screen", Toast.LENGTH_SHORT).show();
    }
}
