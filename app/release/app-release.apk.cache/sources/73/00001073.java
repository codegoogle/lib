package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Dn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0609Dn extends C0985Sq {
    public static String[] A00;

    static {
        A00();
    }

    public static void A00() {
        A00 = new String[]{"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};
    }

    public C0609Dn(AnonymousClass51 anonymousClass51) {
        super(anonymousClass51);
    }

    @Override // com.facebook.ads.redexgen.X.C0985Sq, com.facebook.ads.redexgen.X.M6
    public final void A3s(String rewardedVideoError) {
        if (this.A00.get() == null) {
            return;
        }
        AnonymousClass51 anonymousClass51 = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        strArr[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        anonymousClass51.A0E(rewardedVideoError);
        String A02 = EnumC0888Ou.A08.A02();
        String A022 = EnumC0888Ou.A09.A02();
        if (rewardedVideoError.equals(A02)) {
            this.A00.get().finish(11);
        } else if (rewardedVideoError.equals(A022)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0985Sq, com.facebook.ads.redexgen.X.M6
    public final void A3t(String str, C9I c9i) {
        super.A3t(str, c9i);
    }
}