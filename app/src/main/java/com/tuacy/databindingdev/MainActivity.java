package com.tuacy.databindingdev;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tuacy.databindingdev.adapter.BindingAdapterActivity;
import com.tuacy.databindingdev.recycler.RecyclerBindingActivity;
import com.tuacy.databindingdev.twowaybinding.CustomerTwoWayBindingActivity;
import com.tuacy.databindingdev.simple.DataImportBindingActivity;
import com.tuacy.databindingdev.refresg.DataRefreshActivity;
import com.tuacy.databindingdev.eventbinding.EventBindingActivity;
import com.tuacy.databindingdev.include.IncludeBindingActivity;
import com.tuacy.databindingdev.simple.NoFindViewByIdActivity;
import com.tuacy.databindingdev.simple.SimpleBindingActivity;
import com.tuacy.databindingdev.twowaybinding.TwoWayBindingActivity;

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

		findViewById(R.id.button_event_binding).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				EventBindingActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_data_binding_adapter).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				BindingAdapterActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_recycler_binding).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				RecyclerBindingActivity.startUp(mContext);
			}
		});
	}
}
