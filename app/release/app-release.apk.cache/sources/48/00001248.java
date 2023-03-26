package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Lb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0792Lb extends RelativeLayout implements InterfaceC0899Pf, InterfaceC0880Om, InterfaceC0897Pd {
    public static String[] A0D;
    public static final K3 A0E;
    public static final C0761Jt A0F;
    public static final JJ A0G;
    public static final IO A0H;
    public static final IN A0I;
    public static final IA A0J;
    public static final C0719Hz A0K;
    public static final C0714Hu A0L;
    public int A00;
    public JL A01;
    public C0884Oq A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final Handler A07;
    public final View.OnTouchListener A08;
    public final C1080Wh A09;
    public final C9J<C9K, C9I> A0A;
    public final List<InterfaceC0887Ot> A0B;
    public final InterfaceC0896Pc A0C;

    public static void A0H() {
        A0D = new String[]{"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    }

    static {
        A0H();
        A0G = new JJ();
        A0E = new K3();
        A0H = new IO();
        A0I = new IN();
        A0F = new C0761Jt();
        A0J = new IA();
        A0L = new C0714Hu();
        A0K = new C0719Hz();
    }

    public C0792Lb(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A0B = new ArrayList();
        this.A06 = new Handler();
        this.A07 = new Handler();
        this.A0A = new C9J<>();
        this.A05 = true;
        this.A00 = 200;
        this.A08 = new View$OnTouchListenerC0878Ok(this);
        this.A09 = c1080Wh;
        if (A0P(c1080Wh)) {
            this.A0C = new GC(c1080Wh);
        } else {
            this.A0C = new GB(c1080Wh);
        }
        A0F();
    }

    public C0792Lb(C1080Wh c1080Wh, AttributeSet attributeSet) {
        super(c1080Wh, attributeSet);
        this.A0B = new ArrayList();
        this.A06 = new Handler();
        this.A07 = new Handler();
        this.A0A = new C9J<>();
        this.A05 = true;
        this.A00 = 200;
        this.A08 = new View$OnTouchListenerC0878Ok(this);
        this.A09 = c1080Wh;
        if (A0P(c1080Wh)) {
            this.A0C = new GC(c1080Wh, attributeSet);
        } else {
            this.A0C = new GB(c1080Wh, attributeSet);
        }
        A0F();
    }

    public C0792Lb(C1080Wh c1080Wh, AttributeSet attributeSet, int i) {
        super(c1080Wh, attributeSet, i);
        this.A0B = new ArrayList();
        this.A06 = new Handler();
        this.A07 = new Handler();
        this.A0A = new C9J<>();
        this.A05 = true;
        this.A00 = 200;
        this.A08 = new View$OnTouchListenerC0878Ok(this);
        this.A09 = c1080Wh;
        if (A0P(c1080Wh)) {
            this.A0C = new GC(c1080Wh, attributeSet, i);
        } else {
            this.A0C = new GB(c1080Wh, attributeSet, i);
        }
        A0F();
    }

    public static /* synthetic */ C0761Jt A0B() {
        C0761Jt c0761Jt = A0F;
        if (A0D[1].length() != 30) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[2] = "s0JISK";
        strArr[2] = "s0JISK";
        return c0761Jt;
    }

    public static /* synthetic */ JJ A0C() {
        JJ jj = A0G;
        if (A0D[0].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[6] = "XnBln0F0zo0j2g49JSScdoR2";
        strArr[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return jj;
    }

    private void A0F() {
        this.A09.A0A().A2u();
        this.A0C.setRequestedVolume(1.0f);
        this.A0C.setVideoStateChangeListener(this);
        this.A02 = new C0884Oq(this.A09, this.A0C);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A06.postDelayed(new MO(this), this.A00);
    }

    private final void A0I() {
        for (InterfaceC0887Ot plugin : this.A0B) {
            if (plugin instanceof K6) {
                A0N((K6) plugin);
            }
            plugin.A7s(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(JK jk) {
        JL jl = this.A01;
        if (jl == null) {
            return;
        }
        jl.A03(jk, null);
    }

    private void A0M(InterfaceC0887Ot interfaceC0887Ot) {
        if (interfaceC0887Ot instanceof K6) {
            A0O((K6) interfaceC0887Ot);
        }
        interfaceC0887Ot.ADa(this);
    }

    private void A0N(K6 k6) {
        if (k6.getParent() == null) {
            if (k6 instanceof C04597a) {
                this.A02.A01(k6);
            } else {
                addView(k6);
            }
        }
    }

    private void A0O(K6 k6) {
        if (k6 instanceof C04597a) {
            this.A02.A02(k6);
        } else {
            C0795Le.A0M(k6);
        }
    }

    private boolean A0P(C1080Wh c1080Wh) {
        if (GC.A0A()) {
            boolean A1d = J8.A1d(c1080Wh);
            if (A0D[2].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[0] = "Y2Yi8VJKipCio7lj7Ydrs3ww6YI9yuS";
            strArr[0] = "Y2Yi8VJKipCio7lj7Ydrs3ww6YI9yuS";
            if (A1d) {
                return true;
            }
        }
        return false;
    }

    public final void A0S() {
        this.A0C.setVideoStateChangeListener(null);
        this.A0C.destroy();
    }

    public final void A0T() {
        if (A0f()) {
            return;
        }
        this.A0C.A7E();
    }

    public final void A0U() {
        Iterator<InterfaceC0887Ot> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0D[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            strArr[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (hasNext) {
                InterfaceC0887Ot plugin = it.next();
                A0M(plugin);
            } else {
                this.A0B.clear();
                String[] strArr2 = A0D;
                if (strArr2[4].length() != strArr2[3].length()) {
                    String[] strArr3 = A0D;
                    strArr3[4] = "dBG";
                    strArr3[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0V(int i) {
        this.A06.removeCallbacksAndMessages(null);
        this.A0C.seekTo(i);
    }

    public final void A0W(int i) {
        this.A0C.ADO(i);
    }

    public final void A0X(EnumC0882Oo enumC0882Oo) {
        this.A07.post(new C0793Lc(this));
        this.A0C.ADE(enumC0882Oo.A02());
    }

    public final void A0Y(EnumC0886Os enumC0886Os, int i) {
        if (this.A03 && this.A0C.getState() == EnumC0898Pe.A06) {
            this.A03 = false;
        }
        this.A0C.ADI(enumC0886Os, i);
    }

    public final void A0Z(InterfaceC0887Ot interfaceC0887Ot) {
        this.A0B.add(interfaceC0887Ot);
    }

    public final void A0a(InterfaceC0887Ot interfaceC0887Ot) {
        this.A0B.remove(interfaceC0887Ot);
        A0M(interfaceC0887Ot);
    }

    public final void A0b(boolean z, int i) {
        if (A0f()) {
            return;
        }
        this.A0C.ABX(z, i);
    }

    public final void A0c(boolean z, boolean z2, int i) {
        this.A05 = z2;
        A0b(z, i);
    }

    public final boolean A0d() {
        return this.A0C.A7L();
    }

    public final boolean A0e() {
        return getVolume() == 0.0f;
    }

    public final boolean A0f() {
        return getState() == EnumC0898Pe.A05;
    }

    public final boolean A0g() {
        return A0f() && this.A0C.A7h();
    }

    public final boolean A0h() {
        return getState() == EnumC0898Pe.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Om
    public final boolean A7b() {
        return A0P(this.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Om
    public final boolean A7d() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0899Pf
    public final void AA7() {
        A0b(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0899Pf
    public final void AA8() {
        A0Y(EnumC0886Os.A05, 6);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0899Pf
    public final void AAt(int i, int i2) {
        this.A07.post(new MM(this, i, i2));
        A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0899Pf
    public final void ABN(EnumC0898Pe enumC0898Pe) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        this.A07.post(new MN(this, enumC0898Pe, getDuration(), currentPositionInMillis));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Om
    public int getCurrentPositionInMillis() {
        return this.A0C.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0C.getDuration();
    }

    @NonNull
    public C9J<C9K, C9I> getEventBus() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Om
    public long getInitialBufferTime() {
        return this.A0C.getInitialBufferTime();
    }

    public EnumC0898Pe getState() {
        return this.A0C.getState();
    }

    public Handler getStateHandler() {
        return this.A07;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0C;
    }

    public int getVideoHeight() {
        return this.A0C.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Om
    public EnumC0886Os getVideoStartReason() {
        return this.A0C.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0C.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Om
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Om
    public float getVolume() {
        return this.A0C.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0A.A03(A0K);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0A.A03(A0L);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        InterfaceC0896Pc interfaceC0896Pc = this.A0C;
        if (interfaceC0896Pc != null) {
            interfaceC0896Pc.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(JL jl) {
        this.A01 = jl;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0C.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0C.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A00 = i;
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            A0U();
        } else {
            A0I();
            this.A0C.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(@Nullable String str) {
        this.A09.A0A().A31(str);
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0J(JK.A0b);
            this.A09.A0A().A35();
        } else {
            A0J(JK.A0a);
            this.A09.A0A().A34();
        }
        this.A0C.setRequestedVolume(f);
        C9J<C9K, C9I> eventBus = getEventBus();
        if (A0D[2].length() == 19) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        strArr[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A03(A0J);
    }
}