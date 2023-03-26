package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.p7700g.p99005.i2;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ParcelUtils.java */
/* loaded from: classes.dex */
public class ja0 {
    private static final String a = "a";

    private ja0() {
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static <T extends oa0> T a(InputStream inputStream) {
        return (T) new na0(inputStream, null).g0();
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static <T extends oa0> T b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).c();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @z1
    public static <T extends oa0> T c(@x1 Bundle bundle, @x1 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(ja0.class.getClassLoader());
            return (T) b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @z1
    public static <T extends oa0> List<T> d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(ja0.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(@x1 Bundle bundle, @x1 String str, @z1 oa0 oa0Var) {
        if (oa0Var == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", h(oa0Var));
        bundle.putParcelable(str, bundle2);
    }

    public static void f(@x1 Bundle bundle, @x1 String str, @x1 List<? extends oa0> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (oa0 oa0Var : list) {
            arrayList.add(h(oa0Var));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static void g(oa0 oa0Var, OutputStream outputStream) {
        na0 na0Var = new na0(null, outputStream);
        na0Var.l1(oa0Var);
        na0Var.a();
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static Parcelable h(oa0 oa0Var) {
        return new ParcelImpl(oa0Var);
    }
}