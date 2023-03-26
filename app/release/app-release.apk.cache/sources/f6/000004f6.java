package com.anythink.basead.ui;

import android.content.Context;
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
import com.anythink.core.common.e.k;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.r;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaAdView extends RelativeLayout {
    public static final String TAG = "anythink_" + MediaAdView.class.getSimpleName();
    public i a;
    public k b;
    public j c;
    public a d;
    public boolean e;
    public RelativeLayout f;
    public RelativeLayout g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    private TextView l;
    private TextView m;
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private RoundImageView r;
    private TextView s;

    /* loaded from: classes2.dex */
    public interface a {
        void onClickCloseView();
    }

    public MediaAdView(Context context) {
        super(context);
    }

    public List<View> getClickViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.l);
        arrayList.add(this.p);
        arrayList.add(this.m);
        arrayList.add(this.r);
        arrayList.add(this.s);
        k kVar = this.b;
        if (kVar != null && kVar.u() == 0) {
            arrayList.add(this.o);
            arrayList.add(this.f);
        }
        return arrayList;
    }

    public void init(int i, int i2) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_media_ad_view", "layout"), this);
        this.l = (TextView) findViewById(h.a(getContext(), "myoffer_banner_ad_title", "id"));
        this.m = (TextView) findViewById(h.a(getContext(), "myoffer_media_ad_cta", "id"));
        this.n = (ImageView) findViewById(h.a(getContext(), "myoffer_media_ad_close", "id"));
        this.o = (ImageView) findViewById(h.a(getContext(), "myoffer_media_ad_bg_blur", "id"));
        this.p = (ImageView) findViewById(h.a(getContext(), "myoffer_media_ad_main_image", "id"));
        this.q = (ImageView) findViewById(h.a(getContext(), "myoffer_media_ad_logo", "id"));
        this.r = (RoundImageView) findViewById(h.a(getContext(), "myoffer_media_ad_icon", "id"));
        this.s = (TextView) findViewById(h.a(getContext(), "myoffer_banner_ad_desc", "id"));
        this.f = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_media_ad_container", "id"));
        this.g = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_banner_container", "id"));
        this.h = (TextView) findViewById(h.a(getContext(), "myoffer_banner_publisher_name", "id"));
        this.i = (TextView) findViewById(h.a(getContext(), "myoffer_banner_privacy_agreement", "id"));
        this.j = (TextView) findViewById(h.a(getContext(), "myoffer_banner_permission_manage", "id"));
        this.k = (TextView) findViewById(h.a(getContext(), "myoffer_banner_version_name", "id"));
        String m = this.a.m();
        if (!TextUtils.isEmpty(m)) {
            this.l.setText(m);
        } else {
            this.l.setVisibility(4);
        }
        String r = this.a.r();
        if (!TextUtils.isEmpty(r)) {
            this.m.setText(r);
        } else {
            this.m.setText(h.a(getContext(), "myoffer_cta_learn_more", "string"));
        }
        this.p.setScaleType(ImageView.ScaleType.FIT_CENTER);
        b.a(getContext()).a(new e(1, this.a.p()), i, i2, new b.a() { // from class: com.anythink.basead.ui.MediaAdView.1
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
                String str3 = MediaAdView.TAG;
                "load: image load fail:".concat(String.valueOf(str2));
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(MediaAdView.this.a.p(), str)) {
                    MediaAdView.this.p.setImageBitmap(bitmap);
                    MediaAdView.this.post(new Runnable() { // from class: com.anythink.basead.ui.MediaAdView.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int[] a2 = r.a(MediaAdView.this.getWidth(), MediaAdView.this.getHeight(), bitmap.getWidth() / bitmap.getHeight());
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) MediaAdView.this.p.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.width = a2[0];
                                layoutParams.height = a2[1];
                                layoutParams.addRule(13);
                                MediaAdView.this.p.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    Bitmap a2 = com.anythink.core.common.j.b.a(MediaAdView.this.getContext(), bitmap);
                    MediaAdView.this.o.setScaleType(ImageView.ScaleType.FIT_XY);
                    MediaAdView.this.o.setImageBitmap(a2);
                }
            }
        });
        b.a(getContext()).a(new e(1, this.a.q()), new b.a() { // from class: com.anythink.basead.ui.MediaAdView.2
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (TextUtils.equals(MediaAdView.this.a.q(), str)) {
                    MediaAdView.this.q.setImageBitmap(bitmap);
                }
            }
        });
        if (this.e) {
            this.n.setVisibility(0);
        } else {
            this.n.setVisibility(8);
        }
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar = MediaAdView.this.d;
                if (aVar != null) {
                    aVar.onClickCloseView();
                }
            }
        });
        String n = this.a.n();
        if (!TextUtils.isEmpty(n)) {
            this.s.setText(n);
        } else {
            this.s.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.a.o())) {
            this.r.setRadiusInDip(6);
            this.r.setNeedRadiu(true);
            ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
            b.a(getContext()).a(new e(1, this.a.o()), layoutParams.width, layoutParams.height, new b.a() { // from class: com.anythink.basead.ui.MediaAdView.4
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(MediaAdView.this.a.o(), str)) {
                        MediaAdView.this.r.setImageBitmap(bitmap);
                    }
                }
            });
        } else {
            com.anythink.basead.ui.a.a.a(this.r, true, false);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = 0;
                this.l.setLayoutParams(layoutParams2);
            }
        }
        if (this.a.G()) {
            this.s.setVisibility(8);
            this.l.setTextSize(1, 15.0f);
            RelativeLayout relativeLayout = this.g;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                this.g.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            TextView textView = this.h;
            if (textView != null) {
                textView.setVisibility(0);
                this.h.setText(this.a.B());
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            TextView textView2 = this.i;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.i.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.anythink.core.common.j.k.b(m.a().e(), MediaAdView.this.a.D());
                    }
                });
            }
            TextView textView3 = this.j;
            if (textView3 != null) {
                textView3.setVisibility(0);
                this.j.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.anythink.core.common.j.k.b(m.a().e(), MediaAdView.this.a.E());
                    }
                });
            }
            TextView textView4 = this.k;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.k.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", "string"), this.a.C()));
                this.k.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    public MediaAdView(Context context, i iVar, j jVar, boolean z, a aVar) {
        super(context);
        this.a = iVar;
        this.b = jVar.m;
        this.e = z;
        this.d = aVar;
        this.c = jVar;
    }
}