package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.greedygame.mystique2.models.LayerType;
import com.greedygame.mystique2.models.MediationType;
import com.greedygame.mystique2.models.ViewLayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class hd3 {
    @NotNull
    private final a a;
    @NotNull
    private Context b;
    @NotNull
    private ViewLayer c;
    @NotNull
    private gz2 d;
    @NotNull
    private xx2 e;
    @NotNull
    private MediationType f;
    @Nullable
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    @Nullable
    private hz2 l;

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final Context a;
        @Nullable
        private ViewLayer b;
        @Nullable
        private gz2 c;
        @Nullable
        private xx2 d;
        @Nullable
        private MediationType e;
        @Nullable
        private hz2 f;
        public hp4<Integer, Integer> g;
        @Nullable
        private f05<? super String, yq4> h;
        @Nullable
        private Typeface i;

        /* renamed from: com.p7700g.p99005.hd3$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0187a {
            public static final /* synthetic */ int[] a;

            static {
                MediationType.values();
                int[] iArr = new int[6];
                iArr[MediationType.ADMOB.ordinal()] = 1;
                iArr[MediationType.FACEBOOK.ordinal()] = 2;
                iArr[MediationType.MOPUB.ordinal()] = 3;
                iArr[MediationType.S2S.ordinal()] = 4;
                a = iArr;
            }
        }

        public a(@NotNull Context context) {
            c25.p(context, "context");
            this.a = context;
        }

        @NotNull
        public final Context a() {
            return this.a;
        }

        @NotNull
        public final a b(@Nullable Typeface typeface) {
            this.i = typeface;
            return this;
        }

        @NotNull
        public final a c(@NotNull xx2 xx2Var) {
            c25.p(xx2Var, "assetInterface");
            this.d = xx2Var;
            return this;
        }

        @NotNull
        public final a d(@NotNull gz2 gz2Var) {
            c25.p(gz2Var, "nativeAdAsset");
            this.c = gz2Var;
            return this;
        }

        @NotNull
        public final a e(@NotNull hz2 hz2Var) {
            c25.p(hz2Var, "palette");
            this.f = hz2Var;
            return this;
        }

        @NotNull
        public final a f(@NotNull MediationType mediationType) {
            c25.p(mediationType, "mediationType");
            this.e = mediationType;
            return this;
        }

        @NotNull
        public final a g(@NotNull ViewLayer viewLayer) {
            c25.p(viewLayer, "layer");
            this.b = viewLayer;
            return this;
        }

        @NotNull
        public final a h(@Nullable f05<? super String, yq4> f05Var) {
            this.h = f05Var;
            return this;
        }

        public final void i(@NotNull hp4<Integer, Integer> hp4Var) {
            c25.p(hp4Var, "<set-?>");
            this.g = hp4Var;
        }

        @Nullable
        public final ViewLayer j() {
            return this.b;
        }

        @NotNull
        public final a k(@NotNull hp4<Integer, Integer> hp4Var) {
            c25.p(hp4Var, "pair");
            i(hp4Var);
            return this;
        }

        @Nullable
        public final gz2 l() {
            return this.c;
        }

        @Nullable
        public final xx2 m() {
            return this.d;
        }

        @Nullable
        public final MediationType n() {
            return this.e;
        }

        @Nullable
        public final hz2 o() {
            return this.f;
        }

        @Nullable
        public final f05<String, yq4> p() {
            return this.h;
        }

        @Nullable
        public final Typeface q() {
            return this.i;
        }

        @Nullable
        public final hd3 r() {
            ViewLayer viewLayer;
            int i;
            if (this.d == null || this.c == null || (viewLayer = this.b) == null) {
                return null;
            }
            c25.m(viewLayer);
            String type = viewLayer.getType();
            if (c25.g(type, LayerType.IMAGE.getValue())) {
                return new fd3(this);
            }
            if (c25.g(type, LayerType.TEXT.getValue())) {
                return new gd3(this);
            }
            if (c25.g(type, LayerType.MEDIAVIEW.getValue())) {
                MediationType mediationType = this.e;
                i = mediationType != null ? C0187a.a[mediationType.ordinal()] : -1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return new jd3(this);
                        }
                        return new v33(this);
                    }
                    return new t33(this);
                }
                return new id3(this);
            } else if (c25.g(type, LayerType.ADCHOICE.getValue())) {
                MediationType mediationType2 = this.e;
                i = mediationType2 != null ? C0187a.a[mediationType2.ordinal()] : -1;
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new u33(this);
                }
                return new s33(this);
            } else if (c25.g(type, LayerType.BUTTON.getValue())) {
                return new ed3(this);
            } else {
                return null;
            }
        }
    }

    public hd3(@NotNull a aVar) {
        c25.p(aVar, "builder");
        this.a = aVar;
        this.h = -1;
        this.i = -1;
        this.j = sr.t;
        this.k = true;
        this.b = aVar.a();
        ViewLayer j = aVar.j();
        c25.m(j);
        this.c = j;
        gz2 l = aVar.l();
        c25.m(l);
        this.d = l;
        xx2 m = aVar.m();
        c25.m(m);
        this.e = m;
        MediationType n = aVar.n();
        c25.m(n);
        this.f = n;
        this.l = aVar.o();
        b();
    }

    private final void b() {
        hz2 hz2Var = this.l;
        if (hz2Var == null) {
            s();
            return;
        }
        c25.m(hz2Var);
        this.j = hz2Var.h();
        hz2 hz2Var2 = this.l;
        c25.m(hz2Var2);
        this.i = hz2Var2.j().f();
        hz2 hz2Var3 = this.l;
        c25.m(hz2Var3);
        this.k = hz2Var3.j().h();
        hz2 hz2Var4 = this.l;
        c25.m(hz2Var4);
        this.h = hz2Var4.j().g();
    }

    public static /* synthetic */ void j(hd3 hd3Var, String str, View view) {
        y(hd3Var, str, view);
    }

    public static /* synthetic */ void k(hd3 hd3Var, View view) {
        m(hd3Var, view);
    }

    private final void l(View view) {
        if (this.c.getClickable()) {
            if (!this.d.d()) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.dd3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        hd3.k(hd3.this, view2);
                    }
                });
                return;
            }
            String onClick = this.c.getOnClick();
            if (onClick == null) {
                return;
            }
            if (c25.g(g().getOnClick(), "{redirect}")) {
                String f = h().f();
                if (f == null) {
                    f = "";
                }
                x(view, f);
                return;
            }
            x(view, onClick);
        }
    }

    public static final void m(hd3 hd3Var, View view) {
        c25.p(hd3Var, "this$0");
        f05<String, yq4> p = hd3Var.a.p();
        if (p == null) {
            return;
        }
        p.M("");
    }

    private final void s() {
        iz2 iz2Var = new iz2(0, 0, false, 7, null);
        r(iz2Var.f());
        this.k = iz2Var.h();
        z(iz2Var.g());
    }

    private final void x(View view, final String str) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.cd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hd3.j(hd3.this, str, view2);
            }
        });
    }

    public static final void y(hd3 hd3Var, String str, View view) {
        c25.p(hd3Var, "this$0");
        c25.p(str, "$url");
        f05<String, yq4> p = hd3Var.a.p();
        if (p == null) {
            return;
        }
        p.M(str);
    }

    @NotNull
    public final xx2 a() {
        return this.e;
    }

    @NotNull
    public final Context c() {
        return this.b;
    }

    public final int d() {
        return this.i;
    }

    public final int e() {
        return this.j;
    }

    @Nullable
    public final String f() {
        return this.g;
    }

    @NotNull
    public final ViewLayer g() {
        return this.c;
    }

    @NotNull
    public final gz2 h() {
        return this.d;
    }

    public final int i() {
        return this.h;
    }

    @Nullable
    public final View n() {
        View o = o();
        if (o != null) {
            o.setClickable(false);
        }
        if (o != null) {
            o.setClickable(true);
            l(o);
        }
        return o;
    }

    @Nullable
    public abstract View o();

    public final void p(@NotNull xx2 xx2Var) {
        c25.p(xx2Var, "<set-?>");
        this.e = xx2Var;
    }

    public final void q(@NotNull Context context) {
        c25.p(context, "<set-?>");
        this.b = context;
    }

    public final void r(int i) {
        this.i = i;
    }

    public final void t(int i) {
        this.j = i;
    }

    public final void u(@Nullable String str) {
        this.g = str;
    }

    public final void v(@NotNull ViewLayer viewLayer) {
        c25.p(viewLayer, "<set-?>");
        this.c = viewLayer;
    }

    public final void w(@NotNull gz2 gz2Var) {
        c25.p(gz2Var, "<set-?>");
        this.d = gz2Var;
    }

    public final void z(int i) {
        this.h = i;
    }
}