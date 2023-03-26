package com.p7700g.p99005;

import android.widget.ListView;

/* compiled from: ListViewAutoScrollHelper.java */
/* loaded from: classes.dex */
public class it extends at {
    private final ListView u0;

    public it(@x1 ListView listView) {
        super(listView);
        this.u0 = listView;
    }

    @Override // com.p7700g.p99005.at
    public boolean a(int i) {
        return false;
    }

    @Override // com.p7700g.p99005.at
    public boolean b(int i) {
        ListView listView = this.u0;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.at
    public void l(int i, int i2) {
        jt.b(this.u0, i2);
    }
}