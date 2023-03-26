package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5D  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5D implements NativeAdApi {
    public static String[] A02;
    public final NativeAd A00;
    public final NativeAdBaseApi A01;

    static {
        A01();
    }

    public static void A01() {
        A02 = new String[]{"mRGpAzErj1xKeHc9WkF3Ujy7h38joZC8", "9wVKpObP8FA1o7oyYWhkpjh48o8VAcWp", "pz3BbJjT9xlHe4B2EghGg76rolJKqfV", "txN8wQ5fkL3IFh565s3Q1NMKA4RH7CNr", "KrzK51p50C2Qp4g1XOaXdDfTUeF", "0wnkiGzVks6qBKMatIgqU8hY2PaKlPy", "GWxCKnjCJrIvVlnjjEtvZJVKWYpK", "UfKYcBFUD7Ap"};
    }

    public C5D(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
        C1267bZ.A0J(nativeAdBaseApi).A1Q(EnumC0760Js.A06);
    }

    public C5D(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
    }

    private C1267bZ A00() {
        return C1267bZ.A0J(this.A01);
    }

    @Nullable
    public final String A02() {
        return A00().A19();
    }

    @Nullable
    public final String A03() {
        return A00().A1A();
    }

    @Nullable
    public final List<NativeAd> A04() {
        if (A00().A1C() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1267bZ c1267bZ : A00().A1C()) {
            arrayList.add(new NativeAd(c1267bZ.A0x(), c1267bZ));
        }
        return arrayList;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final NativeAd.AdCreativeType getAdCreativeType() {
        if (!TextUtils.isEmpty(A00().A1A())) {
            return NativeAd.AdCreativeType.VIDEO;
        }
        if (A00().A1C() != null && !A00().A1C().isEmpty()) {
            return NativeAd.AdCreativeType.CAROUSEL;
        }
        if (A00().getAdCoverImage() != null && !TextUtils.isEmpty(A00().getAdCoverImage().getUrl())) {
            NativeAd.AdCreativeType adCreativeType = NativeAd.AdCreativeType.IMAGE;
            String[] strArr = A02;
            if (strArr[7].length() != strArr[6].length()) {
                String[] strArr2 = A02;
                strArr2[7] = "AqlRmswAejgv";
                strArr2[6] = "RNgsy314kOszGsZ2llWC7eCbS6WS";
                return adCreativeType;
            }
            throw new RuntimeException();
        }
        return NativeAd.AdCreativeType.UNKNOWN;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return EnumC0748Je.A00(A00().A14());
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (MediaView) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView, @Nullable List<View> list) {
        if (imageView != null) {
            C1080Wh A0x = A00().A0x();
            C1080Wh A022 = AnonymousClass57.A02(imageView.getContext());
            A022.A0D(A0x);
            C1267bZ.A0f(A00().getAdIcon(), imageView, A022);
        }
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2) {
        registerViewForInteraction(view, mediaView, mediaView2, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2, @Nullable List<View> list) {
        if (mediaView != null) {
            ((T3) mediaView.getMediaViewApi()).A0I(this.A00);
        }
        if (mediaView2 != null) {
            ((T3) mediaView2.getMediaViewApi()).A0J(this.A01, false);
        }
        if (list != null) {
            A00().A1I(view, mediaView, list);
            return;
        }
        C1267bZ A00 = A00();
        if (A02[4].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = "MBrHnoNt0t7c904xRN41qBo9Q6s9Di6J";
        strArr[1] = "MBrHnoNt0t7c904xRN41qBo9Q6s9Di6J";
        A00.A1H(view, mediaView);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list) {
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }
}