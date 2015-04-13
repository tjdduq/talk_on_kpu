package com.example.talkon;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CustomDialog extends Dialog{

	public CustomDialog(Context context, String a) {
		super(context);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.session_info_dialog);
		TextView tv =(TextView) findViewById(R.id.textView1);
	//	Bundle bd = this.getContext().
		tv.setText(a);
		Button enterBtn = (Button) findViewById(R.id.enter_room);
//		enterBtn.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		
	}

}
