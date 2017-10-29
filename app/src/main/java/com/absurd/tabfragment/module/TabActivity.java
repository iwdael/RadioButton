package com.absurd.tabfragment.module;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.absurd.briefness.BindView;
import com.absurd.tabfragment.R;
import com.absurd.tabfragment.base.BaseActivity;
import com.absurd.tabfragment.base.BaseFragment;
import com.absurd.tabfragment.module.view.ITabView;
import com.absurd.tabfragment.module.presenter.TabPresenter;

import java.util.List;

/**
 * Author: mr-absurd
 * Github: http://github.com/mr-absurd
 */
public class TabActivity extends BaseActivity<ITabView, TabPresenter> implements ITabView, RadioGroup.OnCheckedChangeListener {
    @BindView(R.id.rad_group)
    RadioGroup rad_group;

    @Override
    protected TabPresenter createPresenter() {
        return new TabPresenter(this);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_tab;
    }

    @Override
    protected int setTitle() {
        return 0;
    }

    @Override
    protected void initView() {
        initFragment();
    }

    private void initFragment() {
        rad_group.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int id) {
        switch (id) {
            case R.id.tab_radiobutton_one:

                break;
            case R.id.tab_radiobutton_two:

                break;
            case R.id.tab_radiobutton_three:

                break;
            case R.id.tab_radiobutton_four:
                break;
        }
    }

}
