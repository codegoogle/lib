package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Hf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0699Hf extends AbstractRunnableC0770Kc {
    public static String[] A02;
    public final /* synthetic */ int A00;
    public final /* synthetic */ P1 A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"NpaKE5UdtAyMHqvaLPx4AGtZ31wY3C1j", "hZ", "QvlAFGERqyhtEWGueXr2oEhguGRVkueU", "1PB7Q2A0OVus1FFgj1K4N07XZBnviAmq", "QCLV5siYIKSB8enqXDrdMSWnSISBhPag", "u71qdrqstjoPYAgdzxDuhzTAB45rQyDC", "tsgBYsPi1Izoi1wW5rl36QAscdyZX4HE", "imzaDMEG6ltP9AayN9N6Pvq8SnbIyMdS"};
    }

    public C0699Hf(P1 p1, int i) {
        this.A01 = p1;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C0792Lb videoView;
        C0792Lb videoView2;
        videoView = this.A01.A00.A00.getVideoView();
        if (videoView != null) {
            int i = this.A00;
            if (A02[1].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "iSSYmESuchF7uAVhXaEYpov3466pRlYS";
            strArr[5] = "iSSYmESuchF7uAVhXaEYpov3466pRlYS";
            if (i <= 0) {
                videoView2 = this.A01.A00.A00.getVideoView();
                videoView2.A0b(false, 9);
            }
        }
    }
}