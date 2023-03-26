package com.p7700g.p99005;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.uii.CloseImageView;
import com.mopub.nativeads.NativeClickHandler;
import com.mopub.nativeads.StaticNativeAd;
import com.mopub.nativeads.VideoNativeAd;
import com.p7700g.p99005.b03;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class u93 extends l13 {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    private static final String e = "UTF-8";
    @Nullable
    private StaticNativeAd f;
    @Nullable
    private VideoNativeAd g;
    @NotNull
    private b h;
    @NotNull
    private NativeClickHandler i;
    @NotNull
    private Activity j;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return u93.e;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        VIDEO,
        STATIC
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull StaticNativeAd staticNativeAd) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(staticNativeAd, "ad");
        this.f = staticNativeAd;
        this.h = b.STATIC;
        this.j = q13Var.a().f();
        this.i = new NativeClickHandler(this.j);
    }

    public static final void j(u93 u93Var, View view) {
        c25.p(u93Var, "this$0");
        u93Var.g().a().a();
    }

    public static final void k(String str, u93 u93Var, View view) {
        c25.p(str, "$clickThroughUrl");
        c25.p(u93Var, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(u93Var.p().getPackageManager()) != null) {
            u93Var.p().startActivity(intent);
        }
    }

    public static /* synthetic */ void r(u93 u93Var, View view) {
        j(u93Var, view);
    }

    public static /* synthetic */ void s(String str, u93 u93Var, View view) {
        k(str, u93Var, view);
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        View findViewById = this.j.findViewById(b03.h.I2);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        i((ImageView) findViewById);
        ((CloseImageView) this.j.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.q63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u93.r(u93.this, view);
            }
        });
    }

    public final void i(@NotNull ImageView imageView) {
        VideoNativeAd videoNativeAd;
        String privacyInformationIconImageUrl;
        VideoNativeAd videoNativeAd2;
        String privacyInformationIconClickThroughUrl;
        AppConfig r;
        hc3 p;
        StaticNativeAd staticNativeAd;
        StaticNativeAd staticNativeAd2;
        c25.p(imageView, com.anythink.expressad.a.B);
        b bVar = this.h;
        b bVar2 = b.STATIC;
        final String str = "";
        if (bVar != bVar2 ? !((videoNativeAd = this.g) != null && (privacyInformationIconImageUrl = videoNativeAd.getPrivacyInformationIconImageUrl()) != null) : !((staticNativeAd2 = this.f) != null && (privacyInformationIconImageUrl = staticNativeAd2.getPrivacyInformationIconImageUrl()) != null)) {
            privacyInformationIconImageUrl = "";
        }
        if (this.h != bVar2 ? (videoNativeAd2 = this.g) != null && (privacyInformationIconClickThroughUrl = videoNativeAd2.getPrivacyInformationIconClickThroughUrl()) != null : (staticNativeAd = this.f) != null && (privacyInformationIconClickThroughUrl = staticNativeAd.getPrivacyInformationIconClickThroughUrl()) != null) {
            str = privacyInformationIconClickThroughUrl;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Uri uri = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (p = r.p()) != null) {
            uri = p.a(privacyInformationIconImageUrl);
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(String.valueOf(uri), options);
        if (decodeFile != null) {
            imageView.setImageBitmap(decodeFile);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.r63
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u93.s(str, this, view);
                }
            });
            return;
        }
        imageView.setVisibility(8);
    }

    @Nullable
    public final StaticNativeAd l() {
        return this.f;
    }

    @Nullable
    public final VideoNativeAd m() {
        return this.g;
    }

    @NotNull
    public final b n() {
        return this.h;
    }

    @NotNull
    public final NativeClickHandler o() {
        return this.i;
    }

    @NotNull
    public final Activity p() {
        return this.j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull VideoNativeAd videoNativeAd) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(videoNativeAd, "ad");
        this.g = videoNativeAd;
        this.h = b.VIDEO;
        this.j = q13Var.a().f();
        this.i = new NativeClickHandler(this.j);
    }
}