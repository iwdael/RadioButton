package com.absurd.tabfragment.base;

import java.lang.ref.WeakReference;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public abstract class AbsPresenter<T> {
    protected WeakReference<T> mViewRef;


    protected void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    protected T getView() {
        return mViewRef.get();
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void dettachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }



}
