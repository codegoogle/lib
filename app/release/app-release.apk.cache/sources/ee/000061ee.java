package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import com.p7700g.p99005.i2;

/* compiled from: SupportMenuItem.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface vk extends MenuItem {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 4;
    public static final int k = 8;

    @x1
    vk a(@z1 gq gqVar);

    @z1
    gq b();

    boolean c();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @z1
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @z1
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @z1
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @z1
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @z1
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @x1
    MenuItem setActionView(int i2);

    @Override // android.view.MenuItem
    @x1
    MenuItem setActionView(@z1 View view);

    @Override // android.view.MenuItem
    @x1
    MenuItem setAlphabeticShortcut(char c, int i2);

    @Override // android.view.MenuItem
    @x1
    /* bridge */ /* synthetic */ MenuItem setContentDescription(@z1 CharSequence charSequence);

    @Override // android.view.MenuItem
    @x1
    vk setContentDescription(@z1 CharSequence charSequence);

    @Override // android.view.MenuItem
    @x1
    MenuItem setIconTintList(@z1 ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @x1
    MenuItem setIconTintMode(@z1 PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @x1
    MenuItem setNumericShortcut(char c, int i2);

    @Override // android.view.MenuItem
    @x1
    MenuItem setShortcut(char c, char c2, int i2, int i3);

    @Override // android.view.MenuItem
    void setShowAsAction(int i2);

    @Override // android.view.MenuItem
    @x1
    MenuItem setShowAsActionFlags(int i2);

    @Override // android.view.MenuItem
    @x1
    /* bridge */ /* synthetic */ MenuItem setTooltipText(@z1 CharSequence charSequence);

    @Override // android.view.MenuItem
    @x1
    vk setTooltipText(@z1 CharSequence charSequence);
}