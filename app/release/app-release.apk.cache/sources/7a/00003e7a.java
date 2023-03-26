package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: ToolbarUtils.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes3.dex */
public class df2 {
    private static final Comparator<View> a = new a();

    /* compiled from: ToolbarUtils.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private df2() {
    }

    @z1
    public static ActionMenuItemView a(@x1 Toolbar toolbar, @m1 int i) {
        ActionMenuView b = b(toolbar);
        if (b != null) {
            for (int i2 = 0; i2 < b.getChildCount(); i2++) {
                View childAt = b.getChildAt(i2);
                if (childAt instanceof ActionMenuItemView) {
                    ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                    if (actionMenuItemView.getItemData().getItemId() == i) {
                        return actionMenuItemView;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @z1
    public static ActionMenuView b(@x1 Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @z1
    private static ImageView c(@x1 Toolbar toolbar, @z1 Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    @z1
    public static ImageView d(@x1 Toolbar toolbar) {
        return c(toolbar, toolbar.getLogo());
    }

    @z1
    public static ImageButton e(@x1 Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @z1
    public static View f(@x1 Toolbar toolbar) {
        ActionMenuView b = b(toolbar);
        if (b == null || b.getChildCount() <= 1) {
            return null;
        }
        return b.getChildAt(0);
    }

    @z1
    public static TextView g(@x1 Toolbar toolbar) {
        List<TextView> h = h(toolbar, toolbar.getSubtitle());
        if (h.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(h, a);
    }

    private static List<TextView> h(@x1 Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    @z1
    public static TextView i(@x1 Toolbar toolbar) {
        List<TextView> h = h(toolbar, toolbar.getTitle());
        if (h.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(h, a);
    }
}