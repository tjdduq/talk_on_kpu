package com.example.talkon;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;

public class MainActivity extends SherlockActivity {
	private EditText mIdEt, mPwEt;
	private Button mLoginBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mIdEt = (EditText) findViewById(R.id.editText1);
		mPwEt = (EditText) findViewById(R.id.editText2);
		
		Drawable img = getApplicationContext().getResources().getDrawable(
				R.drawable.abs__textfield_searchview_right_holo_dark);
		mIdEt.setCompoundDrawablesWithIntrinsicBounds(img, null, null, null);

		mPwEt.setNextFocusDownId(R.id.editText2);
		mPwEt.setOnKeyListener(new OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if (keyCode == KeyEvent.KEYCODE_ENTER) {
					// 로그인하기
					login(mIdEt.getText().toString(), (String) mPwEt.getText()
							.toString());

				}
				return false;
			}
		});

		mLoginBtn = (Button) findViewById(R.id.loginButton);
		mLoginBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				login(mIdEt.getText().toString(), (String) mPwEt.getText()
						.toString());
			}
		});

	}

	private void login(String id, String passWord) {
		// login module
		Toast.makeText(getApplicationContext(), "login", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(getApplicationContext(),AfterLogin.class);
		startActivity(intent);
	}

}
