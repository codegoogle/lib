package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.k;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.r;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;

/* loaded from: classes2.dex */
public class EndCardView extends RelativeLayout {
    private a a;
    private int b;
    private int c;
    private ImageView d;
    private RoundImageView e;
    private ImageView f;
    private TextView g;
    private i h;
    private k i;
    private final View.OnClickListener j;
    private boolean k;

    /* renamed from: com.anythink.basead.ui.EndCardView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements b.a {
        public final /* synthetic */ i a;

        public AnonymousClass2(i iVar) {
            this.a = iVar;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(str, this.a.p())) {
                EndCardView.this.d.setImageBitmap(bitmap);
                EndCardView.this.post(new Runnable() { // from class: com.anythink.basead.ui.EndCardView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int[] a = r.a(EndCardView.this.getWidth(), EndCardView.this.getHeight(), bitmap.getWidth() / bitmap.getHeight());
                        ViewGroup.LayoutParams layoutParams = EndCardView.this.d.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = a[0];
                            layoutParams.height = a[1];
                            EndCardView.this.d.setLayoutParams(layoutParams);
                        }
                        if (EndCardView.this.a != null) {
                            EndCardView.this.a.b();
                        }
                    }
                });
                EndCardView.this.e.setImageBitmap(com.anythink.core.common.j.b.a(EndCardView.this.getContext(), bitmap));
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.EndCardView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements b.a {
        public final /* synthetic */ String a;

        public AnonymousClass3(String str) {
            this.a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.a)) {
                EndCardView.this.f.setImageBitmap(bitmap);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    public EndCardView(Context context) {
        super(context);
        this.j = new View.OnClickListener() { // from class: com.anythink.basead.ui.EndCardView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (EndCardView.this.i != null) {
                    if (EndCardView.this.i.u() == 0) {
                        if (EndCardView.this.a != null) {
                            EndCardView.this.a.a();
                        }
                    } else if (EndCardView.this.g == null || !EndCardView.this.g.isShown() || view != EndCardView.this.g || EndCardView.this.a == null) {
                    } else {
                        EndCardView.this.a.a();
                    }
                }
            }
        };
        super.setWillNotDraw(false);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int height;
        try {
            if (this.k) {
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                super.draw(canvas);
                int width = getWidth();
                int height2 = getHeight();
                int width2 = getWidth();
                int i = width2 / 2;
                float height3 = getHeight();
                int i2 = (int) (3.0f * height3);
                RectF rectF = new RectF();
                rectF.left = i - i2;
                rectF.top = height - (i2 * 2);
                rectF.right = i + i2;
                rectF.bottom = height3;
                Paint paint = new Paint(1);
                paint.setColor(-1);
                paint.setStyle(Paint.Style.FILL);
                Bitmap createBitmap = Bitmap.createBitmap(width, height2, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawArc(rectF, 0.0f, 360.0f, true, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas.restoreToCount(saveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.draw(canvas);
    }

    public View getLearnMoreButton() {
        return this.g;
    }

    public void init(i iVar, k kVar, boolean z, boolean z2, a aVar) {
        setId(h.a(getContext(), "myoffer_end_card_id", "id"));
        this.a = aVar;
        this.h = iVar;
        this.i = kVar;
        RoundImageView roundImageView = new RoundImageView(getContext());
        this.e = roundImageView;
        roundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.d = new RoundImageView(getContext());
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.b, this.c);
        layoutParams2.addRule(13);
        addView(this.e, layoutParams);
        addView(this.d, layoutParams2);
        if (z) {
            this.f = new RoundImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(11);
            layoutParams3.addRule(12);
            addView(this.f, layoutParams3);
            String q = iVar.q();
            if (!TextUtils.isEmpty(q)) {
                ViewGroup.LayoutParams layoutParams4 = this.f.getLayoutParams();
                b.a(getContext()).a(new e(1, q), layoutParams4.width, layoutParams4.height, new AnonymousClass3(q));
            }
        }
        if (z2) {
            TextView textView = new TextView(getContext());
            this.g = textView;
            textView.setText(h.a(getContext(), "myoffer_cta_learn_more", "string"));
            this.g.setTextColor(Color.parseColor("#ffffffff"));
            this.g.setTextSize(18.0f);
            this.g.setGravity(17);
            this.g.setBackgroundResource(h.a(getContext(), "myoffer_bg_btn_cta_banner", com.anythink.expressad.foundation.h.h.c));
            this.g.setOnClickListener(this.j);
            int a2 = h.a(getContext(), 170.0f);
            int a3 = h.a(getContext(), 45.0f);
            SpreadAnimLayout spreadAnimLayout = new SpreadAnimLayout(getContext());
            spreadAnimLayout.setMaxSpreadDistance((int) getContext().getResources().getDimension(h.a(getContext(), "myoffer_spread_max_distance_large", "dimen")));
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(a2, a3);
            layoutParams5.gravity = 17;
            spreadAnimLayout.addView(this.g, layoutParams5);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams6.addRule(14);
            layoutParams6.addRule(12);
            layoutParams6.bottomMargin = h.a(getContext(), 23.0f);
            addView(spreadAnimLayout, layoutParams6);
        }
        setOnClickListener(this.j);
    }

    public void load() {
        i iVar = this.h;
        try {
            b.a(getContext()).a(new e(1, iVar.p()), this.b, this.c, new AnonymousClass2(iVar));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setNeedArc(boolean z) {
        this.k = z;
        invalidate();
    }

    public void setSize(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    private void a(i iVar) {
        try {
            b.a(getContext()).a(new e(1, iVar.p()), this.b, this.c, new AnonymousClass2(iVar));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    private void b(i iVar) {
        this.f = new RoundImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(this.f, layoutParams);
        String q = iVar.q();
        if (TextUtils.isEmpty(q)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f.getLayoutParams();
        b.a(getContext()).a(new e(1, q), layoutParams2.width, layoutParams2.height, new AnonymousClass3(q));
    }

    private void a() {
        TextView textView = new TextView(getContext());
        this.g = textView;
        textView.setText(h.a(getContext(), "myoffer_cta_learn_more", "string"));
        this.g.setTextColor(Color.parseColor("#ffffffff"));
        this.g.setTextSize(18.0f);
        this.g.setGravity(17);
        this.g.setBackgroundResource(h.a(getContext(), "myoffer_bg_btn_cta_banner", com.anythink.expressad.foundation.h.h.c));
        this.g.setOnClickListener(this.j);
        int a2 = h.a(getContext(), 170.0f);
        int a3 = h.a(getContext(), 45.0f);
        SpreadAnimLayout spreadAnimLayout = new SpreadAnimLayout(getContext());
        spreadAnimLayout.setMaxSpreadDistance((int) getContext().getResources().getDimension(h.a(getContext(), "myoffer_spread_max_distance_large", "dimen")));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a3);
        layoutParams.gravity = 17;
        spreadAnimLayout.addView(this.g, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = h.a(getContext(), 23.0f);
        addView(spreadAnimLayout, layoutParams2);
    }

    private static RectF a(int i, int i2) {
        int i3 = i / 2;
        float f = i2;
        int i4 = (int) (3.0f * f);
        RectF rectF = new RectF();
        rectF.left = i3 - i4;
        rectF.top = i2 - (i4 * 2);
        rectF.right = i3 + i4;
        rectF.bottom = f;
        return rectF;
    }
}