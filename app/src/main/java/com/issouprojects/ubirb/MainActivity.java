package com.issouprojects.ubirb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.issouprojects.ubirb.drawers.FragmentDrawer;
import com.issouprojects.ubirb.fragments.MessagesFragment;
import com.issouprojects.ubirb.fragments.MyCurrentTransactionsFragment;
import com.issouprojects.ubirb.fragments.MyOffersFragment;
import com.issouprojects.ubirb.fragments.MyProfileFragment;
import com.issouprojects.ubirb.fragments.MyRequestsFragment;
import com.issouprojects.ubirb.fragments.OffersFragment;
import com.issouprojects.ubirb.fragments.RequestsFragment;


public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private static String TAG = MainActivity.class.getSimpleName();

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    private ImageView profileView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        profileView = findViewById(R.id.profileView);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        profileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra("fragment", "monProfil");
                startActivity(intent);
            }
        });

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        // display the first navigation drawer view on app launch

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String fragment = extras.getString("fragment");
            if(fragment.equals("messages")) {
                displayView(2);
            }
            else if(fragment.equals("monProfil")) {
                displayView(1);
            }
        }
        else {
            displayView(5);
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new MyProfileFragment();
                title = getString(R.string.title_myprofile);
                break;
            case 1:
                fragment = new MessagesFragment();
                title = getString(R.string.title_messages);
                break;
            case 2:
                fragment = new MyOffersFragment();
                title = getString(R.string.title_myoffers);
                break;
            case 3:
                fragment = new MyRequestsFragment();
                title = getString(R.string.title_myrequests);
                break;
            case 4:
                fragment = new MyCurrentTransactionsFragment();
                title = getString(R.string.title_mycurrenttransactions);
                break;
            case 5:
                fragment = new OffersFragment();
                title = getString(R.string.title_offers);
                break;
            case 6:
                fragment = new RequestsFragment();
                title = getString(R.string.title_requests);
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
}
