package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.71  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass71 {
    public int A00;
    public final Context A01;
    public final C04325z A02;
    public final InterfaceC04576y A03;
    public final InterfaceC04586z A04;
    public final Set<C04386f> A05 = new HashSet();

    public AnonymousClass71(Context context, C04325z c04325z) {
        this.A02 = c04325z;
        this.A01 = context;
        this.A04 = c04325z.A0c();
        this.A03 = c04325z.A0b();
    }

    @Nullable
    private C04546v A00() {
        if (this.A02.A0a() == EnumC04456m.A0G) {
            return null;
        }
        Context context = this.A01;
        return new C04546v(context == null ? "" : context.getPackageName());
    }

    @SuppressLint({"CatchGeneralException"})
    private void A01(long j) {
        AbstractC04566x signalValueTypeDef;
        try {
            JSONObject jSONObject = new JSONObject();
            for (C04386f c04386f : this.A05) {
                InterfaceC04416i A01 = c04386f.A01();
                if (A01 == null) {
                    signalValueTypeDef = new WS(SystemClock.elapsedRealtime(), A00(), new C04536u(EnumC04526t.A04));
                } else {
                    signalValueTypeDef = A01.A50();
                }
                jSONObject.put(Integer.toString(c04386f.A00()), signalValueTypeDef.A0A(false));
            }
            throw null;
        } catch (Throwable t) {
            C6B.A04(t);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private void A02(long j) {
        try {
            this.A02.A0j().schedule(new Runnable() { // from class: com.facebook.ads.redexgen.X.70
                @Override // java.lang.Runnable
                public final void run() {
                    if (KU.A02(this)) {
                        return;
                    }
                    try {
                        AnonymousClass71.this.A03();
                    } catch (Throwable th) {
                        KU.A00(th, this);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C6B.A04(th);
        }
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    public final void A03() {
        if (this.A02.A0W() <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A04.getLastPeriodicCollectionTimeMs() >= this.A02.A0W()) {
            A01(currentTimeMillis);
            A02(this.A02.A0W());
            return;
        }
        A02(Math.abs(currentTimeMillis - (this.A04.getLastPeriodicCollectionTimeMs() + this.A02.A0W())));
    }

    public final void A04(int i) {
        this.A00 = i;
    }

    public final void A05(C04386f c04386f) {
        this.A05.add(c04386f);
    }
}