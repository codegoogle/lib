package com.anythink.expressad;

import android.app.Application;
import android.content.Context;
import com.anythink.expressad.out.r;
import java.util.Map;

/* loaded from: classes2.dex */
public interface b {

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};

        private a(String str, int i) {
        }

        private static int[] a() {
            return (int[]) d.clone();
        }
    }

    int a();

    void a(Map<String, String> map, Application application);

    void a(Map<String, String> map, Application application, r rVar);

    void a(Map<String, String> map, Context context);

    Map<String, String> b();

    void c();
}