package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Od  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0871Od {
    public static String[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final AnonymousClass17 A00;
    public final C1G A01;
    public final C1J A02;
    public final C1Q A03;
    public final C1080Wh A04;
    public final JL A05;

    public static void A02() {
        A06 = new String[]{"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    }

    static {
        A02();
        A09 = (int) (C0795Le.A01 * 4.0f);
        A07 = (int) (C0795Le.A01 * 72.0f);
        A08 = (int) (C0795Le.A01 * 8.0f);
    }

    public C0871Od(C1080Wh c1080Wh, JE je, AnonymousClass16 anonymousClass16) {
        this.A04 = c1080Wh;
        this.A05 = new JL(anonymousClass16.A0Q(), je);
        this.A00 = anonymousClass16.A0L();
        this.A01 = anonymousClass16.A0M().A0F();
        this.A03 = anonymousClass16.A0O();
        this.A02 = anonymousClass16.A0M().A0H();
    }

    private View A00() {
        ES es = new ES(this.A04);
        es.setLayoutManager(new SW(this.A04, 0, false));
        es.setAdapter(new NW(this.A04, this.A02.A00(), A09));
        return es;
    }

    private View A01(@Nullable View$OnClickListenerC1087Wo view$OnClickListenerC1087Wo) {
        C0853Nl c0853Nl = new C0853Nl(this.A04, this.A00.A01(), true, false, false);
        c0853Nl.A02(this.A01.A06(), this.A01.A01(), null, false, true);
        c0853Nl.setAlignment(17);
        C0847Nf c0847Nf = new C0847Nf(this.A04);
        C0795Le.A0P(c0847Nf, 0);
        c0847Nf.setRadius(50);
        new AsyncTaskC1091Ws(c0847Nf, this.A04).A05().A08(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = A07;
        linearLayout.addView(c0847Nf, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A08;
        layoutParams.setMargins(0, i2, 0, i2);
        linearLayout.addView(c0853Nl, layoutParams);
        if (view$OnClickListenerC1087Wo != null) {
            C0795Le.A0M(view$OnClickListenerC1087Wo);
            linearLayout.addView(view$OnClickListenerC1087Wo, layoutParams);
            if (TextUtils.isEmpty(view$OnClickListenerC1087Wo.getText())) {
                C0795Le.A0K(view$OnClickListenerC1087Wo);
            }
        }
        return linearLayout;
    }

    public final Pair<EnumC0870Oc, View> A03(@Nullable View$OnClickListenerC1087Wo view$OnClickListenerC1087Wo) {
        View A00;
        EnumC0870Oc A04 = A04();
        if (C0869Ob.A00[A04.ordinal()] != 1) {
            A00 = A01(view$OnClickListenerC1087Wo);
        } else {
            A00 = A00();
        }
        JN.A04(A00, this.A05, JK.A0S);
        return new Pair<>(A04, A00);
    }

    public final EnumC0870Oc A04() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC0870Oc.A04;
        }
        EnumC0870Oc enumC0870Oc = EnumC0870Oc.A03;
        String[] strArr = A06;
        if (strArr[3].charAt(8) != strArr[7].charAt(8)) {
            String[] strArr2 = A06;
            strArr2[4] = "qwlEjiYhEcV8j1J";
            strArr2[4] = "qwlEjiYhEcV8j1J";
            return enumC0870Oc;
        }
        throw new RuntimeException();
    }
}