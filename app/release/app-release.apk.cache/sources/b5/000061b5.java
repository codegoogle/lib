package com.p7700g.p99005;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class vg {
    public static final String a = "android.remoteinput.results";
    public static final String b = "android.remoteinput.resultsData";
    private static final String c = "android.remoteinput.dataTypeResultsData";
    private static final String d = "android.remoteinput.resultsSource";
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    private final String j;
    private final CharSequence k;
    private final CharSequence[] l;
    private final boolean m;
    private final int n;
    private final Bundle o;
    private final Set<String> p;

    /* compiled from: RemoteInput.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static ClipData a(Intent intent) {
            return intent.getClipData();
        }

        @e1
        public static void b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* compiled from: RemoteInput.java */
    @e2(20)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(vg vgVar) {
            Set<String> g;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(vgVar.o()).setLabel(vgVar.n()).setChoices(vgVar.h()).setAllowFreeFormInput(vgVar.f()).addExtras(vgVar.m());
            if (Build.VERSION.SDK_INT >= 26 && (g = vgVar.g()) != null) {
                for (String str : g) {
                    c.d(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                e.b(addExtras, vgVar.k());
            }
            return addExtras.build();
        }

        public static vg c(Object obj) {
            Set<String> b;
            RemoteInput remoteInput = (RemoteInput) obj;
            f a = new f(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b = c.b(remoteInput)) != null) {
                for (String str : b) {
                    a.d(str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a.g(e.a(remoteInput));
            }
            return a.b();
        }

        @e1
        public static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* compiled from: RemoteInput.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static void a(vg vgVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(vg.c(vgVar), intent, map);
        }

        @e1
        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @e1
        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @e1
        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    /* compiled from: RemoteInput.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @e1
        public static void b(Intent intent, int i) {
            RemoteInput.setResultsSource(intent, i);
        }
    }

    /* compiled from: RemoteInput.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @e1
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @e1
        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* compiled from: RemoteInput.java */
    /* loaded from: classes.dex */
    public static final class f {
        private final String a;
        private CharSequence d;
        private CharSequence[] e;
        private final Set<String> b = new HashSet();
        private final Bundle c = new Bundle();
        private boolean f = true;
        private int g = 0;

        public f(@x1 String str) {
            if (str != null) {
                this.a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @x1
        public f a(@x1 Bundle bundle) {
            if (bundle != null) {
                this.c.putAll(bundle);
            }
            return this;
        }

        @x1
        public vg b() {
            return new vg(this.a, this.d, this.e, this.f, this.g, this.c, this.b);
        }

        @x1
        public Bundle c() {
            return this.c;
        }

        @x1
        public f d(@x1 String str, boolean z) {
            if (z) {
                this.b.add(str);
            } else {
                this.b.remove(str);
            }
            return this;
        }

        @x1
        public f e(boolean z) {
            this.f = z;
            return this;
        }

        @x1
        public f f(@z1 CharSequence[] charSequenceArr) {
            this.e = charSequenceArr;
            return this;
        }

        @x1
        public f g(int i) {
            this.g = i;
            return this;
        }

        @x1
        public f h(@z1 CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }
    }

    /* compiled from: RemoteInput.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* compiled from: RemoteInput.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface h {
    }

    public vg(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i2, Bundle bundle, Set<String> set) {
        this.j = str;
        this.k = charSequence;
        this.l = charSequenceArr;
        this.m = z;
        this.n = i2;
        this.o = bundle;
        this.p = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@x1 vg vgVar, @x1 Intent intent, @x1 Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(vgVar, intent, map);
            return;
        }
        Intent i2 = i(intent);
        if (i2 == null) {
            i2 = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = i2.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(vgVar.o(), value.toString());
                i2.putExtra(l(key), bundleExtra);
            }
        }
        a.b(intent, ClipData.newIntent(a, i2));
    }

    public static void b(@x1 vg[] vgVarArr, @x1 Intent intent, @x1 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(d(vgVarArr), intent, bundle);
            return;
        }
        Bundle p = p(intent);
        int q = q(intent);
        if (p != null) {
            p.putAll(bundle);
            bundle = p;
        }
        for (vg vgVar : vgVarArr) {
            Map<String, Uri> j = j(intent, vgVar.o());
            b.a(d(new vg[]{vgVar}), intent, bundle);
            if (j != null) {
                a(vgVar, intent, j);
            }
        }
        s(intent, q);
    }

    @e2(20)
    public static RemoteInput c(vg vgVar) {
        return b.b(vgVar);
    }

    @e2(20)
    public static RemoteInput[] d(vg[] vgVarArr) {
        if (vgVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[vgVarArr.length];
        for (int i2 = 0; i2 < vgVarArr.length; i2++) {
            remoteInputArr[i2] = c(vgVarArr[i2]);
        }
        return remoteInputArr;
    }

    @e2(20)
    public static vg e(RemoteInput remoteInput) {
        return b.c(remoteInput);
    }

    @e2(16)
    private static Intent i(Intent intent) {
        ClipData a2 = a.a(intent);
        if (a2 == null) {
            return null;
        }
        ClipDescription description = a2.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(a)) {
            return a2.getItemAt(0).getIntent();
        }
        return null;
    }

    @z1
    public static Map<String, Uri> j(@x1 Intent intent, @x1 String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(intent, str);
        }
        Intent i2 = i(intent);
        if (i2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : i2.getExtras().keySet()) {
            if (str2.startsWith(c)) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = i2.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private static String l(String str) {
        return wo1.t(c, str);
    }

    @z1
    public static Bundle p(@x1 Intent intent) {
        return b.d(intent);
    }

    public static int q(@x1 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(intent);
        }
        Intent i2 = i(intent);
        if (i2 == null) {
            return 0;
        }
        return i2.getExtras().getInt(d, 0);
    }

    public static void s(@x1 Intent intent, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            d.b(intent, i2);
            return;
        }
        Intent i3 = i(intent);
        if (i3 == null) {
            i3 = new Intent();
        }
        i3.putExtra(d, i2);
        a.b(intent, ClipData.newIntent(a, i3));
    }

    public boolean f() {
        return this.m;
    }

    @z1
    public Set<String> g() {
        return this.p;
    }

    @z1
    public CharSequence[] h() {
        return this.l;
    }

    public int k() {
        return this.n;
    }

    @x1
    public Bundle m() {
        return this.o;
    }

    @z1
    public CharSequence n() {
        return this.k;
    }

    @x1
    public String o() {
        return this.j;
    }

    public boolean r() {
        return (f() || (h() != null && h().length != 0) || g() == null || g().isEmpty()) ? false : true;
    }
}