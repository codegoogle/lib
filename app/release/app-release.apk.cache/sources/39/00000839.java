package com.anythink.expressad.foundation.g.f.g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.k21;
import java.util.Locale;

/* loaded from: classes2.dex */
public class b {
    private static final String a = "b";
    private static b b;
    private static ConnectivityManager c;
    private static com.anythink.expressad.foundation.g.f.c.a d;

    private static synchronized b a(Context context) {
        b bVar;
        NetworkInfo activeNetworkInfo;
        String lowerCase;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
                if (context != null) {
                    c = (ConnectivityManager) context.getSystemService("connectivity");
                }
                d = new com.anythink.expressad.foundation.g.f.c.a();
                try {
                    ConnectivityManager connectivityManager = c;
                    if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                        String typeName = activeNetworkInfo.getTypeName();
                        Locale locale = Locale.US;
                        if (k21.b.equals(typeName.toLowerCase(locale))) {
                            com.anythink.expressad.foundation.g.f.c.a aVar = d;
                            aVar.e = k21.b;
                            aVar.d = false;
                        } else {
                            if (activeNetworkInfo.getExtraInfo() != null && (lowerCase = activeNetworkInfo.getExtraInfo().toLowerCase(locale)) != null) {
                                if (!lowerCase.startsWith("cmwap") && !lowerCase.startsWith("uniwap") && !lowerCase.startsWith("3gwap")) {
                                    if (lowerCase.startsWith("ctwap")) {
                                        com.anythink.expressad.foundation.g.f.c.a aVar2 = d;
                                        aVar2.d = true;
                                        aVar2.a = lowerCase;
                                        aVar2.b = "10.0.0.200";
                                        aVar2.c = "80";
                                    } else if (lowerCase.startsWith("cmnet") || lowerCase.startsWith("uninet") || lowerCase.startsWith("ctnet") || lowerCase.startsWith("3gnet")) {
                                        com.anythink.expressad.foundation.g.f.c.a aVar3 = d;
                                        aVar3.d = false;
                                        aVar3.a = lowerCase;
                                    }
                                    com.anythink.expressad.foundation.g.f.c.a aVar4 = d;
                                    aVar4.e = aVar4.a;
                                }
                                com.anythink.expressad.foundation.g.f.c.a aVar5 = d;
                                aVar5.d = true;
                                aVar5.a = lowerCase;
                                aVar5.b = "10.0.0.172";
                                aVar5.c = "80";
                                com.anythink.expressad.foundation.g.f.c.a aVar42 = d;
                                aVar42.e = aVar42.a;
                            }
                            String defaultHost = Proxy.getDefaultHost();
                            int defaultPort = Proxy.getDefaultPort();
                            if (defaultHost != null && defaultHost.length() > 0) {
                                d.b = defaultHost;
                                if ("10.0.0.172".equals(defaultHost.trim())) {
                                    com.anythink.expressad.foundation.g.f.c.a aVar6 = d;
                                    aVar6.d = true;
                                    aVar6.c = "80";
                                } else if ("10.0.0.200".equals(d.b.trim())) {
                                    com.anythink.expressad.foundation.g.f.c.a aVar7 = d;
                                    aVar7.d = true;
                                    aVar7.c = "80";
                                } else {
                                    com.anythink.expressad.foundation.g.f.c.a aVar8 = d;
                                    aVar8.d = false;
                                    aVar8.c = Integer.toString(defaultPort);
                                }
                            } else {
                                d.d = false;
                            }
                            com.anythink.expressad.foundation.g.f.c.a aVar422 = d;
                            aVar422.e = aVar422.a;
                        }
                    }
                } catch (Exception e) {
                    n.d(a, e.getMessage());
                }
            }
            bVar = b;
        }
        return bVar;
    }

    private static com.anythink.expressad.foundation.g.f.c.a b() {
        return d;
    }

    private static void a() {
        NetworkInfo activeNetworkInfo;
        String lowerCase;
        try {
            ConnectivityManager connectivityManager = c;
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return;
            }
            String typeName = activeNetworkInfo.getTypeName();
            Locale locale = Locale.US;
            if (k21.b.equals(typeName.toLowerCase(locale))) {
                com.anythink.expressad.foundation.g.f.c.a aVar = d;
                aVar.e = k21.b;
                aVar.d = false;
                return;
            }
            if (activeNetworkInfo.getExtraInfo() != null && (lowerCase = activeNetworkInfo.getExtraInfo().toLowerCase(locale)) != null) {
                if (!lowerCase.startsWith("cmwap") && !lowerCase.startsWith("uniwap") && !lowerCase.startsWith("3gwap")) {
                    if (lowerCase.startsWith("ctwap")) {
                        com.anythink.expressad.foundation.g.f.c.a aVar2 = d;
                        aVar2.d = true;
                        aVar2.a = lowerCase;
                        aVar2.b = "10.0.0.200";
                        aVar2.c = "80";
                    } else if (lowerCase.startsWith("cmnet") || lowerCase.startsWith("uninet") || lowerCase.startsWith("ctnet") || lowerCase.startsWith("3gnet")) {
                        com.anythink.expressad.foundation.g.f.c.a aVar3 = d;
                        aVar3.d = false;
                        aVar3.a = lowerCase;
                    }
                    com.anythink.expressad.foundation.g.f.c.a aVar4 = d;
                    aVar4.e = aVar4.a;
                }
                com.anythink.expressad.foundation.g.f.c.a aVar5 = d;
                aVar5.d = true;
                aVar5.a = lowerCase;
                aVar5.b = "10.0.0.172";
                aVar5.c = "80";
                com.anythink.expressad.foundation.g.f.c.a aVar42 = d;
                aVar42.e = aVar42.a;
            }
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost != null && defaultHost.length() > 0) {
                d.b = defaultHost;
                if ("10.0.0.172".equals(defaultHost.trim())) {
                    com.anythink.expressad.foundation.g.f.c.a aVar6 = d;
                    aVar6.d = true;
                    aVar6.c = "80";
                } else if ("10.0.0.200".equals(d.b.trim())) {
                    com.anythink.expressad.foundation.g.f.c.a aVar7 = d;
                    aVar7.d = true;
                    aVar7.c = "80";
                } else {
                    com.anythink.expressad.foundation.g.f.c.a aVar8 = d;
                    aVar8.d = false;
                    aVar8.c = Integer.toString(defaultPort);
                }
            } else {
                d.d = false;
            }
            com.anythink.expressad.foundation.g.f.c.a aVar422 = d;
            aVar422.e = aVar422.a;
        } catch (Exception e) {
            n.d(a, e.getMessage());
        }
    }

    private static void a(NetworkInfo networkInfo) {
        String lowerCase;
        if (networkInfo.getExtraInfo() != null && (lowerCase = networkInfo.getExtraInfo().toLowerCase(Locale.US)) != null) {
            if (!lowerCase.startsWith("cmwap") && !lowerCase.startsWith("uniwap") && !lowerCase.startsWith("3gwap")) {
                if (lowerCase.startsWith("ctwap")) {
                    com.anythink.expressad.foundation.g.f.c.a aVar = d;
                    aVar.d = true;
                    aVar.a = lowerCase;
                    aVar.b = "10.0.0.200";
                    aVar.c = "80";
                    return;
                } else if (lowerCase.startsWith("cmnet") || lowerCase.startsWith("uninet") || lowerCase.startsWith("ctnet") || lowerCase.startsWith("3gnet")) {
                    com.anythink.expressad.foundation.g.f.c.a aVar2 = d;
                    aVar2.d = false;
                    aVar2.a = lowerCase;
                    return;
                }
            } else {
                com.anythink.expressad.foundation.g.f.c.a aVar3 = d;
                aVar3.d = true;
                aVar3.a = lowerCase;
                aVar3.b = "10.0.0.172";
                aVar3.c = "80";
                return;
            }
        }
        String defaultHost = Proxy.getDefaultHost();
        int defaultPort = Proxy.getDefaultPort();
        if (defaultHost != null && defaultHost.length() > 0) {
            d.b = defaultHost;
            if ("10.0.0.172".equals(defaultHost.trim())) {
                com.anythink.expressad.foundation.g.f.c.a aVar4 = d;
                aVar4.d = true;
                aVar4.c = "80";
                return;
            } else if ("10.0.0.200".equals(d.b.trim())) {
                com.anythink.expressad.foundation.g.f.c.a aVar5 = d;
                aVar5.d = true;
                aVar5.c = "80";
                return;
            } else {
                com.anythink.expressad.foundation.g.f.c.a aVar6 = d;
                aVar6.d = false;
                aVar6.c = Integer.toString(defaultPort);
                return;
            }
        }
        d.d = false;
    }
}