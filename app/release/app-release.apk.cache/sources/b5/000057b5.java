package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.mediation.GGRatingBar;
import com.greedygame.core.uii.CloseImageView;
import com.mopub.nativeads.ClickInterface;
import com.mopub.nativeads.MediaLayout;
import com.mopub.nativeads.StaticNativeAd;
import com.mopub.nativeads.VideoNativeAd;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.u93;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class q93 extends u93 {
    @NotNull
    public static final a k = new a(null);
    @NotNull
    private static final String l = "BaseWrapContentDesignMopub";

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
            u93.b.values();
            int[] iArr = new int[2];
            iArr[u93.b.VIDEO.ordinal()] = 1;
            iArr[u93.b.STATIC.ordinal()] = 2;
            a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ TextView s;

        public c(TextView textView) {
            this.s = textView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.s.getLineCount() > 3) {
                int lineEnd = this.s.getLayout().getLineEnd(2);
                this.s.setText(((Object) this.s.getText().subSequence(0, lineEnd - 3)) + "...");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ FrameLayout s;
        public final /* synthetic */ q93 t;

        public d(FrameLayout frameLayout, q93 q93Var) {
            this.s = frameLayout;
            this.t = q93Var;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View mediaLayout = new MediaLayout(this.t.p());
            mediaLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            mediaLayout.setGravity(17);
            this.s.addView(mediaLayout);
            VideoNativeAd m = this.t.m();
            c25.m(m);
            m.render(mediaLayout);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ TextView s;

        public e(TextView textView) {
            this.s = textView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.s.getLineCount() > 3) {
                int lineEnd = this.s.getLayout().getLineEnd(2);
                this.s.setText(((Object) this.s.getText().subSequence(0, lineEnd - 3)) + "...");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull StaticNativeAd staticNativeAd) {
        super(q13Var, n13Var, staticNativeAd);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(staticNativeAd, "ad");
    }

    private static final void u(q93 q93Var, View view) {
        c25.p(q93Var, "this$0");
        xz2.c(l, "Mopub Handle click");
        try {
            j73 j73Var = j73.a;
            Activity p = q93Var.p();
            VideoNativeAd m = q93Var.m();
            c25.m(m);
            String clickDestinationUrl = m.getClickDestinationUrl();
            c25.m(clickDestinationUrl);
            c25.o(clickDestinationUrl, "mVideoAd!!.clickDestinationUrl!!");
            j73Var.a(p, clickDestinationUrl);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static final void v(StaticNativeAd staticNativeAd, View view) {
        c25.p(staticNativeAd, "$mAd");
        String str = l;
        xz2.c(str, "Mopub Handle click");
        String clickDestinationUrl = staticNativeAd.getClickDestinationUrl();
        if (clickDestinationUrl != null) {
            if (b95.u2(clickDestinationUrl, "mopubnativebrowser://navigate?url=", false, 2, null)) {
                xz2.c(str, "Already added Mopub Native scheme prefix");
            } else {
                try {
                    String C = c25.C("mopubnativebrowser://navigate?url=", URLEncoder.encode(clickDestinationUrl, u93.d.a()));
                    xz2.c(str, C);
                    staticNativeAd.setClickDestinationUrl(C);
                    xz2.c(str, "Opened outside the app");
                } catch (UnsupportedEncodingException e2) {
                    xz2.b(l, "Encoding failed", e2);
                }
            }
        }
        staticNativeAd.handleClick(view);
    }

    public static final void x(q93 q93Var, View view) {
        c25.p(q93Var, "this$0");
        q93Var.g().a().a();
    }

    public static /* synthetic */ void y(q93 q93Var, View view) {
        x(q93Var, view);
    }

    @Override // com.p7700g.p99005.u93, com.p7700g.p99005.l13
    @t0
    public void f() {
        p().getWindow().setLayout(-1, -1);
        int i = b.a[n().ordinal()];
        if (i == 1) {
            w();
        } else if (i == 2) {
            t();
        }
        View findViewById = p().findViewById(b03.h.I2);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        i((ImageView) findViewById);
        ((CloseImageView) p().findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.l63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q93.y(q93.this, view);
            }
        });
    }

    public void t() {
        AppConfig r;
        hc3 p;
        AppConfig r2;
        hc3 p2;
        View findViewById = p().findViewById(b03.h.W1);
        final StaticNativeAd l2 = l();
        if (l2 == null) {
            return;
        }
        l2.prepare(findViewById);
        o().setOnClickListener(findViewById, new ClickInterface() { // from class: com.p7700g.p99005.k63
            public final void a(View view) {
                q93.lambda$naKCdp17glFASurRH9p4N3Sba2c(l2, view);
            }
        });
        String title = l2.getTitle();
        if (title != null) {
            ((TextView) p().findViewById(b03.h.O4)).setText(title);
        }
        Uri uri = null;
        if (l2.getIconImageUrl() != null) {
            ImageView imageView = (ImageView) p().findViewById(b03.h.P4);
            BitmapFactory.Options options = new BitmapFactory.Options();
            String i = h().b().i();
            if (i == null) {
                i = "";
            }
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            Bitmap decodeFile = BitmapFactory.decodeFile(String.valueOf((iNSTANCE$com_greedygame_sdkx_core == null || (r2 = iNSTANCE$com_greedygame_sdkx_core.r()) == null || (p2 = r2.p()) == null) ? null : p2.a(i)), options);
            if (decodeFile != null) {
                imageView.setImageBitmap(decodeFile);
            } else {
                ay2 ay2Var = ay2.a;
                Context context = imageView.getContext();
                c25.o(context, "ivIcon.context");
                String callToAction = l2.getCallToAction();
                if (callToAction == null) {
                    callToAction = "";
                }
                imageView.setImageBitmap(ay2Var.a(context, callToAction));
            }
        }
        if (l2.getMainImageUrl() != null) {
            ImageView imageView2 = (ImageView) p().findViewById(b03.h.K4);
            p().findViewById(b03.h.s2).setVisibility(0);
            imageView2.setVisibility(0);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            String j = h().b().j();
            String str = j != null ? j : "";
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core2 != null && (r = iNSTANCE$com_greedygame_sdkx_core2.r()) != null && (p = r.p()) != null) {
                uri = p.a(str);
            }
            Bitmap decodeFile2 = BitmapFactory.decodeFile(String.valueOf(uri), options2);
            if (decodeFile2 != null) {
                imageView2.setImageBitmap(decodeFile2);
            }
        }
        String callToAction2 = l2.getCallToAction();
        if (callToAction2 != null) {
            ((TextView) p().findViewById(b03.h.M4)).setText(callToAction2);
        }
        String text = l2.getText();
        if (text != null) {
            TextView textView = (TextView) p().findViewById(b03.h.N4);
            textView.setText(text);
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new c(textView));
        }
        if (l2.getStarRating() == null) {
            return;
        }
        GGRatingBar gGRatingBar = (GGRatingBar) p().findViewById(b03.h.S4);
        gGRatingBar.setNumStars(5);
        try {
            Double starRating = l2.getStarRating();
            c25.m(starRating);
            gGRatingBar.setRating(Float.parseFloat(String.valueOf(starRating.doubleValue())));
        } catch (Exception unused) {
            gGRatingBar.setRating(0.0f);
        }
    }

    public void w() {
        AppConfig r;
        hc3 p;
        View findViewById = p().findViewById(b03.h.W1);
        VideoNativeAd m = m();
        c25.m(m);
        m.prepare(findViewById);
        o().setOnClickListener(findViewById, new ClickInterface() { // from class: com.p7700g.p99005.j63
            public final void a(View view) {
                q93.lambda$8wl-StBecffrEB-e0nSpADfdtJE(q93.this, view);
            }
        });
        VideoNativeAd m2 = m();
        c25.m(m2);
        if (m2.getTitle() != null) {
            VideoNativeAd m3 = m();
            c25.m(m3);
            ((TextView) p().findViewById(b03.h.O4)).setText(m3.getTitle());
        }
        VideoNativeAd m4 = m();
        c25.m(m4);
        if (m4.getIconImageUrl() != null) {
            ImageView imageView = (ImageView) p().findViewById(b03.h.P4);
            BitmapFactory.Options options = new BitmapFactory.Options();
            String i = h().b().i();
            if (i == null) {
                i = "";
            }
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            Uri uri = null;
            if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (p = r.p()) != null) {
                uri = p.a(i);
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(String.valueOf(uri), options);
            if (decodeFile != null) {
                imageView.setImageBitmap(decodeFile);
            }
        }
        FrameLayout frameLayout = (FrameLayout) p().findViewById(b03.h.s2);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new d(frameLayout, this));
        frameLayout.setVisibility(0);
        VideoNativeAd m5 = m();
        c25.m(m5);
        if (m5.getCallToAction() != null) {
            VideoNativeAd m6 = m();
            c25.m(m6);
            ((TextView) p().findViewById(b03.h.M4)).setText(m6.getCallToAction());
        }
        VideoNativeAd m7 = m();
        c25.m(m7);
        if (m7.getText() != null) {
            TextView textView = (TextView) p().findViewById(b03.h.N4);
            VideoNativeAd m8 = m();
            c25.m(m8);
            textView.setText(m8.getText());
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new e(textView));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull VideoNativeAd videoNativeAd) {
        super(q13Var, n13Var, videoNativeAd);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(videoNativeAd, "ad");
    }
}