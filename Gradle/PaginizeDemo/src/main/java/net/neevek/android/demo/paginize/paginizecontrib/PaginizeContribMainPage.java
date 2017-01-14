package net.neevek.android.demo.paginize.paginizecontrib;

import android.os.Build;

import net.neevek.android.demo.paginize.R;
import net.neevek.android.lib.paginize.PageActivity;
import net.neevek.android.lib.paginizecontrib.page.BaseTabsPage;

/**
 * Created by neevek on 14/01/2017.
 */
public class PaginizeContribMainPage extends BaseTabsPage {
  public PaginizeContribMainPage(PageActivity pageActivity) {
    super(pageActivity);
    setToolbarEnabled(false);

    addPage(new PaginizeContribInnerPage(this).setPageTitle("Tab1"), "Tab1", R.drawable.home_selector);
    addPage(new PaginizeContribInnerPage(this).setPageTitle("Tab2"), "Tab2", R.drawable.home_selector);
    if (Build.VERSION.SDK_INT >= 23) {
      getTabLayout().setBackgroundColor(getResources().getColor(R.color.primary, getContext().getTheme()));
    } else {
      getTabLayout().setBackgroundColor(getResources().getColor(R.color.primary));
    }
  }
}
