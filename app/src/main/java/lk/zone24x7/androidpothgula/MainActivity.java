package lk.zone24x7.androidpothgula;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView mBottomNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomNavBar = findViewById(R.id.main_bottombar);
        mBottomNavBar.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.bottom_nav_home:
                        switchToHome();
                        break;
                    case R.id.bottom_nav_list:
                        break;
                    case R.id.bottom_nav_message:
                        break;
                    case R.id.bottom_nav_name:
                        break;
                }
            }
        });
    }

    private void switchToHome(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_fragment_layout, SearchFragment.newInstance());
        ft.commit();

    }
}
