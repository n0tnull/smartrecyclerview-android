// The MIT License (MIT)
//
// Copyright (c) 2017 Smart&Soft
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.

package com.smartnsoft.recyclerview.wrapper;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;

/**
 * A {@link SmartRecyclerViewWrapper} that can be used with a {@link GridLayoutManager} or a {@link StaggeredGridLayoutManager}.
 *
 * @param <BusinessObjectClass> the business object class which is represented by the current wrapper
 * @author Jocelyn Girard, Ludovic Roland, Adrien Vitti
 * @see SmartRecyclerViewWrapper
 * @since 2014.04.16
 */
public abstract class SpanRecyclerViewWrapper<BusinessObjectClass>
    extends SmartRecyclerViewWrapper<BusinessObjectClass>
{

  private final int spanSize;

  protected SpanRecyclerViewWrapper(BusinessObjectClass businessObject, int type, @LayoutRes int layoutResourceId,
      int spanSize)
  {
    super(businessObject, type, layoutResourceId);

    this.spanSize = spanSize;
  }

  @Override
  public int getSpanSize()
  {
    return spanSize;
  }

}