package com.ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.g;
import com.p7700g.p99005.wo1;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class ServerURL {
    private static final String A = "icc";
    private static final String B = "mCar";
    private static final String C = "tz";
    private static final String D = "tzOff";
    private static final String E = "rvManual";
    private static final String F = "android";
    private static final String G = "impression";
    private static final String H = "placementId";
    private static final String I = "=";
    private static final String J = "&";
    private static String a = "https://init.supersonicads.com/sdk/v";
    private static String b = "?request=";
    private static final String c = "platform";
    private static final String d = "applicationKey";
    private static final String e = "applicationUserId";
    private static final String f = "sdkVersion";
    private static final String g = "pluginType";
    private static final String h = "pluginVersion";
    private static final String i = "plugin_fw_v";
    private static final String j = "advId";
    private static final String k = "auid";
    private static final String l = "isDemandOnly";
    private static final String m = "serr";
    private static final String n = "appVer";
    private static final String o = "osVer";
    private static final String p = "devModel";
    private static final String q = "devMake";
    private static final String r = "connType";
    private static final String s = "mt";
    private static final String t = "fs";
    private static final String u = "coppa";
    private static final String v = "browserUserAgent";
    private static final String w = "deviceLang";
    private static final String x = "bundleId";
    private static final String y = "mcc";
    private static final String z = "mnc";

    private static String a(Vector<Pair<String, String>> vector) {
        Iterator<Pair<String, String>> it = vector.iterator();
        String str = "";
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            if (str.length() > 0) {
                str = wo1.t(str, J);
            }
            StringBuilder G2 = wo1.G(str);
            G2.append((String) next.first);
            G2.append("=");
            G2.append(URLEncoder.encode((String) next.second, "UTF-8"));
            str = G2.toString();
        }
        return str;
    }

    private static String b(String str) {
        return a + str + b;
    }

    private static void c(String str) {
        a = str;
    }

    public static String getCPVProvidersURL(Context context, String str, String str2, String str3, String str4, boolean z2, Vector<Pair<String, String>> vector, boolean z3) {
        Vector vector2 = new Vector();
        vector2.add(new Pair("platform", "android"));
        vector2.add(new Pair(d, str));
        vector2.add(new Pair(e, str2));
        vector2.add(new Pair(f, IronSourceUtils.getSDKVersion()));
        if (z2) {
            vector2.add(new Pair(E, z2 ? "1" : "0"));
        }
        if (IronSourceUtils.getSerr() == 0) {
            vector2.add(new Pair(m, String.valueOf(IronSourceUtils.getSerr())));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            vector2.add(new Pair(g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            vector2.add(new Pair(h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            vector2.add(new Pair(i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            vector2.add(new Pair(j, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            vector2.add(new Pair(s, str4));
        }
        String c2 = c.c(context, context.getPackageName());
        if (!TextUtils.isEmpty(c2)) {
            vector2.add(new Pair(n, c2));
        }
        int i2 = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        vector2.add(new Pair(o, sb.toString()));
        vector2.add(new Pair(q, Build.MANUFACTURER));
        vector2.add(new Pair(p, Build.MODEL));
        boolean firstSession = IronSourceUtils.getFirstSession(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(firstSession ? 1 : 0);
        vector2.add(new Pair(t, sb2.toString()));
        ConcurrentHashMap<String, List<String>> d2 = com.ironsource.d.a.a().d();
        if (d2.containsKey("is_child_directed")) {
            vector2.add(new Pair(u, d2.get("is_child_directed").get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            vector2.add(new Pair(r, connectionType));
        }
        if (vector != null) {
            vector2.addAll(vector);
        }
        String r2 = h.r();
        if (r2.length() != 0) {
            vector2.add(new Pair(v, r2));
        }
        String str5 = null;
        try {
            str5 = h.a(context) + "-" + h.b(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (str5 != null && str5.length() != 0) {
            vector2.add(new Pair(w, str5));
        }
        vector2.add(new Pair(x, context.getPackageName()));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a.AnonymousClass1.c(context));
        vector2.add(new Pair("mcc", sb3.toString()));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a.AnonymousClass1.d(context));
        vector2.add(new Pair("mnc", sb4.toString()));
        String j2 = h.j(context);
        if (!TextUtils.isEmpty(j2)) {
            vector2.add(new Pair(A, j2));
        }
        String i3 = h.i(context);
        if (!TextUtils.isEmpty(i3)) {
            vector2.add(new Pair(B, i3));
        }
        String c3 = h.c();
        if (!TextUtils.isEmpty(c3)) {
            vector2.add(new Pair("tz", c3));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(h.b());
        vector2.add(new Pair(D, sb5.toString()));
        String y2 = h.y(context);
        if (!TextUtils.isEmpty(y2)) {
            vector2.add(new Pair(k, y2));
        }
        if (z3) {
            vector2.add(new Pair("isDemandOnly", "1"));
        }
        vector2.addAll(IronSourceUtils.parseJsonToPairVector(new com.ironsource.environment.d.b().a()));
        return wo1.C(new StringBuilder(), b(IronSourceUtils.getSDKVersion()), URLEncoder.encode(IronSourceAES.encode(g.a().b(), a(vector2)), "UTF-8"));
    }

    public static String getRequestURL(String str, boolean z2, int i2) {
        Vector vector = new Vector();
        vector.add(new Pair("impression", Boolean.toString(z2)));
        vector.add(new Pair("placementId", Integer.toString(i2)));
        return wo1.u(str, J, a(vector));
    }
}