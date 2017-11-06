package com.aliletter.radiobutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

import java.lang.reflect.Type;

/**
 * Created by 段泽全 on 2017/10/29.
 * Github：https://github.com/aliletter
 * Emile:4884280@qq.com
 */

public class RadioButton extends android.widget.RadioButton {
    private int mDrawableWidth;
    private int mDrawableHeight;
    private Drawable mDrawable;
    private int mDrawableMarginTop;

    public RadioButton(Context context) {
        super(context);
    }

    public RadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public RadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.RadioButton);
        mDrawableWidth = (int) ta.getDimension(R.styleable.RadioButton_drawable_width, 0);
        mDrawableHeight = (int) ta.getDimension(R.styleable.RadioButton_drawable_height, 0);
        mDrawableMarginTop = (int) ta.getDimension(R.styleable.RadioButton_drawable_marginTop, 0);
        setCompoundDrawablePadding(getCompoundDrawablePadding() + mDrawableMarginTop);
        Log.v("TAG", getCompoundDrawables().length + "");
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null) {
                mDrawable = drawable;
            }
        }
        if (mDrawable != null & mDrawableWidth > 0 & mDrawableHeight > 0) {
            mDrawable.setBounds(0, mDrawableMarginTop, mDrawableWidth, mDrawableHeight + mDrawableMarginTop);
            setCompoundDrawables(null, mDrawable, null, null);
        }
        ta.recycle();
    }
}
