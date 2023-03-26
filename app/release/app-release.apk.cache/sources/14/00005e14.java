package com.p7700g.p99005;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.p7700g.p99005.i2;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public class tg {
    private static final String a = "name";
    private static final String b = "icon";
    private static final String c = "uri";
    private static final String d = "key";
    private static final String e = "isBot";
    private static final String f = "isImportant";
    @z1
    public CharSequence g;
    @z1
    public IconCompat h;
    @z1
    public String i;
    @z1
    public String j;
    public boolean k;
    public boolean l;

    /* compiled from: Person.java */
    @e2(22)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static tg a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean(tg.e)).d(persistableBundle.getBoolean(tg.f)).a();
        }

        @e1
        public static PersistableBundle b(tg tgVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = tgVar.g;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", tgVar.i);
            persistableBundle.putString("key", tgVar.j);
            persistableBundle.putBoolean(tg.e, tgVar.k);
            persistableBundle.putBoolean(tg.f, tgVar.l);
            return persistableBundle;
        }
    }

    /* compiled from: Person.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static tg a(Person person) {
            return new c().f(person.getName()).c(person.getIcon() != null ? IconCompat.n(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        @e1
        public static Person b(tg tgVar) {
            return new Person.Builder().setName(tgVar.f()).setIcon(tgVar.d() != null ? tgVar.d().L() : null).setUri(tgVar.g()).setKey(tgVar.e()).setBot(tgVar.h()).setImportant(tgVar.i()).build();
        }
    }

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class c {
        @z1
        public CharSequence a;
        @z1
        public IconCompat b;
        @z1
        public String c;
        @z1
        public String d;
        public boolean e;
        public boolean f;

        public c() {
        }

        @x1
        public tg a() {
            return new tg(this);
        }

        @x1
        public c b(boolean z) {
            this.e = z;
            return this;
        }

        @x1
        public c c(@z1 IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        @x1
        public c d(boolean z) {
            this.f = z;
            return this;
        }

        @x1
        public c e(@z1 String str) {
            this.d = str;
            return this;
        }

        @x1
        public c f(@z1 CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        @x1
        public c g(@z1 String str) {
            this.c = str;
            return this;
        }

        public c(tg tgVar) {
            this.a = tgVar.g;
            this.b = tgVar.h;
            this.c = tgVar.i;
            this.d = tgVar.j;
            this.e = tgVar.k;
            this.f = tgVar.l;
        }
    }

    public tg(c cVar) {
        this.g = cVar.a;
        this.h = cVar.b;
        this.i = cVar.c;
        this.j = cVar.d;
        this.k = cVar.e;
        this.l = cVar.f;
    }

    @e2(28)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public static tg a(@x1 Person person) {
        return b.a(person);
    }

    @x1
    public static tg b(@x1 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new c().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.l(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean(e)).d(bundle.getBoolean(f)).a();
    }

    @e2(22)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public static tg c(@x1 PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    @z1
    public IconCompat d() {
        return this.h;
    }

    @z1
    public String e() {
        return this.j;
    }

    @z1
    public CharSequence f() {
        return this.g;
    }

    @z1
    public String g() {
        return this.i;
    }

    public boolean h() {
        return this.k;
    }

    public boolean i() {
        return this.l;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public String j() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        if (this.g != null) {
            StringBuilder G = wo1.G("name:");
            G.append((Object) this.g);
            return G.toString();
        }
        return "";
    }

    @e2(28)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public Person k() {
        return b.b(this);
    }

    @x1
    public c l() {
        return new c(this);
    }

    @x1
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.g);
        IconCompat iconCompat = this.h;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.i);
        bundle.putString("key", this.j);
        bundle.putBoolean(e, this.k);
        bundle.putBoolean(f, this.l);
        return bundle;
    }

    @e2(22)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public PersistableBundle n() {
        return a.b(this);
    }
}