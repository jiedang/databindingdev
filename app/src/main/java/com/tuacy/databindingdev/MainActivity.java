package com.tuacy.databindingdev;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tuacy.databindingdev.simple.SimpleBindingActivity;

public class MainActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		findViewById(R.id.button_simple).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				SimpleBindingActivity.startUp(mContext);
			}
		});
	}
}
