package com.anythink.expressad.video.dynview.endcard.cloudview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.anythink.expressad.video.dynview.endcard.cloudview.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class TagCloudView extends ViewGroup implements d.a, Runnable {
    public static final int MODE_DECELERATE = 1;
    public static final int MODE_DISABLE = 0;
    public static final int MODE_UNIFORM = 2;
    private static final float a = 0.8f;
    private float b;
    private com.anythink.expressad.video.dynview.endcard.cloudview.c c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float[] j;
    private float[] k;
    private boolean l;
    private ViewGroup.MarginLayoutParams m;
    public int mMode;
    private int n;
    private boolean o;
    private Handler p;
    private d q;
    private b r;
    private c s;
    private float t;
    private float u;

    /* renamed from: com.anythink.expressad.video.dynview.endcard.cloudview.TagCloudView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TagCloudView tagCloudView = TagCloudView.this;
            tagCloudView.f = (tagCloudView.getRight() - TagCloudView.this.getLeft()) / 2;
            TagCloudView tagCloudView2 = TagCloudView.this;
            tagCloudView2.g = (tagCloudView2.getBottom() - TagCloudView.this.getTop()) / 2;
            TagCloudView tagCloudView3 = TagCloudView.this;
            tagCloudView3.h = Math.min(TagCloudView.this.i * tagCloudView3.f, TagCloudView.this.i * TagCloudView.this.g);
            TagCloudView.this.c.b((int) TagCloudView.this.h);
            TagCloudView.this.c.a(TagCloudView.this.k);
            TagCloudView.this.c.b(TagCloudView.this.j);
            TagCloudView.this.c.a();
            TagCloudView.this.removeAllViews();
            for (int i = 0; i < TagCloudView.this.q.a(); i++) {
                com.anythink.expressad.video.dynview.endcard.cloudview.a aVar = new com.anythink.expressad.video.dynview.endcard.cloudview.a(TagCloudView.this.q.a(i));
                aVar.a(TagCloudView.this.q.a(TagCloudView.this.getContext(), i, TagCloudView.this));
                TagCloudView.this.c.a(aVar);
            }
            TagCloudView.this.c.a(TagCloudView.this.d, TagCloudView.this.e);
            TagCloudView.this.c.a(true);
            TagCloudView.this.c();
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.endcard.cloudview.TagCloudView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ int a;

        public AnonymousClass3(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b unused = TagCloudView.this.r;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    public TagCloudView(Context context) {
        super(context);
        this.b = 2.0f;
        this.d = 0.5f;
        this.e = 0.5f;
        this.i = 0.9f;
        this.j = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.k = new float[]{0.9412f, 0.7686f, 0.2f, 1.0f};
        this.o = false;
        this.p = new Handler(Looper.getMainLooper());
        this.q = new com.anythink.expressad.video.dynview.endcard.cloudview.b();
        a();
    }

    public int getAutoScrollMode() {
        return this.mMode;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p.post(this);
    }

    @Override // com.anythink.expressad.video.dynview.endcard.cloudview.d.a
    public void onChange() {
        postDelayed(new AnonymousClass1(), 0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.removeCallbacksAndMessages(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            com.anythink.expressad.video.dynview.endcard.cloudview.a a2 = this.c.a(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                a2.i();
                childAt.setScaleX(a2.d());
                childAt.setScaleY(a2.d());
                int g = ((int) (a2.g() + this.f)) - (childAt.getMeasuredWidth() / 2);
                int h = ((int) (a2.h() + this.g)) - (childAt.getMeasuredHeight() / 2);
                childAt.layout(g, h, childAt.getMeasuredWidth() + g, childAt.getMeasuredHeight() + h);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.m == null) {
            this.m = (ViewGroup.MarginLayoutParams) getLayoutParams();
        }
        if (mode != 1073741824) {
            int i3 = this.n;
            ViewGroup.MarginLayoutParams marginLayoutParams = this.m;
            size = (i3 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        if (mode2 != 1073741824) {
            int i4 = this.n;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = this.m;
            size2 = (i4 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
        }
        setMeasuredDimension(size, size2);
        measureChildren(0, 0);
    }

    public void reset() {
        this.c.c();
        c();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        if (!this.o && (i = this.mMode) != 0) {
            if (i == 1) {
                float f = this.d;
                if (f > 0.04f) {
                    this.d = f - 0.02f;
                }
                float f2 = this.e;
                if (f2 > 0.04f) {
                    this.e = f2 - 0.02f;
                }
                float f3 = this.d;
                if (f3 < -0.04f) {
                    this.d = f3 + 0.02f;
                }
                float f4 = this.e;
                if (f4 < -0.04f) {
                    this.e = f4 + 0.02f;
                }
            }
            d();
        }
        this.p.postDelayed(this, 16L);
    }

    public final void setAdapter(d dVar) {
        this.q = dVar;
        dVar.a(this);
        onChange();
    }

    public void setAutoScrollMode(int i) {
        this.mMode = i;
    }

    public void setDarkColor(int i) {
        this.j = (float[]) new float[]{(Color.red(i) / 1.0f) / 255.0f, (Color.green(i) / 1.0f) / 255.0f, (Color.blue(i) / 1.0f) / 255.0f, (Color.alpha(i) / 1.0f) / 255.0f}.clone();
        onChange();
    }

    public void setLightColor(int i) {
        this.k = (float[]) new float[]{(Color.red(i) / 1.0f) / 255.0f, (Color.green(i) / 1.0f) / 255.0f, (Color.blue(i) / 1.0f) / 255.0f, (Color.alpha(i) / 1.0f) / 255.0f}.clone();
        onChange();
    }

    public void setManualScroll(boolean z) {
        this.l = z;
    }

    public void setOnTagClickListener(b bVar) {
        this.r = bVar;
    }

    public void setOnTagViewClickListener(c cVar) {
        this.s = cVar;
    }

    public void setRadiusPercent(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.i = f;
            onChange();
            return;
        }
        throw new IllegalArgumentException("percent value not in range 0 to 1");
    }

    public void setScrollSpeed(float f) {
        this.b = f;
    }

    private void d() {
        com.anythink.expressad.video.dynview.endcard.cloudview.c cVar = this.c;
        if (cVar != null) {
            cVar.a(this.d, this.e);
            this.c.d();
        }
        c();
    }

    private void a() {
        try {
            setFocusableInTouchMode(true);
            this.c = new com.anythink.expressad.video.dynview.endcard.cloudview.c();
            this.mMode = 2;
            setManualScroll(true);
            setLightColor(Color.parseColor("#b1c914"));
            setDarkColor(Color.parseColor("#206fa1"));
            setRadiusPercent(0.6f);
            setScrollSpeed(1.0f);
            Point point = new Point();
            ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int i = point.x;
            int i2 = point.y;
            if (i2 < i) {
                i = i2;
            }
            this.n = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b() {
        postDelayed(new AnonymousClass1(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        removeAllViews();
        for (com.anythink.expressad.video.dynview.endcard.cloudview.a aVar : this.c.b()) {
            addView(aVar.e());
        }
    }

    public TagCloudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 2.0f;
        this.d = 0.5f;
        this.e = 0.5f;
        this.i = 0.9f;
        this.j = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.k = new float[]{0.9412f, 0.7686f, 0.2f, 1.0f};
        this.o = false;
        this.p = new Handler(Looper.getMainLooper());
        this.q = new com.anythink.expressad.video.dynview.endcard.cloudview.b();
        a();
    }

    private void a(View view, final int i) {
        if (view.hasOnClickListeners() || this.r == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.dynview.endcard.cloudview.TagCloudView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b unused = TagCloudView.this.r;
            }
        });
    }

    private void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                }
            }
            this.o = false;
            return;
        }
        this.t = motionEvent.getX();
        this.u = motionEvent.getY();
        this.o = true;
        float x = motionEvent.getX() - this.t;
        float y = motionEvent.getY() - this.u;
        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if ((Math.abs(x) > scaledTouchSlop || Math.abs(y) > scaledTouchSlop) ? true : true) {
            float f = this.h;
            float f2 = this.b;
            this.d = (y / f) * f2 * a;
            this.e = ((-x) / f) * f2 * a;
            d();
            return;
        }
        if (this.s != null) {
        }
    }

    public TagCloudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 2.0f;
        this.d = 0.5f;
        this.e = 0.5f;
        this.i = 0.9f;
        this.j = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.k = new float[]{0.9412f, 0.7686f, 0.2f, 1.0f};
        this.o = false;
        this.p = new Handler(Looper.getMainLooper());
        this.q = new com.anythink.expressad.video.dynview.endcard.cloudview.b();
        a();
    }

    private boolean a(float f, float f2) {
        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        return Math.abs(f) > scaledTouchSlop || Math.abs(f2) > scaledTouchSlop;
    }
}