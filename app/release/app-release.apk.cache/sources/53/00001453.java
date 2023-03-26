package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class U7 extends C6Z {
    public final Context A00;
    public final ApplicationInfo A01;
    public final C04325z A02;
    public final AnonymousClass72 A03;

    public U7(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = c04325z;
        this.A03 = AnonymousClass72.A00(this.A00, this.A02.A0a(), this.A02.A0g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC04566x A05(HashMap<Integer, U6> hashMap) {
        return new WY(SystemClock.elapsedRealtime(), A03(), hashMap, EnumC04556w.A06);
    }

    public final InterfaceC04416i A0H() {
        return new C1017Tw(this);
    }

    public final InterfaceC04416i A0I() {
        return new C1015Tu(this);
    }

    public final InterfaceC04416i A0J() {
        return new C1014Tt(this);
    }

    public final InterfaceC04416i A0K() {
        return new C1010Tp(this);
    }

    public final InterfaceC04416i A0L() {
        return new U1(this);
    }

    public final InterfaceC04416i A0M() {
        return new U4(this);
    }

    public final InterfaceC04416i A0N() {
        return new C1018Tx(this);
    }

    public final InterfaceC04416i A0O() {
        return new C1019Ty(this);
    }

    public final InterfaceC04416i A0P() {
        return new U2(this);
    }

    public final InterfaceC04416i A0Q() {
        return new U5(this);
    }

    public final InterfaceC04416i A0R() {
        return new U3(this);
    }

    public final InterfaceC04416i A0S() {
        return new U0(this);
    }

    public final InterfaceC04416i A0T() {
        return new C1020Tz(this);
    }

    public final InterfaceC04416i A0U() {
        return new C1008Tn(this);
    }

    public final InterfaceC04416i A0V() {
        return new C1009To(this);
    }

    public final InterfaceC04416i A0W() {
        return new C1011Tq(this);
    }

    public final InterfaceC04416i A0X() {
        return new C1012Tr(this);
    }

    public final InterfaceC04416i A0Y() {
        return new C1013Ts(this);
    }

    public final InterfaceC04416i A0Z() {
        return new C1016Tv(this);
    }
}