package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HS extends ImageView implements InterfaceC0887Ot {
    public static byte[] A05;
    public static String[] A06;
    public static final int A07;
    @Nullable
    public C0792Lb A00;
    public final Paint A01;
    public final C1080Wh A02;
    public final JL A03;
    public final I0 A04;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    public static void A07() {
        A06 = new String[]{"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    }

    static {
        A07();
        A06();
        A07 = (int) (C0795Le.A01 * 4.0f);
    }

    public HS(C1080Wh c1080Wh, JL jl) {
        super(c1080Wh);
        this.A04 = new I0() { // from class: com.facebook.ads.redexgen.X.7b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(IA ia) {
                HS.this.A0A();
            }
        };
        this.A03 = jl;
        this.A02 = c1080Wh;
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        int i = A07;
        setPadding(i, i, i, i);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new P6(this));
    }

    private void A04() {
        setImageBitmap(C0804Ln.A00(EnumC0803Lm.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(C0804Ln.A00(EnumC0803Lm.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A08() {
        C0792Lb c0792Lb = this.A00;
        if (c0792Lb != null) {
            float volume = c0792Lb.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A0A() {
        if (this.A00 == null) {
            return;
        }
        if (A08()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void A7s(C0792Lb c0792Lb) {
        this.A00 = c0792Lb;
        C0792Lb c0792Lb2 = this.A00;
        if (c0792Lb2 != null) {
            c0792Lb2.getEventBus().A06(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void ADa(C0792Lb c0792Lb) {
        C0792Lb c0792Lb2 = this.A00;
        if (c0792Lb2 != null) {
            c0792Lb2.getEventBus().A07(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.A01);
        super.onDraw(canvas);
    }
}