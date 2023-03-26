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
import android.widget.TextView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class da3 extends l13 {
    @NotNull
    private final Activity d;
    @NotNull
    private final NativeMediatedAsset e;

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
    public da3(@NotNull q13 q13Var, @NotNull n13<?> n13Var) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        this.d = q13Var.a().f();
        this.e = n13Var.b();
    }

    public static final void j(da3 da3Var, View view) {
        c25.p(da3Var, "this$0");
        da3Var.g().a().a();
    }

    public static /* synthetic */ void l(da3 da3Var, View view) {
        j(da3Var, view);
    }

    @Override // com.p7700g.p99005.l13
    @t0
    public void f() {
        AppConfig r;
        hc3 p;
        AppConfig r2;
        hc3 p2;
        g().a().f().getWindow().setLayout(-1, -1);
        if (this.e.q() != null) {
            ((TextView) this.d.findViewById(b03.h.O4)).setText(this.e.q());
        }
        String i = this.e.i();
        Uri uri = null;
        if (i != null) {
            ImageView imageView = (ImageView) i().findViewById(b03.h.P4);
            BitmapFactory.Options options = new BitmapFactory.Options();
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            Bitmap decodeFile = BitmapFactory.decodeFile(String.valueOf((iNSTANCE$com_greedygame_sdkx_core == null || (r2 = iNSTANCE$com_greedygame_sdkx_core.r()) == null || (p2 = r2.p()) == null) ? null : p2.a(i)), options);
            if (decodeFile != null) {
                imageView.setImageBitmap(decodeFile);
            } else {
                ay2 ay2Var = ay2.a;
                Context context = imageView.getContext();
                c25.o(context, "ivIcon.context");
                String e = k().e();
                if (e == null) {
                    e = "";
                }
                imageView.setImageBitmap(ay2Var.a(context, e));
            }
        }
        String j = this.e.j();
        if (j != null) {
            ImageView imageView2 = (ImageView) i().findViewById(b03.h.K4);
            ((FrameLayout) i().findViewById(b03.h.s2)).setVisibility(0);
            imageView2.setVisibility(0);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core2 != null && (r = iNSTANCE$com_greedygame_sdkx_core2.r()) != null && (p = r.p()) != null) {
                uri = p.a(j);
            }
            Bitmap decodeFile2 = BitmapFactory.decodeFile(String.valueOf(uri), options2);
            if (decodeFile2 != null) {
                imageView2.setImageBitmap(decodeFile2);
            }
        }
        String e2 = this.e.e();
        if (e2 != null) {
            ((TextView) i().findViewById(b03.h.M4)).setText(e2);
        }
        ((TextView) this.d.findViewById(b03.h.J4)).setVisibility(8);
        ((TextView) this.d.findViewById(b03.h.R4)).setVisibility(8);
        if (this.e.g() != null) {
            TextView textView = (TextView) i().findViewById(b03.h.N4);
            textView.setText(k().g());
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new a(textView));
        }
        ((CloseImageView) this.d.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.w63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                da3.l(da3.this, view);
            }
        });
    }

    @NotNull
    public final Activity i() {
        return this.d;
    }

    @NotNull
    public final NativeMediatedAsset k() {
        return this.e;
    }
}