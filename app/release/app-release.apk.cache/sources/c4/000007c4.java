package com.anythink.expressad.foundation.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.anythink.expressad.foundation.h.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    public static final String a = "a";
    private static a c;
    public SharedPreferences b;

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            aVar = c;
        }
        return aVar;
    }

    private int b(String str, int i) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            if (d == null) {
                return i;
            }
            if (this.b == null) {
                this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            return this.b.getInt(str, i);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    private int c(String str) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            if (d == null) {
                return 0;
            }
            if (this.b == null) {
                this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            return this.b.getInt(str, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private Long d(String str) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            if (d == null) {
                n.d(a, "context is null in get");
                return 0L;
            }
            if (this.b == null) {
                this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            return Long.valueOf(this.b.getLong(str, 0L));
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public final void a(String str, String str2) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            if (d == null) {
                return;
            }
            if (this.b == null) {
                this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            SharedPreferences.Editor edit = this.b.edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList();
        Context d = com.anythink.expressad.foundation.b.a.b().d();
        if (d == null) {
            return null;
        }
        if (this.b == null) {
            this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
        }
        for (Map.Entry<String, ?> entry : this.b.getAll().entrySet()) {
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    private void a(String str, int i) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            if (d == null) {
                return;
            }
            if (this.b == null) {
                this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            SharedPreferences.Editor edit = this.b.edit();
            edit.putInt(str, i);
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(String str) {
        Context d = com.anythink.expressad.foundation.b.a.b().d();
        if (d == null) {
            return;
        }
        if (this.b == null) {
            this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
        }
        this.b.edit().remove(str).apply();
    }

    private void a(String str, long j) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            if (d == null) {
                n.d(a, "context is null in put");
                return;
            }
            if (this.b == null) {
                this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            SharedPreferences.Editor edit = this.b.edit();
            edit.putLong(str, j);
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String a(String str) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            if (d == null) {
                return null;
            }
            if (this.b == null) {
                this.b = d.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0);
            }
            return this.b.getString(str, "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}