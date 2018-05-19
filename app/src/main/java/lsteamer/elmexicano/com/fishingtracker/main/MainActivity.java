package lsteamer.elmexicano.com.fishingtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
}
