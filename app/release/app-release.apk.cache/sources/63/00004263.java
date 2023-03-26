package com.p7700g.p99005;

import android.content.ContentValues;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContentValues.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"contentValuesOf", "Landroid/content/ContentValues;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class fh {
    @NotNull
    public static final ContentValues a(@NotNull hp4<String, ? extends Object>... hp4VarArr) {
        c25.p(hp4VarArr, "pairs");
        ContentValues contentValues = new ContentValues(hp4VarArr.length);
        for (hp4<String, ? extends Object> hp4Var : hp4VarArr) {
            String f = hp4Var.f();
            Object g = hp4Var.g();
            if (g == null) {
                contentValues.putNull(f);
            } else if (g instanceof String) {
                contentValues.put(f, (String) g);
            } else if (g instanceof Integer) {
                contentValues.put(f, (Integer) g);
            } else if (g instanceof Long) {
                contentValues.put(f, (Long) g);
            } else if (g instanceof Boolean) {
                contentValues.put(f, (Boolean) g);
            } else if (g instanceof Float) {
                contentValues.put(f, (Float) g);
            } else if (g instanceof Double) {
                contentValues.put(f, (Double) g);
            } else if (g instanceof byte[]) {
                contentValues.put(f, (byte[]) g);
            } else if (g instanceof Byte) {
                contentValues.put(f, (Byte) g);
            } else if (!(g instanceof Short)) {
                throw new IllegalArgumentException("Illegal value type " + g.getClass().getCanonicalName() + " for key \"" + f + h95.b);
            } else {
                contentValues.put(f, (Short) g);
            }
        }
        return contentValues;
    }
}