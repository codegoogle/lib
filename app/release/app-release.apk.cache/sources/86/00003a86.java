package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.mediation.GGRatingBar;
import com.greedygame.core.mediation.GGTextView;
import com.p7700g.p99005.b03;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b83 extends l13 {
    @NotNull
    private final q13 d;
    @NotNull
    private final NativeAd e;
    @NotNull
    private final Activity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b83(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull NativeAd nativeAd) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(nativeAd, "mAd");
        this.d = q13Var;
        this.e = nativeAd;
        e(n13Var);
        this.f = q13Var.a().f();
    }

    public static final void j(b83 b83Var, View view) {
        c25.p(b83Var, "this$0");
        b83Var.d.a().a();
    }

    private final Bitmap k() {
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
        Bitmap decodeFile = BitmapFactory.decodeFile(String.valueOf(uri), options);
        if (decodeFile == null) {
            ay2 ay2Var = ay2.a;
            Activity activity = this.f;
            String e = h().b().e();
            return ay2Var.a(activity, e != null ? e : "");
        }
        return decodeFile;
    }

    public static final void l(b83 b83Var, View view) {
        c25.p(b83Var, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://greedygame.com/"));
        if (intent.resolveActivity(b83Var.i().getPackageManager()) != null) {
            b83Var.i().startActivity(intent);
        }
    }

    public static /* synthetic */ void m(b83 b83Var, View view) {
        j(b83Var, view);
    }

    public static /* synthetic */ void n(b83 b83Var, View view) {
        l(b83Var, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fc  */
    @Override // com.p7700g.p99005.l13
    @t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f() {
        int i;
        boolean z;
        int i2;
        this.f.setContentView(b03.k.K);
        this.f.getWindow().setLayout(-1, -1);
        View findViewById = this.f.findViewById(b03.h.o0);
        c25.o(findViewById, "mActivity.findViewById(R.id.admob_unifiedad_root)");
        NativeAdView nativeAdView = (NativeAdView) findViewById;
        NativeAd.Image icon = this.e.getIcon();
        int i3 = sr.t;
        if (icon != null) {
            Bitmap k = k();
            hz2 b = k == null ? null : cz2.b(k);
            if (b != null) {
                i3 = b.h();
                i = b.j().f();
                z = b.j().h();
                i2 = b.j().g();
                int g = b.g();
                i().findViewById(b03.h.h1).setBackgroundColor(g);
                i().findViewById(b03.h.a1).setBackgroundColor(g);
                if (this.e.getHeadline() != null) {
                    TextView textView = (TextView) this.f.findViewById(b03.h.O4);
                    textView.setText(this.e.getHeadline());
                    textView.setTextColor(i2);
                    nativeAdView.setHeadlineView(textView);
                }
                Activity i4 = i();
                int i5 = b03.h.P4;
                ImageView imageView = (ImageView) i4.findViewById(i5);
                String str = "";
                if (this.e.getIcon() == null) {
                    ImageView imageView2 = (ImageView) i().findViewById(i5);
                    Bitmap k2 = k();
                    if (k2 != null) {
                        imageView2.setImageBitmap(k2);
                    }
                    nativeAdView.setIconView(imageView2);
                } else {
                    ay2 ay2Var = ay2.a;
                    Context context = imageView.getContext();
                    c25.o(context, "ivIcon.context");
                    String callToAction = this.e.getCallToAction();
                    if (callToAction == null) {
                        callToAction = "";
                    }
                    imageView.setImageBitmap(ay2Var.a(context, callToAction));
                }
                MediaView mediaView = (MediaView) i().findViewById(b03.h.Q4);
                ImageView imageView3 = (ImageView) i().findViewById(b03.h.K4);
                q13 q13Var = this.d;
                c25.o(mediaView, "mediaView");
                q13Var.t(mediaView);
                q13 q13Var2 = this.d;
                c25.o(imageView3, "iv");
                q13Var2.t(imageView3);
                nativeAdView.setMediaView(mediaView);
                nativeAdView.setImageView(imageView3);
                if (this.e.getCallToAction() != null) {
                    View findViewById2 = this.f.findViewById(b03.h.M4);
                    TextView textView2 = (TextView) this.f.findViewById(b03.h.n1);
                    String callToAction2 = this.e.getCallToAction();
                    c25.o(callToAction2, "mAd.callToAction");
                    String lowerCase = callToAction2.toLowerCase();
                    c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                    String m1 = b95.m1(lowerCase);
                    ((ImageView) this.f.findViewById(b03.h.O2)).setColorFilter(i);
                    textView2.setText(m1);
                    findViewById2.setBackgroundColor(i3);
                    textView2.setTextColor(i);
                    nativeAdView.setCallToActionView(findViewById2);
                }
                if (this.e.getAdvertiser() != null) {
                    TextView textView3 = (TextView) this.f.findViewById(b03.h.J4);
                    textView3.setText(this.e.getAdvertiser());
                    textView3.setTextColor(i2);
                    nativeAdView.setAdvertiserView(textView3);
                }
                if (this.e.getBody() != null) {
                    TextView textView4 = (TextView) this.f.findViewById(b03.h.N4);
                    textView4.setText(this.e.getBody());
                    textView4.setTextColor(i2);
                    nativeAdView.setBodyView(textView4);
                }
                if (this.e.getPrice() != null) {
                    TextView textView5 = (TextView) this.f.findViewById(b03.h.n1);
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) textView5.getText());
                    sb.append(gl4.R);
                    String price = this.e.getPrice();
                    c25.o(price, "mAd.price");
                    String lowerCase2 = price.toLowerCase();
                    c25.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    sb.append(b95.m1(lowerCase2));
                    textView5.setText(sb.toString());
                    textView5.setTextColor(i);
                    nativeAdView.setPriceView(textView5);
                }
                GGTextView gGTextView = (GGTextView) i().findViewById(b03.h.T4);
                if (this.e.getStarRating() == null) {
                    GGRatingBar gGRatingBar = (GGRatingBar) i().findViewById(b03.h.S4);
                    gGRatingBar.setNumStars(5);
                    try {
                        Double starRating = this.e.getStarRating();
                        c25.m(starRating);
                        gGRatingBar.setRating(Float.parseFloat(String.valueOf(starRating.doubleValue())));
                        str = "(" + this.e.getStarRating() + ')';
                        gGTextView.setText(str);
                    } catch (Exception unused) {
                        gGRatingBar.setRating(0.0f);
                    }
                    gGTextView.setTextColor(i2);
                    View findViewById3 = i().findViewById(b03.h.l3);
                    Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) findViewById3).setTextColor(i2);
                    nativeAdView.setStarRatingView(gGRatingBar);
                } else {
                    ((TextView) i().findViewById(b03.h.l3)).setVisibility(8);
                }
                if (this.e.getStore() != null) {
                    StringBuilder L = wo1.L(str, "on ");
                    L.append((Object) this.e.getStore());
                    gGTextView.setText(L.toString());
                    nativeAdView.setStoreView(gGTextView);
                }
                TextView textView6 = (TextView) this.f.findViewById(b03.h.L4);
                textView6.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.w53
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        b83.m(b83.this, view);
                    }
                });
                nativeAdView.setNativeAd(this.e);
                Drawable d = yz2.d(this.f.getApplicationContext(), b03.g.P1);
                if (!z) {
                    textView6.setTextColor(Color.parseColor("#262626"));
                    d.setColorFilter(-1, PorterDuff.Mode.SRC);
                } else {
                    textView6.setTextColor(-1);
                    d.setColorFilter(Color.parseColor("#262626"), PorterDuff.Mode.SRC);
                }
                textView6.setBackground(d);
                ((ImageView) this.f.findViewById(b03.h.U1)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.x53
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        b83.n(b83.this, view);
                    }
                });
            }
        }
        i = -1;
        z = true;
        i2 = -1;
        if (this.e.getHeadline() != null) {
        }
        Activity i42 = i();
        int i52 = b03.h.P4;
        ImageView imageView4 = (ImageView) i42.findViewById(i52);
        String str2 = "";
        if (this.e.getIcon() == null) {
        }
        MediaView mediaView2 = (MediaView) i().findViewById(b03.h.Q4);
        ImageView imageView32 = (ImageView) i().findViewById(b03.h.K4);
        q13 q13Var3 = this.d;
        c25.o(mediaView2, "mediaView");
        q13Var3.t(mediaView2);
        q13 q13Var22 = this.d;
        c25.o(imageView32, "iv");
        q13Var22.t(imageView32);
        nativeAdView.setMediaView(mediaView2);
        nativeAdView.setImageView(imageView32);
        if (this.e.getCallToAction() != null) {
        }
        if (this.e.getAdvertiser() != null) {
        }
        if (this.e.getBody() != null) {
        }
        if (this.e.getPrice() != null) {
        }
        GGTextView gGTextView2 = (GGTextView) i().findViewById(b03.h.T4);
        if (this.e.getStarRating() == null) {
        }
        if (this.e.getStore() != null) {
        }
        TextView textView62 = (TextView) this.f.findViewById(b03.h.L4);
        textView62.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.w53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b83.m(b83.this, view);
            }
        });
        nativeAdView.setNativeAd(this.e);
        Drawable d2 = yz2.d(this.f.getApplicationContext(), b03.g.P1);
        if (!z) {
        }
        textView62.setBackground(d2);
        ((ImageView) this.f.findViewById(b03.h.U1)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.x53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b83.n(b83.this, view);
            }
        });
    }

    @NotNull
    public final Activity i() {
        return this.f;
    }
}