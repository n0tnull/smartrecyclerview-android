package com.smartnsoft.smartrecyclerviewsample.wrappers;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * The class description here.
 *
 * @author Adrien Vitti
 * @since 2018.01.24
 */

abstract class AbstractDataBindedViewWrapper<T>
    extends AbstractSmartRecyclerViewWrapper<T>
{

  @LayoutRes
  private int layoutResourceId;

  AbstractDataBindedViewWrapper(T businessObject, int type, int layoutResourceId)
  {
    super(businessObject, type, layoutResourceId);
    this.layoutResourceId = layoutResourceId;
  }

  public View getNewView(ViewGroup parent, Context context)
  {
    final ViewDataBinding viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(context), layoutResourceId, parent, false);
    if (viewDataBinding == null)
    {
      throw new IllegalArgumentException("The given layout is not usable with data binding");
    }
    final View view = viewDataBinding.getRoot();
    view.setTag(extractNewViewAttributes(context, view, this.getBusinessObject()));
    return view;
  }

}
