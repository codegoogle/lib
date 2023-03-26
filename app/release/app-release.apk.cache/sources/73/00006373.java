package com.p7700g.p99005;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* loaded from: classes3.dex */
public class we3 {
    private static final String a = "we3";
    public final x.d b;

    public we3(x.d dVar) {
        this.b = dVar;
    }

    public final synchronized void a(String str, String str2) {
        if (this.b == null) {
            Logger.e(a, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = x.d.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.b, str2);
            return;
        }
        throw new AccessControlException("Trying to access a private function: " + str);
    }
}