package com.absurd.tabfragment.base;

import android.app.Activity;
import android.content.Context;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public interface IBaseModel {

    //拿到ApplicationContext
    Context applicationContext();

    //拿到当前类的Context
    Activity context();
}
