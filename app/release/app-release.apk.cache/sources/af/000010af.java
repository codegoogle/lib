package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* loaded from: assets/audience_network.dex */
public final class Ep extends AbstractC0962Rq {
    public static String[] A03;
    @VisibleForTesting
    public static final InterfaceC03261t A04;
    @Nullable
    public C0967Rv A00;
    public final C03251s A01;
    public final C1080Wh A02;

    public static void A00() {
        A03 = new String[]{"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    }

    static {
        A00();
        A04 = new S0();
    }

    public Ep(C03251s c03251s) {
        super(c03251s.A05(), A04.A4M(c03251s));
        this.A01 = c03251s;
        this.A02 = c03251s.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0962Rq
    public final void A05() {
        C0967Rv c0967Rv = this.A00;
        if (c0967Rv != null) {
            c0967Rv.A0A();
        }
        InterfaceC03221p interfaceC03221p = super.A00;
        EnumC03211o enumC03211o = EnumC03211o.A04;
        if (A03[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        strArr[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC03221p.ACt(enumC03211o);
    }

    public final void A07() {
        this.A00 = new C0967Rv(this.A01, this, super.A02);
        this.A00.A0B(this.A01.A0A(), this.A01.A06());
    }

    public final void A08(InterstitialAd interstitialAd, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        if (super.A00.A51()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        C0967Rv c0967Rv = this.A00;
        if (c0967Rv != null) {
            c0967Rv.A0B(enumSet, str);
            return;
        }
        this.A01.A0J(enumSet);
        this.A01.A0G(str);
        A07();
    }

    public final boolean A09() {
        C0967Rv c0967Rv = this.A00;
        if (c0967Rv != null) {
            return c0967Rv.A0C();
        }
        if (this.A01.A00() > 0) {
            int i = (LW.A00() > this.A01.A00() ? 1 : (LW.A00() == this.A01.A00() ? 0 : -1));
            if (A03[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            strArr[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0A() {
        C0967Rv c0967Rv = this.A00;
        if (c0967Rv != null) {
            return c0967Rv.A0D();
        }
        return super.A00.A5I() == EnumC03211o.A06;
    }

    public final boolean A0B(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A52()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        C0967Rv c0967Rv = this.A00;
        if (c0967Rv != null) {
            return c0967Rv.A0E();
        }
        this.A00 = new C0967Rv(this.A01, this, super.A02);
        this.A00.A0E();
        return false;
    }
}