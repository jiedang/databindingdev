package com.tuacy.databindingdev.recycler;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.databinding.RecyclerActivityBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerBindingActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, RecyclerBindingActivity.class));
	}

	private RecyclerActivityBinding mBinding;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recycler_binding);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_binding);
		initData();
	}

	private void initData() {
		mBinding.recyclerList.setLayoutManager(new GridLayoutManager(this, 2));
		mBinding.recyclerList.setAdapter(new GridRecyclerAdapter(obtainData()));
	}


	private List<String> obtainData() {
		List<String> list = new ArrayList<>();
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514456311&di=2a8ccd6c814c5851fb8763418dd60455&src=http://wenwen.soso.com/p/20130907/20130907174128-2028703867.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1960816299,803825902&fm=27&gp=0.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3790810349,4012335838&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3781123768,373023027&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4052445718,1344904722&fm=27&gp=0.jpg");
		list.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1730874133,3861130981&fm=27&gp=0.jpg");
		list.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4117837678,3129898700&fm=27&gp=0.jpg");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514457163&di=b5c6e3c2242452070e8a40a47fca117f&src=http://p4.gexing.com/G1/M00/A2/1B/rBACFFKAfKzzywqAAAAZExvP8P4963_200x200_3.jpg?recache=20131108");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514456311&di=2a8ccd6c814c5851fb8763418dd60455&src=http://wenwen.soso.com/p/20130907/20130907174128-2028703867.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3790810349,4012335838&fm=27&gp=0.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1960816299,803825902&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3781123768,373023027&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4052445718,1344904722&fm=27&gp=0.jpg");
		list.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1730874133,3861130981&fm=27&gp=0.jpg");
		list.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4117837678,3129898700&fm=27&gp=0.jpg");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514457163&di=b5c6e3c2242452070e8a40a47fca117f&src=http://p4.gexing.com/G1/M00/A2/1B/rBACFFKAfKzzywqAAAAZExvP8P4963_200x200_3.jpg?recache=20131108");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514456311&di=2a8ccd6c814c5851fb8763418dd60455&src=http://wenwen.soso.com/p/20130907/20130907174128-2028703867.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3790810349,4012335838&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3781123768,373023027&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4052445718,1344904722&fm=27&gp=0.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1960816299,803825902&fm=27&gp=0.jpg");
		list.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1730874133,3861130981&fm=27&gp=0.jpg");
		list.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4117837678,3129898700&fm=27&gp=0.jpg");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514457163&di=b5c6e3c2242452070e8a40a47fca117f&src=http://p4.gexing.com/G1/M00/A2/1B/rBACFFKAfKzzywqAAAAZExvP8P4963_200x200_3.jpg?recache=20131108");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514456311&di=2a8ccd6c814c5851fb8763418dd60455&src=http://wenwen.soso.com/p/20130907/20130907174128-2028703867.jpg");
		list.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1730874133,3861130981&fm=27&gp=0.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3790810349,4012335838&fm=27&gp=0.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1960816299,803825902&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4052445718,1344904722&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3781123768,373023027&fm=27&gp=0.jpg");
		list.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4117837678,3129898700&fm=27&gp=0.jpg");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514457163&di=b5c6e3c2242452070e8a40a47fca117f&src=http://p4.gexing.com/G1/M00/A2/1B/rBACFFKAfKzzywqAAAAZExvP8P4963_200x200_3.jpg?recache=20131108");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514456311&di=2a8ccd6c814c5851fb8763418dd60455&src=http://wenwen.soso.com/p/20130907/20130907174128-2028703867.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3790810349,4012335838&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3781123768,373023027&fm=27&gp=0.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1960816299,803825902&fm=27&gp=0.jpg");
		list.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1730874133,3861130981&fm=27&gp=0.jpg");
		list.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4117837678,3129898700&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4052445718,1344904722&fm=27&gp=0.jpg");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514457163&di=b5c6e3c2242452070e8a40a47fca117f&src=http://p4.gexing.com/G1/M00/A2/1B/rBACFFKAfKzzywqAAAAZExvP8P4963_200x200_3.jpg?recache=20131108");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514456311&di=2a8ccd6c814c5851fb8763418dd60455&src=http://wenwen.soso.com/p/20130907/20130907174128-2028703867.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3790810349,4012335838&fm=27&gp=0.jpg");
		list.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3781123768,373023027&fm=27&gp=0.jpg");
		list.add("2016-07-21");
		list.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4052445718,1344904722&fm=27&gp=0.jpg");
		list.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1730874133,3861130981&fm=27&gp=0.jpg");
		list.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4117837678,3129898700&fm=27&gp=0.jpg");
		list.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1960816299,803825902&fm=27&gp=0.jpg");
		list.add(
			"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1514457163&di=b5c6e3c2242452070e8a40a47fca117f&src=http://p4.gexing.com/G1/M00/A2/1B/rBACFFKAfKzzywqAAAAZExvP8P4963_200x200_3.jpg?recache=20131108");
		return list;
	}

}
