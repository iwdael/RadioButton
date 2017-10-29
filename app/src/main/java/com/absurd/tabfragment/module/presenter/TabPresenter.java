package com.absurd.tabfragment.module.presenter;

import com.absurd.tabfragment.base.BasePresenter;
import com.absurd.tabfragment.module.view.ITabView;
import com.absurd.tabfragment.module.presenter.i.ITabPresenter;
import com.absurd.tabfragment.module.model.i.ITabModel;


/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public class TabPresenter extends BasePresenter<ITabView, ITabModel> implements ITabPresenter {

    public TabPresenter(ITabView view) {
        super(view);
    }


}