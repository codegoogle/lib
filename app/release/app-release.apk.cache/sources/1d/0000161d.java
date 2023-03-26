package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.bZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1267bZ implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, InterfaceC0751Jh {
    public static C7H A0g;
    public static byte[] A0h;
    public static String[] A0i;
    public static final String A0j;
    public static final WeakHashMap<View, WeakReference<C1267bZ>> A0k;
    public long A00;
    @Nullable
    public Drawable A01;
    public View.OnTouchListener A02;
    @Nullable
    public View A03;
    public View A04;
    @Nullable
    public View A05;
    @Nullable
    public NativeAdLayout A06;
    public EnumC03060z A07;
    @Nullable
    public RL A08;
    public C0636Es A09;
    @Nullable
    public C0956Rk A0A;
    @Nullable
    public C7M A0B;
    @Nullable
    public AnonymousClass91 A0C;
    public JU A0D;
    public View$OnClickListenerC1265bX A0E;
    @Nullable
    public InterfaceC1268ba A0F;
    public C0745Jb A0G;
    public EnumC0746Jc A0H;
    public EnumC0760Js A0I;
    public C0817Ma A0J;
    @Nullable
    public NS A0K;
    @Nullable
    public OV A0L;
    @DoNotStrip
    public AbstractC0900Pg A0M;
    public C0901Ph A0N;
    public String A0O;
    @Nullable
    public String A0P;
    public WeakReference<C0984Sp> A0Q;
    public WeakReference<AbstractC0900Pg> A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    @Nullable
    public RG A0W;
    public final C7H A0X;
    public final C1080Wh A0Y;
    public final JY A0Z;
    public final C0753Jj A0a;
    public final LX A0b;
    public final String A0c;
    public final String A0d;
    public final List<View> A0e;
    public volatile boolean A0f;

    public static String A0S(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0X() {
        A0h = new byte[]{89, -116, 91, 95, 90, 95, -118, 96, -90, -89, -38, -88, -86, -86, -92, -40, -75, -77, -75, -30, -73, -27, -71, -28, -38, -40, -34, Flags.CD, 8, 12, 10, Flags.CD, 114, 114, -95, 112, 117, 116, 117, -99, -67, -32, -100, -22, -21, -16, -100, -24, -21, -35, -32, bx.j7, -32, -110, -75, -102, -76, -64, -65, -89, -70, -74, -56, 113, -70, -60, 113, -66, -70, -60, -60, -70, -65, -72, g15.c, -88, -53, -69, -52, -44, -41, -45, -56, -37, -52, -121, -114, -116, -38, -114, -121, -48, -38, -121, -43, -42, -37, -121, -56, -121, -43, -56, -37, -48, -35, -52, -121, -56, -53, -96, -100, -101, -49, -66, -61, -65, -56, -67, -65, -88, -65, -50, -47, -55, -52, -59, -82, -55, -47, -44, -51, -52, -120, -36, -41, -120, -44, -41, -55, -52, -120, -75, -51, -52, -47, -55, -106, -50, -23, -15, -12, -19, -20, -88, -4, -9, -88, -9, -22, -4, -23, -15, -10, -88, -4, -19, -11, -8, -12, -23, -4, -19, -88, -47, -52, -88, -18, -6, -9, -11, -88, -22, -15, -20, -88, -8, -23, 1, -12, -9, -23, -20, -88, -81, -83, -5, -81, -77, -40, -34, -49, -36, -40, -53, -42, -118, -49, -36, -36, bx.l7, -36, -104, 116, -75, -38, -30, -51, -40, -43, -48, -116, -33, -47, -32, -116, -37, -46, -116, -49, -40, -43, -49, -41, -51, -50, -40, -47, -116, -30, -43, -47, -29, -33, -117, -93, -94, -89, -97, -108, -89, -93, -75, 94, -89, -79, 94, -85, -89, -79, -79, -89, -84, -91, 108, -50, -10, -12, -11, -95, -15, -13, -16, -9, -22, -27, -26, -95, -30, -95, -41, -22, -26, -8, -115, -96, -77, -88, -75, -92, 95, g15.b, -93, 95, -74, -96, -78, 95, -96, -85, -79, -92, -96, -93, -72, 95, -79, -92, -90, -88, -78, -77, -92, -79, -92, -93, 95, -74, -88, -77, -89, 95, -96, 95, -107, -88, -92, -74, 109, 95, g15.b, -76, -77, -82, 95, -76, -83, -79, -92, -90, -88, -78, -77, -92, -79, -88, -83, -90, 95, -96, -83, -93, 95, -81, -79, -82, -94, -92, -92, -93, -88, -83, -90, 109, -40, -21, -2, -13, 0, -17, -86, -21, -18, -86, -18, -17, -3, -2, -4, -7, 3, -17, -18, -123, -104, -85, -96, -83, -100, 87, -104, -101, 87, -93, -90, -104, -101, 87, -87, -100, -88, -84, -100, -86, -85, -100, -101, -58, bx.l7, -43, -25, -112, -47, -36, -30, -43, -47, -44, -23, -112, -30, -43, -41, bx.l7, -29, -28, -43, -30, -43, -44, -112, -25, bx.l7, -28, -40, -112, -47, -112, -66, -47, -28, bx.l7, -26, -43, -79, -44, -98, -112, -79, -27, -28, -33, -112, -27, -34, -30, -43, -41, bx.l7, -29, -28, -43, -30, bx.l7, -34, -41, -112, -47, -34, -44, -112, -32, -30, -33, -45, -43, -43, -44, bx.l7, -34, -41, -98, -115, -96, -100, -82, 87, -91, -90, -85, 87, -87, -100, -98, -96, -86, -85, -100, -87, -100, -101, 87, -82, -96, -85, -97, 87, -85, -97, -96, -86, 87, -123, -104, -85, -96, -83, -100, 120, -101, -116, 91, 93, -115, 98, 94, 96, -112, -109, 79, -100, -108, -109, -104, -112, 79, -93, -88, -97, -108, 79, -104, -94, 79, -99, -98, -93, 79, -94, -92, -97, -97, -98, -95, -93, -108, -109, 93, -105, -102, -107, -86, -88, -105, -92, -87, -94, -105, -86, -97, -91, -92, -4, -1, 17, 0, 13, 15, 4, 14, 0, 13, -6, 9, -4, 8, 0, -30, -15, -22, -69, -56, -67, -46, -72, -74, -63, -63, -76, -55, -60, -76, -74, -72, -55, -66, -60, -61, -4, -3, Flags.CD, 12, 10, 7, 17, -90, -93, -97, -94, -86, -89, -84, -93, -54, -57, -52, -55, -67, -62, -61, -47, -63, -48, -57, -50, -46, -57, -51, -52, -75, -72, -86, -83, -118, -83, -91, -88, -102, -99, 122, -99, 97, 98, 89, -100, -102, -91, -91, -98, -99, 89, -90, -88, -85, -98, 89, -83, -95, -102, -89, 89, -88, -89, -100, -98, -94, -91, -105, -102, 119, -102, 124, -88, -91, -93, 120, -97, -102, -28, -41, -22, -33, -20, -37, -44, -59, bx.l7, -41, -55, -61, -40, -42, -59, -46, -41, -48, -59, -40, -51, -45, -46, -94, -98, -109, -85, -111, -90, -92, -109, -96, -91, -98, -109, -90, -101, -95, -96, -15, -13, -16, -18, -16, -11, -26, -27, -32, -11, -13, -30, -17, -12, -19, -30, -11, -22, -16, -17, -32, -36, -48, -42, -50, bx.l7, -52, -48, -36, -37, bx.j7, -46, -27, bx.j7, -79, -82, -83, -84, -79, -83, -80, -93, -94, -99, -78, -80, -97, -84, -79, -86, -97, -78, -89, -83, -84};
    }

    public static void A0Y() {
        A0i = new String[]{"Bl7Z7O36thNMsAQG86cT5hXAswukL2TU", "w0l3kgVUfrf8f1EzcfbBJ9JqF1JIQyF1", "3FYeVZ4P9Hva0brxRfDXnSutu97odoaf", "TkemScCQ72wM3yeu7V5OcaIZTlgQuG0T", "aV5nfdXEnoj7uvLi", "brDFWAS69jf159nGVdOYVvf", "WGIwYSb5Wjcv", "W7skGFSknqdZoaqu210O1mF"};
    }

    static {
        A0Y();
        A0X();
        A0j = C1267bZ.class.getSimpleName();
        A0k = new WeakHashMap<>();
    }

    public C1267bZ(Context context, String str, JY jy, boolean z) {
        this.A0d = UUID.randomUUID().toString();
        this.A0I = EnumC0760Js.A06;
        this.A0Q = new WeakReference<>(null);
        this.A0e = new ArrayList();
        this.A0b = new LX();
        this.A0V = false;
        this.A0U = false;
        this.A0D = JU.A04;
        this.A07 = EnumC03060z.A03;
        this.A00 = -1L;
        if (!z) {
            this.A0Y = AnonymousClass57.A04(context);
        } else {
            this.A0Y = AnonymousClass57.A02(context);
        }
        this.A0Y.A0C(this);
        this.A0c = str;
        this.A0Z = jy;
        C7H c7h = A0g;
        if (c7h != null) {
            this.A0X = c7h;
        } else {
            this.A0X = new C7H(this.A0Y);
        }
        this.A04 = new View(context);
        this.A0a = new C0753Jj(this.A0Y, this);
    }

    public C1267bZ(C1080Wh c1080Wh, RG rg, @Nullable AnonymousClass91 anonymousClass91, JY jy) {
        this((Context) c1080Wh, (String) null, jy, true);
        this.A0W = rg;
        this.A0C = anonymousClass91;
        this.A0f = true;
        this.A04 = new View(c1080Wh);
    }

    public C1267bZ(C1080Wh c1080Wh, RG rg, @Nullable AnonymousClass91 anonymousClass91, JY jy, @Nullable C0956Rk c0956Rk) {
        this(c1080Wh, rg, anonymousClass91, jy);
        this.A0A = c0956Rk;
    }

    public C1267bZ(C1267bZ c1267bZ) {
        this((Context) c1267bZ.A0Y, (String) null, c1267bZ.A0Z, true);
        this.A0C = c1267bZ.A0C;
        this.A0W = c1267bZ.A0W;
        this.A0A = c1267bZ.A0A;
        this.A0f = true;
        this.A04 = new View(this.A0Y);
    }

    private int A00() {
        AnonymousClass91 anonymousClass91 = this.A0C;
        if (anonymousClass91 != null) {
            return anonymousClass91.A04();
        }
        C0636Es c0636Es = this.A09;
        if (c0636Es == null || c0636Es.A0H() == null) {
            return 1;
        }
        return this.A09.A0H().A04();
    }

    private int A01() {
        AnonymousClass91 anonymousClass91 = this.A0C;
        if (anonymousClass91 != null) {
            return anonymousClass91.A07();
        }
        RG rg = this.A0W;
        if (rg != null) {
            int A0G = rg.A0G();
            String[] strArr = A0i;
            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                String[] strArr2 = A0i;
                strArr2[7] = "EUscbuPuA5cZxxPx7y6ncGc";
                strArr2[5] = "07NrZ6juCFttxvE5hiFlF8c";
                return A0G;
            }
            throw new RuntimeException();
        }
        C0636Es c0636Es = this.A09;
        if (c0636Es != null && c0636Es.A0H() != null) {
            return this.A09.A0H().A07();
        }
        return 0;
    }

    private int A02() {
        AnonymousClass91 anonymousClass91 = this.A0C;
        if (anonymousClass91 != null) {
            return anonymousClass91.A08();
        }
        RG rg = this.A0W;
        if (rg != null) {
            int A0H = rg.A0H();
            String[] strArr = A0i;
            if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
                String[] strArr2 = A0i;
                strArr2[1] = "wlXrbCoONy6aNPfJSLZ4JGG9g8lWOQWJ";
                strArr2[3] = "zMDzXw8vWIk5v34E7N5RdIcOKoPIh5je";
                return A0H;
            }
            throw new RuntimeException();
        }
        C0636Es c0636Es = this.A09;
        String[] strArr3 = A0i;
        if (strArr3[4].length() != strArr3[6].length()) {
            String[] strArr4 = A0i;
            strArr4[7] = "IJhE7OuQr9AUmHg0gZAU0NE";
            strArr4[5] = "Tpbr9nnLmrgR8Cas3OKWnYo";
            if (c0636Es == null) {
                return 1000;
            }
        } else {
            String[] strArr5 = A0i;
            strArr5[0] = "x7i9CQzVOJPdqJX1dHOWNRL80PPtBuUS";
            strArr5[2] = "xh5QtfSCbDAINUU48h4MV8p0ljd4aaCa";
            if (c0636Es == null) {
                return 1000;
            }
        }
        if (c0636Es.A0H() != null) {
            return this.A09.A0H().A08();
        }
        return 1000;
    }

    private int A03() {
        AnonymousClass91 anonymousClass91 = this.A0C;
        if (anonymousClass91 != null) {
            return anonymousClass91.A09();
        }
        C0636Es c0636Es = this.A09;
        if (c0636Es == null || c0636Es.A0H() == null) {
            return 0;
        }
        return this.A09.A0H().A09();
    }

    public static Drawable A05(C1080Wh c1080Wh, Bitmap bitmap, boolean z, @Nullable String str) {
        BitmapDrawable A00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c1080Wh.getResources(), bitmap);
        if (z && (A00 = OU.A00(c1080Wh, str)) != null) {
            return new LayerDrawable(new Drawable[]{bitmapDrawable, A00});
        }
        return bitmapDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws C0756Jn {
        EnumC0760Js A00 = C0765Jx.A00(str2);
        if (A00 != null) {
            EnumC0760Js enumC0760Js = EnumC0760Js.A05;
            String[] strArr = A0i;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[0] = "9sjWaS9CbZxjWOFrlYfgckD2h0ahWze6";
            strArr2[2] = "CgLfFBC4KJYZcdRIWMiGUMQeYT9XpqO1";
            if (A00 == enumC0760Js) {
                return new NativeBannerAd(context, str);
            }
            if (A00 == EnumC0760Js.A06) {
                return new NativeAd(context, str);
            }
            throw new C0756Jn(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0S(75, 34, 63), A00));
        }
        throw new C0756Jn(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0S(147, 50, 96), str2));
    }

    @Nullable
    private final RG A0C() {
        RG rg = this.A0W;
        if (rg != null && rg.A0g()) {
            return rg;
        }
        return null;
    }

    public static JY A0I() {
        return new bW();
    }

    public static C1267bZ A0J(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C1267bZ) ((C03944m) Proxy.getInvocationHandler(nativeAdBaseApi)).A05();
        }
        return (C1267bZ) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0L */
    public final C0744Ja getAdStarRating() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0L();
    }

    private AdPlacementType A0O() {
        return this.A0I == EnumC0760Js.A06 ? AdPlacementType.NATIVE : AdPlacementType.NATIVE_BANNER;
    }

    private void A0V() {
        for (View view : this.A0e) {
            view.setOnClickListener(null);
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0e.clear();
    }

    private void A0W() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            Kw.A09(new Kw(), this.A0Y, Uri.parse(getAdChoicesLinkUrl()), A15());
        }
    }

    public static void A0Z(@Nullable Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(null);
        } else {
            imageView.setBackgroundDrawable(null);
        }
    }

    private void A0a(View view) {
        this.A0e.add(view);
        view.setOnClickListener(this.A0E);
        view.setOnTouchListener(this.A0E);
        if (Build.VERSION.SDK_INT >= 18) {
            boolean A0q = J8.A0q(view.getContext());
            String[] strArr = A0i;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[4] = "GeTsVetQiODT9yUx";
            strArr2[6] = "UPeG8QvAHkrx";
            if (A0q) {
                view.setOnLongClickListener(this.A0E);
            }
        }
    }

    private void A0b(View view, View view2, List<View> list, boolean z) {
        InterfaceC1268ba interfaceC1268ba;
        View view3 = view2;
        if (!A0n()) {
            this.A0Y.A0A().ACC();
        }
        if (view == null) {
            String A0S = A0S(264, 19, 89);
            if (!A0n()) {
                this.A0Y.A0A().ACB(A0S);
            }
            throw new IllegalArgumentException(A0S);
        } else if (list == null || list.size() == 0) {
            String A0S2 = A0S(213, 30, 68);
            if (!A0n()) {
                this.A0Y.A0A().ACB(A0S2);
            }
            throw new IllegalArgumentException(A0S2);
        } else {
            RG A0C = A0C();
            if (A0C == null) {
                String A0S3 = A0S(40, 13, 84);
                if (!A0n()) {
                    this.A0Y.A0A().ACB(A0S3);
                }
                Log.e(A0j, A0S3);
                C0755Jm c0755Jm = new C0755Jm(AdErrorType.NATIVE_AD_IS_NOT_LOADED, A0S3);
                A0x().A0A().A2d(LW.A01(this.A00), c0755Jm.A04().getErrorCode(), c0755Jm.A05());
                if (J8.A1X(this.A0Y) && (interfaceC1268ba = this.A0F) != null) {
                    interfaceC1268ba.A9X(c0755Jm);
                    return;
                }
                return;
            }
            String str = this.A0P;
            boolean z2 = view instanceof FrameLayout;
            String[] strArr = A0i;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[0] = "EctJGKY0XxsuqG0UQd3u1zsk6i1LiKEB";
            strArr2[2] = "xfmrtxxFdZMJNwdY4ICwqytBKlocc6OO";
            if (z2 && str != null) {
                A0c((FrameLayout) view, str);
            }
            NativeAdLayout nativeAdLayout = this.A06;
            if (nativeAdLayout != null) {
                ((T4) nativeAdLayout.getNativeAdLayoutApi()).A03();
            }
            C0984Sp c0984Sp = this.A0Q.get();
            if (c0984Sp != null && A0C.A0B() == 1) {
                c0984Sp.A03(EnumC0803Lm.AN_INFO_ICON);
            }
            if (view3 == null) {
                if (this.A0I == EnumC0760Js.A06) {
                    AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
                    String A0S4 = A0S(WKSRecord.Service.SUR_MEAS, 21, 22);
                    C0755Jm c0755Jm2 = new C0755Jm(adErrorType, A0S4);
                    A0x().A0A().A2d(LW.A01(this.A00), c0755Jm2.A04().getErrorCode(), c0755Jm2.A05());
                    InterfaceC1268ba interfaceC1268ba2 = this.A0F;
                    if (interfaceC1268ba2 != null) {
                        interfaceC1268ba2.A9X(c0755Jm2);
                    }
                    if (AdInternalSettings.isDebugBuild()) {
                        Log.e(A0j, A0S4);
                        return;
                    }
                    return;
                }
                AdErrorType adErrorType2 = AdErrorType.NO_ICONVIEW_IN_NATIVEBANNERAD;
                String A0S5 = A0S(53, 22, 41);
                C0755Jm c0755Jm3 = new C0755Jm(adErrorType2, A0S5);
                A0x().A0A().A2d(LW.A01(this.A00), c0755Jm3.A04().getErrorCode(), c0755Jm3.A05());
                InterfaceC1268ba interfaceC1268ba3 = this.A0F;
                if (interfaceC1268ba3 != null) {
                    interfaceC1268ba3.A9X(c0755Jm3);
                }
                if (!AdInternalSettings.isDebugBuild()) {
                    return;
                }
                Log.e(A0j, A0S5);
                return;
            }
            boolean z3 = false;
            boolean z4 = (view3 instanceof AdNativeComponentView) && ((AdNativeComponentView) view3).getAdContentsView() != null;
            if (z && (view3 instanceof ImageView)) {
                z3 = true;
            }
            if (!z4 && !z3) {
                if (this.A0F != null) {
                    C0755Jm c0755Jm4 = new C0755Jm(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0S(IronSourceError.ERROR_CAPPED_PER_SESSION, 31, 7));
                    A0x().A0A().A2d(LW.A01(this.A00), c0755Jm4.A04().getErrorCode(), c0755Jm4.A05());
                    this.A0F.A9X(c0755Jm4);
                    return;
                }
                return;
            }
            if (this.A03 != null) {
                Log.w(A0j, A0S(283, 80, 23));
                unregisterView();
            }
            boolean containsKey = A0k.containsKey(view);
            String[] strArr3 = A0i;
            if (strArr3[7].length() != strArr3[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0i;
            strArr4[7] = "Yitqb4l5O5wHhToyiUZG328";
            strArr4[5] = "n4uNZUYEyoiQJdMJgH58rRy";
            if (containsKey && A0k.get(view).get() != null) {
                Log.w(A0j, A0S(406, 75, 72));
                A0k.get(view).get().unregisterView();
            }
            this.A0E = new View$OnClickListenerC1265bX(this, this.A0Y, null);
            this.A03 = view;
            this.A05 = view3;
            boolean nativeAdBannerViewIsImageView = view instanceof ViewGroup;
            if (nativeAdBannerViewIsImageView) {
                this.A0J = new C0817Ma(this.A0Y, new C1263bU(this));
                ((ViewGroup) view).addView(this.A0J);
            }
            ArrayList<View> arrayList = new ArrayList(list);
            View view4 = this.A04;
            if (view4 != null) {
                arrayList.add(view4);
            }
            for (View view5 : arrayList) {
                A0a(view5);
            }
            int A00 = A00();
            this.A0M = new C1264bV(this, view3, z3, A0C);
            if (view3 instanceof AdNativeComponentView) {
                view3 = ((AdNativeComponentView) view3).getAdContentsView();
            }
            this.A0N = new C0901Ph(view3, A00, A03(), true, new WeakReference(this.A0M), this.A0Y);
            this.A0N.A0a(true ^ A0n());
            this.A0N.A0Y(A01());
            this.A0N.A0Z(A02());
            this.A08 = new RL(this.A0Y, new C1266bY(this, null), this.A0N, this.A0W);
            this.A08.A0E(arrayList);
            A0k.put(view, new WeakReference<>(this));
            if (Build.VERSION.SDK_INT >= 18 && J8.A0q(this.A0Y)) {
                this.A0K = new NS();
                this.A0K.A0D(this.A0c);
                this.A0K.A0C(this.A0Y.getPackageName());
                this.A0K.A0B(this.A0N);
                if (this.A0W.A0C() > 0) {
                    this.A0K.A09(this.A0W.A0C(), this.A0W.A0D());
                }
                AnonymousClass91 anonymousClass91 = this.A0C;
                if (anonymousClass91 != null) {
                    this.A0K.A0A(anonymousClass91.A0C());
                } else {
                    C0636Es c0636Es = this.A09;
                    if (c0636Es != null && c0636Es.A0H() != null) {
                        this.A0K.A0A(this.A09.A0H().A0C());
                    }
                }
                View adContentsView = this.A03;
                adContentsView.getOverlay().add(this.A0K);
            }
        }
    }

    private void A0c(FrameLayout frameLayout, String str) {
        OV ov = this.A0L;
        if (ov != null) {
            frameLayout.removeView(ov);
        }
        this.A0L = OU.A01(AnonymousClass57.A02(this.A0Y), str);
        OV ov2 = this.A0L;
        if (ov2 != null) {
            frameLayout.addView(ov2, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(@Nullable RG rg, boolean z) {
        if (rg == null) {
            return;
        }
        if (this.A0D.equals(JU.A04)) {
            String A5j = rg.A5j();
            if (!TextUtils.isEmpty(A5j)) {
                this.A0X.A0X(new JL(A5j, this.A0Y.A06()));
            }
            if (rg.A0K() != null) {
                C7E c7e = new C7E(rg.A0K().getUrl(), rg.A0K().getHeight(), rg.A0K().getWidth(), rg.A0R(), A0S(687, 6, 78));
                c7e.A00 = this.A0B;
                this.A0X.A0P();
                this.A0X.A0R(c7e);
            }
            if (!this.A0I.equals(EnumC0760Js.A05)) {
                if (rg.A0J() != null) {
                    this.A0X.A0R(new C7E(rg.A0J().getUrl(), rg.A0J().getHeight(), rg.A0J().getWidth(), rg.A0R(), A0S(687, 6, 78)));
                }
                List<C1267bZ> A0V = rg.A0V();
                String[] strArr = A0i;
                if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0i;
                strArr2[1] = "BiVeVWtUTguxpSjeMqAkCwQXeKWOVTz4";
                strArr2[3] = "8sdR9nWPZ664Gt9BvBocaDJi5It1hBkX";
                if (A0V != null) {
                    for (C1267bZ c1267bZ : rg.A0V()) {
                        if (c1267bZ.getAdCoverImage() != null) {
                            this.A0X.A0R(new C7E(c1267bZ.getAdCoverImage().getUrl(), c1267bZ.getAdCoverImage().getHeight(), c1267bZ.getAdCoverImage().getWidth(), rg.A0R(), A0S(687, 6, 78)));
                        }
                    }
                }
                String A0T = rg.A0T();
                if (!TextUtils.isEmpty(A0T)) {
                    this.A0X.A0W(new C7G(A0T, rg.A0R(), A0S(687, 6, 78), rg.A0N().longValue()));
                }
            }
        }
        this.A0X.A0Q(new C1262bT(this, rg, z), new C7A(rg.A0R(), A0S(687, 6, 78)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0e(AnonymousClass11 anonymousClass11) {
        RG rg = this.A0W;
        if (rg == null) {
            return;
        }
        rg.A0X(anonymousClass11);
    }

    public static void A0f(NativeAdImageApi nativeAdImageApi, ImageView imageView, C1080Wh c1080Wh) {
        if (nativeAdImageApi != null && imageView != null) {
            new AsyncTaskC1091Ws(imageView, c1080Wh).A06(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A08(nativeAdImageApi.getUrl());
        }
    }

    private final void A0g(JU ju, @Nullable String str) {
        A1N(ju, str, new C7M(false, -1, -1));
    }

    private final void A0j(InterfaceC1268ba interfaceC1268ba) {
        this.A0F = interfaceC1268ba;
    }

    private final void A0k(String str) {
        this.A0O = str;
    }

    private void A0l(List<View> list, View view) {
        JY jy = this.A0Z;
        if (jy != null && jy.ADA(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                String[] strArr = A0i;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0i;
                strArr2[1] = "SQxDsveS3BVeMl0nUnJayKxDlwKiSRwM";
                strArr2[3] = "CPUPH8uU8pe6dd8URnD7AGDEQ4lKFlLs";
                A0l(list, childAt);
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0m() {
        return A14() == EnumC0748Je.A05 || A14() == EnumC0748Je.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0n() {
        RG rg = this.A0W;
        return rg != null && rg.A0h();
    }

    public final long A0u() {
        return this.A00;
    }

    @Nullable
    public final RG A0v() {
        return this.A0W;
    }

    public final C7H A0w() {
        return this.A0X;
    }

    public final C1080Wh A0x() {
        return this.A0Y;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0y */
    public final JZ getAdChoicesIcon() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0I();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0z */
    public final JZ getAdCoverImage() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A10 */
    public final JZ getAdIcon() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0K();
    }

    @Nullable
    public final InterfaceC1268ba A11() {
        return this.A0F;
    }

    public final C0745Jb A12() {
        return this.A0G;
    }

    public final EnumC0746Jc A13() {
        return this.A0H;
    }

    public final EnumC0748Je A14() {
        if (!isAdLoaded()) {
            return EnumC0748Je.A03;
        }
        return this.A0W.A0M();
    }

    @Nullable
    public final String A15() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A5j();
    }

    @Nullable
    public final String A16() {
        return this.A0P;
    }

    @Nullable
    public final String A17() {
        return A1B(A0S(693, 17, 60));
    }

    @Nullable
    public final String A18() {
        return A1B(A0S(710, 16, 10));
    }

    @Nullable
    public final String A19() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0S();
    }

    @Nullable
    public final String A1A() {
        if (!isAdLoaded() || TextUtils.isEmpty(this.A0W.A0T())) {
            return null;
        }
        return this.A0X.A0M(this.A0W.A0T());
    }

    @Nullable
    public final String A1B(String str) {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0U(str);
    }

    @Nullable
    public final List<C1267bZ> A1C() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0V();
    }

    public final void A1D() {
        if (!AnonymousClass23.A0Q(this.A0Y.A00(), false)) {
            A0W();
            return;
        }
        C1080Wh c1080Wh = this.A0Y;
        AbstractC0823Mg A01 = C0824Mh.A01(c1080Wh, c1080Wh.A06(), A15(), this.A06);
        if (A01 == null) {
            A0W();
            return;
        }
        ((T4) this.A06.getNativeAdLayoutApi()).A04(A01);
        A01.A0J();
    }

    public final void A1E(@Nullable Drawable drawable) {
        this.A01 = drawable;
        A1U(drawable != null, true);
        String[] strArr = A0i;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[4] = "Q96JEqttX0oIb74l";
        strArr2[6] = "mqYIcYUMJzEb";
    }

    public final void A1F(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0l(arrayList, view);
        A0b(view, imageView, arrayList, true);
    }

    public final void A1G(View view, ImageView imageView, List<View> list) {
        A0b(view, imageView, list, true);
    }

    public final void A1H(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0l(arrayList, view);
        A0b(view, adNativeComponentView, arrayList, false);
    }

    public final void A1I(View view, AdNativeComponentView adNativeComponentView, List<View> list) {
        A0b(view, adNativeComponentView, list, false);
    }

    public final void A1J(MediaView mediaView) {
        if (mediaView != null) {
            this.A0U = true;
        }
    }

    public final void A1K(MediaView mediaView) {
        if (mediaView != null) {
            this.A0V = true;
        }
    }

    public final void A1L(@Nullable NativeAdLayout nativeAdLayout) {
        this.A06 = nativeAdLayout;
    }

    public final void A1M(@Nullable C0984Sp c0984Sp) {
        this.A0Q = new WeakReference<>(c0984Sp);
    }

    public final void A1N(JU ju, @Nullable String str, C7M c7m) {
        this.A00 = System.currentTimeMillis();
        if (this.A0f) {
            AdSettings.IntegrationErrorMode A00 = C03181l.A00(this.A0Y);
            String A0S = A0S(644, 30, 17);
            if (!AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE.equals(A00)) {
                C0755Jm c0755Jm = new C0755Jm(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0S(644, 30, 17));
                A0x().A0A().A2d(LW.A01(this.A00), c0755Jm.A04().getErrorCode(), c0755Jm.A05());
                InterfaceC1268ba interfaceC1268ba = this.A0F;
                if (interfaceC1268ba != null) {
                    interfaceC1268ba.A9X(c0755Jm);
                } else {
                    Log.e(A0S(109, 17, 50), A0S);
                }
                C04858j c04858j = new C04858j(A0S);
                A0x().A04().A82(A0S(586, 3, 89), C04848i.A0R, c04858j);
            } else {
                throw new C03231q(A0S);
            }
        }
        this.A0f = true;
        this.A0D = ju;
        if (ju.equals(JU.A05)) {
            this.A07 = EnumC03060z.A05;
        }
        this.A0B = c7m;
        C03171k c03171k = new C03171k(this.A0c, this.A0I, A0O(), null, 1);
        c03171k.A04(ju);
        c03171k.A05(this.A0O);
        c03171k.A06(this.A0P);
        this.A09 = new C0636Es(this.A0Y, c03171k);
        this.A09.A0R(new C1261bS(this));
        this.A09.A0T(str);
    }

    public final void A1O(C0745Jb c0745Jb) {
        this.A0G = c0745Jb;
    }

    public final void A1P(EnumC0746Jc enumC0746Jc) {
        this.A0H = enumC0746Jc;
    }

    public final void A1Q(EnumC0760Js enumC0760Js) {
        if (!A0n()) {
            if (EnumC0760Js.A05.equals(enumC0760Js)) {
                C1080Wh c1080Wh = this.A0Y;
                String[] strArr = A0i;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0i;
                strArr2[7] = "er71GFUENUkH6mVEmd80tsw";
                strArr2[5] = "eRFgtOOg0hnVr16Te1PNaNs";
                c1080Wh.A0A().A2j(AdPlacementType.NATIVE_BANNER.toString());
            } else {
                this.A0Y.A0A().A2j(AdPlacementType.NATIVE.toString());
            }
        }
        this.A0I = enumC0760Js;
    }

    public final void A1R(AbstractC0900Pg abstractC0900Pg) {
        this.A0R = new WeakReference<>(abstractC0900Pg);
    }

    public final void A1S(boolean z) {
        this.A0S = z;
    }

    public final void A1T(boolean z) {
        this.A0T = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r2 = r3.A0R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
        r2 = A0S(0, 0, 21);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1U(boolean z, boolean z2) {
        String A0S;
        InterfaceC1268ba interfaceC1268ba;
        if (z) {
            boolean equals = this.A0D.equals(JU.A05);
            String[] strArr = A0i;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[7] = "JLY2qeoxINM9b6rKgxvdoo5";
            strArr2[5] = "SO3TgjdXtMDnoN5cYw5MldE";
            if (equals && !A0n() && (interfaceC1268ba = this.A0F) != null) {
                interfaceC1268ba.AA9();
            }
            C0901Ph c0901Ph = this.A0N;
            if (c0901Ph != null) {
                c0901Ph.A0W();
                this.A0a.A0A();
                return;
            }
            return;
        }
        if (this.A0N != null) {
            RG A0v = A0v();
            String[] strArr3 = A0i;
            if (strArr3[7].length() != strArr3[5].length()) {
                String[] strArr4 = A0i;
                strArr4[7] = "USSBWMStI3ylD2K7nffeYBb";
                strArr4[5] = "raKwme25MGMDEpiUbEFBbTJ";
            } else {
                String[] strArr5 = A0i;
                strArr5[0] = "bG4PdUDVMluUNyK8pZyXt2dq2VQBZyfQ";
                strArr5[2] = "sHMyAJzOe9OYyidAIXRm3TyTiII6Suie";
            }
            this.A0a.A0D(this.A0Y, A0S);
            this.A0N.A0X();
        }
        InterfaceC1268ba interfaceC1268ba2 = this.A0F;
        String[] strArr6 = A0i;
        if (strArr6[4].length() != strArr6[6].length()) {
            String[] strArr7 = A0i;
            strArr7[0] = "FypWWsEn8bqXdPqUiIsc7hG8qhiMqauF";
            strArr7[2] = "IXlSBRmtDoTZUwhzIwgkgymkT50eT72S";
            if (interfaceC1268ba2 == null) {
                return;
            }
        } else if (interfaceC1268ba2 == null) {
            return;
        }
        if (!z2) {
            return;
        }
        C0755Jm A02 = C0755Jm.A02(AdErrorType.BROKEN_MEDIA_ERROR, A0S(126, 21, 64));
        A0x().A0A().A2d(LW.A01(this.A00), A02.A04().getErrorCode(), A02.A05());
        this.A0F.A9X(A02);
    }

    public final boolean A1V() {
        return this.A06 == null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Jh
    public final int A5s() {
        View view = this.A05;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof C0884Oq) {
                return ((C0884Oq) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C0749Jf(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        K0.A05(A0S(607, 7, 112), A0S(363, 19, 98), A0S(32, 8, 20));
        if (!A0n()) {
            this.A0Y.A0A().A2k();
        }
        C0636Es c0636Es = this.A09;
        if (c0636Es != null) {
            c0636Es.A0W(true);
            this.A09 = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0D.equals(JU.A05)) {
            this.A07 = EnumC03060z.A04;
        }
        this.A0D = JU.A04;
        A0d(this.A0W, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdBodyText() {
        if (isAdLoaded()) {
            return this.A0W.A0O();
        }
        String[] strArr = A0i;
        if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
            String[] strArr2 = A0i;
            strArr2[0] = "hTgZwGr1QjZPArcNv2XISvdh6HkvBsNu";
            strArr2[2] = "WdfIathAKVLlC1caO5TsuRke00xxoQup";
            return null;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdCallToAction() {
        return A1B(A0S(593, 14, 45));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        JZ adChoicesIcon = getAdChoicesIcon();
        String[] strArr = A0i;
        if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
            String[] strArr2 = A0i;
            strArr2[7] = "MRTmAh7YnfwjJHGdoro5GGF";
            strArr2[5] = "5NAjexdbITBZf7E7VHPXfXw";
            return adChoicesIcon.getUrl();
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesLinkUrl() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesText() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdHeadline() {
        return A1B(A0S(IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, 8, 22));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdLinkDescription() {
        return A1B(A0S(622, 16, 54));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdSocialContext() {
        return A1B(A0S(746, 14, 69));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdTranslation() {
        return A1B(A0S(557, 14, 14));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdUntrimmedBodyText() {
        return A1B(A0S(589, 4, 49));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdvertiserName() {
        return A1B(A0S(571, 15, 115));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        RG rg = this.A0W;
        if (rg != null) {
            JZ A0J = rg.A0J();
            int width = A0J.getWidth();
            String[] strArr = A0i;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[1] = "Gk0JtmCCXYpL8dPDyrRdSPBqQO7pSw2M";
            strArr2[3] = "hZFl2ZrFl9W40ZKmdwMt57qcTxbjzHrP";
            int height = A0J.getHeight();
            if (height > 0) {
                return width / height;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        String str = this.A0d;
        String[] strArr = A0i;
        if (strArr[4].length() != strArr[6].length()) {
            String[] strArr2 = A0i;
            strArr2[7] = "iawtn5ImZtHDfKUJHK1ePg9";
            strArr2[5] = "61vZsTsWUXSHOR043CjOsZn";
            return str;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0c;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final Drawable getPreloadedIconViewDrawable() {
        JZ adIcon;
        Bitmap A0I;
        RG rg = this.A0W;
        if (rg != null && (adIcon = rg.A0K()) != null && (A0I = this.A0X.A0I(adIcon.getUrl())) != null) {
            C1080Wh A0x = A0x();
            boolean A1V = A1V();
            String[] strArr = A0i;
            if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
                String[] strArr2 = A0i;
                strArr2[4] = "5rXv1LFjMRKkpcU7";
                strArr2[6] = "SFgDKFOuseBk";
                return A05(A0x, A0I, A1V, A16());
            }
            throw new RuntimeException();
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getPromotedTranslation() {
        return A1B(A0S(726, 20, 89));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getSponsoredTranslation() {
        return A1B(A0S(760, 21, 22));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        RG rg = this.A0W;
        return rg != null && rg.A0f();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = true;
        C0636Es c0636Es = this.A09;
        if (c0636Es != null) {
            z = c0636Es.A0X();
        } else {
            C0956Rk c0956Rk = this.A0A;
            String[] strArr = A0i;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[7] = "v5uFzvuQ32LyebguaenlI2Y";
            strArr2[5] = "nsJGpwd0QPZOfVeZMyNRGWR";
            if (c0956Rk != null) {
                z = c0956Rk.A0B();
            }
        }
        this.A0Y.A0A().A4X(z);
        return z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        RG rg = this.A0W;
        return rg != null && rg.A0g();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        K0.A05(A0S(638, 6, 33), A0S(382, 24, 15), A0S(8, 8, 76));
        loadAd(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        K0.A05(A0S(638, 6, 33), A0S(382, 24, 15), A0S(519, 7, 3));
        A0g(JU.A00(mediaCacheFlag), null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        K0.A05(A0S(638, 6, 33), A0S(382, 24, 15), A0S(0, 8, 0));
        ((C0749Jf) nativeLoadAdConfig).loadAd();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAdFromBid(String str) {
        K0.A05(A0S(674, 13, 14), A0S(382, 24, 15), A0S(24, 8, 126));
        loadAdFromBid(str, NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAdFromBid(String str, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        K0.A05(A0S(674, 13, 14), A0S(382, 24, 15), A0S(16, 8, 89));
        A0g(JU.A00(mediaCacheFlag), str);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        this.A04.performClick();
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        View view = this.A03;
        if (view != null) {
            view.post(new C1259bQ(this));
        }
        String str = A0S(197, 16, 66) + LN.A03(this.A0Y, th);
        A0x().A0A().A2d(LW.A01(this.A00), 2001, str);
        InterfaceC1268ba interfaceC1268ba = this.A0F;
        if (interfaceC1268ba != null) {
            interfaceC1268ba.A9X(new C0755Jm(2001, str));
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setAdListener(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        if (nativeAdListener == null) {
            return;
        }
        A0j(new A0(nativeAdListener, nativeAdBase));
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0k(extraHints.getHints());
        this.A0P = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r5.containsKey(r4) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (com.facebook.ads.redexgen.X.C1267bZ.A0k.get(r6.A03).get() != r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        r1 = r6.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        if ((r1 instanceof android.view.ViewGroup) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        r0 = r6.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
        ((android.view.ViewGroup) r1).removeView(r0);
        r3 = com.facebook.ads.redexgen.X.C1267bZ.A0i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r3[4].length() == r3[6].length()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
        r3 = com.facebook.ads.redexgen.X.C1267bZ.A0i;
        r3[0] = "lVWmVGygxw0UbRbggHe19cSptvLLteak";
        r3[2] = "yD1YSLWVotW9RM3Ng5RpEu8J61bKeSm7";
        r6.A0J = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
        r0 = r6.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
        r0.A0W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (android.os.Build.VERSION.SDK_INT < 18) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
        if (r6.A0K == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
        if (com.facebook.ads.redexgen.X.J8.A0q(r6.A0Y) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r6.A0K.A08();
        r6.A03.getOverlay().remove(r6.A0K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
        com.facebook.ads.redexgen.X.C1267bZ.A0k.remove(r6.A03);
        A0V();
        r6.A03 = null;
        r6.A05 = null;
        r0 = r6.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
        r0.A0X();
        r6.A0N = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
        r6.A08 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
        r6.A0J = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
        if (r5.containsKey(r4) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0110, code lost:
        throw new java.lang.IllegalStateException(A0S(481, 38, 15));
     */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void unregisterView() {
        OV ov = this.A0L;
        if (ov != null) {
            ViewParent parent = ov.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(ov);
            }
            this.A0L = null;
        }
        if (this.A03 == null || this.A05 == null) {
            return;
        }
        if (!A0n()) {
            C0S A0A = this.A0Y.A0A();
            String[] strArr = A0i;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[1] = "cYEHlIHF7Qe4IYNxEGisZavvdYqfT1NQ";
            strArr2[3] = "IvkWoeS5LcA5RnG3xI5yLmU1spuVl7qW";
            A0A.unregisterView();
        }
        WeakHashMap<View, WeakReference<C1267bZ>> weakHashMap = A0k;
        View view = this.A03;
        String[] strArr3 = A0i;
        if (strArr3[1].charAt(16) != strArr3[3].charAt(16)) {
            String[] strArr4 = A0i;
            strArr4[0] = "MOnirYFFQGBOpDM1usFuy9dITQXNjsmg";
            strArr4[2] = "BENjy9ISBGpLCtRbprsy2gYEceZw0rIm";
        }
    }
}