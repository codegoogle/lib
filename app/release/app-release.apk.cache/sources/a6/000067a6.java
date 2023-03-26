package com.p7700g.p99005;

import com.p7700g.p99005.qp4;

/* compiled from: FastServiceLoader.kt */
@vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class yl5 {
    private static final boolean a;

    static {
        Object b;
        try {
            qp4.a aVar = qp4.s;
            b = qp4.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            qp4.a aVar2 = qp4.s;
            b = qp4.b(rp4.a(th));
        }
        a = qp4.m(b);
    }

    public static final boolean a() {
        return a;
    }
}