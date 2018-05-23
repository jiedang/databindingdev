package com.tuacy.databindingdev;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tuacy.databindingdev.simple.CustomerTwoWayBindingActivity;
import com.tuacy.databindingdev.simple.DataImportBindingActivity;
import com.tuacy.databindingdev.simple.DataRefreshActivity;
import com.tuacy.databindingdev.simple.IncludeBindingActivity;
import com.tuacy.databindingdev.simple.NoFindViewByIdActivity;
import com.tuacy.databindingdev.simple.SimpleBindingActivity;
import com.tuacy.databindingdev.simple.TwoWayBindingActivity;

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

		findViewById(R.id.button_simple_import).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DataImportBindingActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_simple_include).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				IncludeBindingActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_no_find_view).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				NoFindViewByIdActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_data_refresh).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DataRefreshActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_two_way_binding).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				TwoWayBindingActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_customer_two_way_binding).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				CustomerTwoWayBindingActivity.startUp(mContext);
			}
		});
	}
}
