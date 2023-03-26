package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1252bJ implements InterfaceC0883Op {
    public static String[] A01;
    public final /* synthetic */ C1258bP A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"T9VzL8fHxpfySiwwlXedeY7mX", "guyVlBlOMcVDAIfN1wPFopCO0r0Zk0gq", "ttKJ4peW2WPtu1OROjgTykJGR", "A5J8ePX4fIk14ZpUSfaCkLGHXqqMAYt6", "kQp8myZeu", "7L0NbJj9RoUIRUZ", "UhNplE17b8XX", "zMftdbZDucx4tcPG97oOAYZ8vQU5TBbw"};
    }

    public C1252bJ(C1258bP c1258bP) {
        this.A00 = c1258bP;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0883Op
    public final void ABI() {
        AtomicBoolean atomicBoolean;
        JT jt;
        JT jt2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        jt = this.A00.A02;
        if (jt == null) {
            return;
        }
        jt2 = this.A00.A02;
        atomicBoolean2 = this.A00.A0D;
        boolean z = atomicBoolean2.get();
        if (A01[1].charAt(3) == 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
        strArr[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
        jt2.AAP(z);
    }
}