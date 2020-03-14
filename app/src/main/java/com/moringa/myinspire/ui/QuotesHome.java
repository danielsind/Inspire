package com.moringa.myinspire.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.moringa.myinspire.FavoriteQuotes;
import com.moringa.myinspire.ProfileFragment;
import com.moringa.myinspire.QuotesFragment;
import com.moringa.myinspire.R;
import com.moringa.myinspire.adapter.ViewPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuotesHome extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.tabLayout) TabLayout tabLayout;
    @BindView(R.id.viewPager) ViewPager viewPager;
    @BindView(R.id.shareButton)
    FloatingActionButton mShareButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes_home);
        ButterKnife.bind(this);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
         adapter.addFragment(new ProfileFragment(), "Profile");
         adapter.addFragment(new QuotesFragment() , "Quotes");
         adapter.addFragment(new FavoriteQuotes(), "Favorite Quotes");
         mShareButton.setOnClickListener(this);

         viewPager.setAdapter(adapter);
         tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onClick(View view) {
        if(view == mShareButton){
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
            sendIntent.setType("text/plain");

            Intent share = Intent.createChooser(sendIntent, null);
            startActivity(share);
        }
    }
}
