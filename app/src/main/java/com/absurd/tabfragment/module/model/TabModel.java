package com.absurd.tabfragment.module.model;

import com.absurd.tabfragment.base.BaseModel;
import com.absurd.tabfragment.module.model.i.ITabModel;
import com.absurd.tabfragment.module.presenter.i.ITabPresenter;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public class TabModel extends BaseModel<ITabPresenter> implements ITabModel {

    public TabModel(ITabPresenter presenter) {
        super(presenter);
    }
}