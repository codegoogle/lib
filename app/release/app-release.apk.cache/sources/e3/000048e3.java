package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Map;

/* compiled from: CredentialsSourceSet.java */
/* loaded from: classes2.dex */
public class io1 implements ho1 {
    @x1
    private static final String a = "pref:start:params";
    private Context b;
    @x1
    private final Map<String, ho1> c;
    @x1
    private final jo1 d;
    @z1
    private ve1 e = null;

    /* compiled from: CredentialsSourceSet.java */
    /* loaded from: classes2.dex */
    public class a implements ua1<go1> {
        public final /* synthetic */ String b;
        public final /* synthetic */ ua1 c;

        public a(String str, ua1 ua1Var) {
            this.b = str;
            this.c = ua1Var;
        }

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 gc1 gc1Var) {
            this.c.a(gc1Var);
        }

        @Override // com.p7700g.p99005.ua1
        /* renamed from: c */
        public void b(@x1 go1 go1Var) {
            go1Var.x.putString(dn1.t, this.b);
            this.c.b(go1Var);
        }
    }

    public io1(@x1 Context context, @x1 Map<String, ho1> map, @x1 jo1 jo1Var) {
        this.b = context;
        this.c = map;
        this.d = jo1Var;
    }

    @Override // com.p7700g.p99005.ho1
    @z1
    public go1 get(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle) throws Exception {
        ho1 ho1Var = this.c.get(this.d.a(bundle));
        if (ho1Var != null) {
            return ho1Var.get(str, ti1Var, bundle);
        }
        return null;
    }

    @Override // com.p7700g.p99005.ho1
    public void load(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle, @x1 ua1<go1> ua1Var) {
        String a2 = this.d.a(bundle);
        if (a2 == null) {
            ua1Var.a(new bc1());
        } else if (!this.c.containsKey(a2)) {
            ua1Var.a(gc1.unexpected(new IllegalStateException(wo1.t("Invalid vpn transport transportId:", a2))));
        }
        ((ho1) r81.f(this.c.get(a2))).load(str, ti1Var, bundle, new a(a2, ua1Var));
    }

    @Override // com.p7700g.p99005.ho1
    @z1
    public ve1 loadStartParams() {
        ve1 ve1Var = this.e;
        if (ve1Var != null) {
            return ve1Var;
        }
        String string = PreferenceManager.getDefaultSharedPreferences(this.b).getString(a, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        byte[] decode = Base64.decode(string, 0);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        ve1 ve1Var2 = (ve1) obtain.readParcelable(ve1.class.getClassLoader());
        obtain.recycle();
        return ve1Var2;
    }

    @Override // com.p7700g.p99005.ho1
    public void preloadCredentials(@x1 String str, @x1 Bundle bundle) {
        ho1 ho1Var = this.c.get(this.d.a(bundle));
        if (ho1Var != null) {
            ho1Var.preloadCredentials(str, bundle);
        }
    }

    @Override // com.p7700g.p99005.ho1
    public void storeStartParams(@z1 ve1 ve1Var) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(ve1Var, 0);
        PreferenceManager.getDefaultSharedPreferences(this.b).edit().putString(a, Base64.encodeToString(obtain.marshall(), 0)).apply();
        obtain.recycle();
        this.e = ve1Var;
    }
}