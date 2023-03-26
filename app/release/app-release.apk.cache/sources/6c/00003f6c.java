package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import com.p7700g.p99005.fv;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DefaultEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class dv {

    /* compiled from: DefaultEmojiCompatConfig.java */
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class a {
        @x1
        private static final String a = "emoji2.text.DefaultEmojiConfig";
        @x1
        private static final String b = "androidx.content.action.LOAD_EMOJI_FONT";
        @x1
        private static final String c = "emojicompat-emoji-font";
        private final b d;

        @i2({i2.a.LIBRARY})
        public a(@z1 b bVar) {
            this.d = bVar == null ? e() : bVar;
        }

        @z1
        private fv.d a(@x1 Context context, @z1 rn rnVar) {
            if (rnVar == null) {
                return null;
            }
            return new kv(context, rnVar);
        }

        @x1
        private List<List<byte[]>> b(@x1 Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @x1
        private rn d(@x1 ProviderInfo providerInfo, @x1 PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new rn(str, str2, c, b(this.d.b(packageManager, str2)));
        }

        @x1
        private static b e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new d();
            }
            return new c();
        }

        private boolean f(@z1 ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @z1
        private ProviderInfo g(@x1 PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.d.c(packageManager, new Intent(b), 0)) {
                ProviderInfo a2 = this.d.a(resolveInfo);
                if (f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        @i2({i2.a.LIBRARY})
        @z1
        public fv.d c(@x1 Context context) {
            return a(context, h(context));
        }

        @i2({i2.a.LIBRARY})
        @r2
        @z1
        public rn h(@x1 Context context) {
            PackageManager packageManager = context.getPackageManager();
            jp.m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf(a, e);
                return null;
            }
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {
        @z1
        public ProviderInfo a(@x1 ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @x1
        public Signature[] b(@x1 PackageManager packageManager, @x1 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @x1
        public List<ResolveInfo> c(@x1 PackageManager packageManager, @x1 Intent intent, int i) {
            return Collections.emptyList();
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @e2(19)
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // com.p7700g.p99005.dv.b
        @z1
        public ProviderInfo a(@x1 ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // com.p7700g.p99005.dv.b
        @x1
        public List<ResolveInfo> c(@x1 PackageManager packageManager, @x1 Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @e2(28)
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // com.p7700g.p99005.dv.b
        @x1
        public Signature[] b(@x1 PackageManager packageManager, @x1 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    private dv() {
    }

    @z1
    public static kv a(@x1 Context context) {
        return (kv) new a(null).c(context);
    }
}