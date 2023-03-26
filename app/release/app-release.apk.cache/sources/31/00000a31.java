package com.anythink.expressad.video.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.k;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.f.a;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.shake.MBShakeView;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.videocommon.view.StarLevelView;
import com.anythink.expressad.widget.FeedBackButton;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkNativeEndCardView extends AnythinkBaseView implements f {
    private static final String m = "anythink_reward_endcard_native_hor";
    private static final String n = "anythink_reward_endcard_native_land";
    private static final String o = "anythink_reward_endcard_native_half_portrait";
    private static final String p = "anythink_reward_endcard_native_half_landscape";
    private TextView A;
    private TextView B;
    private LinearLayout C;
    private FeedBackButton D;
    private Runnable E;
    private RelativeLayout F;
    private b G;
    private boolean H;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;
    private boolean M;
    private AlphaAnimation N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private View S;
    private TextView T;
    private boolean U;
    private String V;
    private d W;
    private MBShakeView aa;
    private com.anythink.expressad.shake.b ab;
    private int ac;
    private ViewGroup q;
    private ViewGroup r;
    private RelativeLayout s;
    private ImageView t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private ImageView y;
    private TextView z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            AnythinkNativeEndCardView.this.M = true;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            AnythinkNativeEndCardView.this.M = false;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            AnythinkNativeEndCardView.this.M = false;
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements Runnable {
        public AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 2);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$8  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass8 implements c {
        public AnonymousClass8() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (AnythinkNativeEndCardView.this.u != null) {
                    AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView.i_) {
                        anythinkNativeEndCardView.u.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.u.setImageBitmap(bitmap);
                }
                Bitmap blurBitmap = AnythinkNativeEndCardView.this.blurBitmap(bitmap);
                if (blurBitmap == null || blurBitmap.isRecycled() || AnythinkNativeEndCardView.this.t == null) {
                    return;
                }
                AnythinkNativeEndCardView anythinkNativeEndCardView2 = AnythinkNativeEndCardView.this;
                if (anythinkNativeEndCardView2.i_) {
                    anythinkNativeEndCardView2.t.setBackgroundDrawable(null);
                }
                AnythinkNativeEndCardView.this.t.setImageBitmap(blurBitmap);
            } catch (Throwable unused) {
                if (AnythinkNativeEndCardView.this.t != null) {
                    AnythinkNativeEndCardView.this.t.setVisibility(4);
                }
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$9  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ String a;

        public AnonymousClass9(String str) {
            this.a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k.b(AnythinkNativeEndCardView.this.a_, this.a);
        }
    }

    public AnythinkNativeEndCardView(Context context) {
        super(context);
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = false;
        this.L = false;
        this.M = false;
        this.ac = 1;
    }

    public static /* synthetic */ void n(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            anythinkNativeEndCardView.b_.j(anythinkNativeEndCardView.V);
            com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), anythinkNativeEndCardView.V, "_2"), new AnonymousClass3());
            com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), anythinkNativeEndCardView.V, "_2"), anythinkNativeEndCardView.b_);
            com.anythink.expressad.foundation.f.b a = com.anythink.expressad.foundation.f.b.a();
            a.c(anythinkNativeEndCardView.V + "_1");
            com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), anythinkNativeEndCardView.V, "_2"), anythinkNativeEndCardView.D);
            return;
        }
        FeedBackButton feedBackButton = anythinkNativeEndCardView.D;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.a_.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.S;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        d dVar;
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
        com.anythink.expressad.foundation.d.c cVar = this.b_;
        if (cVar == null || !cVar.j() || (dVar = this.W) == null || (arrayList = dVar.J) == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<com.anythink.expressad.foundation.d.c> it = this.W.J.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.foundation.d.c next = it.next();
            if (!TextUtils.isEmpty(next.bd())) {
                wo1.m0().c(next.bd());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r5.U != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (r5.U != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        r3 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(Context context) {
        int findLayout;
        boolean b;
        if (this.i_) {
            new com.anythink.expressad.video.dynview.i.c();
            Context context2 = getContext();
            com.anythink.expressad.video.dynview.c a = new c.a().a(j.b(context2) == 1 ? com.anythink.expressad.video.dynview.a.a.b : com.anythink.expressad.video.dynview.a.a.a).a(4).a(context2).b(j.b(context2)).a();
            com.anythink.expressad.video.dynview.b.a();
            com.anythink.expressad.video.dynview.b.a(a, new AnonymousClass7());
            return;
        }
        int i = this.ac;
        String str = p;
        String str2 = o;
        if (i == 0) {
            if (!this.U) {
                str2 = m;
            }
            if (isLandscape()) {
            }
            findLayout = findLayout(str2);
            if (findLayout <= 0) {
                if (isLandscape()) {
                    ViewGroup viewGroup = (ViewGroup) this.c_.inflate(findLayout, (ViewGroup) null);
                    this.r = viewGroup;
                    addView(viewGroup);
                    b = b(this.r);
                } else {
                    ViewGroup viewGroup2 = (ViewGroup) this.c_.inflate(findLayout, (ViewGroup) null);
                    this.q = viewGroup2;
                    addView(viewGroup2);
                    b = b(this.q);
                }
                this.f_ = b;
                e();
                return;
            }
            return;
        }
        if (i != 1) {
            str2 = "";
        } else if (!this.U) {
            str2 = m;
        }
        if (i == 2) {
        }
        findLayout = findLayout(str2);
        if (findLayout <= 0) {
        }
    }

    public void notifyShowListener() {
        this.e_.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E == null) {
            this.E = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView.this.I = true;
                    if (AnythinkNativeEndCardView.this.S != null) {
                        AnythinkNativeEndCardView.this.S.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.E;
        if (runnable != null) {
            postDelayed(runnable, this.J * 1000);
            if (!this.L) {
                this.L = true;
            }
            try {
                com.anythink.expressad.foundation.d.c cVar = this.b_;
                if (cVar != null) {
                    String G = cVar.G();
                    if (TextUtils.isEmpty(G)) {
                        G = this.b_.O();
                    }
                    String a = w.a(G, "alac");
                    if (TextUtils.isEmpty(a) || !a.equals("1")) {
                        return;
                    }
                    postDelayed(new AnonymousClass6(), 1000L);
                }
            } catch (Throwable th) {
                n.d(AnythinkBaseView.TAG, th.getMessage());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.E;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (this.ab != null) {
            com.anythink.expressad.shake.a.a().b(this.ab);
            this.ab = null;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        com.anythink.expressad.foundation.d.c cVar = this.b_;
        if (cVar == null || !cVar.j()) {
            this.F.setVisibility(4);
            this.d_ = configuration.orientation;
            n.d(AnythinkBaseView.TAG, " native onSelfConfigurationChanged:" + this.d_);
            if (this.d_ == 2) {
                removeView(this.q);
                a(this.r);
                return;
            }
            removeView(this.r);
            a(this.q);
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        this.G = bVar;
        try {
            if (this.b_ == null || !this.f_) {
                return;
            }
            com.anythink.expressad.foundation.g.d.b.a(this.a_.getApplicationContext()).a(this.b_.be(), new AnonymousClass8());
            com.anythink.expressad.foundation.g.d.b.a(this.a_.getApplicationContext()).a(this.b_.bd(), new com.anythink.expressad.video.module.a.a.j(this.v, s.b(m.a().e(), 8.0f)));
            this.z.setText(this.b_.bb());
            TextView textView = this.T;
            if (textView != null) {
                textView.setText(this.b_.cS);
            }
            TextView textView2 = this.A;
            if (textView2 != null) {
                textView2.setText(this.b_.bc());
            }
            TextView textView3 = this.B;
            if (textView3 != null) {
                textView3.setText(this.b_.aY() + ")");
            }
            this.C.removeAllViews();
            double aX = this.b_.aX();
            if (aX <= zg2.s) {
                aX = 5.0d;
            }
            LinearLayout linearLayout = this.C;
            if (linearLayout instanceof StarLevelView) {
                ((StarLevelView) linearLayout).initScore(aX);
            }
            LinearLayout linearLayout2 = this.C;
            if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
                ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(aX, this.b_.aY());
            }
            if (!TextUtils.isEmpty(this.b_.G()) && this.b_.G().contains("alecfc=1")) {
                this.H = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
                this.w.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("anythink_reward_flag_cn", h.c, com.anythink.expressad.foundation.b.a.b().a())));
            } else {
                this.w.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("anythink_reward_flag_en", h.c, com.anythink.expressad.foundation.b.a.b().a())));
            }
            com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
            if (b != null) {
                String K = b.K();
                if (TextUtils.isEmpty(K)) {
                    this.x.setVisibility(8);
                }
                this.x.setOnClickListener(new AnonymousClass9(K));
            } else {
                this.x.setVisibility(8);
            }
            if (!this.I) {
                this.S.setVisibility(8);
            }
            j();
        } catch (Throwable th) {
            n.a(AnythinkBaseView.TAG, th.getMessage());
        }
    }

    public void setCloseBtnDelay(int i) {
        this.J = i;
    }

    public void setMoreOfferCampaignUnit(d dVar) {
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
        MBShakeView mBShakeView;
        com.anythink.expressad.foundation.d.c cVar = this.b_;
        if (cVar == null || !cVar.j()) {
            return;
        }
        this.W = dVar;
        if (dVar == null || (arrayList = dVar.J) == null || arrayList.size() <= 5 || (mBShakeView = this.aa) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, s.b(getContext(), 5.0f));
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        n.d(AnythinkBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.O = i;
        this.P = i2;
        this.Q = i3;
        this.R = i4;
        h();
    }

    public void setOnPause() {
        this.L = false;
    }

    public void setOnResume() {
        this.L = true;
    }

    public void setUnitId(String str) {
        this.V = str;
    }

    private boolean b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.c_.inflate(i, (ViewGroup) null);
            this.r = viewGroup;
            addView(viewGroup);
            return b(this.r);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.c_.inflate(i, (ViewGroup) null);
        this.q = viewGroup2;
        addView(viewGroup2);
        return b(this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c();
        if (!this.f_) {
            this.e_.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.N = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void f() {
        com.anythink.expressad.foundation.g.d.b.a(this.a_.getApplicationContext()).a(this.b_.be(), new AnonymousClass8());
        com.anythink.expressad.foundation.g.d.b.a(this.a_.getApplicationContext()).a(this.b_.bd(), new com.anythink.expressad.video.module.a.a.j(this.v, s.b(m.a().e(), 8.0f)));
        this.z.setText(this.b_.bb());
        TextView textView = this.T;
        if (textView != null) {
            textView.setText(this.b_.cS);
        }
        TextView textView2 = this.A;
        if (textView2 != null) {
            textView2.setText(this.b_.bc());
        }
        TextView textView3 = this.B;
        if (textView3 != null) {
            textView3.setText(this.b_.aY() + ")");
        }
        this.C.removeAllViews();
        double aX = this.b_.aX();
        if (aX <= zg2.s) {
            aX = 5.0d;
        }
        LinearLayout linearLayout = this.C;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(aX);
        }
        LinearLayout linearLayout2 = this.C;
        if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
            ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(aX, this.b_.aY());
        }
        if (!TextUtils.isEmpty(this.b_.G()) && this.b_.G().contains("alecfc=1")) {
            this.H = true;
        }
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
            this.w.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("anythink_reward_flag_cn", h.c, com.anythink.expressad.foundation.b.a.b().a())));
        } else {
            this.w.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("anythink_reward_flag_en", h.c, com.anythink.expressad.foundation.b.a.b().a())));
        }
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
        if (b != null) {
            String K = b.K();
            if (TextUtils.isEmpty(K)) {
                this.x.setVisibility(8);
            }
            this.x.setOnClickListener(new AnonymousClass9(K));
        } else {
            this.x.setVisibility(8);
        }
        if (!this.I) {
            this.S.setVisibility(8);
        }
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r6.U != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
        if (r6.U != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
        r3 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int g() {
        int i = this.ac;
        String str = p;
        String str2 = o;
        if (i == 0) {
            if (!this.U) {
                str2 = m;
            }
            if (isLandscape()) {
            }
        } else {
            if (i != 1) {
                str2 = "";
            } else if (!this.U) {
                str2 = m;
            }
            if (i == 2) {
            }
        }
        return findLayout(str2);
    }

    private void h() {
        this.F.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.foundation.d.c cVar = AnythinkNativeEndCardView.this.b_;
                if (cVar != null && !cVar.j() && AnythinkNativeEndCardView.this.b_.f() != 2) {
                    AnythinkNativeEndCardView.this.F.setPadding(AnythinkNativeEndCardView.this.O, AnythinkNativeEndCardView.this.Q, AnythinkNativeEndCardView.this.P, AnythinkNativeEndCardView.this.R);
                    AnythinkNativeEndCardView.this.F.startAnimation(AnythinkNativeEndCardView.this.N);
                }
                AnythinkNativeEndCardView.this.F.setVisibility(0);
                if (AnythinkNativeEndCardView.this.S.getVisibility() != 0 && AnythinkNativeEndCardView.this.I) {
                    AnythinkNativeEndCardView.this.S.setVisibility(0);
                }
                AnythinkNativeEndCardView.n(AnythinkNativeEndCardView.this);
            }
        }, 200L);
    }

    private void i() {
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.b_.j(this.V);
            com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), this.V, "_2"), new AnonymousClass3());
            com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), this.V, "_2"), this.b_);
            com.anythink.expressad.foundation.f.b a = com.anythink.expressad.foundation.f.b.a();
            a.c(this.V + "_1");
            com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), this.V, "_2"), this.D);
            return;
        }
        FeedBackButton feedBackButton = this.D;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    private void j() {
        int parseInt;
        int parseInt2;
        try {
            com.anythink.expressad.foundation.d.c cVar = this.b_;
            if (cVar != null) {
                String G = cVar.G();
                if (TextUtils.isEmpty(G)) {
                    G = this.b_.O();
                }
                String a = w.a(G, "shake_show");
                String a2 = w.a(G, "shake_strength");
                String a3 = w.a(G, "shake_time");
                if (!TextUtils.isEmpty(a) && a.equals("1") && this.aa == null) {
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.aa = mBShakeView;
                    mBShakeView.initView(this.b_.cS, true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (!isLandscape()) {
                        layoutParams.addRule(2, findID("anythink_iv_logo"));
                        layoutParams.addRule(14);
                        this.aa.setPadding(0, 0, 0, s.b(getContext(), 20.0f));
                    } else {
                        layoutParams.addRule(13);
                    }
                    this.aa.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.s;
                    if (relativeLayout != null) {
                        relativeLayout.addView(this.aa);
                        this.T.setVisibility(4);
                        this.aa.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                            }
                        });
                        int i = 10;
                        if (!TextUtils.isEmpty(a2) && (parseInt2 = Integer.parseInt(a2)) > 0) {
                            i = parseInt2;
                        }
                        boolean isEmpty = TextUtils.isEmpty(a3);
                        int i2 = un3.f.v;
                        if (!isEmpty && (parseInt = Integer.parseInt(a3)) > 0) {
                            i2 = parseInt * 1000;
                        }
                        this.ab = new com.anythink.expressad.shake.b(i, i2) { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.5
                            @Override // com.anythink.expressad.shake.b
                            public final void a() {
                                if (!AnythinkNativeEndCardView.this.M && AnythinkNativeEndCardView.this.L) {
                                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 4);
                                }
                            }
                        };
                        com.anythink.expressad.shake.a.a().a(this.ab);
                    }
                }
            }
        } catch (Throwable th) {
            n.d(AnythinkBaseView.TAG, th.getMessage());
        }
    }

    private void k() {
        try {
            com.anythink.expressad.foundation.d.c cVar = this.b_;
            if (cVar != null) {
                String G = cVar.G();
                if (TextUtils.isEmpty(G)) {
                    G = this.b_.O();
                }
                String a = w.a(G, "alac");
                if (TextUtils.isEmpty(a) || !a.equals("1")) {
                    return;
                }
                postDelayed(new AnonymousClass6(), 1000L);
            }
        } catch (Throwable th) {
            n.d(AnythinkBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        if (this.f_) {
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkNativeEndCardView.this.H) {
                        AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 1);
                    }
                }
            });
            this.S.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkNativeEndCardView.this.e_.a(104, "");
                }
            });
            this.T.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.12
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
            this.v.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.13
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
            this.u.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.14
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements com.anythink.expressad.video.dynview.e.d {
        public AnonymousClass7() {
        }

        @Override // com.anythink.expressad.video.dynview.e.d
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            AnythinkNativeEndCardView.this.addView(aVar.a());
            AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
            anythinkNativeEndCardView.f_ = anythinkNativeEndCardView.b(aVar.a());
            AnythinkNativeEndCardView.this.e();
        }

        @Override // com.anythink.expressad.video.dynview.e.d
        public final void a(com.anythink.expressad.video.dynview.c.a aVar) {
            n.d(AnythinkBaseView.TAG, "errorMsg:" + aVar.b());
        }
    }

    private void a() {
        new com.anythink.expressad.video.dynview.i.c();
        Context context = getContext();
        com.anythink.expressad.video.dynview.c a = new c.a().a(j.b(context) == 1 ? com.anythink.expressad.video.dynview.a.a.b : com.anythink.expressad.video.dynview.a.a.a).a(4).a(context).b(j.b(context)).a();
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a, new AnonymousClass7());
    }

    private void c(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ce, a(i));
            } catch (JSONException e) {
                e = e;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
                this.e_.a(105, jSONObject);
            }
        } catch (JSONException e2) {
            e = e2;
        }
        this.e_.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = false;
        this.L = false;
        this.M = false;
        this.ac = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        try {
            this.s = (RelativeLayout) view.findViewById(findID("anythink_native_ec_layout"));
            this.u = (ImageView) view.findViewById(findID("anythink_iv_adbanner"));
            this.v = (ImageView) view.findViewById(findID("anythink_iv_icon"));
            this.w = (ImageView) view.findViewById(findID("anythink_iv_flag"));
            this.x = (ImageView) view.findViewById(findID("anythink_iv_link"));
            this.z = (TextView) view.findViewById(findID("anythink_tv_apptitle"));
            this.C = (LinearLayout) view.findViewById(findID("anythink_sv_starlevel"));
            this.S = view.findViewById(findID("anythink_iv_close"));
            this.T = (TextView) view.findViewById(findID("anythink_tv_cta"));
            this.D = (FeedBackButton) view.findViewById(findID("anythink_native_endcard_feed_btn"));
            this.F = (RelativeLayout) view.findViewById(findID("anythink_native_ec_controller"));
            this.t = (ImageView) view.findViewById(findID("anythink_iv_adbanner_bg"));
            if (this.i_) {
                ImageView imageView = this.u;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.v;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.t, this.u, this.v, this.z, this.C, this.S, this.T);
            }
            this.A = (TextView) view.findViewById(findID("anythink_tv_appdesc"));
            TextView textView = (TextView) view.findViewById(findID("anythink_tv_number"));
            this.B = textView;
            return isNotNULL(this.t, this.u, this.v, this.z, this.A, textView, this.C, this.S, this.T);
        } catch (Throwable th) {
            n.b(AnythinkBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private void a(View view) {
        if (view == null) {
            init(this.a_);
            preLoadData(this.G);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            b(view);
            c();
        }
        h();
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2) {
        super(context, attributeSet, z, i, z2, i2);
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = false;
        this.L = false;
        this.M = false;
        this.ac = 1;
    }

    public static /* synthetic */ void a(AnythinkNativeEndCardView anythinkNativeEndCardView, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ce, anythinkNativeEndCardView.a(i));
            } catch (JSONException e) {
                e = e;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
                anythinkNativeEndCardView.e_.a(105, jSONObject);
            }
        } catch (JSONException e2) {
            e = e2;
        }
        anythinkNativeEndCardView.e_.a(105, jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r6.U != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
        if (r6.U != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
        r3 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b() {
        boolean b;
        int i = this.ac;
        String str = p;
        String str2 = o;
        if (i == 0) {
            if (!this.U) {
                str2 = m;
            }
            if (isLandscape()) {
            }
        } else {
            if (i != 1) {
                str2 = "";
            } else if (!this.U) {
                str2 = m;
            }
            if (i == 2) {
            }
        }
        int findLayout = findLayout(str2);
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.c_.inflate(findLayout, (ViewGroup) null);
                this.r = viewGroup;
                addView(viewGroup);
                b = b(this.r);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.c_.inflate(findLayout, (ViewGroup) null);
                this.q = viewGroup2;
                addView(viewGroup2);
                b = b(this.q);
            }
            this.f_ = b;
            e();
        }
    }
}