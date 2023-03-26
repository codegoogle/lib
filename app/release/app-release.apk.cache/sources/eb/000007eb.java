package com.anythink.expressad.foundation.f.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.anythink.core.common.b.m;
import com.anythink.expressad.d.a;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.FeedbackRadioGroup;
import com.anythink.expressad.widget.a.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class a {
    private static int n = -1;
    private static String s;
    private String a;
    private c b;
    private FeedBackButton c;
    private int d;
    private int e;
    private String j;
    private String k;
    private com.anythink.expressad.widget.a.c p;
    private List<C0062a> q;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private float l = 1.0f;
    private int m = s.b(m.a().e(), 20.0f);
    private int o = n;
    private b r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.1
        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            a.a(a.this);
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            a.b(a.this);
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
            a.c(a.this);
        }
    };

    public a(String str) {
        this.q = new ArrayList();
        this.a = str;
        if (this.q == null) {
            this.q = new ArrayList();
        }
        f();
        m();
        g();
    }

    private void f() {
        if (this.r == null) {
            this.r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.2
                @Override // com.anythink.expressad.widget.a.b
                public final void a() {
                    a.a(a.this);
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void b() {
                    a.b(a.this);
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void c() {
                    a.c(a.this);
                }
            };
        }
    }

    private void g() {
        try {
            com.anythink.expressad.foundation.f.b.a();
            if (com.anythink.expressad.foundation.f.b.a(m.a().e()) != null) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.foundation.b.a.b().e();
                com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
                if (b == null) {
                    com.anythink.expressad.d.b.a();
                    b = com.anythink.expressad.d.b.c();
                }
                a.b M = b.M();
                if (M == null) {
                    n.b("", "feedback fbk is null");
                    return;
                }
                f();
                com.anythink.expressad.foundation.f.b.a();
                this.p = new com.anythink.expressad.widget.a.c(com.anythink.expressad.foundation.f.b.a(m.a().e()), this.r);
                FeedbackRadioGroup a = a(M);
                this.p.c(M.c());
                this.p.b(M.b());
                this.p.a(M.a());
                this.p.a(a);
                this.p.a(!TextUtils.isEmpty(s));
                a(a, M);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void h() {
        List<C0062a> list = this.q;
        if (list != null) {
            for (C0062a c0062a : list) {
                if (c0062a != null) {
                    c0062a.b();
                }
            }
        }
        s = "";
    }

    private void i() {
        List<C0062a> list = this.q;
        if (list != null) {
            for (C0062a c0062a : list) {
                if (c0062a != null) {
                    c0062a.a();
                }
            }
        }
        s = "";
    }

    private void j() {
        List<C0062a> list = this.q;
        if (list != null) {
            Iterator<C0062a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private String k() {
        return this.a;
    }

    private void l() {
        FeedBackButton feedBackButton = this.c;
        if (feedBackButton != null) {
            int i = this.f;
            if (i >= 0) {
                feedBackButton.setX(i);
            }
            int i2 = this.g;
            if (i2 >= 0) {
                this.c.setY(i2);
            }
            float f = this.l;
            if (f >= 0.0f) {
                this.c.setAlpha(f);
                this.c.setEnabled(this.l != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            int i3 = this.h;
            if (i3 > 0) {
                this.c.setWidth(i3);
                if (layoutParams != null) {
                    layoutParams.width = this.h;
                }
            }
            int i4 = this.i;
            if (i4 > 0) {
                this.c.setHeight(i4);
                if (layoutParams != null) {
                    layoutParams.height = this.i;
                }
            }
            if (layoutParams != null) {
                this.c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.j)) {
                    this.c.setTextColor(Color.parseColor(this.j));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i5 = this.m;
            if (i5 > 0) {
                gradientDrawable.setCornerRadius(i5);
            }
            if (!TextUtils.isEmpty(this.k)) {
                gradientDrawable.setColor(Color.parseColor(this.k));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            try {
                this.c.setBackgroundDrawable(gradientDrawable);
            } catch (Throwable unused) {
            }
        }
    }

    private void m() {
        Context e = m.a().e();
        if (e != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(e);
                this.c = feedBackButton;
                int i = 8;
                if (this.o != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.c.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.a();
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private c n() {
        return this.b;
    }

    private int o() {
        return this.d;
    }

    private int p() {
        return this.e;
    }

    public final void b() {
        com.anythink.expressad.widget.a.c cVar = this.p;
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        this.p.cancel();
    }

    public final FeedBackButton c() {
        if (this.c == null) {
            m();
        }
        return this.c;
    }

    public final void a() {
        com.anythink.expressad.foundation.f.b.a();
        Activity a = com.anythink.expressad.foundation.f.b.a(m.a().e());
        com.anythink.expressad.widget.a.c cVar = this.p;
        if (cVar == null || cVar.getContext() != a) {
            g();
        }
        Context e = m.a().e();
        FeedBackButton feedBackButton = this.c;
        if (feedBackButton != null) {
            e = feedBackButton.getContext();
        }
        com.anythink.expressad.foundation.f.b.a();
        boolean a2 = com.anythink.expressad.foundation.f.b.a(e, this.p);
        List<C0062a> list = this.q;
        if (list != null) {
            for (C0062a c0062a : list) {
                if (c0062a != null) {
                    c0062a.a(a2);
                }
            }
        }
    }

    public final void d() {
        FeedBackButton feedBackButton = this.c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.c);
            }
        }
        com.anythink.expressad.widget.a.c cVar = this.p;
        if (cVar != null) {
            cVar.a();
        }
        this.p = null;
        this.q = null;
        this.c = null;
        this.r = null;
    }

    /* renamed from: com.anythink.expressad.foundation.f.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0062a implements b {
        private com.anythink.expressad.foundation.f.a a;
        private String b;

        public C0062a(String str, com.anythink.expressad.foundation.f.a aVar) {
            this.a = aVar;
            this.b = str;
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            com.anythink.expressad.foundation.f.b.c = false;
            com.anythink.expressad.foundation.f.a aVar = this.a;
            if (aVar != null) {
                String unused = a.s;
                aVar.c();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            com.anythink.expressad.foundation.f.b.c = false;
            com.anythink.expressad.foundation.f.a aVar = this.a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
        }

        public final void a(boolean z) {
            com.anythink.expressad.foundation.f.b.c = true;
            com.anythink.expressad.foundation.f.a aVar = this.a;
            if (aVar == null || !z) {
                return;
            }
            aVar.a();
        }
    }

    private void b(C0062a c0062a) {
        List<C0062a> list = this.q;
        if (list != null) {
            list.remove(c0062a);
        }
    }

    public final void c(int i) {
        this.e = i;
    }

    public static /* synthetic */ void c(a aVar) {
        List<C0062a> list = aVar.q;
        if (list != null) {
            Iterator<C0062a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void b(int i) {
        this.d = i;
    }

    public static /* synthetic */ void b(a aVar) {
        List<C0062a> list = aVar.q;
        if (list != null) {
            for (C0062a c0062a : list) {
                if (c0062a != null) {
                    c0062a.b();
                }
            }
        }
        s = "";
    }

    public final void a(int i) {
        this.o = i;
        FeedBackButton feedBackButton = this.c;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(FeedbackRadioGroup feedbackRadioGroup, a.b bVar) {
        ColorStateList colorStateList;
        int i;
        JSONArray d = bVar.d();
        Context e = m.a().e();
        if (d == null || d.length() <= 0 || e == null) {
            return;
        }
        int a = h.a(e, "anythink_cm_feedback_choice_btn_bg", h.c);
        Resources a2 = h.a(e);
        int a3 = h.a(e, "anythink_cm_feedback_rb_text_color_color_list", "color");
        if (a2 != null) {
            try {
                colorStateList = a2.getColorStateList(a3);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            int b = s.b(e, 14.0f);
            int b2 = s.b(e, 7.0f);
            int b3 = s.b(e, 6.0f);
            for (i = 0; i < d.length(); i++) {
                String optString = d.optString(i);
                RadioButton radioButton = new RadioButton(e);
                radioButton.setButtonDrawable((Drawable) null);
                radioButton.setBackgroundResource(a);
                radioButton.setText(optString);
                if (colorStateList != null) {
                    radioButton.setTextColor(colorStateList);
                }
                radioButton.setPadding(b, b2, b, b2);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
                int i2 = b3 / 4;
                layoutParams.setMargins(b3, i2, b3, i2);
                a(radioButton);
                feedbackRadioGroup.addView(radioButton, layoutParams);
            }
        }
        colorStateList = null;
        int b4 = s.b(e, 14.0f);
        int b22 = s.b(e, 7.0f);
        int b32 = s.b(e, 6.0f);
        while (i < d.length()) {
        }
    }

    private static FeedbackRadioGroup a(a.b bVar) {
        JSONArray d = bVar.d();
        Context e = m.a().e();
        if (d == null || d.length() <= 0 || e == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(e);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    private void a(RadioButton radioButton) {
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.anythink.expressad.foundation.f.a.a.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    String unused = a.s = (String) compoundButton.getText();
                }
                if (a.this.p != null) {
                    a.this.p.a(!TextUtils.isEmpty(a.s));
                }
            }
        });
    }

    public final void a(C0062a c0062a) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(c0062a);
    }

    private void a(boolean z) {
        List<C0062a> list = this.q;
        if (list != null) {
            for (C0062a c0062a : list) {
                if (c0062a != null) {
                    c0062a.a(z);
                }
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, float f, String str, String str2) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str;
        this.k = str2;
        this.l = f;
        this.m = i5;
        l();
    }

    public final void a(c cVar) {
        this.b = cVar;
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.c;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.l);
            feedBackButton.setEnabled(this.l != 0.0f);
            feedBackButton.setVisibility(this.o != 8 ? 0 : 8);
            this.c = feedBackButton;
            l();
            feedBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.a();
                }
            });
        }
    }

    public static /* synthetic */ void a(a aVar) {
        List<C0062a> list = aVar.q;
        if (list != null) {
            for (C0062a c0062a : list) {
                if (c0062a != null) {
                    c0062a.a();
                }
            }
        }
        s = "";
    }
}