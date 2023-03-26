package com.anythink.core.common.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATDetectionResultCallback;
import com.anythink.detection.ATDetection;
import com.anythink.detection.Models;
import com.anythink.detection.RyInterface;
import com.p7700g.p99005.wo1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i {
    private static i c;
    public ATDetectionResultCallback a;
    private Boolean d;
    private String e;
    private Object h;
    private String i;
    private final String b = i.class.getSimpleName();
    private Boolean f = null;
    private boolean g = false;

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        try {
            com.anythink.core.c.a b = com.anythink.core.c.b.a(m.a().e()).b(m.a().n());
            if (b == null) {
                return;
            }
            String e = b.e();
            String f = b.f();
            String l = m.a().l();
            if (d() && !TextUtils.isEmpty(l)) {
                l.length();
            }
            if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(f)) {
                this.f = Boolean.TRUE;
                a(m.a().e(), l, e, f);
                if (this.g) {
                    this.i = l;
                    Models.cc();
                    return;
                }
                a("", "Detection SDK init fail, please check whether the string of Channel meets the requirements.");
                return;
            }
            if (d()) {
                com.anythink.core.common.j.e.d("anythink_detection", "Account does not have permission to use or missing Detection SDK.");
            }
        } catch (Throwable unused) {
            a("", "Missing Detection SDK.");
        }
    }

    private boolean d() {
        if (this.d == null) {
            try {
                ATDetection.getInstance();
                this.d = Boolean.TRUE;
            } catch (Throwable unused) {
                this.d = Boolean.FALSE;
            }
        }
        return this.d.booleanValue();
    }

    public final void b() {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.i.1
            @Override // java.lang.Runnable
            public final void run() {
                i.this.c();
            }
        });
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (c == null) {
                c = new i();
            }
            iVar = c;
        }
        return iVar;
    }

    private static boolean b(com.anythink.core.c.a aVar) {
        if (aVar == null) {
            return false;
        }
        return (TextUtils.isEmpty(aVar.e()) || TextUtils.isEmpty(aVar.f())) ? false : true;
    }

    private synchronized void a(Context context, String str, String str2, String str3) {
        if (!this.g) {
            if (this.h == null) {
                this.h = new RyInterface() { // from class: com.anythink.core.common.b.i.2
                    public final void callback(String str4) {
                        i.this.e = str4;
                        com.anythink.core.common.i.c.b();
                        i.this.a(str4, (String) null);
                    }
                };
            }
            this.g = ATDetection.getInstance().init(context, str, str2, str3, (RyInterface) this.h);
        }
    }

    private boolean b(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 12) {
            if (TextUtils.equals(this.i, str)) {
                return false;
            }
            this.i = str;
            this.g = false;
            return true;
        }
        com.anythink.core.common.j.e.d("anythink_detection", "The Channel used by Detection SDK must be within 12 characters and shouludn't be empty.");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x000d, B:11:0x0013, B:13:0x001a, B:16:0x0023, B:18:0x002b, B:21:0x003a, B:19:0x0031, B:24:0x003f), top: B:30:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(String str) {
        if (d()) {
            Boolean bool = this.f;
            if (bool != null && bool.booleanValue()) {
                boolean z = false;
                if (!TextUtils.isEmpty(str) && str.length() <= 12) {
                    if (!TextUtils.equals(this.i, str)) {
                        this.i = str;
                        this.g = false;
                        z = true;
                    }
                    if (z) {
                        b();
                    }
                    return;
                }
                com.anythink.core.common.j.e.d("anythink_detection", "The Channel used by Detection SDK must be within 12 characters and shouludn't be empty.");
                if (z) {
                }
                return;
            }
            this.i = str;
        }
    }

    public final String a(com.anythink.core.c.a aVar) {
        if (b(aVar)) {
            if (TextUtils.isEmpty(this.e)) {
                try {
                    a(m.a().e(), this.i, aVar.e(), aVar.f());
                    this.e = ATDetection.getInstance().r1();
                } catch (Throwable unused) {
                    this.e = "";
                }
            }
            return this.e;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ATDetectionResultCallback aTDetectionResultCallback = this.a;
            if (aTDetectionResultCallback != null) {
                if (str2 == null) {
                    str2 = "";
                }
                aTDetectionResultCallback.onError(str2);
                return;
            }
            return;
        }
        ATDetectionResultCallback aTDetectionResultCallback2 = this.a;
        if (aTDetectionResultCallback2 != null) {
            aTDetectionResultCallback2.onSucess(str);
        }
    }

    public final void a(ATDetectionResultCallback aTDetectionResultCallback) {
        this.a = aTDetectionResultCallback;
    }

    public final void a(int i, com.anythink.core.common.e.e eVar) {
        if (eVar == null) {
            return;
        }
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(m.a().e()));
        if (b(l0) && d()) {
            a(m.a().e(), this.i, l0.e(), l0.f());
            if (this.g) {
                String str = "";
                try {
                    Map<String, Object> k = m.a().k();
                    if (k != null) {
                        str = k.get("user_id").toString();
                    }
                } catch (Throwable unused) {
                }
                try {
                    if (i == 4) {
                        Models.event_adevent(str, eVar.S(), 2);
                    } else if (i == 6) {
                        Models.event_adevent(str, eVar.S(), 3);
                    } else if (i == 9) {
                        Models.event_adevent(str, eVar.S(), 4);
                    } else if (i != 10) {
                    } else {
                        Models.event_adevent(str, eVar.S(), 1);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }
}