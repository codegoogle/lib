package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {
    public long a;
    public int b;
    public int c;
    public b d = b.NONE;
    private String e;
    private String f;
    private com.ironsource.sdk.k.b g;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] s = {1, 2, 3};

        public static int[] a() {
            return (int[]) s.clone();
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        
        public int t;

        b(int i) {
            this.t = i;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends JSONObject {
        public c() {
            putOpt("controllerSourceStrategy", Integer.valueOf(f.this.b));
            putOpt("controllerSourceCode", Integer.valueOf(f.this.d.t));
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.a().length];
            a = iArr;
            try {
                int i = a.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                int i2 = a.b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                int i3 = a.c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(JSONObject jSONObject, String str, String str2, com.ironsource.sdk.k.b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.b = optInt;
        this.c = optInt != 1 ? optInt != 2 ? a.a : a.c : a.b;
        this.e = str;
        this.f = str2;
        this.g = bVar;
    }

    private void b(com.ironsource.sdk.h.c cVar) {
        if (this.g.b()) {
            return;
        }
        this.g.a(cVar, this.f);
    }

    private com.ironsource.sdk.h.c i() {
        return new com.ironsource.sdk.h.c(this.e, "next_mobileController.html");
    }

    private com.ironsource.sdk.h.c j() {
        return new com.ironsource.sdk.h.c(this.e, "fallback_mobileController.html");
    }

    private void k() {
        try {
            com.ironsource.sdk.h.c f = f();
            if (f.exists()) {
                com.ironsource.sdk.h.c j = j();
                if (j.exists()) {
                    j.delete();
                }
                IronSourceStorageUtils.renameFile(f.getPath(), j.getPath());
            }
        } catch (Exception unused) {
        }
    }

    public void a(b bVar) {
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(this.b)).a("controllersource", Integer.valueOf(bVar.t));
        if (this.a > 0) {
            a2.a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.a));
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.s, a2.a);
    }

    public final boolean c() {
        return this.d != b.NONE;
    }

    public final boolean d() {
        com.ironsource.sdk.h.c cVar;
        int i = d.a[this.c - 1];
        if (i == 1) {
            IronSourceStorageUtils.deleteFile(f());
            cVar = new com.ironsource.sdk.h.c(this.e, SDKUtils.getFileName(this.f));
        } else if (i != 2) {
            if (i == 3) {
                try {
                    com.ironsource.sdk.h.c f = f();
                    com.ironsource.sdk.h.c i2 = i();
                    if (!i2.exists() && !f.exists()) {
                        b(new com.ironsource.sdk.h.c(this.e, SDKUtils.getFileName(this.f)));
                        return false;
                    } else if (!i2.exists() && f.exists()) {
                        b bVar = b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.d = bVar;
                        a(bVar);
                        b(new com.ironsource.sdk.h.c(this.e, i2.getName()));
                        return true;
                    } else {
                        k();
                        if (IronSourceStorageUtils.renameFile(i().getPath(), f().getPath())) {
                            b bVar2 = b.PREPARED_CONTROLLER_LOADED;
                            this.d = bVar2;
                            a(bVar2);
                            e();
                            b(new com.ironsource.sdk.h.c(this.e, i2.getName()));
                            return true;
                        } else if (g()) {
                            b bVar3 = b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.d = bVar3;
                            a(bVar3);
                            b(new com.ironsource.sdk.h.c(this.e, i2.getName()));
                            return true;
                        } else {
                            b(new com.ironsource.sdk.h.c(this.e, SDKUtils.getFileName(this.f)));
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            k();
            cVar = new com.ironsource.sdk.h.c(this.e, SDKUtils.getFileName(this.f));
        }
        b(cVar);
        return false;
    }

    public void e() {
        IronSourceStorageUtils.deleteFile(j());
    }

    public final com.ironsource.sdk.h.c f() {
        return new com.ironsource.sdk.h.c(this.e, "mobileController.html");
    }

    public boolean g() {
        try {
            if (j().exists()) {
                return IronSourceStorageUtils.renameFile(j().getPath(), f().getPath());
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final JSONObject h() {
        return new c();
    }
}