package com.example.talkon;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CustomDialog extends Dialog implements OnClickListener {

	Intent intent;
	long mId;
	TextView mTitle;
	Button enterBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.session_info_dialog);
		mTitle = (TextView) findViewById(R.id.textView1);
		enterBtn= (Button) findViewById(R.id.enter_room);
		enterBtn.setOnClickListener(this);
	}

	public CustomDialog(Context context, String contents, long id) {
		super(context);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.session_info_dialog);
		mId = id;
		
	}
	public void setCustom(String con){
		mTitle.setText(con);
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(v.getContext(),Room.class);
		intent.putExtra("key", mId);
		v.getContext().startActivity(intent);
		
	}

}
