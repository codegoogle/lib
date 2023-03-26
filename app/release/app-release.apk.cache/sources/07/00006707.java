package com.p7700g.p99005;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.mediation.GGButton;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.mystique2.models.ScaleType;
import com.p7700g.p99005.b03;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yc3 extends y03 implements xx2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc3(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad) {
        super(q13Var, n13Var, ad);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "ggAdView");
        c25.p(ad, "ad");
    }

    private final Bitmap E() {
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

    public static /* synthetic */ void F(yc3 yc3Var, View view) {
        z(yc3Var, view);
    }

    public static final void z(yc3 yc3Var, View view) {
        c25.p(yc3Var, "this$0");
        yc3Var.g().w(true);
    }

    @r2(otherwise = 2)
    public final void A(@NotNull TextView textView) {
        c25.p(textView, "tv");
        x(textView, D().g());
    }

    @r2(otherwise = 2)
    public final void B(@NotNull TextView textView) {
        c25.p(textView, "tv");
        x(textView, D().e());
    }

    @Nullable
    public final hc3 C() {
        AppConfig r;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null) {
            return null;
        }
        return r.p();
    }

    @NotNull
    public final NativeMediatedAsset D() {
        return j().v();
    }

    @Override // com.p7700g.p99005.xx2
    public void a(@NotNull List<String> list) {
        c25.p(list, "urls");
    }

    @Override // com.p7700g.p99005.xx2
    @NotNull
    public Uri b(@NotNull String str) {
        c25.p(str, "url");
        hc3 C = C();
        Uri a = C == null ? null : C.a(str);
        if (a == null) {
            Uri uri = Uri.EMPTY;
            c25.o(uri, "EMPTY");
            return uri;
        }
        return a;
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
        hc3 C = C();
        if (C == null) {
            return null;
        }
        return C.h(str);
    }

    @Override // com.p7700g.p99005.y03
    @Nullable
    public View q() {
        AppConfig r;
        Typeface h;
        AppConfig r2;
        Typeface h2;
        AppConfig r3;
        Typeface h3;
        Bitmap E = E();
        hz2 b = E == null ? null : cz2.b(E);
        if (b == null) {
            b = new hz2(0, 0, null, null, 15, null);
        }
        View inflate = LayoutInflater.from(n()).inflate(b03.k.C0, (ViewGroup) p(), false);
        View findViewById = inflate.findViewById(b03.h.O4);
        c25.o(findViewById, "tv");
        TextView textView = (TextView) findViewById;
        w(textView);
        GreedyGameAds.Companion companion = GreedyGameAds.a;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r3 = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (h3 = r3.h()) != null && textView != null) {
            textView.setTypeface(h3);
        }
        View findViewById2 = inflate.findViewById(b03.h.N4);
        c25.o(findViewById2, "tv");
        TextView textView2 = (TextView) findViewById2;
        A(textView2);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core2 != null && (r2 = iNSTANCE$com_greedygame_sdkx_core2.r()) != null && (h2 = r2.h()) != null && textView2 != null) {
            textView2.setTypeface(h2);
        }
        GGButton gGButton = (GGButton) inflate.findViewById(b03.h.M4);
        gGButton.setBackgroundColor(b.h());
        gGButton.setTextColor(b.j().f());
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core3 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core3 != null && (r = iNSTANCE$com_greedygame_sdkx_core3.r()) != null && (h = r.h()) != null && gGButton != null) {
            gGButton.setTypeface(h);
        }
        c25.o(gGButton, "ctaButton");
        B(gGButton);
        gGButton.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.e73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yc3.F(yc3.this, view);
            }
        });
        w33 w33Var = new w33(n(), null, 0, 6, null);
        y(w33Var);
        ((FrameLayout) inflate.findViewById(b03.h.Q4)).addView(w33Var, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = (ImageView) inflate.findViewById(b03.h.P4);
        hc3 C = C();
        if (C != null) {
            c25.o(imageView, "iconImageVIew");
            String i = D().i();
            if (i == null) {
                i = "";
            }
            v(imageView, C, i);
        }
        return inflate;
    }

    public final void u(@NotNull ImageView imageView, @NotNull Bitmap bitmap) {
        c25.p(imageView, "imageView");
        c25.p(bitmap, "bitmap");
        imageView.setImageBitmap(bitmap);
    }

    public final void v(@NotNull ImageView imageView, @NotNull hc3 hc3Var, @NotNull String str) {
        c25.p(imageView, "imageView");
        c25.p(hc3Var, "assetManager");
        c25.p(str, "url");
        String uri = hc3Var.a(str).toString();
        c25.o(uri, "assetManager.getCachedPath(url).toString()");
        Bitmap decodeFile = BitmapFactory.decodeFile(uri);
        if (decodeFile == null) {
            ay2 ay2Var = ay2.a;
            Activity n = n();
            String e = j().v().e();
            if (e == null && (e = j().v().q()) == null) {
                e = "";
            }
            decodeFile = ay2Var.a(n, e);
        }
        if (decodeFile == null) {
            return;
        }
        u(imageView, decodeFile);
    }

    @r2(otherwise = 2)
    public final void w(@NotNull TextView textView) {
        c25.p(textView, "tv");
        String q = D().q();
        if (q == null) {
            return;
        }
        x(textView, q);
    }

    @r2(otherwise = 2)
    public final void x(@NotNull TextView textView, @Nullable String str) {
        c25.p(textView, "tv");
        textView.setText(str);
    }

    @r2(otherwise = 2)
    public final void y(@NotNull w33 w33Var) {
        c25.p(w33Var, "mediaView");
        String j = D().j();
        if (j == null) {
            j = "";
        }
        w33Var.setMediaContent(x33.a.a(j, this));
        w33Var.e(ScaleType.FIT_CENTER);
    }
}