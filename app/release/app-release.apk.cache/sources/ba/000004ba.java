package com.anythink.basead.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.x;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.k;
import com.anythink.core.common.j.r;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.ui.component.RoundImageView;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public class BannerAdView extends BaseAdView {
    public static final String TAG = BannerAdView.class.getSimpleName();
    private static final int x = 1;
    private static final int y = 2;
    private final View.OnClickListener A;
    public com.anythink.basead.e.a a;
    public boolean b;
    public String c;
    private View v;
    private int w;
    private final View.OnClickListener z;

    /* renamed from: com.anythink.basead.ui.BannerAdView$11  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass11 implements Runnable {
        public AnonymousClass11() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BannerAdView.super.h();
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$12  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass12 implements b.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ RecycleImageView b;
        public final /* synthetic */ RecycleImageView c;

        public AnonymousClass12(String str, RecycleImageView recycleImageView, RecycleImageView recycleImageView2) {
            this.a = str;
            this.b = recycleImageView;
            this.c = recycleImageView2;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(this.a, str)) {
                this.b.setImageBitmap(bitmap);
                BannerAdView.this.post(new Runnable() { // from class: com.anythink.basead.ui.BannerAdView.12.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int[] a = r.a(BannerAdView.this.getWidth(), BannerAdView.this.getHeight(), bitmap.getWidth() / bitmap.getHeight());
                        ViewGroup.LayoutParams layoutParams = AnonymousClass12.this.b.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = a[0];
                            layoutParams.height = a[1];
                            AnonymousClass12.this.b.setLayoutParams(layoutParams);
                        }
                    }
                });
                this.c.setImageBitmap(com.anythink.core.common.j.b.a(BannerAdView.this.getContext(), bitmap));
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$13  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass13 implements b.a {
        public final /* synthetic */ ImageView a;

        public AnonymousClass13(ImageView imageView) {
            this.a = imageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(BannerAdView.this.f.q(), str)) {
                this.a.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$14  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass14 implements View.OnClickListener {
        public AnonymousClass14() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$15  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass15 implements View.OnClickListener {
        public AnonymousClass15() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k.b(m.a().e(), BannerAdView.this.f.D());
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$16  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass16 implements View.OnClickListener {
        public AnonymousClass16() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k.b(m.a().e(), BannerAdView.this.f.E());
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$17  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass17 implements View.OnClickListener {
        public AnonymousClass17() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements b.a {
        public final /* synthetic */ RoundImageView a;

        public AnonymousClass2(RoundImageView roundImageView) {
            this.a = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(BannerAdView.this.f.o(), str)) {
                this.a.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements b.a {
        public final /* synthetic */ ImageView a;

        public AnonymousClass3(ImageView imageView) {
            this.a = imageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(BannerAdView.this.f.q(), str)) {
                this.a.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements b.a {
        public final /* synthetic */ RoundImageView a;

        public AnonymousClass4(RoundImageView roundImageView) {
            this.a = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(BannerAdView.this.f.p(), str)) {
                this.a.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k.b(m.a().e(), BannerAdView.this.f.D());
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k.b(m.a().e(), BannerAdView.this.f.E());
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$8  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.BannerAdView$9  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public AnonymousClass9() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.anythink.basead.e.a aVar = BannerAdView.this.a;
            if (aVar != null) {
                aVar.onAdClosed();
            }
        }
    }

    public BannerAdView(Context context) {
        super(context);
        this.w = 2;
        this.z = new View.OnClickListener() { // from class: com.anythink.basead.ui.BannerAdView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (2 != BannerAdView.this.w) {
                    BannerAdView.super.b(1);
                    return;
                }
                com.anythink.core.common.e.k kVar = BannerAdView.this.e.m;
                if (kVar == null || kVar.u() != 0) {
                    return;
                }
                BannerAdView.super.b(1);
            }
        };
        this.A = new View.OnClickListener() { // from class: com.anythink.basead.ui.BannerAdView.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerAdView.super.b(1);
            }
        };
    }

    private static void c() {
    }

    private void m() {
        b(new AnonymousClass11());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03bb, code lost:
        if (r1.equals(com.anythink.core.common.e.k.c) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void n() {
        TextView textView;
        TextView textView2;
        char c;
        TextView textView3;
        RelativeLayout relativeLayout;
        TextView textView4;
        ImageView imageView;
        RoundImageView roundImageView;
        char c2;
        RelativeLayout relativeLayout2;
        TextView textView5;
        char c3;
        char c4;
        char c5;
        RoundImageView roundImageView2 = (RoundImageView) wo1.e0(this, "myoffer_banner_icon", "id");
        TextView textView6 = (TextView) wo1.e0(this, "myoffer_banner_ad_title", "id");
        TextView textView7 = (TextView) wo1.e0(this, "myoffer_banner_desc", "id");
        TextView textView8 = (TextView) wo1.e0(this, "myoffer_banner_ad_install_btn", "id");
        SpreadAnimLayout spreadAnimLayout = (SpreadAnimLayout) wo1.e0(this, "myoffer_banner_spread_layout", "id");
        this.v = (ImageView) wo1.e0(this, "myoffer_banner_close", "id");
        RelativeLayout relativeLayout3 = (RelativeLayout) wo1.e0(this, "myoffer_banner_container", "id");
        TextView textView9 = (TextView) wo1.e0(this, "myoffer_banner_publisher_name", "id");
        TextView textView10 = (TextView) wo1.e0(this, "myoffer_banner_privacy_agreement", "id");
        TextView textView11 = (TextView) wo1.e0(this, "myoffer_banner_permission_manage", "id");
        TextView textView12 = (TextView) wo1.e0(this, "myoffer_banner_version_name", "id");
        boolean z = this.e.m.q() == 0;
        if (z) {
            textView2 = textView11;
            textView = textView10;
            this.v.setVisibility(0);
        } else {
            textView = textView10;
            textView2 = textView11;
            this.v.setVisibility(8);
            String str = this.c;
            str.hashCode();
            switch (str.hashCode()) {
                case 1507809730:
                    if (str.equals(com.anythink.core.common.e.k.a)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1507809854:
                    if (str.equals(com.anythink.core.common.e.k.b)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1622564786:
                    if (str.equals(com.anythink.core.common.e.k.d)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    textView3 = textView9;
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) spreadAnimLayout.getLayoutParams();
                    layoutParams.rightMargin = h.a(getContext(), 10.0f);
                    spreadAnimLayout.setLayoutParams(layoutParams);
                    break;
                case 1:
                    textView3 = textView9;
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView6.getLayoutParams();
                    layoutParams2.rightMargin = h.a(getContext(), 10.0f);
                    textView6.setLayoutParams(layoutParams2);
                    break;
                case 2:
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) spreadAnimLayout.getLayoutParams();
                    textView3 = textView9;
                    layoutParams3.rightMargin = h.a(getContext(), 20.0f);
                    spreadAnimLayout.setLayoutParams(layoutParams3);
                    break;
            }
            if (TextUtils.isEmpty(this.f.o())) {
                ViewGroup.LayoutParams layoutParams4 = roundImageView2.getLayoutParams();
                roundImageView2.setRadiusInDip(2);
                roundImageView2.setNeedRadiu(true);
                relativeLayout = relativeLayout3;
                textView4 = textView12;
                b.a(getContext()).a(new e(1, this.f.o()), layoutParams4.width, layoutParams4.height, new AnonymousClass2(roundImageView2));
            } else {
                relativeLayout = relativeLayout3;
                textView4 = textView12;
                com.anythink.basead.ui.a.a.a(roundImageView2, true, false);
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) textView6.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.leftMargin = 0;
                    textView6.setLayoutParams(layoutParams5);
                }
            }
            this.t.add(roundImageView2);
            textView6.setText(this.f.m());
            this.t.add(textView6);
            textView8.setText(this.f.r());
            this.t.add(textView8);
            if (textView7 != null) {
                textView7.setText(this.f.n());
                this.t.add(textView7);
            }
            if (TextUtils.isEmpty(this.f.q())) {
                imageView = (ImageView) wo1.e0(this, "myoffer_banner_self_ad_logo", "id");
                b.a(getContext()).a(new e(1, this.f.q()), new AnonymousClass3(imageView));
            } else {
                imageView = null;
            }
            this.t.add(imageView);
            if (this.b) {
                roundImageView = null;
            } else {
                roundImageView = (RoundImageView) wo1.e0(this, "myoffer_banner_main_image", "id");
                if (!TextUtils.isEmpty(this.f.p())) {
                    roundImageView.getLayoutParams();
                    roundImageView.setRadiusInDip(2);
                    roundImageView.setNeedRadiu(true);
                    b.a(getContext()).a(new e(1, this.f.p()), new AnonymousClass4(roundImageView));
                    this.t.add(roundImageView);
                }
            }
            this.t.add(roundImageView);
            if (TextUtils.isEmpty(this.f.r())) {
                spreadAnimLayout.setVisibility(0);
                textView8.setVisibility(0);
            } else {
                spreadAnimLayout.setVisibility(8);
                textView8.setVisibility(8);
                String str2 = this.c;
                switch (str2.hashCode()) {
                    case -559799608:
                        if (str2.equals(com.anythink.core.common.e.k.c)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1507809730:
                        if (str2.equals(com.anythink.core.common.e.k.a)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1507809854:
                        if (str2.equals(com.anythink.core.common.e.k.b)) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1622564786:
                        if (str2.equals(com.anythink.core.common.e.k.d)) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    relativeLayout2 = relativeLayout;
                    textView5 = textView4;
                    c3 = 2;
                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) roundImageView2.getLayoutParams();
                    layoutParams6.addRule(15);
                    layoutParams6.addRule(6, -1);
                    roundImageView2.setLayoutParams(layoutParams6);
                } else if (c2 != 1) {
                    c3 = 2;
                    if (c2 != 2) {
                        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) textView6.getLayoutParams();
                        layoutParams7.addRule(11);
                        if (z) {
                            layoutParams7.rightMargin = h.a(getContext(), 18.0f);
                        } else {
                            layoutParams7.rightMargin = h.a(getContext(), 10.0f);
                        }
                        textView6.setLayoutParams(layoutParams7);
                        if (textView4 != null) {
                            RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) textView4.getLayoutParams();
                            layoutParams8.rightMargin = h.a(getContext(), 55.0f);
                            textView5 = textView4;
                            textView5.setLayoutParams(layoutParams8);
                        } else {
                            textView5 = textView4;
                        }
                    } else {
                        textView5 = textView4;
                        RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) textView6.getLayoutParams();
                        layoutParams9.rightMargin = h.a(getContext(), 18.0f);
                        textView6.setLayoutParams(layoutParams9);
                        if (textView7 != null) {
                            RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) textView7.getLayoutParams();
                            layoutParams10.rightMargin = h.a(getContext(), 114.0f);
                            textView7.setLayoutParams(layoutParams10);
                        }
                        if (relativeLayout != null) {
                            RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                            layoutParams11.rightMargin = h.a(getContext(), 114.0f);
                            relativeLayout2 = relativeLayout;
                            relativeLayout2.setLayoutParams(layoutParams11);
                        }
                    }
                    relativeLayout2 = relativeLayout;
                }
                if (this.f.G()) {
                    textView7.setVisibility(8);
                    String str3 = this.c;
                    switch (str3.hashCode()) {
                        case -559799608:
                            if (str3.equals(com.anythink.core.common.e.k.c)) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1507809730:
                            if (str3.equals(com.anythink.core.common.e.k.a)) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1507809854:
                            if (str3.equals(com.anythink.core.common.e.k.b)) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1622564786:
                            if (str3.equals(com.anythink.core.common.e.k.d)) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    if (c5 == 0 && imageView != null) {
                        RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                        layoutParams12.topMargin = h.a(getContext(), 8.0f);
                        imageView.setLayoutParams(layoutParams12);
                    }
                    if (relativeLayout2 != null) {
                        relativeLayout2.setVisibility(0);
                    }
                    if (textView3 != null) {
                        TextView textView13 = textView3;
                        textView13.setVisibility(0);
                        textView13.setText(this.f.B());
                        textView13.setOnClickListener(new AnonymousClass5());
                    }
                    if (textView != null) {
                        TextView textView14 = textView;
                        textView14.setVisibility(0);
                        textView14.setOnClickListener(new AnonymousClass6());
                    }
                    if (textView2 != null) {
                        TextView textView15 = textView2;
                        textView15.setVisibility(0);
                        textView15.setOnClickListener(new AnonymousClass7());
                    }
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                        String str4 = this.c;
                        switch (str4.hashCode()) {
                            case -559799608:
                                break;
                            case 1507809730:
                                if (str4.equals(com.anythink.core.common.e.k.a)) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1507809854:
                                if (str4.equals(com.anythink.core.common.e.k.b)) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1622564786:
                                if (str4.equals(com.anythink.core.common.e.k.d)) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 != 0 && c3 != 1) {
                            textView5.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", "string"), this.f.C()));
                        } else {
                            Resources resources = getContext().getResources();
                            int a = h.a(getContext(), "myoffer_panel_version", "string");
                            textView5.setText(resources.getString(a, this.f.C() + g54.A + this.f.B()));
                        }
                        textView5.setOnClickListener(new AnonymousClass8());
                        return;
                    }
                    return;
                }
                textView7.setVisibility(0);
                String str5 = this.c;
                switch (str5.hashCode()) {
                    case -559799608:
                        if (str5.equals(com.anythink.core.common.e.k.c)) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1507809730:
                        if (str5.equals(com.anythink.core.common.e.k.a)) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1507809854:
                        if (str5.equals(com.anythink.core.common.e.k.b)) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1622564786:
                        if (str5.equals(com.anythink.core.common.e.k.d)) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                if (c4 != 0) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams13 = (RelativeLayout.LayoutParams) textView6.getLayoutParams();
                layoutParams13.topMargin = h.a(getContext(), 8.0f);
                textView6.setLayoutParams(layoutParams13);
                return;
            }
            relativeLayout2 = relativeLayout;
            textView5 = textView4;
            c3 = 2;
            if (this.f.G()) {
            }
        }
        textView3 = textView9;
        if (TextUtils.isEmpty(this.f.o())) {
        }
        this.t.add(roundImageView2);
        textView6.setText(this.f.m());
        this.t.add(textView6);
        textView8.setText(this.f.r());
        this.t.add(textView8);
        if (textView7 != null) {
        }
        if (TextUtils.isEmpty(this.f.q())) {
        }
        this.t.add(imageView);
        if (this.b) {
        }
        this.t.add(roundImageView);
        if (TextUtils.isEmpty(this.f.r())) {
        }
        relativeLayout2 = relativeLayout;
        textView5 = textView4;
        c3 = 2;
        if (this.f.G()) {
        }
    }

    private void o() {
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            View view = this.t.get(i);
            if (view != null) {
                view.setOnClickListener(this.A);
            }
        }
        setOnClickListener(this.z);
        this.v.setOnClickListener(new AnonymousClass9());
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public void destroy() {
        super.destroy();
    }

    @Override // com.anythink.basead.ui.BaseAdView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    private int a(String str) {
        i iVar = this.f;
        int i = 1;
        if (!(iVar instanceof x) ? !(iVar instanceof q) || TextUtils.isEmpty(str) || !com.anythink.basead.a.a.b.b(str) : ((x) iVar).R() != 1) {
            i = 2;
        }
        this.w = i;
        return i;
    }

    private void b(String str) {
        RelativeLayout relativeLayout = (RelativeLayout) wo1.e0(this, "myoffer_banner_root", "id");
        this.v = (ImageView) wo1.e0(this, "myoffer_banner_close", "id");
        RelativeLayout relativeLayout2 = (RelativeLayout) wo1.e0(this, "myoffer_banner_container", "id");
        TextView textView = (TextView) wo1.e0(this, "myoffer_banner_publisher_name", "id");
        TextView textView2 = (TextView) wo1.e0(this, "myoffer_banner_privacy_agreement", "id");
        TextView textView3 = (TextView) wo1.e0(this, "myoffer_banner_permission_manage", "id");
        TextView textView4 = (TextView) wo1.e0(this, "myoffer_banner_version_name", "id");
        if (this.e.m.q() == 0) {
            this.v.setVisibility(0);
            if (TextUtils.equals(com.anythink.core.common.e.k.d, this.c)) {
                ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
                layoutParams.width = h.a(getContext(), 23.0f);
                layoutParams.height = h.a(getContext(), 23.0f);
                this.v.setLayoutParams(layoutParams);
            }
        } else {
            this.v.setVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        relativeLayout.setLayoutParams(layoutParams2);
        RecycleImageView recycleImageView = new RecycleImageView(getContext());
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(recycleImageView, 0, new RelativeLayout.LayoutParams(-1, -1));
        RecycleImageView recycleImageView2 = new RecycleImageView(getContext());
        recycleImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        b.a(getContext()).a(new e(1, str), new AnonymousClass12(str, recycleImageView2, recycleImageView));
        this.t.add(recycleImageView2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        addView(recycleImageView2, 1, layoutParams3);
        if (!TextUtils.isEmpty(this.f.q())) {
            ImageView imageView = (ImageView) wo1.e0(this, "myoffer_banner_self_ad_logo", "id");
            b.a(getContext()).a(new e(1, this.f.q()), new AnonymousClass13(imageView));
            this.t.add(imageView);
        }
        if (this.f.G()) {
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(this.f.B());
                textView.setOnClickListener(new AnonymousClass14());
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new AnonymousClass15());
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new AnonymousClass16());
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
                textView4.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", "string"), this.f.C()));
                textView4.setOnClickListener(new AnonymousClass17());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0703, code lost:
        if (r3.equals(r9) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d() {
        char c;
        String str;
        String str2;
        Object obj;
        TextView textView;
        Object obj2;
        char c2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        RelativeLayout relativeLayout;
        ImageView imageView;
        RoundImageView roundImageView;
        Object obj3;
        char c3;
        RelativeLayout relativeLayout2;
        TextView textView5;
        char c4;
        char c5;
        String p = this.e.m.p();
        i iVar = this.f;
        String p2 = iVar instanceof x ? iVar.p() : null;
        switch (p.hashCode()) {
            case -559799608:
                if (p.equals(com.anythink.core.common.e.k.c)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1507809730:
                if (p.equals(com.anythink.core.common.e.k.a)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1507809854:
                if (p.equals(com.anythink.core.common.e.k.b)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1622564786:
                if (p.equals(com.anythink.core.common.e.k.d)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str3 = "myoffer_banner_ad_layout_320x50";
        if (c == 0) {
            this.c = com.anythink.core.common.e.k.b;
            if (p2 == null) {
                i iVar2 = this.f;
                if (iVar2 instanceof q) {
                    p2 = ((q) iVar2).b();
                }
            }
            this.b = true;
            str3 = "myoffer_banner_ad_layout_320x90";
        } else if (c == 1) {
            this.c = com.anythink.core.common.e.k.c;
            if (p2 == null) {
                i iVar3 = this.f;
                if (iVar3 instanceof q) {
                    p2 = ((q) iVar3).c();
                }
            }
            this.b = true;
            str3 = "myoffer_banner_ad_layout_300x250";
        } else if (c != 2) {
            this.c = com.anythink.core.common.e.k.a;
            if (p2 == null) {
                i iVar4 = this.f;
                if (iVar4 instanceof q) {
                    p2 = ((q) iVar4).a();
                }
            }
        } else {
            this.c = com.anythink.core.common.e.k.d;
            if (p2 == null) {
                i iVar5 = this.f;
                if (iVar5 instanceof q) {
                    p2 = ((q) iVar5).e();
                }
            }
            this.b = true;
            str3 = "myoffer_banner_ad_layout_728x90";
        }
        i iVar6 = this.f;
        int i = (!(iVar6 instanceof x) ? (iVar6 instanceof q) && !TextUtils.isEmpty(p2) && com.anythink.basead.a.a.b.b(p2) : ((x) iVar6).R() == 1) ? 2 : 1;
        this.w = i;
        if (1 == i) {
            com.anythink.core.common.j.e.a(TAG, "mode: pure picture");
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_banner_ad_layout_pure_picture", "layout"), this);
            RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_banner_root", "id"));
            this.v = (ImageView) wo1.e0(this, "myoffer_banner_close", "id");
            RelativeLayout relativeLayout4 = (RelativeLayout) wo1.e0(this, "myoffer_banner_container", "id");
            TextView textView6 = (TextView) wo1.e0(this, "myoffer_banner_publisher_name", "id");
            TextView textView7 = (TextView) wo1.e0(this, "myoffer_banner_privacy_agreement", "id");
            TextView textView8 = (TextView) wo1.e0(this, "myoffer_banner_permission_manage", "id");
            TextView textView9 = (TextView) wo1.e0(this, "myoffer_banner_version_name", "id");
            if (this.e.m.q() == 0) {
                this.v.setVisibility(0);
                if (TextUtils.equals(com.anythink.core.common.e.k.d, this.c)) {
                    ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
                    layoutParams.width = h.a(getContext(), 23.0f);
                    layoutParams.height = h.a(getContext(), 23.0f);
                    this.v.setLayoutParams(layoutParams);
                }
            } else {
                this.v.setVisibility(8);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout3.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            relativeLayout3.setLayoutParams(layoutParams2);
            RecycleImageView recycleImageView = new RecycleImageView(getContext());
            recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(recycleImageView, 0, new RelativeLayout.LayoutParams(-1, -1));
            RecycleImageView recycleImageView2 = new RecycleImageView(getContext());
            recycleImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            b.a(getContext()).a(new e(1, p2), new AnonymousClass12(p2, recycleImageView2, recycleImageView));
            this.t.add(recycleImageView2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.addRule(13);
            addView(recycleImageView2, 1, layoutParams3);
            if (!TextUtils.isEmpty(this.f.q())) {
                ImageView imageView2 = (ImageView) wo1.e0(this, "myoffer_banner_self_ad_logo", "id");
                b.a(getContext()).a(new e(1, this.f.q()), new AnonymousClass13(imageView2));
                this.t.add(imageView2);
            }
            if (this.f.G()) {
                if (relativeLayout4 != null) {
                    relativeLayout4.setVisibility(0);
                }
                if (textView6 != null) {
                    textView6.setVisibility(0);
                    textView6.setText(this.f.B());
                    textView6.setOnClickListener(new AnonymousClass14());
                }
                if (textView7 != null) {
                    textView7.setVisibility(0);
                    textView7.setOnClickListener(new AnonymousClass15());
                }
                if (textView8 != null) {
                    textView8.setVisibility(0);
                    textView8.setOnClickListener(new AnonymousClass16());
                }
                if (textView9 != null) {
                    textView9.setVisibility(0);
                    textView9.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", "string"), this.f.C()));
                    textView9.setOnClickListener(new AnonymousClass17());
                    return;
                }
                return;
            }
            return;
        }
        com.anythink.core.common.j.e.a(TAG, "mode: assemble banner");
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), str3, "layout"), this);
        RoundImageView roundImageView2 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_banner_icon", "id"));
        TextView textView10 = (TextView) wo1.e0(this, "myoffer_banner_ad_title", "id");
        TextView textView11 = (TextView) wo1.e0(this, "myoffer_banner_desc", "id");
        TextView textView12 = (TextView) wo1.e0(this, "myoffer_banner_ad_install_btn", "id");
        SpreadAnimLayout spreadAnimLayout = (SpreadAnimLayout) wo1.e0(this, "myoffer_banner_spread_layout", "id");
        this.v = (ImageView) wo1.e0(this, "myoffer_banner_close", "id");
        RelativeLayout relativeLayout5 = (RelativeLayout) wo1.e0(this, "myoffer_banner_container", "id");
        TextView textView13 = (TextView) wo1.e0(this, "myoffer_banner_publisher_name", "id");
        TextView textView14 = (TextView) wo1.e0(this, "myoffer_banner_privacy_agreement", "id");
        TextView textView15 = (TextView) wo1.e0(this, "myoffer_banner_permission_manage", "id");
        TextView textView16 = (TextView) wo1.e0(this, "myoffer_banner_version_name", "id");
        boolean z = this.e.m.q() == 0;
        if (z) {
            str = "myoffer_panel_version";
            str2 = "string";
            this.v.setVisibility(0);
            textView3 = textView13;
            obj = com.anythink.core.common.e.k.b;
            textView = textView15;
            obj2 = com.anythink.core.common.e.k.a;
            textView2 = textView14;
        } else {
            str = "myoffer_panel_version";
            str2 = "string";
            this.v.setVisibility(8);
            String str4 = this.c;
            str4.hashCode();
            switch (str4.hashCode()) {
                case 1507809730:
                    obj = com.anythink.core.common.e.k.b;
                    textView = textView15;
                    obj2 = com.anythink.core.common.e.k.a;
                    if (str4.equals(obj2)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1507809854:
                    obj = com.anythink.core.common.e.k.b;
                    if (str4.equals(obj)) {
                        c2 = 1;
                        textView = textView15;
                        obj2 = com.anythink.core.common.e.k.a;
                        break;
                    }
                    textView = textView15;
                    obj2 = com.anythink.core.common.e.k.a;
                    c2 = 65535;
                    break;
                case 1622564786:
                    if (str4.equals(com.anythink.core.common.e.k.d)) {
                        c2 = 2;
                        obj = com.anythink.core.common.e.k.b;
                        textView = textView15;
                        obj2 = com.anythink.core.common.e.k.a;
                        break;
                    }
                default:
                    obj = com.anythink.core.common.e.k.b;
                    textView = textView15;
                    obj2 = com.anythink.core.common.e.k.a;
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    textView2 = textView14;
                    textView3 = textView13;
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) spreadAnimLayout.getLayoutParams();
                    layoutParams4.rightMargin = h.a(getContext(), 10.0f);
                    spreadAnimLayout.setLayoutParams(layoutParams4);
                    break;
                case 1:
                    textView2 = textView14;
                    textView3 = textView13;
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
                    layoutParams5.rightMargin = h.a(getContext(), 10.0f);
                    textView10.setLayoutParams(layoutParams5);
                    break;
                case 2:
                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) spreadAnimLayout.getLayoutParams();
                    textView2 = textView14;
                    textView3 = textView13;
                    layoutParams6.rightMargin = h.a(getContext(), 20.0f);
                    spreadAnimLayout.setLayoutParams(layoutParams6);
                    break;
                default:
                    textView2 = textView14;
                    textView3 = textView13;
                    break;
            }
        }
        if (!TextUtils.isEmpty(this.f.o())) {
            ViewGroup.LayoutParams layoutParams7 = roundImageView2.getLayoutParams();
            roundImageView2.setRadiusInDip(2);
            roundImageView2.setNeedRadiu(true);
            relativeLayout = relativeLayout5;
            textView4 = textView16;
            b.a(getContext()).a(new e(1, this.f.o()), layoutParams7.width, layoutParams7.height, new AnonymousClass2(roundImageView2));
        } else {
            textView4 = textView16;
            relativeLayout = relativeLayout5;
            com.anythink.basead.ui.a.a.a(roundImageView2, true, false);
            RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
            if (layoutParams8 != null) {
                layoutParams8.leftMargin = 0;
                textView10.setLayoutParams(layoutParams8);
            }
        }
        this.t.add(roundImageView2);
        textView10.setText(this.f.m());
        this.t.add(textView10);
        textView12.setText(this.f.r());
        this.t.add(textView12);
        if (textView11 != null) {
            textView11.setText(this.f.n());
            this.t.add(textView11);
        }
        if (TextUtils.isEmpty(this.f.q())) {
            imageView = null;
        } else {
            imageView = (ImageView) wo1.e0(this, "myoffer_banner_self_ad_logo", "id");
            b.a(getContext()).a(new e(1, this.f.q()), new AnonymousClass3(imageView));
        }
        this.t.add(imageView);
        if (this.b) {
            roundImageView = (RoundImageView) wo1.e0(this, "myoffer_banner_main_image", "id");
            if (!TextUtils.isEmpty(this.f.p())) {
                roundImageView.getLayoutParams();
                roundImageView.setRadiusInDip(2);
                roundImageView.setNeedRadiu(true);
                b.a(getContext()).a(new e(1, this.f.p()), new AnonymousClass4(roundImageView));
                this.t.add(roundImageView);
            }
        } else {
            roundImageView = null;
        }
        this.t.add(roundImageView);
        if (!TextUtils.isEmpty(this.f.r())) {
            spreadAnimLayout.setVisibility(0);
            textView12.setVisibility(0);
            obj3 = com.anythink.core.common.e.k.c;
        } else {
            spreadAnimLayout.setVisibility(8);
            textView12.setVisibility(8);
            String str5 = this.c;
            switch (str5.hashCode()) {
                case -559799608:
                    obj3 = com.anythink.core.common.e.k.c;
                    if (str5.equals(obj3)) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1507809730:
                    if (str5.equals(obj2)) {
                        c3 = 3;
                        obj3 = com.anythink.core.common.e.k.c;
                        break;
                    }
                    obj3 = com.anythink.core.common.e.k.c;
                    c3 = 65535;
                    break;
                case 1507809854:
                    if (str5.equals(obj)) {
                        c3 = 0;
                        obj3 = com.anythink.core.common.e.k.c;
                        break;
                    }
                    obj3 = com.anythink.core.common.e.k.c;
                    c3 = 65535;
                    break;
                case 1622564786:
                    if (str5.equals(com.anythink.core.common.e.k.d)) {
                        c3 = 2;
                        obj3 = com.anythink.core.common.e.k.c;
                        break;
                    }
                    obj3 = com.anythink.core.common.e.k.c;
                    c3 = 65535;
                    break;
                default:
                    obj3 = com.anythink.core.common.e.k.c;
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                relativeLayout2 = relativeLayout;
                textView5 = textView4;
                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) roundImageView2.getLayoutParams();
                layoutParams9.addRule(15);
                layoutParams9.addRule(6, -1);
                roundImageView2.setLayoutParams(layoutParams9);
            } else if (c3 != 1) {
                if (c3 != 2) {
                    RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
                    layoutParams10.addRule(11);
                    if (z) {
                        layoutParams10.rightMargin = h.a(getContext(), 18.0f);
                    } else {
                        layoutParams10.rightMargin = h.a(getContext(), 10.0f);
                    }
                    textView10.setLayoutParams(layoutParams10);
                    if (textView4 != null) {
                        RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) textView4.getLayoutParams();
                        layoutParams11.rightMargin = h.a(getContext(), 55.0f);
                        textView5 = textView4;
                        textView5.setLayoutParams(layoutParams11);
                    } else {
                        textView5 = textView4;
                    }
                } else {
                    textView5 = textView4;
                    RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
                    layoutParams12.rightMargin = h.a(getContext(), 18.0f);
                    textView10.setLayoutParams(layoutParams12);
                    if (textView11 != null) {
                        RelativeLayout.LayoutParams layoutParams13 = (RelativeLayout.LayoutParams) textView11.getLayoutParams();
                        layoutParams13.rightMargin = h.a(getContext(), 114.0f);
                        textView11.setLayoutParams(layoutParams13);
                    }
                    if (relativeLayout != null) {
                        RelativeLayout.LayoutParams layoutParams14 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                        layoutParams14.rightMargin = h.a(getContext(), 114.0f);
                        relativeLayout2 = relativeLayout;
                        relativeLayout2.setLayoutParams(layoutParams14);
                    }
                }
                relativeLayout2 = relativeLayout;
            }
            if (!this.f.G()) {
                textView11.setVisibility(8);
                String str6 = this.c;
                switch (str6.hashCode()) {
                    case -559799608:
                        if (str6.equals(obj3)) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1507809730:
                        if (str6.equals(obj2)) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1507809854:
                        if (str6.equals(obj)) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1622564786:
                        if (str6.equals(com.anythink.core.common.e.k.d)) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                if (c4 == 0 && imageView != null) {
                    RelativeLayout.LayoutParams layoutParams15 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams15.topMargin = h.a(getContext(), 8.0f);
                    imageView.setLayoutParams(layoutParams15);
                }
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                }
                if (textView3 != null) {
                    TextView textView17 = textView3;
                    textView17.setVisibility(0);
                    textView17.setText(this.f.B());
                    textView17.setOnClickListener(new AnonymousClass5());
                }
                if (textView2 != null) {
                    TextView textView18 = textView2;
                    textView18.setVisibility(0);
                    textView18.setOnClickListener(new AnonymousClass6());
                }
                if (textView != null) {
                    TextView textView19 = textView;
                    textView19.setVisibility(0);
                    textView19.setOnClickListener(new AnonymousClass7());
                }
                if (textView5 != null) {
                    textView5.setVisibility(0);
                    String str7 = this.c;
                    switch (str7.hashCode()) {
                        case -559799608:
                            if (str7.equals(obj3)) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1507809730:
                            if (str7.equals(obj2)) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1507809854:
                            if (str7.equals(obj)) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1622564786:
                            if (str7.equals(com.anythink.core.common.e.k.d)) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    if (c5 != 0 && c5 != 1) {
                        textView5.setText(getContext().getResources().getString(h.a(getContext(), str, str2), this.f.C()));
                    } else {
                        Resources resources = getContext().getResources();
                        int a = h.a(getContext(), str, str2);
                        textView5.setText(resources.getString(a, this.f.C() + g54.A + this.f.B()));
                    }
                    textView5.setOnClickListener(new AnonymousClass8());
                    return;
                }
                return;
            }
            char c6 = 0;
            textView11.setVisibility(0);
            String str8 = this.c;
            switch (str8.hashCode()) {
                case -559799608:
                    if (str8.equals(obj3)) {
                        c6 = 2;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1507809730:
                    break;
                case 1507809854:
                    if (str8.equals(obj)) {
                        c6 = 1;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1622564786:
                    if (str8.equals(com.anythink.core.common.e.k.d)) {
                        c6 = 3;
                        break;
                    }
                    c6 = 65535;
                    break;
                default:
                    c6 = 65535;
                    break;
            }
            if (c6 != 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
            layoutParams16.topMargin = h.a(getContext(), 8.0f);
            textView10.setLayoutParams(layoutParams16);
            return;
        }
        relativeLayout2 = relativeLayout;
        textView5 = textView4;
        if (!this.f.G()) {
        }
    }

    public BannerAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar);
        this.w = 2;
        this.z = new View.OnClickListener() { // from class: com.anythink.basead.ui.BannerAdView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (2 != BannerAdView.this.w) {
                    BannerAdView.super.b(1);
                    return;
                }
                com.anythink.core.common.e.k kVar = BannerAdView.this.e.m;
                if (kVar == null || kVar.u() != 0) {
                    return;
                }
                BannerAdView.super.b(1);
            }
        };
        this.A = new View.OnClickListener() { // from class: com.anythink.basead.ui.BannerAdView.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerAdView.super.b(1);
            }
        };
        this.a = aVar;
        b(new AnonymousClass11());
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            View view = this.t.get(i);
            if (view != null) {
                view.setOnClickListener(this.A);
            }
        }
        setOnClickListener(this.z);
        this.v.setOnClickListener(new AnonymousClass9());
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(int i) {
        com.anythink.basead.e.a aVar = this.a;
        if (aVar != null) {
            aVar.onAdClick(i);
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(boolean z) {
        com.anythink.basead.e.a aVar = this.a;
        if (aVar != null) {
            aVar.onDeeplinkCallback(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0703, code lost:
        if (r3.equals(r9) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06e1  */
    @Override // com.anythink.basead.ui.BaseAdView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        char c;
        String str;
        String str2;
        Object obj;
        TextView textView;
        Object obj2;
        char c2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        RelativeLayout relativeLayout;
        ImageView imageView;
        RoundImageView roundImageView;
        Object obj3;
        char c3;
        RelativeLayout relativeLayout2;
        TextView textView5;
        char c4;
        char c5;
        String p = this.e.m.p();
        i iVar = this.f;
        String p2 = iVar instanceof x ? iVar.p() : null;
        switch (p.hashCode()) {
            case -559799608:
                if (p.equals(com.anythink.core.common.e.k.c)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1507809730:
                if (p.equals(com.anythink.core.common.e.k.a)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1507809854:
                if (p.equals(com.anythink.core.common.e.k.b)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1622564786:
                if (p.equals(com.anythink.core.common.e.k.d)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str3 = "myoffer_banner_ad_layout_320x50";
        if (c == 0) {
            this.c = com.anythink.core.common.e.k.b;
            if (p2 == null) {
                i iVar2 = this.f;
                if (iVar2 instanceof q) {
                    p2 = ((q) iVar2).b();
                }
            }
            this.b = true;
            str3 = "myoffer_banner_ad_layout_320x90";
        } else if (c == 1) {
            this.c = com.anythink.core.common.e.k.c;
            if (p2 == null) {
                i iVar3 = this.f;
                if (iVar3 instanceof q) {
                    p2 = ((q) iVar3).c();
                }
            }
            this.b = true;
            str3 = "myoffer_banner_ad_layout_300x250";
        } else if (c != 2) {
            this.c = com.anythink.core.common.e.k.a;
            if (p2 == null) {
                i iVar4 = this.f;
                if (iVar4 instanceof q) {
                    p2 = ((q) iVar4).a();
                }
            }
        } else {
            this.c = com.anythink.core.common.e.k.d;
            if (p2 == null) {
                i iVar5 = this.f;
                if (iVar5 instanceof q) {
                    p2 = ((q) iVar5).e();
                }
            }
            this.b = true;
            str3 = "myoffer_banner_ad_layout_728x90";
        }
        i iVar6 = this.f;
        int i = (!(iVar6 instanceof x) ? (iVar6 instanceof q) && !TextUtils.isEmpty(p2) && com.anythink.basead.a.a.b.b(p2) : ((x) iVar6).R() == 1) ? 2 : 1;
        this.w = i;
        if (1 == i) {
            com.anythink.core.common.j.e.a(TAG, "mode: pure picture");
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_banner_ad_layout_pure_picture", "layout"), this);
            RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_banner_root", "id"));
            this.v = (ImageView) wo1.e0(this, "myoffer_banner_close", "id");
            RelativeLayout relativeLayout4 = (RelativeLayout) wo1.e0(this, "myoffer_banner_container", "id");
            TextView textView6 = (TextView) wo1.e0(this, "myoffer_banner_publisher_name", "id");
            TextView textView7 = (TextView) wo1.e0(this, "myoffer_banner_privacy_agreement", "id");
            TextView textView8 = (TextView) wo1.e0(this, "myoffer_banner_permission_manage", "id");
            TextView textView9 = (TextView) wo1.e0(this, "myoffer_banner_version_name", "id");
            if (this.e.m.q() == 0) {
                this.v.setVisibility(0);
                if (TextUtils.equals(com.anythink.core.common.e.k.d, this.c)) {
                    ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
                    layoutParams.width = h.a(getContext(), 23.0f);
                    layoutParams.height = h.a(getContext(), 23.0f);
                    this.v.setLayoutParams(layoutParams);
                }
            } else {
                this.v.setVisibility(8);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout3.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            relativeLayout3.setLayoutParams(layoutParams2);
            RecycleImageView recycleImageView = new RecycleImageView(getContext());
            recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(recycleImageView, 0, new RelativeLayout.LayoutParams(-1, -1));
            RecycleImageView recycleImageView2 = new RecycleImageView(getContext());
            recycleImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            b.a(getContext()).a(new e(1, p2), new AnonymousClass12(p2, recycleImageView2, recycleImageView));
            this.t.add(recycleImageView2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.addRule(13);
            addView(recycleImageView2, 1, layoutParams3);
            if (!TextUtils.isEmpty(this.f.q())) {
                ImageView imageView2 = (ImageView) wo1.e0(this, "myoffer_banner_self_ad_logo", "id");
                b.a(getContext()).a(new e(1, this.f.q()), new AnonymousClass13(imageView2));
                this.t.add(imageView2);
            }
            if (this.f.G()) {
                if (relativeLayout4 != null) {
                    relativeLayout4.setVisibility(0);
                }
                if (textView6 != null) {
                    textView6.setVisibility(0);
                    textView6.setText(this.f.B());
                    textView6.setOnClickListener(new AnonymousClass14());
                }
                if (textView7 != null) {
                    textView7.setVisibility(0);
                    textView7.setOnClickListener(new AnonymousClass15());
                }
                if (textView8 != null) {
                    textView8.setVisibility(0);
                    textView8.setOnClickListener(new AnonymousClass16());
                }
                if (textView9 != null) {
                    textView9.setVisibility(0);
                    textView9.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", "string"), this.f.C()));
                    textView9.setOnClickListener(new AnonymousClass17());
                    return;
                }
                return;
            }
            return;
        }
        com.anythink.core.common.j.e.a(TAG, "mode: assemble banner");
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), str3, "layout"), this);
        RoundImageView roundImageView2 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_banner_icon", "id"));
        TextView textView10 = (TextView) wo1.e0(this, "myoffer_banner_ad_title", "id");
        TextView textView11 = (TextView) wo1.e0(this, "myoffer_banner_desc", "id");
        TextView textView12 = (TextView) wo1.e0(this, "myoffer_banner_ad_install_btn", "id");
        SpreadAnimLayout spreadAnimLayout = (SpreadAnimLayout) wo1.e0(this, "myoffer_banner_spread_layout", "id");
        this.v = (ImageView) wo1.e0(this, "myoffer_banner_close", "id");
        RelativeLayout relativeLayout5 = (RelativeLayout) wo1.e0(this, "myoffer_banner_container", "id");
        TextView textView13 = (TextView) wo1.e0(this, "myoffer_banner_publisher_name", "id");
        TextView textView14 = (TextView) wo1.e0(this, "myoffer_banner_privacy_agreement", "id");
        TextView textView15 = (TextView) wo1.e0(this, "myoffer_banner_permission_manage", "id");
        TextView textView16 = (TextView) wo1.e0(this, "myoffer_banner_version_name", "id");
        boolean z = this.e.m.q() == 0;
        if (z) {
            str = "myoffer_panel_version";
            str2 = "string";
            this.v.setVisibility(0);
            textView3 = textView13;
            obj = com.anythink.core.common.e.k.b;
            textView = textView15;
            obj2 = com.anythink.core.common.e.k.a;
            textView2 = textView14;
        } else {
            str = "myoffer_panel_version";
            str2 = "string";
            this.v.setVisibility(8);
            String str4 = this.c;
            str4.hashCode();
            switch (str4.hashCode()) {
                case 1507809730:
                    obj = com.anythink.core.common.e.k.b;
                    textView = textView15;
                    obj2 = com.anythink.core.common.e.k.a;
                    if (str4.equals(obj2)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1507809854:
                    obj = com.anythink.core.common.e.k.b;
                    if (str4.equals(obj)) {
                        c2 = 1;
                        textView = textView15;
                        obj2 = com.anythink.core.common.e.k.a;
                        break;
                    }
                    textView = textView15;
                    obj2 = com.anythink.core.common.e.k.a;
                    c2 = 65535;
                    break;
                case 1622564786:
                    if (str4.equals(com.anythink.core.common.e.k.d)) {
                        c2 = 2;
                        obj = com.anythink.core.common.e.k.b;
                        textView = textView15;
                        obj2 = com.anythink.core.common.e.k.a;
                        break;
                    }
                default:
                    obj = com.anythink.core.common.e.k.b;
                    textView = textView15;
                    obj2 = com.anythink.core.common.e.k.a;
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    textView2 = textView14;
                    textView3 = textView13;
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) spreadAnimLayout.getLayoutParams();
                    layoutParams4.rightMargin = h.a(getContext(), 10.0f);
                    spreadAnimLayout.setLayoutParams(layoutParams4);
                    break;
                case 1:
                    textView2 = textView14;
                    textView3 = textView13;
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
                    layoutParams5.rightMargin = h.a(getContext(), 10.0f);
                    textView10.setLayoutParams(layoutParams5);
                    break;
                case 2:
                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) spreadAnimLayout.getLayoutParams();
                    textView2 = textView14;
                    textView3 = textView13;
                    layoutParams6.rightMargin = h.a(getContext(), 20.0f);
                    spreadAnimLayout.setLayoutParams(layoutParams6);
                    break;
                default:
                    textView2 = textView14;
                    textView3 = textView13;
                    break;
            }
        }
        if (!TextUtils.isEmpty(this.f.o())) {
            ViewGroup.LayoutParams layoutParams7 = roundImageView2.getLayoutParams();
            roundImageView2.setRadiusInDip(2);
            roundImageView2.setNeedRadiu(true);
            relativeLayout = relativeLayout5;
            textView4 = textView16;
            b.a(getContext()).a(new e(1, this.f.o()), layoutParams7.width, layoutParams7.height, new AnonymousClass2(roundImageView2));
        } else {
            textView4 = textView16;
            relativeLayout = relativeLayout5;
            com.anythink.basead.ui.a.a.a(roundImageView2, true, false);
            RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
            if (layoutParams8 != null) {
                layoutParams8.leftMargin = 0;
                textView10.setLayoutParams(layoutParams8);
            }
        }
        this.t.add(roundImageView2);
        textView10.setText(this.f.m());
        this.t.add(textView10);
        textView12.setText(this.f.r());
        this.t.add(textView12);
        if (textView11 != null) {
            textView11.setText(this.f.n());
            this.t.add(textView11);
        }
        if (TextUtils.isEmpty(this.f.q())) {
            imageView = null;
        } else {
            imageView = (ImageView) wo1.e0(this, "myoffer_banner_self_ad_logo", "id");
            b.a(getContext()).a(new e(1, this.f.q()), new AnonymousClass3(imageView));
        }
        this.t.add(imageView);
        if (this.b) {
            roundImageView = (RoundImageView) wo1.e0(this, "myoffer_banner_main_image", "id");
            if (!TextUtils.isEmpty(this.f.p())) {
                roundImageView.getLayoutParams();
                roundImageView.setRadiusInDip(2);
                roundImageView.setNeedRadiu(true);
                b.a(getContext()).a(new e(1, this.f.p()), new AnonymousClass4(roundImageView));
                this.t.add(roundImageView);
            }
        } else {
            roundImageView = null;
        }
        this.t.add(roundImageView);
        if (!TextUtils.isEmpty(this.f.r())) {
            spreadAnimLayout.setVisibility(0);
            textView12.setVisibility(0);
            obj3 = com.anythink.core.common.e.k.c;
        } else {
            spreadAnimLayout.setVisibility(8);
            textView12.setVisibility(8);
            String str5 = this.c;
            switch (str5.hashCode()) {
                case -559799608:
                    obj3 = com.anythink.core.common.e.k.c;
                    if (str5.equals(obj3)) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1507809730:
                    if (str5.equals(obj2)) {
                        c3 = 3;
                        obj3 = com.anythink.core.common.e.k.c;
                        break;
                    }
                    obj3 = com.anythink.core.common.e.k.c;
                    c3 = 65535;
                    break;
                case 1507809854:
                    if (str5.equals(obj)) {
                        c3 = 0;
                        obj3 = com.anythink.core.common.e.k.c;
                        break;
                    }
                    obj3 = com.anythink.core.common.e.k.c;
                    c3 = 65535;
                    break;
                case 1622564786:
                    if (str5.equals(com.anythink.core.common.e.k.d)) {
                        c3 = 2;
                        obj3 = com.anythink.core.common.e.k.c;
                        break;
                    }
                    obj3 = com.anythink.core.common.e.k.c;
                    c3 = 65535;
                    break;
                default:
                    obj3 = com.anythink.core.common.e.k.c;
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                relativeLayout2 = relativeLayout;
                textView5 = textView4;
                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) roundImageView2.getLayoutParams();
                layoutParams9.addRule(15);
                layoutParams9.addRule(6, -1);
                roundImageView2.setLayoutParams(layoutParams9);
            } else if (c3 != 1) {
                if (c3 != 2) {
                    RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
                    layoutParams10.addRule(11);
                    if (z) {
                        layoutParams10.rightMargin = h.a(getContext(), 18.0f);
                    } else {
                        layoutParams10.rightMargin = h.a(getContext(), 10.0f);
                    }
                    textView10.setLayoutParams(layoutParams10);
                    if (textView4 != null) {
                        RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) textView4.getLayoutParams();
                        layoutParams11.rightMargin = h.a(getContext(), 55.0f);
                        textView5 = textView4;
                        textView5.setLayoutParams(layoutParams11);
                    } else {
                        textView5 = textView4;
                    }
                } else {
                    textView5 = textView4;
                    RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
                    layoutParams12.rightMargin = h.a(getContext(), 18.0f);
                    textView10.setLayoutParams(layoutParams12);
                    if (textView11 != null) {
                        RelativeLayout.LayoutParams layoutParams13 = (RelativeLayout.LayoutParams) textView11.getLayoutParams();
                        layoutParams13.rightMargin = h.a(getContext(), 114.0f);
                        textView11.setLayoutParams(layoutParams13);
                    }
                    if (relativeLayout != null) {
                        RelativeLayout.LayoutParams layoutParams14 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                        layoutParams14.rightMargin = h.a(getContext(), 114.0f);
                        relativeLayout2 = relativeLayout;
                        relativeLayout2.setLayoutParams(layoutParams14);
                    }
                }
                relativeLayout2 = relativeLayout;
            }
            if (!this.f.G()) {
                textView11.setVisibility(8);
                String str6 = this.c;
                switch (str6.hashCode()) {
                    case -559799608:
                        if (str6.equals(obj3)) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1507809730:
                        if (str6.equals(obj2)) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1507809854:
                        if (str6.equals(obj)) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1622564786:
                        if (str6.equals(com.anythink.core.common.e.k.d)) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                if (c4 == 0 && imageView != null) {
                    RelativeLayout.LayoutParams layoutParams15 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams15.topMargin = h.a(getContext(), 8.0f);
                    imageView.setLayoutParams(layoutParams15);
                }
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                }
                if (textView3 != null) {
                    TextView textView17 = textView3;
                    textView17.setVisibility(0);
                    textView17.setText(this.f.B());
                    textView17.setOnClickListener(new AnonymousClass5());
                }
                if (textView2 != null) {
                    TextView textView18 = textView2;
                    textView18.setVisibility(0);
                    textView18.setOnClickListener(new AnonymousClass6());
                }
                if (textView != null) {
                    TextView textView19 = textView;
                    textView19.setVisibility(0);
                    textView19.setOnClickListener(new AnonymousClass7());
                }
                if (textView5 != null) {
                    textView5.setVisibility(0);
                    String str7 = this.c;
                    switch (str7.hashCode()) {
                        case -559799608:
                            if (str7.equals(obj3)) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1507809730:
                            if (str7.equals(obj2)) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1507809854:
                            if (str7.equals(obj)) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1622564786:
                            if (str7.equals(com.anythink.core.common.e.k.d)) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    if (c5 != 0 && c5 != 1) {
                        textView5.setText(getContext().getResources().getString(h.a(getContext(), str, str2), this.f.C()));
                    } else {
                        Resources resources = getContext().getResources();
                        int a = h.a(getContext(), str, str2);
                        textView5.setText(resources.getString(a, this.f.C() + g54.A + this.f.B()));
                    }
                    textView5.setOnClickListener(new AnonymousClass8());
                    return;
                }
                return;
            }
            char c6 = 0;
            textView11.setVisibility(0);
            String str8 = this.c;
            switch (str8.hashCode()) {
                case -559799608:
                    if (str8.equals(obj3)) {
                        c6 = 2;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1507809730:
                    break;
                case 1507809854:
                    if (str8.equals(obj)) {
                        c6 = 1;
                        break;
                    }
                    c6 = 65535;
                    break;
                case 1622564786:
                    if (str8.equals(com.anythink.core.common.e.k.d)) {
                        c6 = 3;
                        break;
                    }
                    c6 = 65535;
                    break;
                default:
                    c6 = 65535;
                    break;
            }
            if (c6 != 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) textView10.getLayoutParams();
            layoutParams16.topMargin = h.a(getContext(), 8.0f);
            textView10.setLayoutParams(layoutParams16);
            return;
        }
        relativeLayout2 = relativeLayout;
        textView5 = textView4;
        if (!this.f.G()) {
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void b() {
        com.anythink.basead.a.b.a(8, this.f, i());
        com.anythink.basead.e.a aVar = this.a;
        if (aVar != null) {
            aVar.onAdShow();
        }
    }
}