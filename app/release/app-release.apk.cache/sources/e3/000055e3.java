package com.p7700g.p99005;

import android.net.Uri;
import com.greedygame.core.network.model.responses.SignalResponse;
import com.greedygame.core.network.moshi.FillTypeAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class pb3 extends b23<n23, SignalResponse> {
    @NotNull
    public static final a h = new a(null);
    @NotNull
    private final n23 i;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb3(@NotNull n23 n23Var, @Nullable ka3<n23, SignalResponse> ka3Var) {
        super(ka3Var);
        c25.p(n23Var, "mSignalModel");
        this.i = n23Var;
    }

    @Override // com.p7700g.p99005.b23
    @Nullable
    public qa3<n23> d() {
        xz2.c("MediationLoadedSignalReq", c25.C("Signal Body : ", this.i));
        return new qa3<>(this.i, n23.class);
    }

    @Override // com.p7700g.p99005.b23
    public int g() {
        return 1;
    }

    @Override // com.p7700g.p99005.b23
    @NotNull
    public x43 i() {
        return new j43(30000, 3, 1.0f);
    }

    @Override // com.p7700g.p99005.b23
    @NotNull
    public Uri j() {
        Uri parse = Uri.parse(sa3.c());
        c25.o(parse, "parse(SIGNAL_URL)");
        return parse;
    }

    @Override // com.p7700g.p99005.b23
    public void n(@NotNull b23<n23, SignalResponse> b23Var, @NotNull b53 b53Var, @Nullable p43 p43Var) {
        c25.p(b23Var, "request");
        c25.p(b53Var, "error");
        super.n(b23Var, b53Var, p43Var);
        if (b53Var.s != null) {
            ka3<n23, SignalResponse> e = e();
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
        ka3<n23, SignalResponse> e2 = e();
        if (e2 == null) {
            return;
        }
        e2.a(b23Var, new h23<>(localizedMessage, p43Var == null ? -1 : p43Var.a, true), b53Var);
    }

    @Override // com.p7700g.p99005.b23
    public void o(@NotNull b23<n23, SignalResponse> b23Var, @NotNull byte[] bArr, @NotNull p43 p43Var) {
        c25.p(b23Var, "request");
        c25.p(bArr, "response");
        c25.p(p43Var, "networkResponse");
        super.o(b23Var, bArr, p43Var);
        Moshi a2 = rz2.a.a(new FillTypeAdapter());
        String str = new String(bArr, f85.b);
        try {
            if (p43Var.a == 204) {
                ka3<n23, SignalResponse> e = e();
                if (e == null) {
                    return;
                }
                e.b(b23Var, new h23<>((String) null, p43Var.a, true));
                return;
            }
            SignalResponse signalResponse = (SignalResponse) a2.adapter(SignalResponse.class).fromJson(str);
            ka3<n23, SignalResponse> e2 = e();
            if (e2 == null) {
                return;
            }
            e2.b(b23Var, new h23<>(signalResponse, p43Var.a, true));
        } catch (JsonDataException e3) {
            xz2.b("MediationLoadedSignalReq", "Error trying to convert the json", e3);
            ka3<n23, SignalResponse> e4 = e();
            if (e4 == null) {
                return;
            }
            e4.a(b23Var, new h23<>("Error trying to convert the json", p43Var.a, true), e3);
        } catch (IOException e5) {
            xz2.b("MediationLoadedSignalReq", "Error trying to convert the json", e5);
            ka3<n23, SignalResponse> e6 = e();
            if (e6 == null) {
                return;
            }
            e6.a(b23Var, new h23<>("Error trying to convert the json", p43Var.a, true), e5);
        }
    }
}