package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import org.jetbrains.annotations.NotNull;

/* compiled from: SharedPreferences.kt */
@vo4(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"edit", "", "Landroid/content/SharedPreferences;", "commit", "", "action", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class rh {
    @SuppressLint({"ApplySharedPref"})
    public static final void a(@NotNull SharedPreferences sharedPreferences, boolean z, @NotNull f05<? super SharedPreferences.Editor, yq4> f05Var) {
        c25.p(sharedPreferences, "<this>");
        c25.p(f05Var, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        c25.o(edit, "editor");
        f05Var.M(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c25.p(sharedPreferences, "<this>");
        c25.p(f05Var, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        c25.o(edit, "editor");
        f05Var.M(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}