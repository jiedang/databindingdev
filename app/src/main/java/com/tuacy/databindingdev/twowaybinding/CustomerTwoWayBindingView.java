package com.tuacy.databindingdev.twowaybinding;

import android.content.Context;
import android.content.res.TypedArray;
import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.databinding.InverseBindingListener;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.utils.DensityUtils;

public class CustomerTwoWayBindingView extends View {

	private Context   mContext;
	private TextPaint mPaint;
	private String    value;

	public CustomerTwoWayBindingView(Context context) {
		this(context, null);
	}

	public CustomerTwoWayBindingView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public CustomerTwoWayBindingView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		mContext = context;
		initAttribute(attrs, defStyleAttr);
		init();
	}

	private void initAttribute(AttributeSet attrs, int defStyleAttr) {
		TypedArray typeArray = mContext.obtainStyledAttributes(attrs, R.styleable.CustomerTwoWayBindingView, defStyleAttr, 0);
		value = typeArray.getString(R.styleable.CustomerTwoWayBindingView_value);
		typeArray.recycle();
	}

	private void init() {
		mPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);
		mPaint.setStyle(Paint.Style.FILL);
		mPaint.setColor(Color.BLACK);
		mPaint.setTextSize(DensityUtils.sp2px(getContext(), 16));
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
		if (!TextUtils.isEmpty(value)) {
			float valueWidth = mPaint.measureText(value, 0, value.length());
			canvas.drawText(value, getMeasuredWidth() / 2 - valueWidth / 2, getMeasuredHeight() / 2, mPaint);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		postInvalidate();
		if (valueInverseBindingListener != null) {
			//通知数据改变
			valueInverseBindingListener.onChange();
		}
	}

	@BindingAdapter(value = "value", requireAll = false)
	public static void setValue(CustomerTwoWayBindingView view, String value) {
		//避免无限循环,数据不相同的时候我们才去改变数据，因为是双向绑定吗，数据改变通知View刷新，View刷新又通知数据改变
		if (TextUtils.isEmpty(view.getValue()) && TextUtils.isEmpty(value)) {
			return;
		}
		if (view.getValue() != null && view.getValue().equals(value)) {
			return;
		}
		view.setValue(value);
	}

	/**
	 * 关联某个数据变更
	 */
	@InverseBindingAdapter(attribute = "value", event = "valueAttrChanged")
	public static String getValue(CustomerTwoWayBindingView view) {
		return view.getValue();
	}

	private static InverseBindingListener valueInverseBindingListener;

	@BindingAdapter(value = {"valueAttrChanged"}, requireAll = false)
	public static void setValueChangedListener(CustomerTwoWayBindingView view, final InverseBindingListener bindingListener) {
		valueInverseBindingListener = bindingListener;
	}


}
