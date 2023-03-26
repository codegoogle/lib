package com.p7700g.p99005;

import android.net.Uri;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.models.core.BidModel;
import com.greedygame.core.network.model.responses.BidResponse;
import com.greedygame.core.network.moshi.FillTypeAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f23 extends b23<BidModel, BidResponse> {
    @NotNull
    public static final b h = new b(null);
    @NotNull
    private static final String i = "IniRqst";
    private static final float j = 1.0f;
    private static final int k = 30000;
    private static final int l = 0;
    private static final int m = 204;
    @NotNull
    private final a n;
    @NotNull
    private final BidModel o;

    /* loaded from: classes3.dex */
    public static final class a {
        public BidModel a;
        public ka3<BidModel, BidResponse> b;
        public n03 c;
        private boolean d;
        @NotNull
        private String e = "";

        private final void i() {
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            c25.m(iNSTANCE$com_greedygame_sdkx_core);
            j(iNSTANCE$com_greedygame_sdkx_core.t().k());
        }

        @NotNull
        public final f23 a() {
            if (this.a != null && this.b != null && this.c != null) {
                BidModel c = c();
                String c2 = e().c();
                Objects.requireNonNull(c2, "null cannot be cast to non-null type kotlin.CharSequence");
                c.k(c95.E5(c2).toString());
                if (this.e.length() > 0) {
                    c().j(this.e);
                }
                return new f23(this);
            }
            xz2.c(f23.i, "[ERROR] Need all the Fields to create an object");
            throw new ey2(null, 1, null);
        }

        @NotNull
        public final a b(@NotNull ka3<BidModel, BidResponse> ka3Var) {
            c25.p(ka3Var, "callback");
            k(ka3Var);
            return this;
        }

        @NotNull
        public final BidModel c() {
            BidModel bidModel = this.a;
            if (bidModel != null) {
                return bidModel;
            }
            c25.S("initModel");
            throw null;
        }

        @NotNull
        public final ka3<BidModel, BidResponse> d() {
            ka3<BidModel, BidResponse> ka3Var = this.b;
            if (ka3Var != null) {
                return ka3Var;
            }
            c25.S("mCallback");
            throw null;
        }

        @NotNull
        public final n03 e() {
            n03 n03Var = this.c;
            if (n03Var != null) {
                return n03Var;
            }
            c25.S("mUnitConfig");
            throw null;
        }

        @NotNull
        public final String f() {
            return this.e;
        }

        @NotNull
        public final a g(boolean z) {
            this.d = z;
            return this;
        }

        public final boolean h() {
            return this.d;
        }

        public final void j(@NotNull BidModel bidModel) {
            c25.p(bidModel, "<set-?>");
            this.a = bidModel;
        }

        public final void k(@NotNull ka3<BidModel, BidResponse> ka3Var) {
            c25.p(ka3Var, "<set-?>");
            this.b = ka3Var;
        }

        public final void l(@NotNull n03 n03Var) {
            c25.p(n03Var, "<set-?>");
            this.c = n03Var;
        }

        public final void m(boolean z) {
            this.d = z;
        }

        @NotNull
        public final a n(@NotNull String str) {
            c25.p(str, "sessionId");
            this.e = str;
            return this;
        }

        public final void o(@NotNull String str) {
            c25.p(str, "<set-?>");
            this.e = str;
        }

        @NotNull
        public final a p(@NotNull n03 n03Var) {
            c25.p(n03Var, "unitConfig");
            l(n03Var);
            i();
            return this;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f23(@NotNull a aVar) {
        super(aVar.d());
        c25.p(aVar, "builder");
        this.n = aVar;
        this.o = aVar.c();
    }

    @Override // com.p7700g.p99005.b23
    @NotNull
    public qa3<BidModel> d() {
        return new qa3<>(this.o, BidModel.class);
    }

    @Override // com.p7700g.p99005.b23
    public int g() {
        return 1;
    }

    @Override // com.p7700g.p99005.b23
    @NotNull
    public x43 i() {
        return new j43(30000, 0, 1.0f);
    }

    @Override // com.p7700g.p99005.b23
    @NotNull
    public Uri j() {
        Uri parse = Uri.parse(sa3.b() + this.o.b() + j14.P + this.o.g());
        if (this.n.h()) {
            parse = parse.buildUpon().appendQueryParameter("manual_refresh", "true").build();
        }
        c25.o(parse, "parsedUri");
        return parse;
    }

    @Override // com.p7700g.p99005.b23
    public void n(@NotNull b23<BidModel, BidResponse> b23Var, @NotNull b53 b53Var, @Nullable p43 p43Var) {
        c25.p(b23Var, "request");
        c25.p(b53Var, "error");
        super.n(b23Var, b53Var, p43Var);
        if (b53Var.s != null) {
            ka3<BidModel, BidResponse> e = e();
            if (e == null) {
                return;
            }
            e.a(b23Var, new h23<>(b53Var.getLocalizedMessage(), b53Var.s.a, true), b53Var);
            return;
        }
        String localizedMessage = b53Var.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        ka3<BidModel, BidResponse> e2 = e();
        if (e2 == null) {
            return;
        }
        e2.a(b23Var, new h23<>(localizedMessage, p43Var == null ? -1 : p43Var.a, true), b53Var);
    }

    @Override // com.p7700g.p99005.b23
    public void o(@NotNull b23<BidModel, BidResponse> b23Var, @NotNull byte[] bArr, @NotNull p43 p43Var) {
        c25.p(b23Var, "request");
        c25.p(bArr, "response");
        c25.p(p43Var, "networkResponse");
        super.o(b23Var, bArr, p43Var);
        Moshi a2 = rz2.a.a(new FillTypeAdapter());
        String str = new String(bArr, f85.b);
        try {
            if (p43Var.a == m) {
                ka3<BidModel, BidResponse> e = e();
                if (e == null) {
                    return;
                }
                e.b(b23Var, new h23<>((String) null, p43Var.a, true));
                return;
            }
            BidResponse bidResponse = (BidResponse) a2.adapter(BidResponse.class).fromJson(str);
            ka3<BidModel, BidResponse> e2 = e();
            if (e2 == null) {
                return;
            }
            e2.b(b23Var, new h23<>(bidResponse, p43Var.a, true));
        } catch (JsonDataException e3) {
            xz2.b(i, "Error trying to convert the json", e3);
            ka3<BidModel, BidResponse> e4 = e();
            if (e4 == null) {
                return;
            }
            e4.a(b23Var, new h23<>("Error trying to convert the json", p43Var.a, true), e3);
        } catch (IOException e5) {
            xz2.b(i, "Error trying to convert the json", e5);
            ka3<BidModel, BidResponse> e6 = e();
            if (e6 == null) {
                return;
            }
            e6.a(b23Var, new h23<>("Error trying to convert the json", p43Var.a, true), e5);
        }
    }
}