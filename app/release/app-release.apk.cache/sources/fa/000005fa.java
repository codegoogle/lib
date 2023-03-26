package com.anythink.core.common.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p7700g.p99005.wo1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h implements Thread.UncaughtExceptionHandler {
    private static h d;
    private Thread.UncaughtExceptionHandler b;
    private Context c;
    private SharedPreferences e;
    private final String f = "crash_type";
    private final String g = "crash_msg";
    private final String h = e.c;
    public String a = "com.anythink";

    private h(Context context) {
        this.c = context;
        this.e = context.getSharedPreferences(g.u, 0);
    }

    public static synchronized h a(Context context) {
        h hVar;
        synchronized (h.class) {
            if (d == null) {
                d = new h(context);
            }
            hVar = d;
        }
        return hVar;
    }

    private void b() {
        Map<String, ?> all = this.e.getAll();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String obj = next != null ? next.toString() : "";
            if (!TextUtils.isEmpty(obj)) {
                try {
                    JSONObject jSONObject = new JSONObject(obj);
                    com.anythink.core.common.i.c.a(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString(e.c));
                } catch (Exception unused) {
                }
            }
        }
        if (all.size() > 0) {
            this.e.edit().clear().commit();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        try {
            String b = b(th);
            if (a(b)) {
                String b2 = b(b);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crash_type", URLEncoder.encode(b2));
                jSONObject.put("crash_msg", URLEncoder.encode(b));
                jSONObject.put(e.c, m.a().p());
                SharedPreferences.Editor edit = this.e.edit();
                edit.putString(System.currentTimeMillis() + "_crash", jSONObject.toString());
                edit.commit();
            }
        } catch (Throwable unused) {
        }
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || (uncaughtExceptionHandler instanceof h)) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Exception unused2) {
        }
    }

    public final void a() {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(this.c));
        if (l0 == null || l0.p() != 0) {
            try {
                com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.h.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a(h.this);
                    }
                });
                if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof h)) {
                    this.b = Thread.getDefaultUncaughtExceptionHandler();
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
            } catch (Exception unused) {
            }
        }
    }

    private void a(Throwable th) {
        try {
            String b = b(th);
            if (a(b)) {
                String b2 = b(b);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crash_type", URLEncoder.encode(b2));
                jSONObject.put("crash_msg", URLEncoder.encode(b));
                jSONObject.put(e.c, m.a().p());
                SharedPreferences.Editor edit = this.e.edit();
                edit.putString(System.currentTimeMillis() + "_crash", jSONObject.toString());
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    private static String b(Throwable th) {
        PrintWriter printWriter;
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = null;
        try {
            for (Throwable th2 = new Throwable(com.anythink.core.common.j.g.a(), th); th2 != null; th2 = th2.getCause()) {
                if (th2 instanceof UnknownHostException) {
                    return "";
                }
            }
            StringWriter stringWriter2 = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter2);
            } catch (Exception unused) {
                printWriter = null;
            } catch (Throwable th3) {
                th = th3;
                printWriter = null;
            }
            try {
                th.printStackTrace(printWriter);
                printWriter.flush();
                printWriter.close();
                stringWriter2.close();
                String stringWriter3 = stringWriter2.toString();
                try {
                    stringWriter2.close();
                    stringWriter2.close();
                } catch (Throwable unused2) {
                }
                return stringWriter3;
            } catch (Exception unused3) {
                stringWriter = stringWriter2;
                if (stringWriter != null) {
                    try {
                        stringWriter.close();
                    } catch (Throwable unused4) {
                        return "";
                    }
                }
                if (printWriter != null) {
                    stringWriter.close();
                }
                return "";
            } catch (Throwable th4) {
                th = th4;
                stringWriter = stringWriter2;
                if (stringWriter != null) {
                    try {
                        stringWriter.close();
                    } catch (Throwable unused5) {
                        throw th;
                    }
                }
                if (printWriter != null) {
                    stringWriter.close();
                }
                throw th;
            }
        } catch (Exception unused6) {
            printWriter = null;
        } catch (Throwable th5) {
            th = th5;
            printWriter = null;
        }
    }

    private boolean a(String str) {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(this.c));
        if (l0 != null) {
            if (l0.p() == 0) {
                return false;
            }
            String r = l0.r();
            try {
                if (TextUtils.isEmpty(r)) {
                    return true;
                }
                JSONArray jSONArray = new JSONArray(r);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.contains(jSONArray.optString(i))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        } else if (str.contains(this.a)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void a(h hVar) {
        Map<String, ?> all = hVar.e.getAll();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String obj = next != null ? next.toString() : "";
            if (!TextUtils.isEmpty(obj)) {
                try {
                    JSONObject jSONObject = new JSONObject(obj);
                    com.anythink.core.common.i.c.a(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString(e.c));
                } catch (Exception unused) {
                }
            }
        }
        if (all.size() > 0) {
            hVar.e.edit().clear().commit();
        }
    }

    private static String b(String str) {
        String str2 = "";
        try {
            Matcher matcher = Pattern.compile(".*?(Exception|Error|Death)", 2).matcher(str);
            String group = matcher.find() ? matcher.group(0) : "";
            try {
                return !TextUtils.isEmpty(group) ? group.replaceAll("Caused by:", "").replaceAll(" ", "") : group;
            } catch (Exception unused) {
                str2 = group;
                return str2;
            }
        } catch (Exception unused2) {
        }
    }
}