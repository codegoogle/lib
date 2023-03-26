package com.anythink.core.c;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.q;
import com.anythink.core.common.g.h;
import com.anythink.core.common.g.i;
import com.anythink.core.common.j.n;
import com.anythink.core.common.r;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {
    public static final String a = "e";
    private static e b;
    private Context c;
    private ConcurrentHashMap<String, d> d = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public interface a {
        void a(AdError adError);

        void a(d dVar);

        void b(d dVar);
    }

    private e(Context context) {
        this.c = context;
    }

    private void b() {
        this.d.clear();
    }

    public final List<q> c(String str) {
        List<q> z;
        if (this.d == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d.values());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (TextUtils.equals(String.valueOf(dVar.S()), str) && (z = dVar.z()) != null) {
                arrayList2.addAll(z);
            }
        }
        return arrayList2;
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (b == null) {
                synchronized (e.class) {
                    if (b == null) {
                        b = new e(context);
                    }
                }
            }
            eVar = b;
        }
        return eVar;
    }

    public final d b(String str) {
        String n = m.a().n();
        ConcurrentHashMap<String, d> concurrentHashMap = this.d;
        return concurrentHashMap.get(n + str);
    }

    public final void a() {
        Context context = this.c;
        if (context != null) {
            try {
                context.getSharedPreferences(g.B, 0).edit().clear().apply();
            } catch (Error | Exception unused) {
            }
        }
    }

    public final void a(Context context, String str, d dVar, String str2) {
        String n = m.a().n();
        if (n == null) {
            n = "";
        }
        synchronized (this) {
            ConcurrentHashMap<String, d> concurrentHashMap = this.d;
            concurrentHashMap.put(n + str, dVar);
        }
        if (dVar.c() == 1) {
            m.a().H();
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        n.a(context, g.o, wo1.u(n, str, "_PL_SY"), str2);
    }

    public final d a(String str) {
        String n = m.a().n();
        if (n == null) {
            n = "";
        }
        ConcurrentHashMap<String, d> concurrentHashMap = this.d;
        if (concurrentHashMap.containsKey(n + str)) {
            ConcurrentHashMap<String, d> concurrentHashMap2 = this.d;
            return concurrentHashMap2.get(n + str);
        }
        String b2 = n.b(this.c, g.o, wo1.u(n, str, "_PL_SY"), "");
        if (!TextUtils.isEmpty(b2)) {
            d b3 = d.b(b2);
            if (b3 != null) {
                ConcurrentHashMap<String, d> concurrentHashMap3 = this.d;
                concurrentHashMap3.put(n + str, b3);
            }
            return b3;
        }
        String str2 = a;
        com.anythink.core.common.j.e.a(str2, "no key[" + n + str + "]");
        return null;
    }

    public final void a(final d dVar, final String str, final String str2, final String str3, final a aVar) {
        m.a().a(new Runnable() { // from class: com.anythink.core.c.e.1
            @Override // java.lang.Runnable
            public final void run() {
                d dVar2 = dVar;
                String K = dVar2 != null ? dVar2.K() : null;
                Map<String, Object> b2 = m.a().b(str3);
                d dVar3 = dVar;
                if (dVar3 != null) {
                    if (!(!b2.equals(dVar3.H())) && !dVar.ar() && !r.a().c(e.this.c, str3)) {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(dVar);
                            return;
                        }
                        return;
                    }
                    String str4 = e.a;
                    com.anythink.core.common.j.e.a(str4, "Placement strategy expired。。。。");
                    final boolean[] zArr = new boolean[1];
                    long T = dVar.T();
                    final CountDownTimer countDownTimer = new CountDownTimer(T, T) { // from class: com.anythink.core.c.e.1.1
                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            com.anythink.core.common.j.e.b(e.a, "Timer onFinish，load AD by old strategy");
                            zArr[0] = true;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a aVar3 = aVar;
                            if (aVar3 != null) {
                                aVar3.a(dVar);
                            }
                        }

                        @Override // android.os.CountDownTimer
                        public final void onTick(long j) {
                        }
                    };
                    if (T == 0) {
                        zArr[0] = true;
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.a(dVar);
                        }
                    } else {
                        com.anythink.core.common.j.e.b(str4, "Update placement strategy，start timer");
                        countDownTimer.start();
                    }
                    new i(e.this.c, str, str2, str3, K, b2).a(0, new h() { // from class: com.anythink.core.c.e.1.2
                        @Override // com.anythink.core.common.g.h
                        public final void onLoadCanceled(int i) {
                            AnonymousClass1 anonymousClass1;
                            a aVar4;
                            if (zArr[0] || (aVar4 = aVar) == null) {
                                return;
                            }
                            aVar4.a(dVar);
                        }

                        @Override // com.anythink.core.common.g.h
                        public final void onLoadError(int i, String str5, AdError adError) {
                            AnonymousClass1 anonymousClass1;
                            a aVar4;
                            String str6 = e.a;
                            com.anythink.core.common.j.e.d(str6, "place laod f!:".concat(String.valueOf(str5)));
                            if (ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                                String str7 = str + str3 + str2;
                                com.anythink.core.common.j.e.d(str6, "code: " + adError.getPlatformCode() + "msg: " + adError.getPlatformMSG() + ", key -> " + str7);
                                n.a(e.this.c, g.B, str7, System.currentTimeMillis());
                            }
                            m.a().a(new Runnable() { // from class: com.anythink.core.c.e.1.2.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.anythink.core.common.j.e.b(e.a, "Update placement strategy success，cancel timer");
                                    CountDownTimer countDownTimer2 = countDownTimer;
                                    if (countDownTimer2 != null) {
                                        countDownTimer2.cancel();
                                    }
                                }
                            });
                            if (zArr[0] || (aVar4 = aVar) == null) {
                                return;
                            }
                            aVar4.a(dVar);
                        }

                        @Override // com.anythink.core.common.g.h
                        public final void onLoadFinish(int i, Object obj) {
                            String str5 = (String) obj;
                            try {
                                JSONObject jSONObject = new JSONObject(str5);
                                jSONObject.put("updateTime", System.currentTimeMillis());
                                str5 = jSONObject.toString();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            d b3 = d.b(str5);
                            if (b3 != null) {
                                e eVar = e.this;
                                Context context = eVar.c;
                                String str6 = str3;
                                if (b3.U() != 1) {
                                    str5 = "";
                                }
                                eVar.a(context, str6, b3, str5);
                                if (b3.I() == 1) {
                                    r.a().a(e.this.c, str3);
                                }
                            }
                            m.a().a(new Runnable() { // from class: com.anythink.core.c.e.1.2.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.anythink.core.common.j.e.b(e.a, "Update placement strategy success，cancel timer");
                                    CountDownTimer countDownTimer2 = countDownTimer;
                                    if (countDownTimer2 != null) {
                                        countDownTimer2.cancel();
                                    }
                                }
                            });
                            if (zArr[0]) {
                                a aVar4 = aVar;
                                if (aVar4 == null || b3 == null) {
                                    return;
                                }
                                aVar4.b(b3);
                            } else if (b3 != null) {
                                a aVar5 = aVar;
                                if (aVar5 != null) {
                                    aVar5.a(b3);
                                }
                            } else {
                                a aVar6 = aVar;
                                if (aVar6 != null) {
                                    aVar6.a(ErrorCode.getErrorCode("3001", "", "Placement Service error."));
                                }
                            }
                        }

                        @Override // com.anythink.core.common.g.h
                        public final void onLoadStart(int i) {
                        }
                    });
                    return;
                }
                new i(e.this.c, str, str2, str3, K, b2).a(0, new h() { // from class: com.anythink.core.c.e.1.3
                    @Override // com.anythink.core.common.g.h
                    public final void onLoadCanceled(int i) {
                        a aVar4 = aVar;
                        if (aVar4 != null) {
                            aVar4.a(ErrorCode.getErrorCode(ErrorCode.exception, "", "by canceled"));
                        }
                    }

                    @Override // com.anythink.core.common.g.h
                    public final void onLoadError(int i, String str5, AdError adError) {
                        String str6 = e.a;
                        com.anythink.core.common.j.e.d(str6, "place laod f!:".concat(String.valueOf(str5)));
                        if (ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                            String str7 = str + str3 + str2;
                            com.anythink.core.common.j.e.d(str6, "code: " + adError.getPlatformCode() + "msg: " + adError.getPlatformMSG() + ", key -> " + str7);
                            n.a(e.this.c, g.B, str7, System.currentTimeMillis());
                            if (m.a().y()) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                String str8 = str;
                                String str9 = str2;
                                String str10 = str3;
                            }
                        }
                        a aVar4 = aVar;
                        if (aVar4 != null) {
                            aVar4.a(adError);
                        }
                    }

                    @Override // com.anythink.core.common.g.h
                    public final void onLoadFinish(int i, Object obj) {
                        String str5 = (String) obj;
                        try {
                            JSONObject jSONObject = new JSONObject(str5);
                            jSONObject.put("updateTime", System.currentTimeMillis());
                            str5 = jSONObject.toString();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        d b3 = d.b(str5);
                        if (b3 != null) {
                            e eVar = e.this;
                            Context context = eVar.c;
                            String str6 = str3;
                            if (b3.U() != 1) {
                                str5 = "";
                            }
                            eVar.a(context, str6, b3, str5);
                            if (b3.I() == 1) {
                                r.a().a(e.this.c, str3);
                            }
                            a aVar4 = aVar;
                            if (aVar4 != null) {
                                aVar4.a(b3);
                                return;
                            }
                            return;
                        }
                        a aVar5 = aVar;
                        if (aVar5 != null) {
                            aVar5.a(ErrorCode.getErrorCode("3001", "", "Placement Service error."));
                        }
                    }

                    @Override // com.anythink.core.common.g.h
                    public final void onLoadStart(int i) {
                    }
                });
            }
        });
    }
}