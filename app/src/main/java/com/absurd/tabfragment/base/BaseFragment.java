package com.absurd.tabfragment.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.absurd.briefness.Briefness;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public abstract class BaseFragment<V extends IBaseView, T extends AbsPresenter<V>> extends Fragment implements IBaseView {
    private View view;
    protected T presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(attachLayoutRes(), null);
        Briefness.bind(this,view);
        presenter = createPresenter();
        return view;
    }

    protected abstract T createPresenter();

    protected abstract int attachLayoutRes();

    protected abstract int setTitle();

    protected abstract void initView();

    @Override
    public Context applicationContext() {
        return getActivity().getApplication();
    }

    @Override
    public Activity context() {
        return getActivity();
    }

    @Nullable
    @Override
    public View getView() {
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null)
            presenter.dettachView();
    }
}
