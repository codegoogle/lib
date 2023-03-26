package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class MN extends AbstractRunnableC0770Kc {
    public static String[] A04;
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0792Lb A02;
    public final /* synthetic */ EnumC0898Pe A03;

    static {
        A00();
    }

    public static void A00() {
        A04 = new String[]{"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    }

    public MN(C0792Lb c0792Lb, EnumC0898Pe enumC0898Pe, int i, int i2) {
        this.A02 = c0792Lb;
        this.A03 = enumC0898Pe;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C1080Wh c1080Wh;
        Handler handler;
        C9J c9j;
        C1080Wh c1080Wh2;
        C9J c9j2;
        IN in;
        Handler handler2;
        C1080Wh c1080Wh3;
        C9J c9j3;
        Handler handler3;
        C1080Wh c1080Wh4;
        C9J c9j4;
        Handler handler4;
        C1080Wh c1080Wh5;
        Handler handler5;
        C9J c9j5;
        C9J c9j6;
        K3 k3;
        C1080Wh c1080Wh6;
        C9J c9j7;
        if (this.A03 == EnumC0898Pe.A07) {
            this.A02.A0J(JK.A0m);
            c1080Wh6 = this.A02.A09;
            c1080Wh6.A0A().A30();
            c9j7 = this.A02.A0A;
            c9j7.A03(C0792Lb.A0C());
        } else if (this.A03 == EnumC0898Pe.A03) {
            this.A02.A0J(JK.A0h);
            this.A02.A03 = true;
            c9j6 = this.A02.A0A;
            k3 = C0792Lb.A0E;
            c9j6.A03(k3);
        } else {
            EnumC0898Pe enumC0898Pe = this.A03;
            EnumC0898Pe enumC0898Pe2 = EnumC0898Pe.A06;
            String[] strArr = A04;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
            strArr2[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
            if (enumC0898Pe == enumC0898Pe2) {
                this.A02.A0J(JK.A0g);
                c1080Wh5 = this.A02.A09;
                c1080Wh5.A0A().A2s();
                this.A02.A03 = true;
                handler5 = this.A02.A06;
                handler5.removeCallbacksAndMessages(null);
                c9j5 = this.A02.A0A;
                int i = this.A01;
                c9j5.A03(new C7v(i, i));
            } else if (this.A03 == EnumC0898Pe.A0A) {
                this.A02.A0J(JK.A0k);
                c1080Wh4 = this.A02.A09;
                c1080Wh4.A0A().A37();
                c9j4 = this.A02.A0A;
                c9j4.A03(C0792Lb.A0B());
                handler4 = this.A02.A06;
                handler4.removeCallbacksAndMessages(null);
                this.A02.A0G();
            } else if (this.A03 == EnumC0898Pe.A05) {
                this.A02.A0J(JK.A0j);
                c1080Wh3 = this.A02.A09;
                c1080Wh3.A0A().A2w();
                c9j3 = this.A02.A0A;
                c9j3.A03(new K5(this.A00) { // from class: com.facebook.ads.redexgen.X.7t
                });
                handler3 = this.A02.A06;
                handler3.removeCallbacksAndMessages(null);
            } else if (this.A03 == EnumC0898Pe.A04) {
                this.A02.A0J(JK.A0i);
                c1080Wh2 = this.A02.A09;
                c1080Wh2.A0A().A2t();
                c9j2 = this.A02.A0A;
                in = C0792Lb.A0I;
                c9j2.A03(in);
                handler2 = this.A02.A06;
                handler2.removeCallbacksAndMessages(null);
            } else if (this.A03 == EnumC0898Pe.A09) {
                this.A02.A0J(JK.A0g);
                c1080Wh = this.A02.A09;
                c1080Wh.A0A().A32();
                this.A02.A03 = true;
                handler = this.A02.A06;
                handler.removeCallbacksAndMessages(null);
                c9j = this.A02.A0A;
                c9j.A03(new C7v(this.A00, this.A01));
            }
        }
    }
}