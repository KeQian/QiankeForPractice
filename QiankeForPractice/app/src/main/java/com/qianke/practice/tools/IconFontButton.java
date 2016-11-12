package com.qianke.practice.tools;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Android IconFont自定义控件 
 * 通过使用阿里巴巴IconFont库,使用TextView替代ImageView
 * 
 * @author yangyuancheng
 *
 */
public class IconFontButton extends Button {

	public IconFontButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		 Typeface typeface = Typeface.createFromAsset(context.getAssets(),"iconfont/iconfont.ttf");
	       setTypeface(typeface);

	}

	public IconFontButton(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		 Typeface typeface = Typeface.createFromAsset(context.getAssets(),"iconfont/iconfont.ttf");
	       setTypeface(typeface);

	}

	public IconFontButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		 Typeface typeface = Typeface.createFromAsset(context.getAssets(),"iconfont/iconfont.ttf");
	       setTypeface(typeface);	      
	}

	/**
	 * 设置图标样式
	 * 
	 * @param iconName
	 */
	public void setIconName(String iconName) {
		setText(iconName);
	}

	/**
	 * 设置图标颜色
	 * 
	 * @param color
	 */
	public void setIconColor(int color) {
		setTextColor(color);
	}

	/**
	 * 设置图标大小
	 * 
	 * @param iconSize
	 */
	public void setIconSize(int iconSize) {
		setTextSize(iconSize);
	}

}
