package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class q83 extends l13 {
    @NotNull
    private final NativeAd d;
    @NotNull
    private final Activity e;

    /* loaded from: classes3.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ TextView s;

        public a(TextView textView) {
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
    public q83(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull NativeAd nativeAd) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(nativeAd, "mAd");
        this.d = nativeAd;
        this.e = q13Var.a().f();
    }

    public static final void j(q83 q83Var, View view) {
        c25.p(q83Var, "this$0");
        q83Var.g().a().a();
    }

    public static /* synthetic */ void k(q83 q83Var, View view) {
        j(q83Var, view);
    }

    @Override // com.p7700g.p99005.l13
    @t0
    public void f() {
        AppConfig r;
        hc3 p;
        this.e.getWindow().setLayout(-1, -1);
        ArrayList arrayList = new ArrayList();
        NativeAdLayout nativeAdLayout = (NativeAdLayout) this.e.findViewById(b03.h.M1);
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(b03.h.k0);
        AdOptionsView adOptionsView = new AdOptionsView(this.e, this.d, nativeAdLayout);
        linearLayout.removeAllViews();
        linearLayout.addView(adOptionsView, 0);
        if (this.d.getAdHeadline() != null) {
            TextView textView = (TextView) this.e.findViewById(b03.h.O4);
            textView.setText(this.d.getAdHeadline());
            arrayList.add(textView);
        }
        if (this.d.getAdIcon() != null) {
            ImageView imageView = (ImageView) this.e.findViewById(b03.h.P4);
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
                arrayList.add(imageView);
            } else {
                ay2 ay2Var = ay2.a;
                Context context = imageView.getContext();
                c25.o(context, "ivIcon.context");
                String adCallToAction = this.d.getAdCallToAction();
                imageView.setImageBitmap(ay2Var.a(context, adCallToAction != null ? adCallToAction : ""));
            }
        }
        MediaView mediaView = (MediaView) this.e.findViewById(b03.h.Q4);
        if (this.d.getAdCallToAction() != null) {
            TextView textView2 = (TextView) this.e.findViewById(b03.h.M4);
            textView2.setText(this.d.getAdCallToAction());
            arrayList.add(textView2);
        }
        if (this.d.getAdvertiserName() != null) {
            TextView textView3 = (TextView) this.e.findViewById(b03.h.J4);
            textView3.setText(this.d.getAdvertiserName());
            arrayList.add(textView3);
        }
        if (this.d.getAdBodyText() != null) {
            TextView textView4 = (TextView) this.e.findViewById(b03.h.N4);
            textView4.setText(this.d.getAdBodyText());
            textView4.getViewTreeObserver().addOnGlobalLayoutListener(new a(textView4));
            arrayList.add(textView4);
        }
        ((CloseImageView) this.e.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.y53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q83.k(q83.this, view);
            }
        });
        this.d.unregisterView();
        this.d.registerViewForInteraction(nativeAdLayout, mediaView, arrayList);
    }

    @NotNull
    public final Activity i() {
        return this.e;
    }
}