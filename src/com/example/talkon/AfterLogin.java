package com.example.talkon;

import java.util.ArrayList;
import java.util.zip.Inflater;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;

public class AfterLogin extends SherlockActivity{
	private ArrayList<String> al;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.after_login);
		ListView listView = (ListView) findViewById(R.id.listview);
		al = getTitleArray();
		ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
		
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
			
				// Toast.makeText(getApplicationContext(), al.get(position)+ " ", Toast.LENGTH_SHORT).show();
				
				CustomDialog dialog  = new CustomDialog(AfterLogin.this,al.get(position),id);
				dialog.show();
				
				
			}
		});
		
		
	}
	private ArrayList<String> getTitleArray(){
		
		// 서버로 부터 title을 받아오는 기능 구현하기
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("홍정환- 러디쉽 그것은 무엇인가?");
		al.add("이민태 - 공부의 시작과 끝");
		al.add("김성겸 - 알고리즘의 고뇌와 끝");
		al.add("김진성 - 사회와 사회");
		
		
		
		return al;
		
	}
	
}
