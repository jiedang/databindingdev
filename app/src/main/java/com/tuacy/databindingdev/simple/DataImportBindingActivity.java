package com.tuacy.databindingdev.simple;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.databindingdev.R;

import java.util.ArrayList;
import java.util.List;

public class DataImportBindingActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, DataImportBindingActivity.class));
	}

	private DataImportBinding mBinding;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_import);
		initData();
	}

	private void initData() {
		DataImportEntity dataImportEntity = new DataImportEntity("Test", true);
		mBinding.setImportEntity(dataImportEntity);

		List<DataImportEntity> entityList = new ArrayList<>();
		entityList.add(new DataImportEntity("Test", true));
		mBinding.setImportList(entityList);
	}

}
