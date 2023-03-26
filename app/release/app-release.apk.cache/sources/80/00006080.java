package com.p7700g.p99005;

import android.annotation.SuppressLint;
import com.p7700g.p99005.mz;

/* compiled from: MenuHost.java */
/* loaded from: classes.dex */
public interface uq {
    void addMenuProvider(@x1 zq zqVar);

    void addMenuProvider(@x1 zq zqVar, @x1 qz qzVar);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@x1 zq zqVar, @x1 qz qzVar, @x1 mz.c cVar);

    void invalidateMenu();

    void removeMenuProvider(@x1 zq zqVar);
}