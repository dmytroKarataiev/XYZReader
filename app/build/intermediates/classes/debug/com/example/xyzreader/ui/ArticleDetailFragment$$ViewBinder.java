// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleDetailFragment$$ViewBinder<T extends com.example.xyzreader.ui.ArticleDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558523, "field 'description'");
    target.description = finder.castView(view, 2131558523, "field 'description'");
    view = finder.findRequiredView(source, 2131558524, "field 'subtitle'");
    target.subtitle = finder.castView(view, 2131558524, "field 'subtitle'");
    view = finder.findRequiredView(source, 2131558521, "field 'layout'");
    target.layout = finder.castView(view, 2131558521, "field 'layout'");
    view = finder.findRequiredView(source, 2131558522, "field 'mPhotoView'");
    target.mPhotoView = finder.castView(view, 2131558522, "field 'mPhotoView'");
  }

  @Override public void unbind(T target) {
    target.description = null;
    target.subtitle = null;
    target.layout = null;
    target.mPhotoView = null;
  }
}
