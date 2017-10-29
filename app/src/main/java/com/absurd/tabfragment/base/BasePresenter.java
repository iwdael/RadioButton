package com.absurd.tabfragment.base;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public class BasePresenter<V extends IBaseView, M extends IBaseModel> extends AbsPresenter<V> implements IBasePresenter {

    protected V view;
    protected M model;

    public BasePresenter(V view) {
        this.attachView(view);
        this.view = getView();
        Type[] types = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
        String modelName = types[1].toString().replace("interface ", "").replace("i.I", "");
        String presenterClazzName = getClass().getName();
        int index = presenterClazzName.lastIndexOf('.');
        String presenterName = presenterClazzName.substring(0, index) + ".i.I" + presenterClazzName.substring(1 + index, presenterClazzName.length());
        try {
            Class<?> clazzModel = Class.forName(modelName);
            Class<?> clazzPresenter = Class.forName(presenterName);
            Constructor<?> constructor = clazzModel.getConstructor(new Class[]{clazzPresenter});
            model = (M) constructor.newInstance(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Context applicationContext() {
        return view.applicationContext();
    }

    @Override
    public Activity context() {
        return view.context();
    }
}
