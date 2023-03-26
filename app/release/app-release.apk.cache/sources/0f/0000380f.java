package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.p7700g.p99005.x10;

/* compiled from: MediaSessionManagerImplBase.java */
/* loaded from: classes.dex */
public class a20 implements x10.a {
    private static final String a = "MediaSessionManager";
    private static final boolean b = x10.b;
    private static final String c = "android.permission.STATUS_BAR_SERVICE";
    private static final String d = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final String e = "enabled_notification_listeners";
    public Context f;
    public ContentResolver g;

    /* compiled from: MediaSessionManagerImplBase.java */
    /* loaded from: classes.dex */
    public static class a implements x10.c {
        private String a;
        private int b;
        private int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // com.p7700g.p99005.x10.c
        public int a() {
            return this.c;
        }

        @Override // com.p7700g.p99005.x10.c
        public int b() {
            return this.b;
        }

        @Override // com.p7700g.p99005.x10.c
        public String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return ep.b(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
        }
    }

    public a20(Context context) {
        this.f = context;
        this.g = context.getContentResolver();
    }

    private boolean c(x10.c cVar, String str) {
        return cVar.b() < 0 ? this.f.getPackageManager().checkPermission(str, cVar.e()) == 0 : this.f.checkPermission(str, cVar.b(), cVar.a()) == 0;
    }

    @Override // com.p7700g.p99005.x10.a
    public boolean a(@x1 x10.c cVar) {
        try {
            if (this.f.getPackageManager().getApplicationInfo(cVar.e(), 0).uid == cVar.a()) {
                return c(cVar, c) || c(cVar, d) || cVar.a() == 1000 || b(cVar);
            }
            if (b) {
                cVar.e();
                cVar.a();
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            if (b) {
                cVar.e();
            }
            return false;
        }
    }

    public boolean b(@x1 x10.c cVar) {
        String string = Settings.Secure.getString(this.g, e);
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(cVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.x10.a
    public Context getContext() {
        return this.f;
    }
}