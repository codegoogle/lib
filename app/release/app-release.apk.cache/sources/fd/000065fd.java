package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.zp5;
import java.io.File;
import java.io.IOException;

/* compiled from: CacheManager.java */
/* loaded from: classes3.dex */
public class xp5 {
    public static String a = "xp5";

    /* compiled from: CacheManager.java */
    /* loaded from: classes3.dex */
    public static class a implements zp5.c {
        public final /* synthetic */ b a;

        public a(final b val$listener) {
            this.a = val$listener;
        }

        @Override // com.p7700g.p99005.zp5.c
        public void a() {
            String str = xp5.a;
            this.a.a();
        }

        @Override // com.p7700g.p99005.zp5.c
        public void b(Throwable t) {
            String str = xp5.a;
            this.a.b(t);
        }
    }

    /* compiled from: CacheManager.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void b(Throwable t);
    }

    public static File a(Context context, String url) {
        File file = new File(context.getCacheDir(), String.valueOf(url.hashCode()));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public static boolean b(Context context, String url) {
        return a(context, url) != null;
    }

    public static void c(Context context, String url, b listener) {
        File file = new File(context.getCacheDir(), String.valueOf(url.hashCode()));
        a aVar = new a(listener);
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
            zp5.c(url, file, aVar);
        } catch (IOException e) {
            e.printStackTrace();
            listener.b(e);
            if (file.exists()) {
                file.delete();
            }
        }
    }
}