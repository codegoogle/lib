package com.p7700g.p99005;

import android.content.Context;
import android.text.TextUtils;
import com.p7700g.p99005.b03;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class va3 {
    @NotNull
    public static final b a = new b(null);
    @NotNull
    private final Context b;
    @Nullable
    private final Throwable c;
    private final boolean d;
    @Nullable
    private final String e;
    @Nullable
    private final String f;
    @Nullable
    private final String g;

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final Context a;
        @Nullable
        private Throwable b;
        @Nullable
        private Boolean c;
        @Nullable
        private String d;
        @Nullable
        private String e;
        @Nullable
        private String f;

        public a(@NotNull Context context) {
            c25.p(context, "context");
            this.a = context;
        }

        @NotNull
        public final Context a() {
            return this.a;
        }

        @NotNull
        public final a b(@NotNull String str) {
            c25.p(str, "tag");
            this.d = str;
            return this;
        }

        @NotNull
        public final a c(@NotNull Throwable th) {
            c25.p(th, "throwable");
            this.b = th;
            return this;
        }

        @NotNull
        public final a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @NotNull
        public final a e(@Nullable String str) {
            this.e = str;
            return this;
        }

        @Nullable
        public final Throwable f() {
            return this.b;
        }

        @NotNull
        public final a g(@NotNull String str) {
            c25.p(str, "gameId");
            this.f = str;
            return this;
        }

        @Nullable
        public final Boolean h() {
            return this.c;
        }

        @Nullable
        public final String i() {
            return this.d;
        }

        @Nullable
        public final String j() {
            return this.e;
        }

        @Nullable
        public final String k() {
            return this.f;
        }

        @NotNull
        public final va3 l() {
            return new va3(this, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private va3(a aVar) {
        this.b = aVar.a();
        Throwable f = aVar.f();
        c25.m(f);
        this.c = f;
        Boolean h = aVar.h();
        c25.m(h);
        this.d = h.booleanValue();
        String i = aVar.i();
        c25.m(i);
        this.e = i;
        this.f = aVar.j();
        String k = aVar.k();
        c25.m(k);
        this.g = k;
    }

    public /* synthetic */ va3(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private final List<ua3> b() {
        ArrayList arrayList = new ArrayList();
        gb3 gb3Var = new gb3(this.b);
        Throwable th = this.c;
        c25.m(th);
        arrayList.add(new za3(th));
        arrayList.add(new ab3());
        Context context = this.b;
        Boolean valueOf = Boolean.valueOf(this.d);
        String str = this.e;
        c25.m(str);
        arrayList.add(new ya3(context, valueOf, str));
        arrayList.add(new wa3(gb3Var));
        Context context2 = this.b;
        String string = context2.getString(b03.l.g0);
        c25.o(string, "context.getString(R.string.gg_exposed_shared_pref_name)");
        String str2 = this.f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.g;
        c25.m(str3);
        arrayList.add(new xa3(context2, string, str2, str3));
        return arrayList;
    }

    private final Set<l23> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(l23.AI5);
        linkedHashSet.add(l23.APP_VERSION_CODE);
        linkedHashSet.add(l23.APP_VERSION_NAME);
        linkedHashSet.add(l23.ANDROID_VERSION);
        linkedHashSet.add(l23.GAME_ID);
        linkedHashSet.add(l23.PHONE_MODEL);
        linkedHashSet.add(l23.STACK_TRACE);
        linkedHashSet.add(l23.SDK_N);
        linkedHashSet.add(l23.SDK_V);
        linkedHashSet.add(l23.SESSION_ID);
        linkedHashSet.add(l23.ADVID);
        linkedHashSet.add(l23.CRASH_TIMESTAMP);
        linkedHashSet.add(l23.PLATFORM);
        if (this.d) {
            linkedHashSet.add(l23.IS_NON_FATAL);
            if (!TextUtils.isEmpty(this.e)) {
                linkedHashSet.add(l23.TAG);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public final cb3 a() {
        cb3 cb3Var = new cb3();
        try {
            Set<l23> c = c();
            for (ua3 ua3Var : b()) {
                try {
                    for (l23 l23Var : ua3Var.b()) {
                        if (ua3Var.c(c, l23Var)) {
                            db3 a2 = ua3Var.a(l23Var);
                            xz2.c("CrsBldr", "Element: " + l23Var + "\nData: " + a2.a());
                            cb3Var.put((cb3) l23Var, (l23) a2);
                        }
                    }
                } catch (RuntimeException e) {
                    xz2.c("CrsBldr", "[ERROR] Collector error: " + ((Object) ua3Var.getClass().getSimpleName()) + '\n' + e);
                }
            }
        } catch (RuntimeException e2) {
            xz2.b("CrsBldr", "Error while retrieving crash data: ", e2);
            e2.printStackTrace();
        }
        xz2.c("CrsBldr", "Crash report created");
        return cb3Var;
    }
}