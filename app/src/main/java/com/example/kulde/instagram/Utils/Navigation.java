package com.example.kulde.instagram.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.kulde.instagram.MainPage;
import com.example.kulde.instagram.Profile;
import com.example.kulde.instagram.R;
import com.example.kulde.instagram.Search;
import com.example.kulde.instagram.Userfeed;
import com.example.kulde.instagram.camera.TakePhotoActivity;

public class Navigation {
    private static final String TAG = "Navigation";
    public static void enablenavigation(final Context context, BottomNavigationView bottomNavigationView){
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, MainPage.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_add:
                        Intent intent2 = new Intent(context, TakePhotoActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_profile:
                        Intent intent3 = new Intent(context, Profile.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_search:
                        Intent intent4 = new Intent(context, Search.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_like:
                        Intent intent5 = new Intent(context,Userfeed.class);
                        context.startActivity(intent5);
                        break;
                }
            }
        });
    }
}
