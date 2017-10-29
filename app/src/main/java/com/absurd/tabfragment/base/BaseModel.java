package com.absurd.tabfragment.base;

import android.app.Activity;
import android.content.Context;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public abstract class BaseModel<T extends IBasePresenter> implements IBaseModel {
    protected T presenter;

    public BaseModel(T presenter) {
        this.presenter = presenter;
    }

    @Override
    public Context applicationContext() {
        return presenter.applicationContext();
    }

    @Override
    public Activity context() {
        return presenter.context();
    }
}
