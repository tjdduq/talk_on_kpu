package fragment;

import com.example.talkon.R;
import com.example.talkon.R.id;
import com.example.talkon.R.layout;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class OneFragment extends Fragment {

	int mCount = 0;
	TextView tv;
	Button bt;
	static final private int MESSAGE_COUNT = 1;
	Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MESSAGE_COUNT:
				int currentCount = msg.arg1;
				TextView countTextView = (TextView) msg.obj;
				countTextView.setText("count" + currentCount);
				break;

			}
		}
	};

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.one_fragment, container, false);
		return v;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

	}
}
