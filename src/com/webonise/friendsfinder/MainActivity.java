package com.webonise.friendsfinder;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

import com.example.friendsfinder.R;

public class MainActivity extends FragmentActivity {
	private FragmentTabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		setTabContent();

	}

	private void setTabContent() {
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.tabFrameLayout);

		
		mTabHost.addTab(
				mTabHost.newTabSpec("map").setIndicator("Map",
						getResources().getDrawable(android.R.drawable.star_big_on)),
				MapFragment.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("friends list").setIndicator("Friends",
						getResources().getDrawable(android.R.drawable.star_big_on)),
				FriendsListFragment.class, null);

	}
}