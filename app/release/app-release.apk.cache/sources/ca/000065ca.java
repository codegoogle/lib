package com.p7700g.p99005;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
@e2(24)
/* loaded from: classes.dex */
public final class xm implements wm {
    private final LocaleList a;

    public xm(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // com.p7700g.p99005.wm
    public int a(Locale locale) {
        return this.a.indexOf(locale);
    }

    @Override // com.p7700g.p99005.wm
    public String b() {
        return this.a.toLanguageTags();
    }

    @Override // com.p7700g.p99005.wm
    public Object c() {
        return this.a;
    }

    @Override // com.p7700g.p99005.wm
    @z1
    public Locale d(@x1 String[] strArr) {
        return this.a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.a.equals(((wm) obj).c());
    }

    @Override // com.p7700g.p99005.wm
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.p7700g.p99005.wm
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // com.p7700g.p99005.wm
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}