package com.p7700g.p99005;

import android.content.Context;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes3.dex */
public class jv2 {

    /* compiled from: LibraryVersionComponent.java */
    /* loaded from: classes3.dex */
    public interface a<T> {
        String a(T t);
    }

    private jv2() {
    }

    public static so2<?> a(String str, String str2) {
        return so2.g(iv2.a(str, str2), iv2.class);
    }

    public static so2<?> b(final String str, final a<Context> aVar) {
        return so2.h(iv2.class).b(zo2.j(Context.class)).f(new vo2() { // from class: com.p7700g.p99005.dv2
            @Override // com.p7700g.p99005.vo2
            public final Object a(to2 to2Var) {
                return jv2.c(str, aVar, to2Var);
            }
        }).d();
    }

    public static /* synthetic */ iv2 c(String str, a aVar, to2 to2Var) {
        return iv2.a(str, aVar.a((Context) to2Var.a(Context.class)));
    }
}