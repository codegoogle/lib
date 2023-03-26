package com.p7700g.p99005;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.mediation.GGButton;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.uii.CloseImageView;
import com.greedygame.mystique2.models.ScaleType;
import com.p7700g.p99005.b03;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ba3 extends l13 implements xx2 {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    private final q13 e;
    @NotNull
    private Ad f;
    @NotNull
    private final Activity g;
    @Nullable
    private final hc3 h;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba3(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad) {
        super(q13Var, n13Var);
        AppConfig r;
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(ad, "mAd");
        this.e = q13Var;
        this.f = ad;
        this.g = g().a().f();
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        hc3 hc3Var = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
            hc3Var = r.p();
        }
        this.h = hc3Var;
    }

    public static final void o(ba3 ba3Var, View view) {
        c25.p(ba3Var, "this$0");
        ba3Var.e.w(true);
    }

    private final Bitmap p() {
        AppConfig r;
        hc3 p;
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
        return BitmapFactory.decodeFile(String.valueOf(uri), options);
    }

    public static final void r(ba3 ba3Var, View view) {
        c25.p(ba3Var, "this$0");
        ba3Var.e.a().a();
    }

    public static /* synthetic */ void t(ba3 ba3Var, View view) {
        r(ba3Var, view);
    }

    public static /* synthetic */ void u(ba3 ba3Var, View view) {
        o(ba3Var, view);
    }

    @Override // com.p7700g.p99005.xx2
    public void a(@NotNull List<String> list) {
        c25.p(list, "urls");
    }

    @Override // com.p7700g.p99005.xx2
    @NotNull
    public Uri b(@NotNull String str) {
        c25.p(str, "url");
        hc3 hc3Var = this.h;
        Uri a2 = hc3Var == null ? null : hc3Var.a(str);
        if (a2 == null) {
            Uri uri = Uri.EMPTY;
            c25.o(uri, "EMPTY");
            return uri;
        }
        return a2;
    }

    @Override // com.p7700g.p99005.xx2
    public void c(@NotNull List<String> list, @NotNull String str, @NotNull wx2 wx2Var) {
        c25.p(list, "urls");
        c25.p(str, "directive");
        c25.p(wx2Var, "assetDownloadListener");
    }

    @Override // com.p7700g.p99005.xx2
    @Nullable
    public byte[] d(@NotNull String str) {
        c25.p(str, "url");
        hc3 hc3Var = this.h;
        if (hc3Var == null) {
            return null;
        }
        return hc3Var.h(str);
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        AppConfig r;
        Typeface h;
        AppConfig r2;
        Typeface h2;
        AppConfig r3;
        Typeface h3;
        this.g.setContentView(b03.k.c0);
        this.g.getWindow().setLayout(-1, -1);
        Bitmap p = p();
        hz2 b = p == null ? null : cz2.b(p);
        if (b == null) {
            b = new hz2(0, 0, null, null, 15, null);
        }
        View findViewById = this.g.findViewById(b03.h.O4);
        c25.o(findViewById, "tv");
        TextView textView = (TextView) findViewById;
        l(textView);
        GreedyGameAds.Companion companion = GreedyGameAds.a;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r3 = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (h3 = r3.h()) != null && textView != null) {
            textView.setTypeface(h3);
        }
        View findViewById2 = this.g.findViewById(b03.h.N4);
        c25.o(findViewById2, "tv");
        TextView textView2 = (TextView) findViewById2;
        q(textView2);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core2 != null && (r2 = iNSTANCE$com_greedygame_sdkx_core2.r()) != null && (h2 = r2.h()) != null && textView2 != null) {
            textView2.setTypeface(h2);
        }
        GGButton gGButton = (GGButton) this.g.findViewById(b03.h.M4);
        gGButton.setBackgroundColor(b.h());
        gGButton.setTextColor(b.j().f());
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core3 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core3 != null && (r = iNSTANCE$com_greedygame_sdkx_core3.r()) != null && (h = r.h()) != null && gGButton != null) {
            gGButton.setTypeface(h);
        }
        c25.o(gGButton, "ctaButton");
        s(gGButton);
        gGButton.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.v63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ba3.u(ba3.this, view);
            }
        });
        w33 w33Var = new w33(this.g, null, 0, 6, null);
        n(w33Var);
        ((FrameLayout) this.g.findViewById(b03.h.Q4)).addView(w33Var, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = (ImageView) this.g.findViewById(b03.h.P4);
        hc3 hc3Var = this.h;
        if (hc3Var != null) {
            c25.o(imageView, "iconImageVIew");
            String i = i().i();
            if (i == null) {
                i = "";
            }
            k(imageView, hc3Var, i);
        }
        ((CloseImageView) this.g.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.u63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ba3.t(ba3.this, view);
            }
        });
    }

    @NotNull
    public final NativeMediatedAsset i() {
        return this.f.v();
    }

    public final void j(@NotNull ImageView imageView, @NotNull Bitmap bitmap) {
        c25.p(imageView, "imageView");
        c25.p(bitmap, "bitmap");
        imageView.setImageBitmap(bitmap);
    }

    public final void k(@NotNull ImageView imageView, @NotNull hc3 hc3Var, @NotNull String str) {
        c25.p(imageView, "imageView");
        c25.p(hc3Var, "assetManager");
        c25.p(str, "url");
        String uri = hc3Var.a(str).toString();
        c25.o(uri, "assetManager.getCachedPath(url).toString()");
        Bitmap decodeFile = BitmapFactory.decodeFile(uri);
        if (decodeFile == null) {
            ay2 ay2Var = ay2.a;
            Activity activity = this.g;
            String e = this.f.v().e();
            if (e == null && (e = this.f.v().q()) == null) {
                e = "";
            }
            decodeFile = ay2Var.a(activity, e);
        }
        if (decodeFile == null) {
            return;
        }
        j(imageView, decodeFile);
    }

    @r2(otherwise = 2)
    public final void l(@NotNull TextView textView) {
        c25.p(textView, "tv");
        String q = i().q();
        if (q == null) {
            return;
        }
        m(textView, q);
    }

    @r2(otherwise = 2)
    public final void m(@NotNull TextView textView, @Nullable String str) {
        c25.p(textView, "tv");
        textView.setText(str);
    }

    @r2(otherwise = 2)
    public final void n(@NotNull w33 w33Var) {
        c25.p(w33Var, "mediaView");
        String j = i().j();
        if (j == null) {
            j = "";
        }
        w33Var.setMediaContent(x33.a.a(j, this));
        w33Var.e(ScaleType.FIT_CENTER);
    }

    @r2(otherwise = 2)
    public final void q(@NotNull TextView textView) {
        c25.p(textView, "tv");
        m(textView, i().g());
    }

    @r2(otherwise = 2)
    public final void s(@NotNull TextView textView) {
        c25.p(textView, "tv");
        m(textView, i().e());
    }
}