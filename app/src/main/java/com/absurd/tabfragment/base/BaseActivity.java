package com.absurd.tabfragment.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.absurd.briefness.Briefness;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public abstract class BaseActivity<V extends IBaseView, T extends AbsPresenter<V>> extends Activity implements IBaseView {
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(attachLayoutRes());
        Briefness.bind(this);
        presenter = createPresenter();
        initView();
    }

    protected abstract T createPresenter();

    protected abstract int attachLayoutRes();

    protected abstract int setTitle();

    protected abstract void initView();


    @Override
    public Context applicationContext() {
        return getApplication();
    }

    @Override
    public Activity context() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null)
            presenter.dettachView();
    }
}
