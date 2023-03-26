package com.p7700g.p99005;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.mopub.nativeads.ClickInterface;
import com.mopub.nativeads.MediaLayout;
import com.mopub.nativeads.NativeClickHandler;
import com.mopub.nativeads.StaticNativeAd;
import com.mopub.nativeads.VideoNativeAd;
import com.p7700g.p99005.n13;
import com.p7700g.p99005.u33;
import com.p7700g.p99005.v33;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n93 implements k93 {
    @NotNull
    public static final a b = new a(null);
    @NotNull
    private final n13<?> c;
    @NotNull
    private final o33 d;
    private n13.a e;
    private StaticNativeAd f;
    private VideoNativeAd g;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            n13.a.values();
            int[] iArr = new int[12];
            iArr[n13.a.MOPUB_STATIC.ordinal()] = 1;
            iArr[n13.a.MOPUB_VIDEO.ordinal()] = 2;
            a = iArr;
        }
    }

    public n93(@NotNull n13<?> n13Var, @NotNull o33 o33Var) {
        c25.p(n13Var, "adView");
        c25.p(o33Var, com.anythink.expressad.a.B);
        this.c = n13Var;
        this.d = o33Var;
        Object a2 = n13Var.a();
        if (a2 instanceof StaticNativeAd) {
            this.e = n13.a.MOPUB_STATIC;
            this.f = (StaticNativeAd) n13Var.a();
        } else if (a2 instanceof VideoNativeAd) {
            this.e = n13.a.MOPUB_VIDEO;
            this.g = (VideoNativeAd) n13Var.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0068, code lost:
        r2 = r3.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x006c, code lost:
        r0 = android.graphics.BitmapFactory.decodeFile(java.lang.String.valueOf(r2), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0074, code lost:
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0076, code lost:
        r9.setImageBitmap(r0);
        r9.setOnClickListener(new com.p7700g.p99005.f63());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0082, code lost:
        r9.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0087, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0019, code lost:
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0028, code lost:
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x002a, code lost:
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0039, code lost:
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0048, code lost:
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x004b, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x004c, code lost:
        r1 = new android.graphics.BitmapFactory.Options();
        r3 = com.greedygame.core.GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0057, code lost:
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x005a, code lost:
        r3 = r3.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x005e, code lost:
        if (r3 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0061, code lost:
        r3 = r3.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0065, code lost:
        if (r3 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b(final ImageView imageView) {
        String privacyInformationIconImageUrl;
        String privacyInformationIconClickThroughUrl;
        n13.a aVar = this.e;
        Uri uri = null;
        if (aVar != null) {
            n13.a aVar2 = n13.a.MOPUB_STATIC;
            final String str = "";
            if (aVar == aVar2) {
                StaticNativeAd staticNativeAd = this.f;
                if (staticNativeAd == null) {
                    c25.S("mStaticAd");
                    throw null;
                }
                privacyInformationIconImageUrl = staticNativeAd.getPrivacyInformationIconImageUrl();
            } else {
                VideoNativeAd videoNativeAd = this.g;
                if (videoNativeAd == null) {
                    c25.S("mVideoAd");
                    throw null;
                }
                privacyInformationIconImageUrl = videoNativeAd.getPrivacyInformationIconImageUrl();
            }
            n13.a aVar3 = this.e;
            if (aVar3 == null) {
                c25.S("mAdType");
                throw null;
            } else if (aVar3 == aVar2) {
                StaticNativeAd staticNativeAd2 = this.f;
                if (staticNativeAd2 == null) {
                    c25.S("mStaticAd");
                    throw null;
                }
                privacyInformationIconClickThroughUrl = staticNativeAd2.getPrivacyInformationIconClickThroughUrl();
            } else {
                VideoNativeAd videoNativeAd2 = this.g;
                if (videoNativeAd2 == null) {
                    c25.S("mVideoAd");
                    throw null;
                }
                privacyInformationIconClickThroughUrl = videoNativeAd2.getPrivacyInformationIconClickThroughUrl();
            }
        } else {
            c25.S("mAdType");
            throw null;
        }
    }

    private final void c(v33.a aVar) {
        ViewGroup nativeAdView = this.d.getNativeAdView();
        View d = nativeAdView == null ? null : vr.d(nativeAdView, 0);
        Objects.requireNonNull(d, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) d;
        StaticNativeAd staticNativeAd = this.f;
        if (staticNativeAd != null) {
            staticNativeAd.prepare(viewGroup);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            MediaLayout mediaLayout = new MediaLayout(this.d.getContext());
            String j = this.c.b().j();
            if (j == null) {
                j = "";
            }
            Drawable a2 = a(j);
            if (a2 != null) {
                mediaLayout.setMainImageDrawable(a2);
            }
            aVar.addView((View) mediaLayout, layoutParams);
            return;
        }
        c25.S("mStaticAd");
        throw null;
    }

    private final void d(v33.a aVar, VideoNativeAd videoNativeAd) {
        MediaLayout mediaLayout = new MediaLayout(this.d.getContext());
        aVar.addView((View) mediaLayout, new FrameLayout.LayoutParams(-1, -1));
        videoNativeAd.render(mediaLayout);
    }

    private static final void e(n93 n93Var, View view) {
        c25.p(n93Var, "this$0");
        xz2.c("MoAdMap", "Mopub Handle click");
        StaticNativeAd staticNativeAd = n93Var.f;
        if (staticNativeAd != null) {
            String clickDestinationUrl = staticNativeAd.getClickDestinationUrl();
            c25.m(clickDestinationUrl);
            c25.o(clickDestinationUrl, "mStaticAd.clickDestinationUrl!!");
            if (b95.u2(clickDestinationUrl, "mopubnativebrowser://navigate?url=", false, 2, null)) {
                xz2.c("MoAdMap", "Already added Mopub Native scheme prefix");
            } else {
                try {
                    StaticNativeAd staticNativeAd2 = n93Var.f;
                    if (staticNativeAd2 != null) {
                        String C = c25.C("mopubnativebrowser://navigate?url=", URLEncoder.encode(staticNativeAd2.getClickDestinationUrl(), "UTF-8"));
                        xz2.c("MoAdMap", C);
                        StaticNativeAd staticNativeAd3 = n93Var.f;
                        if (staticNativeAd3 != null) {
                            staticNativeAd3.setClickDestinationUrl(C);
                            xz2.c("MoAdMap", "Opened outside the app");
                        } else {
                            c25.S("mStaticAd");
                            throw null;
                        }
                    } else {
                        c25.S("mStaticAd");
                        throw null;
                    }
                } catch (UnsupportedEncodingException e) {
                    xz2.b("MoAdMap", "Encoding failed", e);
                }
            }
            StaticNativeAd staticNativeAd4 = n93Var.f;
            if (staticNativeAd4 != null) {
                staticNativeAd4.handleClick(view);
                return;
            } else {
                c25.S("mStaticAd");
                throw null;
            }
        }
        c25.S("mStaticAd");
        throw null;
    }

    public static final void f(String str, ImageView imageView, View view) {
        c25.p(str, "$clickThroughUrl");
        c25.p(imageView, "$view");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(imageView.getContext().getPackageManager()) != null) {
            imageView.getContext().startActivity(intent);
        }
    }

    private final void g() {
        new NativeClickHandler(this.d.getContext()).setOnClickListener(this.d, new ClickInterface() { // from class: com.p7700g.p99005.h63
            public final void a(View view) {
                n93.lambda$vUhzzJcrDFlro7ZR042dsElin70(n93.this, view);
            }
        });
        ViewGroup nativeAdView = this.d.getNativeAdView();
        View d = nativeAdView == null ? null : vr.d(nativeAdView, 0);
        Objects.requireNonNull(d, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) d;
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof v33.a) {
                c25.o(childAt, "child");
                c((v33.a) childAt);
            } else if (childAt instanceof u33.a) {
                View childAt2 = ((u33.a) childAt).getChildAt(0);
                Objects.requireNonNull(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
                b((ImageView) childAt2);
            }
            if (i2 >= childCount) {
                return;
            }
            i = i2;
        }
    }

    public static final void h(n93 n93Var, View view) {
        c25.p(n93Var, "this$0");
        xz2.c("MoAdMap", "Mopub Handle click");
        VideoNativeAd videoNativeAd = n93Var.g;
        if (videoNativeAd == null) {
            c25.S("mVideoAd");
            throw null;
        }
        String clickDestinationUrl = videoNativeAd.getClickDestinationUrl();
        c25.m(clickDestinationUrl);
        c25.o(clickDestinationUrl, "mVideoAd.clickDestinationUrl!!");
        if (b95.u2(clickDestinationUrl, "mopubnativebrowser://navigate?url=", false, 2, null)) {
            xz2.c("MoAdMap", "Already added Mopub Native scheme prefix");
            return;
        }
        try {
            VideoNativeAd videoNativeAd2 = n93Var.g;
            if (videoNativeAd2 != null) {
                String C = c25.C("mopubnativebrowser://navigate?url=", URLEncoder.encode(videoNativeAd2.getClickDestinationUrl(), "UTF-8"));
                xz2.c("MoAdMap", C);
                VideoNativeAd videoNativeAd3 = n93Var.g;
                if (videoNativeAd3 != null) {
                    videoNativeAd3.setClickDestinationUrl(C);
                    xz2.c("MoAdMap", "Opened outside the app");
                    return;
                }
                c25.S("mVideoAd");
                throw null;
            }
            c25.S("mVideoAd");
            throw null;
        } catch (UnsupportedEncodingException e) {
            xz2.b("MoAdMap", "Encoding failed", e);
        }
    }

    private final void i() {
        ViewGroup nativeAdView = this.d.getNativeAdView();
        View d = nativeAdView == null ? null : vr.d(nativeAdView, 0);
        Objects.requireNonNull(d, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) d;
        VideoNativeAd videoNativeAd = this.g;
        if (videoNativeAd != null) {
            videoNativeAd.prepare(viewGroup);
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.g63
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n93.k(n93.this, view);
                }
            });
            int childCount = viewGroup.getChildCount();
            if (childCount <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof v33.a) {
                    c25.o(childAt, "child");
                    v33.a aVar = (v33.a) childAt;
                    VideoNativeAd videoNativeAd2 = this.g;
                    if (videoNativeAd2 == null) {
                        c25.S("mVideoAd");
                        throw null;
                    }
                    d(aVar, videoNativeAd2);
                } else if (childAt instanceof u33.a) {
                    View childAt2 = ((u33.a) childAt).getChildAt(0);
                    Objects.requireNonNull(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
                    b((ImageView) childAt2);
                }
                if (i2 >= childCount) {
                    return;
                }
                i = i2;
            }
        } else {
            c25.S("mVideoAd");
            throw null;
        }
    }

    public static /* synthetic */ void j(String str, ImageView imageView, View view) {
        f(str, imageView, view);
    }

    public static /* synthetic */ void k(n93 n93Var, View view) {
        h(n93Var, view);
    }

    @Override // com.p7700g.p99005.k93
    public void a() {
        n13.a aVar = this.e;
        if (aVar == null) {
            c25.S("mAdType");
            throw null;
        }
        int i = b.a[aVar.ordinal()];
        if (i == 1) {
            g();
        } else if (i != 2) {
        } else {
            i();
        }
    }

    private final Drawable a(String str) {
        AppConfig r;
        hc3 p;
        Uri uri = null;
        if (str.length() == 0) {
            return null;
        }
        new BitmapFactory.Options();
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (p = r.p()) != null) {
            uri = p.a(str);
        }
        return Drawable.createFromPath(String.valueOf(uri));
    }
}