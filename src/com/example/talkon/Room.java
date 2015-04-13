package com.example.talkon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import fragment.OneFragment;
import fragment.ThreeFragment;
import fragment.TwoFragment;


public class Room extends FragmentActivity implements OnClickListener{
	final String TAG = "MainActivity";

	int mCurrentFragmentIndex;
	public final static int FRAGMENT_ONE = 0;
	public final static int FRAGMENT_TWO = 1;
	public final static int FRAGMENT_THREE = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.room);

		Button bt_oneFragment = (Button) findViewById(R.id.button1);
		bt_oneFragment.setOnClickListener(this);
		Button bt_twoFragment = (Button) findViewById(R.id.button2);
		bt_twoFragment.setOnClickListener(this);
		Button bt_threeFragment = (Button) findViewById(R.id.button3);
		bt_threeFragment.setOnClickListener(this);

		mCurrentFragmentIndex = FRAGMENT_ONE;

		fragmentReplace(mCurrentFragmentIndex);
	}

	public void fragmentReplace(int reqNewFragmentIndex) {

		Fragment newFragment = null;


		newFragment = getFragment(reqNewFragmentIndex);

		// replace fragment
		final FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();

		transaction.replace(R.id.frag, newFragment);

		// Commit the transaction
		transaction.commit();

	}

	private Fragment getFragment(int idx) {
		Fragment newFragment = null;

		switch (idx) {
		case FRAGMENT_ONE:
			newFragment = new OneFragment();
			break;
		case FRAGMENT_TWO:
			newFragment = new TwoFragment();
			break;
		case FRAGMENT_THREE:
			newFragment = new ThreeFragment();
			break;

		default:
			Log.d(TAG, "Unhandle case");
			break;
		}

		return newFragment;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {

		case R.id.button1:
			mCurrentFragmentIndex = FRAGMENT_ONE;
			fragmentReplace(mCurrentFragmentIndex);
			break;
		case R.id.button2:
			mCurrentFragmentIndex = FRAGMENT_TWO;
			fragmentReplace(mCurrentFragmentIndex);
			break;
		case R.id.button3:
			mCurrentFragmentIndex = FRAGMENT_THREE;
			fragmentReplace(mCurrentFragmentIndex);
			break;

		}

	}

}