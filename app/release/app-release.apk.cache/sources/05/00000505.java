package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.o;
import com.anythink.core.common.j.r;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class PanelView extends RelativeLayout {
    public static final int TYPE_FULL_SCREEN_BANNER = 0;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_PORTRAIT = 1;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_LANDSCAPE = 2;
    public static final int TYPE_HALF_SCREEN_HORIZONTAL = 4;
    public static final int TYPE_HALF_SCREEN_VERTICAL = 3;
    private View a;
    private ImageView b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private Button f;
    private SpreadAnimLayout g;
    private AppRatingView h;
    private a i;
    private int j;
    private k k;
    private j l;
    private i m;
    private int n;
    private ViewGroup o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final View.OnClickListener w;

    /* renamed from: com.anythink.basead.ui.PanelView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements b.a {
        public final /* synthetic */ String a;

        public AnonymousClass1(String str) {
            this.a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.a)) {
                PanelView.this.b.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PanelView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements b.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ ViewGroup.LayoutParams b;

        public AnonymousClass2(String str, ViewGroup.LayoutParams layoutParams) {
            this.a = str;
            this.b = layoutParams;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.a)) {
                PanelView.this.c.setImageBitmap(bitmap);
                float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                ViewGroup.LayoutParams layoutParams = this.b;
                int i = layoutParams.height;
                layoutParams.width = (int) (i * width);
                layoutParams.height = i;
                PanelView.this.c.setLayoutParams(this.b);
                PanelView.this.c.setScaleType(ImageView.ScaleType.FIT_XY);
                PanelView.this.c.setImageBitmap(bitmap);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public PanelView(Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 0;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PanelView.this.k != null) {
                    if (PanelView.this.k.u() == 1) {
                        if (view != PanelView.this.f || PanelView.this.i == null) {
                            return;
                        }
                        PanelView.this.i.a();
                    } else if (PanelView.this.i != null) {
                        PanelView.this.i.a();
                    }
                }
            }
        };
    }

    private void f() {
        this.b.setOnClickListener(this.w);
        this.d.setOnClickListener(this.w);
        this.e.setOnClickListener(this.w);
        this.f.setOnClickListener(this.w);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setOnClickListener(this.w);
        }
        if (this.n == 4) {
            View k0 = wo1.k0(this, "myoffer_panel_view_blank", "id", this.a);
            if (k0 != null) {
                k0.setOnClickListener(this.w);
                return;
            }
            return;
        }
        this.a.setOnClickListener(this.w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.n == 0) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            super.dispatchDraw(canvas);
            r.a(canvas, getWidth(), getHeight(), h.a(getContext(), 7.0f));
            canvas.restoreToCount(saveLayer);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public View getCTAButton() {
        return this.f;
    }

    public void init(i iVar, j jVar, int i, a aVar) {
        this.i = aVar;
        this.j = i;
        this.m = iVar;
        this.l = jVar;
        this.k = jVar.m;
        this.t = iVar.G();
        this.u = this.k.m() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setForceShowDetailInfoIfExist(boolean z) {
        this.v = z;
    }

    public void setLayoutType(int i) {
        RelativeLayout relativeLayout;
        SpreadAnimLayout spreadAnimLayout;
        this.n = i;
        if (i == 1) {
            this.a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_horizontal", "layout"), (ViewGroup) this, true);
        } else if (i == 2) {
            this.a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_vertical", "layout"), (ViewGroup) this, true);
        } else if (i == 3) {
            this.a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_vertical", "layout"), (ViewGroup) this, true);
        } else if (i != 4) {
            this.a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_bottom_banner", "layout"), (ViewGroup) this, true);
        } else if (!this.t && this.j != 1) {
            this.a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal_no_detail_info", "layout"), (ViewGroup) this, true);
        } else {
            this.a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
        }
        this.b = (ImageView) wo1.k0(this, "myoffer_iv_banner_icon", "id", this.a);
        this.d = (TextView) wo1.k0(this, "myoffer_tv_banner_title", "id", this.a);
        this.e = (TextView) wo1.k0(this, "myoffer_tv_banner_desc", "id", this.a);
        this.f = (Button) wo1.k0(this, "myoffer_btn_banner_cta", "id", this.a);
        this.g = (SpreadAnimLayout) wo1.k0(this, "myoffer_spread_layout", "id", this.a);
        this.c = (ImageView) wo1.k0(this, "myoffer_iv_logo", "id", this.a);
        this.o = (ViewGroup) wo1.k0(this, "myoffer_panel_container", "id", this.a);
        this.p = (TextView) wo1.k0(this, "myoffer_panel_version_name", "id", this.a);
        this.q = (TextView) wo1.k0(this, "myoffer_panel_publisher_name", "id", this.a);
        this.r = (TextView) wo1.k0(this, "myoffer_panel_permission_manage", "id", this.a);
        this.s = (TextView) wo1.k0(this, "myoffer_panel_privacy_agreement", "id", this.a);
        int i2 = this.n;
        if (i2 == 1 || i2 == 2) {
            this.h = (AppRatingView) wo1.k0(this, "myoffer_endcard_rating", "id", this.a);
        }
        i iVar = this.m;
        String o = iVar.o();
        if (!TextUtils.isEmpty(o)) {
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            b.a(getContext()).a(new e(1, o), layoutParams.width, layoutParams.height, new AnonymousClass1(o));
        }
        if (this.c != null) {
            String q = iVar.q();
            if (!TextUtils.isEmpty(q)) {
                ViewGroup.LayoutParams layoutParams2 = this.c.getLayoutParams();
                b.a(getContext()).a(new e(1, q), layoutParams2.width, layoutParams2.height, new AnonymousClass2(q, layoutParams2));
            }
        }
        if (TextUtils.isEmpty(iVar.o())) {
            this.b.setVisibility(8);
        }
        if (!TextUtils.isEmpty(iVar.n())) {
            this.e.setText(iVar.n());
        } else {
            if (this.n == 0) {
                this.d.setTextSize(2, 17.0f);
                this.d.setTypeface(Typeface.defaultFromStyle(1));
            }
            this.e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(iVar.m())) {
            this.d.setText(iVar.m());
        } else {
            this.d.setVisibility(8);
            if (this.n == 1 && (relativeLayout = (RelativeLayout) wo1.k0(this, "myoffer_title_container", "id", this.a)) != null) {
                relativeLayout.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(iVar.r())) {
            this.f.setText(iVar.r());
        } else {
            this.f.setText(com.anythink.basead.a.e.a(getContext(), this.m));
        }
        b(iVar);
        int i3 = this.n;
        if ((i3 == 1 || i3 == 2) && this.h != null) {
            int A = iVar.A();
            if (A > 5) {
                this.h.setVisibility(0);
                this.h.setStarSizeInDp(13);
                this.h.setStarNum(5);
                this.h.setRating(5);
            } else if (A > 0) {
                this.h.setVisibility(0);
                this.h.setStarSizeInDp(13);
                this.h.setStarNum(5);
                this.h.setRating(A);
            } else {
                this.h.setVisibility(8);
            }
        }
        this.b.setOnClickListener(this.w);
        this.d.setOnClickListener(this.w);
        this.e.setOnClickListener(this.w);
        this.f.setOnClickListener(this.w);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setOnClickListener(this.w);
        }
        if (this.n == 4) {
            View k0 = wo1.k0(this, "myoffer_panel_view_blank", "id", this.a);
            if (k0 != null) {
                k0.setOnClickListener(this.w);
            }
        } else {
            this.a.setOnClickListener(this.w);
        }
        if (this.n != 0) {
            ImageView imageView2 = this.b;
            if (imageView2 instanceof RoundImageView) {
                ((RoundImageView) imageView2).setNeedRadiu(true);
                this.b.invalidate();
            }
            int i4 = this.n;
            if ((i4 == 1 || i4 == 2) && (spreadAnimLayout = this.g) != null) {
                spreadAnimLayout.setMaxSpreadDistance(getResources().getDimensionPixelSize(h.a(getContext(), "myoffer_spread_max_distance_large", "dimen")));
            }
        }
    }

    public void updateForceShowDetailInfoIfExist(boolean z) {
        setForceShowDetailInfoIfExist(z);
        b(this.m);
    }

    private boolean a() {
        return this.t && (this.v || !this.u);
    }

    private void b(final i iVar) {
        if (a()) {
            this.p.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", "string"), iVar.C()));
            this.q.setText(iVar.B());
            int i = this.n;
            if (i == 1 || i == 2 || i == 3) {
                this.s.setText(o.a(getResources().getString(h.a(getContext(), "myoffer_panel_privacy", "string")), getResources().getString(h.a(getContext(), "myoffer_panel_permission", "string"))));
            }
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.anythink.core.common.j.k.b(m.a().e(), iVar.D());
                }
            });
            this.r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.anythink.core.common.j.k.b(m.a().e(), iVar.E());
                }
            });
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            if (this.n == 0) {
                this.e.setVisibility(8);
            }
            ViewGroup viewGroup = this.o;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TextView textView = this.p;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.q;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.s;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.r;
            if (textView4 != null) {
                textView4.setVisibility(0);
                return;
            }
            return;
        }
        if (this.n == 0) {
            this.e.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.o;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        TextView textView5 = this.p;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        TextView textView6 = this.q;
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        TextView textView7 = this.s;
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
        TextView textView8 = this.r;
        if (textView8 != null) {
            textView8.setVisibility(8);
        }
    }

    private void c() {
        SpreadAnimLayout spreadAnimLayout;
        if (this.n != 0) {
            ImageView imageView = this.b;
            if (imageView instanceof RoundImageView) {
                ((RoundImageView) imageView).setNeedRadiu(true);
                this.b.invalidate();
            }
            int i = this.n;
            if ((i == 1 || i == 2) && (spreadAnimLayout = this.g) != null) {
                spreadAnimLayout.setMaxSpreadDistance(getResources().getDimensionPixelSize(h.a(getContext(), "myoffer_spread_max_distance_large", "dimen")));
            }
        }
    }

    private void d() {
        this.b = (ImageView) wo1.k0(this, "myoffer_iv_banner_icon", "id", this.a);
        this.d = (TextView) wo1.k0(this, "myoffer_tv_banner_title", "id", this.a);
        this.e = (TextView) wo1.k0(this, "myoffer_tv_banner_desc", "id", this.a);
        this.f = (Button) wo1.k0(this, "myoffer_btn_banner_cta", "id", this.a);
        this.g = (SpreadAnimLayout) wo1.k0(this, "myoffer_spread_layout", "id", this.a);
        this.c = (ImageView) wo1.k0(this, "myoffer_iv_logo", "id", this.a);
        this.o = (ViewGroup) wo1.k0(this, "myoffer_panel_container", "id", this.a);
        this.p = (TextView) wo1.k0(this, "myoffer_panel_version_name", "id", this.a);
        this.q = (TextView) wo1.k0(this, "myoffer_panel_publisher_name", "id", this.a);
        this.r = (TextView) wo1.k0(this, "myoffer_panel_permission_manage", "id", this.a);
        this.s = (TextView) wo1.k0(this, "myoffer_panel_privacy_agreement", "id", this.a);
        int i = this.n;
        if (i == 1 || i == 2) {
            this.h = (AppRatingView) wo1.k0(this, "myoffer_endcard_rating", "id", this.a);
        }
    }

    private void e() {
        int i = this.n;
        if (i == 1 || i == 2) {
            this.h = (AppRatingView) wo1.k0(this, "myoffer_endcard_rating", "id", this.a);
        }
    }

    private void a(i iVar) {
        RelativeLayout relativeLayout;
        String o = iVar.o();
        if (!TextUtils.isEmpty(o)) {
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            b.a(getContext()).a(new e(1, o), layoutParams.width, layoutParams.height, new AnonymousClass1(o));
        }
        if (this.c != null) {
            String q = iVar.q();
            if (!TextUtils.isEmpty(q)) {
                ViewGroup.LayoutParams layoutParams2 = this.c.getLayoutParams();
                b.a(getContext()).a(new e(1, q), layoutParams2.width, layoutParams2.height, new AnonymousClass2(q, layoutParams2));
            }
        }
        if (TextUtils.isEmpty(iVar.o())) {
            this.b.setVisibility(8);
        }
        if (!TextUtils.isEmpty(iVar.n())) {
            this.e.setText(iVar.n());
        } else {
            if (this.n == 0) {
                this.d.setTextSize(2, 17.0f);
                this.d.setTypeface(Typeface.defaultFromStyle(1));
            }
            this.e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(iVar.m())) {
            this.d.setText(iVar.m());
        } else {
            this.d.setVisibility(8);
            if (this.n == 1 && (relativeLayout = (RelativeLayout) wo1.k0(this, "myoffer_title_container", "id", this.a)) != null) {
                relativeLayout.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(iVar.r())) {
            this.f.setText(iVar.r());
        } else {
            this.f.setText(com.anythink.basead.a.e.a(getContext(), this.m));
        }
        b(iVar);
        int i = this.n;
        if ((i == 1 || i == 2) && this.h != null) {
            int A = iVar.A();
            if (A > 5) {
                this.h.setVisibility(0);
                this.h.setStarSizeInDp(13);
                this.h.setStarNum(5);
                this.h.setRating(5);
            } else if (A > 0) {
                this.h.setVisibility(0);
                this.h.setStarSizeInDp(13);
                this.h.setStarNum(5);
                this.h.setRating(A);
            } else {
                this.h.setVisibility(8);
            }
        }
    }

    private void c(i iVar) {
        int i = this.n;
        if ((i == 1 || i == 2) && this.h != null) {
            int A = iVar.A();
            if (A > 5) {
                this.h.setVisibility(0);
                this.h.setStarSizeInDp(13);
                this.h.setStarNum(5);
                this.h.setRating(5);
            } else if (A > 0) {
                this.h.setVisibility(0);
                this.h.setStarSizeInDp(13);
                this.h.setStarNum(5);
                this.h.setRating(A);
            } else {
                this.h.setVisibility(8);
            }
        }
    }

    private void b() {
        RelativeLayout relativeLayout;
        SpreadAnimLayout spreadAnimLayout;
        this.b = (ImageView) wo1.k0(this, "myoffer_iv_banner_icon", "id", this.a);
        this.d = (TextView) wo1.k0(this, "myoffer_tv_banner_title", "id", this.a);
        this.e = (TextView) wo1.k0(this, "myoffer_tv_banner_desc", "id", this.a);
        this.f = (Button) wo1.k0(this, "myoffer_btn_banner_cta", "id", this.a);
        this.g = (SpreadAnimLayout) wo1.k0(this, "myoffer_spread_layout", "id", this.a);
        this.c = (ImageView) wo1.k0(this, "myoffer_iv_logo", "id", this.a);
        this.o = (ViewGroup) wo1.k0(this, "myoffer_panel_container", "id", this.a);
        this.p = (TextView) wo1.k0(this, "myoffer_panel_version_name", "id", this.a);
        this.q = (TextView) wo1.k0(this, "myoffer_panel_publisher_name", "id", this.a);
        this.r = (TextView) wo1.k0(this, "myoffer_panel_permission_manage", "id", this.a);
        this.s = (TextView) wo1.k0(this, "myoffer_panel_privacy_agreement", "id", this.a);
        int i = this.n;
        if (i == 1 || i == 2) {
            this.h = (AppRatingView) wo1.k0(this, "myoffer_endcard_rating", "id", this.a);
        }
        i iVar = this.m;
        String o = iVar.o();
        if (!TextUtils.isEmpty(o)) {
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            b.a(getContext()).a(new e(1, o), layoutParams.width, layoutParams.height, new AnonymousClass1(o));
        }
        if (this.c != null) {
            String q = iVar.q();
            if (!TextUtils.isEmpty(q)) {
                ViewGroup.LayoutParams layoutParams2 = this.c.getLayoutParams();
                b.a(getContext()).a(new e(1, q), layoutParams2.width, layoutParams2.height, new AnonymousClass2(q, layoutParams2));
            }
        }
        if (TextUtils.isEmpty(iVar.o())) {
            this.b.setVisibility(8);
        }
        if (!TextUtils.isEmpty(iVar.n())) {
            this.e.setText(iVar.n());
        } else {
            if (this.n == 0) {
                this.d.setTextSize(2, 17.0f);
                this.d.setTypeface(Typeface.defaultFromStyle(1));
            }
            this.e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(iVar.m())) {
            this.d.setText(iVar.m());
        } else {
            this.d.setVisibility(8);
            if (this.n == 1 && (relativeLayout = (RelativeLayout) wo1.k0(this, "myoffer_title_container", "id", this.a)) != null) {
                relativeLayout.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(iVar.r())) {
            this.f.setText(iVar.r());
        } else {
            this.f.setText(com.anythink.basead.a.e.a(getContext(), this.m));
        }
        b(iVar);
        int i2 = this.n;
        if ((i2 == 1 || i2 == 2) && this.h != null) {
            int A = iVar.A();
            if (A > 5) {
                this.h.setVisibility(0);
                this.h.setStarSizeInDp(13);
                this.h.setStarNum(5);
                this.h.setRating(5);
            } else if (A > 0) {
                this.h.setVisibility(0);
                this.h.setStarSizeInDp(13);
                this.h.setStarNum(5);
                this.h.setRating(A);
            } else {
                this.h.setVisibility(8);
            }
        }
        this.b.setOnClickListener(this.w);
        this.d.setOnClickListener(this.w);
        this.e.setOnClickListener(this.w);
        this.f.setOnClickListener(this.w);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setOnClickListener(this.w);
        }
        if (this.n == 4) {
            View k0 = wo1.k0(this, "myoffer_panel_view_blank", "id", this.a);
            if (k0 != null) {
                k0.setOnClickListener(this.w);
            }
        } else {
            this.a.setOnClickListener(this.w);
        }
        if (this.n != 0) {
            ImageView imageView2 = this.b;
            if (imageView2 instanceof RoundImageView) {
                ((RoundImageView) imageView2).setNeedRadiu(true);
                this.b.invalidate();
            }
            int i3 = this.n;
            if ((i3 == 1 || i3 == 2) && (spreadAnimLayout = this.g) != null) {
                spreadAnimLayout.setMaxSpreadDistance(getResources().getDimensionPixelSize(h.a(getContext(), "myoffer_spread_max_distance_large", "dimen")));
            }
        }
    }
}