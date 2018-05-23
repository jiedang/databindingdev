package com.tuacy.databindingdev.recycler;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.databinding.RecyclerHolderItemBinding;

import java.util.List;

public class GridRecyclerAdapter extends RecyclerView.Adapter<GridRecyclerAdapter.ItemHolder> {

	private List<String> mDataList;

	public GridRecyclerAdapter(List<String> dataList) {
		mDataList = dataList;
	}

	@NonNull
	@Override
	public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return new ItemHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_grid, parent, false));
	}

	@Override
	public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
		holder.setBinding(mDataList.get(position));
	}

	@Override
	public int getItemCount() {
		return mDataList == null ? 0 : mDataList.size();
	}

	static class ItemHolder extends RecyclerView.ViewHolder {

		RecyclerHolderItemBinding mBinding;

		ItemHolder(View itemView) {
			super(itemView);
			mBinding = DataBindingUtil.bind(itemView);
		}

		public ItemHolder setBinding(String item) {
			mBinding.setViewModel(item);
			return this;
		}
	}

}
