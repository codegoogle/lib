package com.p7700g.p99005;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import com.p7700g.p99005.kg;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: NotificationCompatJellybean.java */
@e2(16)
/* loaded from: classes.dex */
public class ng {
    public static final String a = "NotificationCompat";
    public static final String b = "android.support.dataRemoteInputs";
    public static final String c = "android.support.allowGeneratedReplies";
    private static final String d = "icon";
    private static final String e = "title";
    private static final String f = "actionIntent";
    private static final String g = "extras";
    private static final String h = "remoteInputs";
    private static final String i = "dataOnlyRemoteInputs";
    private static final String j = "resultKey";
    private static final String k = "label";
    private static final String l = "choices";
    private static final String m = "allowFreeFormInput";
    private static final String n = "allowedDataTypes";
    private static final String o = "semanticAction";
    private static final String p = "showsUserInterface";
    private static Field r;
    private static boolean s;
    private static Field u;
    private static Field v;
    private static Field w;
    private static Field x;
    private static boolean y;
    private static final Object q = new Object();
    private static final Object t = new Object();

    private ng() {
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    private static boolean b() {
        if (y) {
            return false;
        }
        try {
            if (u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                v = cls.getDeclaredField("icon");
                w = cls.getDeclaredField("title");
                x = cls.getDeclaredField(f);
                Field declaredField = Notification.class.getDeclaredField("actions");
                u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException unused) {
            y = true;
        } catch (NoSuchFieldException unused2) {
            y = true;
        }
        return true ^ y;
    }

    private static vg c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new vg(bundle.getString(j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(l), bundle.getBoolean(m), 0, bundle.getBundle("extras"), hashSet);
    }

    private static vg[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        vg[] vgVarArr = new vg[bundleArr.length];
        for (int i2 = 0; i2 < bundleArr.length; i2++) {
            vgVarArr[i2] = c(bundleArr[i2]);
        }
        return vgVarArr;
    }

    public static kg.b e(Notification notification, int i2) {
        SparseArray sparseParcelableArray;
        synchronized (t) {
            try {
                try {
                    Object[] h2 = h(notification);
                    if (h2 != null) {
                        Object obj = h2[i2];
                        Bundle k2 = k(notification);
                        return l(v.getInt(obj), (CharSequence) w.get(obj), (PendingIntent) x.get(obj), (k2 == null || (sparseParcelableArray = k2.getSparseParcelableArray(mg.e)) == null) ? null : (Bundle) sparseParcelableArray.get(i2));
                    }
                } catch (IllegalAccessException unused) {
                    y = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(Notification notification) {
        int length;
        synchronized (t) {
            Object[] h2 = h(notification);
            length = h2 != null ? h2.length : 0;
        }
        return length;
    }

    public static kg.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new kg.b(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f), bundle.getBundle("extras"), d(i(bundle, h)), d(i(bundle, i)), bundle2 != null ? bundle2.getBoolean(c, false) : false, bundle.getInt(o), bundle.getBoolean(p), false, false);
    }

    private static Object[] h(Notification notification) {
        synchronized (t) {
            if (b()) {
                try {
                    return (Object[]) u.get(notification);
                } catch (IllegalAccessException unused) {
                    y = true;
                    return null;
                }
            }
            return null;
        }
    }

    private static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
            Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
            bundle.putParcelableArray(str, bundleArr);
            return bundleArr;
        }
        return (Bundle[]) parcelableArray;
    }

    public static Bundle j(kg.b bVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f2 = bVar.f();
        bundle2.putInt("icon", f2 != null ? f2.A() : 0);
        bundle2.putCharSequence("title", bVar.j());
        bundle2.putParcelable(f, bVar.a());
        if (bVar.d() != null) {
            bundle = new Bundle(bVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(c, bVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray(h, n(bVar.g()));
        bundle2.putBoolean(p, bVar.i());
        bundle2.putInt(o, bVar.h());
        return bundle2;
    }

    public static Bundle k(Notification notification) {
        synchronized (q) {
            if (s) {
                return null;
            }
            try {
                if (r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    r = declaredField;
                }
                Bundle bundle = (Bundle) r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                s = true;
                return null;
            }
        }
    }

    public static kg.b l(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        vg[] vgVarArr;
        vg[] vgVarArr2;
        boolean z;
        if (bundle != null) {
            vgVarArr = d(i(bundle, mg.f));
            vgVarArr2 = d(i(bundle, b));
            z = bundle.getBoolean(c);
        } else {
            vgVarArr = null;
            vgVarArr2 = null;
            z = false;
        }
        return new kg.b(i2, charSequence, pendingIntent, bundle, vgVarArr, vgVarArr2, z, 0, true, false, false);
    }

    private static Bundle m(vg vgVar) {
        Bundle bundle = new Bundle();
        bundle.putString(j, vgVar.o());
        bundle.putCharSequence("label", vgVar.n());
        bundle.putCharSequenceArray(l, vgVar.h());
        bundle.putBoolean(m, vgVar.f());
        bundle.putBundle("extras", vgVar.m());
        Set<String> g2 = vgVar.g();
        if (g2 != null && !g2.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(g2.size());
            for (String str : g2) {
                arrayList.add(str);
            }
            bundle.putStringArrayList(n, arrayList);
        }
        return bundle;
    }

    private static Bundle[] n(vg[] vgVarArr) {
        if (vgVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[vgVarArr.length];
        for (int i2 = 0; i2 < vgVarArr.length; i2++) {
            bundleArr[i2] = m(vgVarArr[i2]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, kg.b bVar) {
        IconCompat f2 = bVar.f();
        builder.addAction(f2 != null ? f2.A() : 0, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray(mg.f, n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray(b, n(bVar.c()));
        }
        bundle.putBoolean(c, bVar.b());
        return bundle;
    }
}