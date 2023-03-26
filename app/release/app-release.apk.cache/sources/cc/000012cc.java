package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Nk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0852Nk extends C4X {
    public static String[] A0A;
    @DoNotStrip
    public AbstractC0900Pg A00;
    public C0901Ph A01;
    @Nullable
    public C0901Ph A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C1080Wh A08;
    public final AbstractC0930Qk A09;

    static {
        A08();
    }

    public static void A08() {
        A0A = new String[]{"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    }

    public C0852Nk(AbstractC0930Qk abstractC0930Qk, SparseBooleanArray sparseBooleanArray, C0901Ph c0901Ph, int i, int i2, int i3, int i4, C1080Wh c1080Wh) {
        super(abstractC0930Qk);
        this.A08 = c1080Wh;
        this.A09 = abstractC0930Qk;
        this.A07 = sparseBooleanArray;
        this.A01 = c0901Ph;
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
    }

    private void A09(JE je, LX lx, String str, OQ oq) {
        if (this.A07.get(oq.A02())) {
            return;
        }
        C0901Ph c0901Ph = this.A02;
        if (c0901Ph != null) {
            c0901Ph.A0X();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            strArr[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new OL(this, str, oq, je, oq.A04(), lx);
        this.A02 = new C0901Ph(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0a(false);
        this.A02.A0Y(100);
        this.A02.A0Z(100);
        this.A09.setOnAssetsLoadedListener(new O0(this, oq));
    }

    public final void A0m(OQ oq, JE je, C7H c7h, LX lx, String videoUrl) {
        int A02 = oq.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        marginLayoutParams.setMargins(A02 == 0 ? this.A04 : this.A05, 0, A02 >= this.A06 + (-1) ? this.A04 : this.A05, 0);
        String A07 = oq.A03().A0E().A07();
        String A08 = oq.A03().A0E().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A09.A0k()) {
            this.A09.setVideoPlaceholderUrl(A07);
            this.A09.setVideoUrl(c7h.A0M(A08));
        } else {
            this.A09.setImageUrl(A07);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(oq.A03().A0F().A06(), oq.A03().A0F().A01());
        this.A09.setCTAInfo(oq.A03().A0G(), oq.A04());
        this.A09.A0i(oq.A04());
        A09(je, lx, videoUrl, oq);
    }
}