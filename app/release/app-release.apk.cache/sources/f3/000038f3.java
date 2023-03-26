package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ShortcutInfoCompat.java */
/* loaded from: classes.dex */
public class ai {
    private static final String a = "extraPersonCount";
    private static final String b = "extraPerson_";
    private static final String c = "extraLocusId";
    private static final String d = "extraLongLived";
    private static final String e = "extraSliceUri";
    public static final int f = 1;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E = true;
    public boolean F;
    public int G;
    public int H;
    public Context g;
    public String h;
    public String i;
    public Intent[] j;
    public ComponentName k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    public IconCompat o;
    public boolean p;
    public tg[] q;
    public Set<String> r;
    @z1
    public kh s;
    public boolean t;
    public int u;
    public PersistableBundle v;
    public Bundle w;
    public long x;
    public UserHandle y;
    public boolean z;

    /* compiled from: ShortcutInfoCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @e2(22)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    private PersistableBundle b() {
        if (this.v == null) {
            this.v = new PersistableBundle();
        }
        tg[] tgVarArr = this.q;
        if (tgVarArr != null && tgVarArr.length > 0) {
            this.v.putInt(a, tgVarArr.length);
            int i = 0;
            while (i < this.q.length) {
                PersistableBundle persistableBundle = this.v;
                StringBuilder G = wo1.G(b);
                int i2 = i + 1;
                G.append(i2);
                persistableBundle.putPersistableBundle(G.toString(), this.q[i].n());
                i = i2;
            }
        }
        kh khVar = this.s;
        if (khVar != null) {
            this.v.putString(c, khVar.a());
        }
        this.v.putBoolean(d, this.t);
        return this.v;
    }

    @e2(25)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static List<ai> c(@x1 Context context, @x1 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfo shortcutInfo : list) {
            arrayList.add(new a(context, shortcutInfo).c());
        }
        return arrayList;
    }

    @e2(25)
    @z1
    public static kh p(@x1 ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (shortcutInfo.getLocusId() == null) {
                return null;
            }
            return kh.d(shortcutInfo.getLocusId());
        }
        return q(shortcutInfo.getExtras());
    }

    @e2(25)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    private static kh q(@z1 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(c)) == null) {
            return null;
        }
        return new kh(string);
    }

    @e2(25)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    public static boolean s(@z1 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(d)) {
            return false;
        }
        return persistableBundle.getBoolean(d);
    }

    @e2(25)
    @z1
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    public static tg[] u(@x1 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(a)) {
            return null;
        }
        int i = persistableBundle.getInt(a);
        tg[] tgVarArr = new tg[i];
        int i2 = 0;
        while (i2 < i) {
            StringBuilder G = wo1.G(b);
            int i3 = i2 + 1;
            G.append(i3);
            tgVarArr[i2] = tg.c(persistableBundle.getPersistableBundle(G.toString()));
            i2 = i3;
        }
        return tgVarArr;
    }

    public boolean A() {
        return this.z;
    }

    public boolean B() {
        return this.C;
    }

    public boolean C() {
        return this.A;
    }

    public boolean D() {
        return this.E;
    }

    public boolean E(int i) {
        return (i & this.H) != 0;
    }

    public boolean F() {
        return this.D;
    }

    public boolean G() {
        return this.B;
    }

    @e2(25)
    public ShortcutInfo H() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.g, this.h).setShortLabel(this.l).setIntents(this.j);
        IconCompat iconCompat = this.o;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.M(this.g));
        }
        if (!TextUtils.isEmpty(this.m)) {
            intents.setLongLabel(this.m);
        }
        if (!TextUtils.isEmpty(this.n)) {
            intents.setDisabledMessage(this.n);
        }
        ComponentName componentName = this.k;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.r;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.u);
        PersistableBundle persistableBundle = this.v;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            tg[] tgVarArr = this.q;
            if (tgVarArr != null && tgVarArr.length > 0) {
                int length = tgVarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.q[i].k();
                }
                intents.setPersons(personArr);
            }
            kh khVar = this.s;
            if (khVar != null) {
                intents.setLocusId(khVar.c());
            }
            intents.setLongLived(this.t);
        } else {
            intents.setExtras(b());
        }
        return intents.build();
    }

    public Intent a(Intent intent) {
        Intent[] intentArr = this.j;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.l.toString());
        if (this.o != null) {
            Drawable drawable = null;
            if (this.p) {
                PackageManager packageManager = this.g.getPackageManager();
                ComponentName componentName = this.k;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.g.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.o.j(intent, drawable, this.g);
        }
        return intent;
    }

    @z1
    public ComponentName d() {
        return this.k;
    }

    @z1
    public Set<String> e() {
        return this.r;
    }

    @z1
    public CharSequence f() {
        return this.n;
    }

    public int g() {
        return this.G;
    }

    public int h() {
        return this.H;
    }

    @z1
    public PersistableBundle i() {
        return this.v;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public IconCompat j() {
        return this.o;
    }

    @x1
    public String k() {
        return this.h;
    }

    @x1
    public Intent l() {
        Intent[] intentArr = this.j;
        return intentArr[intentArr.length - 1];
    }

    @x1
    public Intent[] m() {
        Intent[] intentArr = this.j;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long n() {
        return this.x;
    }

    @z1
    public kh o() {
        return this.s;
    }

    @z1
    public CharSequence r() {
        return this.m;
    }

    @x1
    public String t() {
        return this.i;
    }

    public int v() {
        return this.u;
    }

    @x1
    public CharSequence w() {
        return this.l;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public Bundle x() {
        return this.w;
    }

    @z1
    public UserHandle y() {
        return this.y;
    }

    public boolean z() {
        return this.F;
    }

    /* compiled from: ShortcutInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        private final ai a;
        private boolean b;
        private Set<String> c;
        private Map<String, Map<String, List<String>>> d;
        private Uri e;

        public a(@x1 Context context, @x1 String str) {
            ai aiVar = new ai();
            this.a = aiVar;
            aiVar.g = context;
            aiVar.h = str;
        }

        @x1
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a a(@x1 String str) {
            if (this.c == null) {
                this.c = new HashSet();
            }
            this.c.add(str);
            return this;
        }

        @x1
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a b(@x1 String str, @x1 String str2, @x1 List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.d == null) {
                    this.d = new HashMap();
                }
                if (this.d.get(str) == null) {
                    this.d.put(str, new HashMap());
                }
                this.d.get(str).put(str2, list);
            }
            return this;
        }

        @x1
        public ai c() {
            if (!TextUtils.isEmpty(this.a.l)) {
                ai aiVar = this.a;
                Intent[] intentArr = aiVar.j;
                if (intentArr != null && intentArr.length != 0) {
                    if (this.b) {
                        if (aiVar.s == null) {
                            aiVar.s = new kh(aiVar.h);
                        }
                        this.a.t = true;
                    }
                    if (this.c != null) {
                        ai aiVar2 = this.a;
                        if (aiVar2.r == null) {
                            aiVar2.r = new HashSet();
                        }
                        this.a.r.addAll(this.c);
                    }
                    if (this.d != null) {
                        ai aiVar3 = this.a;
                        if (aiVar3.v == null) {
                            aiVar3.v = new PersistableBundle();
                        }
                        for (String str : this.d.keySet()) {
                            Map<String, List<String>> map = this.d.get(str);
                            this.a.v.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                            for (String str2 : map.keySet()) {
                                List<String> list = map.get(str2);
                                this.a.v.putStringArray(wo1.u(str, "/", str2), list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                            }
                        }
                    }
                    if (this.e != null) {
                        ai aiVar4 = this.a;
                        if (aiVar4.v == null) {
                            aiVar4.v = new PersistableBundle();
                        }
                        this.a.v.putString(ai.e, hm.a(this.e));
                    }
                    return this.a;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        @x1
        public a d(@x1 ComponentName componentName) {
            this.a.k = componentName;
            return this;
        }

        @x1
        public a e() {
            this.a.p = true;
            return this;
        }

        @x1
        public a f(@x1 Set<String> set) {
            this.a.r = set;
            return this;
        }

        @x1
        public a g(@x1 CharSequence charSequence) {
            this.a.n = charSequence;
            return this;
        }

        @x1
        public a h(int i) {
            this.a.H = i;
            return this;
        }

        @x1
        public a i(@x1 PersistableBundle persistableBundle) {
            this.a.v = persistableBundle;
            return this;
        }

        @x1
        public a j(IconCompat iconCompat) {
            this.a.o = iconCompat;
            return this;
        }

        @x1
        public a k(@x1 Intent intent) {
            return l(new Intent[]{intent});
        }

        @x1
        public a l(@x1 Intent[] intentArr) {
            this.a.j = intentArr;
            return this;
        }

        @x1
        public a m() {
            this.b = true;
            return this;
        }

        @x1
        public a n(@z1 kh khVar) {
            this.a.s = khVar;
            return this;
        }

        @x1
        public a o(@x1 CharSequence charSequence) {
            this.a.m = charSequence;
            return this;
        }

        @x1
        @Deprecated
        public a p() {
            this.a.t = true;
            return this;
        }

        @x1
        public a q(boolean z) {
            this.a.t = z;
            return this;
        }

        @x1
        public a r(@x1 tg tgVar) {
            return s(new tg[]{tgVar});
        }

        @x1
        public a s(@x1 tg[] tgVarArr) {
            this.a.q = tgVarArr;
            return this;
        }

        @x1
        public a t(int i) {
            this.a.u = i;
            return this;
        }

        @x1
        public a u(@x1 CharSequence charSequence) {
            this.a.l = charSequence;
            return this;
        }

        @x1
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a v(@x1 Uri uri) {
            this.e = uri;
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @x1
        public a w(@x1 Bundle bundle) {
            this.a.w = (Bundle) jp.l(bundle);
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public a(@x1 ai aiVar) {
            ai aiVar2 = new ai();
            this.a = aiVar2;
            aiVar2.g = aiVar.g;
            aiVar2.h = aiVar.h;
            aiVar2.i = aiVar.i;
            Intent[] intentArr = aiVar.j;
            aiVar2.j = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            aiVar2.k = aiVar.k;
            aiVar2.l = aiVar.l;
            aiVar2.m = aiVar.m;
            aiVar2.n = aiVar.n;
            aiVar2.G = aiVar.G;
            aiVar2.o = aiVar.o;
            aiVar2.p = aiVar.p;
            aiVar2.y = aiVar.y;
            aiVar2.x = aiVar.x;
            aiVar2.z = aiVar.z;
            aiVar2.A = aiVar.A;
            aiVar2.B = aiVar.B;
            aiVar2.C = aiVar.C;
            aiVar2.D = aiVar.D;
            aiVar2.E = aiVar.E;
            aiVar2.s = aiVar.s;
            aiVar2.t = aiVar.t;
            aiVar2.F = aiVar.F;
            aiVar2.u = aiVar.u;
            tg[] tgVarArr = aiVar.q;
            if (tgVarArr != null) {
                aiVar2.q = (tg[]) Arrays.copyOf(tgVarArr, tgVarArr.length);
            }
            if (aiVar.r != null) {
                aiVar2.r = new HashSet(aiVar.r);
            }
            PersistableBundle persistableBundle = aiVar.v;
            if (persistableBundle != null) {
                aiVar2.v = persistableBundle;
            }
            aiVar2.H = aiVar.H;
        }

        @e2(25)
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public a(@x1 Context context, @x1 ShortcutInfo shortcutInfo) {
            ai aiVar = new ai();
            this.a = aiVar;
            aiVar.g = context;
            aiVar.h = shortcutInfo.getId();
            aiVar.i = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            aiVar.j = (Intent[]) Arrays.copyOf(intents, intents.length);
            aiVar.k = shortcutInfo.getActivity();
            aiVar.l = shortcutInfo.getShortLabel();
            aiVar.m = shortcutInfo.getLongLabel();
            aiVar.n = shortcutInfo.getDisabledMessage();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                aiVar.G = shortcutInfo.getDisabledReason();
            } else {
                aiVar.G = shortcutInfo.isEnabled() ? 0 : 3;
            }
            aiVar.r = shortcutInfo.getCategories();
            aiVar.q = ai.u(shortcutInfo.getExtras());
            aiVar.y = shortcutInfo.getUserHandle();
            aiVar.x = shortcutInfo.getLastChangedTimestamp();
            if (i >= 30) {
                aiVar.z = shortcutInfo.isCached();
            }
            aiVar.A = shortcutInfo.isDynamic();
            aiVar.B = shortcutInfo.isPinned();
            aiVar.C = shortcutInfo.isDeclaredInManifest();
            aiVar.D = shortcutInfo.isImmutable();
            aiVar.E = shortcutInfo.isEnabled();
            aiVar.F = shortcutInfo.hasKeyFieldsOnly();
            aiVar.s = ai.p(shortcutInfo);
            aiVar.u = shortcutInfo.getRank();
            aiVar.v = shortcutInfo.getExtras();
        }
    }
}