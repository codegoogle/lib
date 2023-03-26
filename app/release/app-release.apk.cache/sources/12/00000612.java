package com.anythink.core.common.b;

import android.content.Context;
import android.content.Intent;
import com.anythink.core.activity.AnyThinkGdprAuthActivity;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.api.AdError;
import com.anythink.core.api.NetTrafficeCallback;
import com.anythink.core.common.b.g;
import com.p7700g.p99005.wo1;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o {
    private static o d;
    public Context b;
    public int c;
    public final int a = -100;
    private ConcurrentHashMap<Integer, Boolean> e = new ConcurrentHashMap<>(5);

    private o(Context context) {
        this.c = 2;
        if (context != null) {
            this.b = context.getApplicationContext();
        }
        this.c = com.anythink.core.common.j.n.b(this.b, g.o, g.o.d, 2);
    }

    public final boolean b() {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(this.b));
        if (l0 == null || l0.y()) {
            return this.c != 1;
        } else if (l0.O() == 0) {
            return true;
        } else {
            int i = this.c;
            if (l0.M() == 1) {
                i = l0.L();
            }
            return i == 0;
        }
    }

    public final boolean c() {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(this.b));
        return (l0 == null || l0.y()) ? this.c != 1 : this.c == 2 ? l0.O() == 0 : l0.M() == 1 ? l0.L() == 0 : this.c == 0 || l0.O() == 0;
    }

    public final boolean d() {
        return com.anythink.core.common.j.n.b(this.b, g.o, g.o.j, -100) == 1;
    }

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (o.class) {
            if (d == null) {
                d = new o(context);
            }
            oVar = d;
        }
        return oVar;
    }

    public final void a(int i) {
        this.c = i;
        com.anythink.core.common.j.n.a(this.b, g.o, g.o.d, i);
    }

    public final int a() {
        return this.c;
    }

    public final void a(final Context context, final ATGDPRAuthCallback aTGDPRAuthCallback) {
        m.a().a(new Runnable() { // from class: com.anythink.core.common.b.o.1
            @Override // java.lang.Runnable
            public final void run() {
                AnyThinkGdprAuthActivity.mCallback = aTGDPRAuthCallback;
                Intent intent = new Intent(context, AnyThinkGdprAuthActivity.class);
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
        });
    }

    public final void b(final int i) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.o.3
            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.c(i)) {
                    return;
                }
                o a = o.a(m.a().e());
                com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(m.a().e()));
                if (a.c == 2 && l0.O() == 1 && l0.A() == 0) {
                    com.anythink.core.common.i.c.a(1, a.c, l0.O(), i);
                }
                if (a.c == 1 && l0.M() == 0 && l0.O() == 0) {
                    com.anythink.core.common.i.c.a(2, a.c, l0.O(), i);
                }
                o.this.e.put(Integer.valueOf(i), Boolean.TRUE);
            }
        });
    }

    public final void a(final NetTrafficeCallback netTrafficeCallback) {
        int b = com.anythink.core.common.j.n.b(this.b, g.o, g.o.j, -100);
        if (b == -100) {
            new com.anythink.core.common.g.g().a(0, new com.anythink.core.common.g.h() { // from class: com.anythink.core.common.b.o.2
                @Override // com.anythink.core.common.g.h
                public final void onLoadCanceled(int i) {
                }

                @Override // com.anythink.core.common.g.h
                public final void onLoadError(int i, String str, AdError adError) {
                    NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                    if (netTrafficeCallback2 != null) {
                        netTrafficeCallback2.onErrorCallback(adError.printStackTrace());
                    }
                }

                @Override // com.anythink.core.common.g.h
                public final void onLoadFinish(int i, Object obj) {
                    try {
                        if (obj == null) {
                            NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                            if (netTrafficeCallback2 != null) {
                                netTrafficeCallback2.onErrorCallback("There is no result.");
                            }
                        } else if (!((JSONObject) obj).has("is_eu")) {
                            NetTrafficeCallback netTrafficeCallback3 = netTrafficeCallback;
                            if (netTrafficeCallback3 != null) {
                                netTrafficeCallback3.onErrorCallback("There is no result.");
                            }
                        } else if (((JSONObject) obj).optInt("is_eu") == 1) {
                            NetTrafficeCallback netTrafficeCallback4 = netTrafficeCallback;
                            if (netTrafficeCallback4 != null) {
                                netTrafficeCallback4.onResultCallback(true);
                            }
                        } else {
                            NetTrafficeCallback netTrafficeCallback5 = netTrafficeCallback;
                            if (netTrafficeCallback5 != null) {
                                netTrafficeCallback5.onResultCallback(false);
                            }
                        }
                    } catch (Throwable unused) {
                        NetTrafficeCallback netTrafficeCallback6 = netTrafficeCallback;
                        if (netTrafficeCallback6 != null) {
                            netTrafficeCallback6.onErrorCallback("Internal error");
                        }
                    }
                }

                @Override // com.anythink.core.common.g.h
                public final void onLoadStart(int i) {
                }
            });
        } else if (b == 1) {
            if (netTrafficeCallback != null) {
                netTrafficeCallback.onResultCallback(true);
            }
        } else if (netTrafficeCallback != null) {
            netTrafficeCallback.onResultCallback(false);
        }
    }

    public final boolean c(int i) {
        return this.e.get(Integer.valueOf(i)) != null && this.e.get(Integer.valueOf(i)).booleanValue();
    }
}