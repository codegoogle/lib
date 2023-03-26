package com.p7700g.p99005;

/* compiled from: MembersInjectors.java */
/* loaded from: classes2.dex */
public final class o62 {

    /* compiled from: MembersInjectors.java */
    /* loaded from: classes2.dex */
    public enum a implements w52<Object> {
        INSTANCE;

        @Override // com.p7700g.p99005.w52
        public void a(Object obj) {
            q62.c(obj, "Cannot inject members into a null reference");
        }
    }

    private o62() {
    }

    public static <T> w52<T> a() {
        return a.INSTANCE;
    }
}