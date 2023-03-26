package com.anythink.core.common;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q {
    public static final String a = "q";
    private static q b;
    private Context c;

    private q(Context context) {
        this.c = context.getApplicationContext();
    }

    public static synchronized q a(Context context) {
        q qVar;
        synchronized (q.class) {
            if (b == null) {
                synchronized (q.class) {
                    if (b == null) {
                        b = new q(context);
                    }
                }
            }
            qVar = b;
        }
        return qVar;
    }

    public final void a(final int i, final com.anythink.core.common.e.f fVar, final com.anythink.core.c.a aVar) {
        try {
            com.anythink.core.common.b.m.a();
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.q.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(fVar.b.S()) == null) {
                            return;
                        }
                        String w = ((com.anythink.core.common.e.e) fVar.b).w();
                        if (TextUtils.isEmpty(w)) {
                            return;
                        }
                        String str = null;
                        int i2 = i;
                        if (i2 == 4) {
                            r3 = ((com.anythink.core.common.e.e) fVar.b).s() == 1;
                            str = aVar.E().get("show");
                        } else if (i2 != 6) {
                            switch (i2) {
                                case 18:
                                case 19:
                                case 20:
                                    r3 = ((com.anythink.core.common.e.e) fVar.b).a() == 1;
                                    str = aVar.E().get("dl");
                                    break;
                            }
                        } else {
                            r3 = ((com.anythink.core.common.e.e) fVar.b).t() == 1;
                            str = aVar.E().get(com.anythink.expressad.foundation.d.c.bY);
                        }
                        if (!r3 || TextUtils.isEmpty(str)) {
                            return;
                        }
                        JSONObject a2 = com.anythink.core.common.j.l.a();
                        String str2 = q.a;
                        com.anythink.core.common.j.e.a(str2, "common -> " + a2.toString());
                        com.anythink.core.common.j.e.a(str2, "data -> " + fVar.a().toString());
                        q.a(q.this, i, str, a2.toString(), fVar.a().toString(), w, (com.anythink.core.common.e.e) fVar.b);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void a(final com.anythink.core.c.a aVar) {
        com.anythink.core.common.b.m.a();
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.q.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (q.this.c == null) {
                        return;
                    }
                    String packageName = q.this.c.getPackageName();
                    String str = "";
                    for (int i = 0; i < 2; i++) {
                        str = str + packageName;
                    }
                    String c = com.anythink.core.common.j.f.c(str);
                    Intent intent = new Intent(c);
                    intent.putExtra(c, aVar.z());
                    intent.putExtra("data", com.anythink.core.common.j.l.a().toString());
                    intent.putExtra("denied", com.anythink.core.common.b.m.a().d());
                    intent.putExtra("area", com.anythink.core.common.b.m.a().D());
                    intent.setPackage(packageName);
                    com.anythink.core.common.b.k.a(q.this.c).a(intent);
                } catch (Throwable unused) {
                }
            }
        }, 1000L);
    }

    private void a(int i, String str, String str2, String str3, String str4, com.anythink.core.common.e.e eVar) {
        if (this.c == null) {
            return;
        }
        try {
            Intent intent = new Intent(str);
            intent.putExtra(com.anythink.core.common.g.c.W, str2);
            intent.putExtra("data", str3);
            intent.putExtra("adsourceId", str4);
            intent.putExtra("networkType", String.valueOf(eVar.G()));
            intent.putExtra("format", eVar.U());
            intent.putExtra("showid", eVar.k());
            intent.putExtra("tktype", i);
            intent.setPackage(this.c.getPackageName());
            com.anythink.core.common.b.k.a(this.c).a(intent);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void a(q qVar, int i, String str, String str2, String str3, String str4, com.anythink.core.common.e.e eVar) {
        if (qVar.c != null) {
            try {
                Intent intent = new Intent(str);
                intent.putExtra(com.anythink.core.common.g.c.W, str2);
                intent.putExtra("data", str3);
                intent.putExtra("adsourceId", str4);
                intent.putExtra("networkType", String.valueOf(eVar.G()));
                intent.putExtra("format", eVar.U());
                intent.putExtra("showid", eVar.k());
                intent.putExtra("tktype", i);
                intent.setPackage(qVar.c.getPackageName());
                com.anythink.core.common.b.k.a(qVar.c).a(intent);
            } catch (Throwable unused) {
            }
        }
    }
}