package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class ZT implements M0 {
    public static String[] A01;
    public final /* synthetic */ YA A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"rR3MQXnxH1GXPkPV1PgRqgdt6qAZ8aBc", "thx7zZihUvA4zDglxpqJ8", "GT9LpnhCusFld3d6m5Ylaq2YY93CXZTz", "CEYcJLQZRcUyVb0GbNJEX1KNnfWwQfE2", "P05vWpU8TGR89ExqviT8AvwxGU5kpxcL", "lyVbFyj9sQoux55muYN3p2AWW", "FBc7SUvMlEnZMMlwSnzRcI2535EomHFs", "rjU0a8GNBirc6jTbd1zIs9BaAuj9QLsR"};
    }

    public ZT(YA ya) {
        this.A00 = ya;
    }

    @Override // com.facebook.ads.redexgen.X.M0
    public final void A9A() {
        boolean z;
        JL jl;
        M6 m6;
        InterfaceC0818Mb interfaceC0818Mb;
        AtomicBoolean atomicBoolean;
        boolean A0W;
        z = this.A00.A0N;
        if (z) {
            atomicBoolean = this.A00.A0L;
            boolean z2 = atomicBoolean.get();
            if (A01[5].length() == 32) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "Rosc2egaZ2bfxLAQiTqXfx2zjuVcC1pu";
            strArr[2] = "vMXK6MvWFWmZqWG9iCsHx320m1OPkYMA";
            if (!z2) {
                A0W = this.A00.A0W();
                if (A0W) {
                    this.A00.A0P.setToolbarActionMode(0);
                    this.A00.A0K();
                    return;
                }
            }
        }
        jl = this.A00.A0E;
        jl.A03(JK.A07, null);
        m6 = this.A00.A0H;
        interfaceC0818Mb = this.A00.A0I;
        m6.A3s(interfaceC0818Mb.A67());
    }
}