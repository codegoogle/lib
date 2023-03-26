package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.r;
import com.anythink.expressad.out.j;

/* loaded from: classes2.dex */
public class ATAdChoice extends ATImageView {
    private static String a = "ATAdChoice";
    private String b;
    private String c;
    private String d;
    private Context e;

    /* renamed from: com.anythink.expressad.widget.ATAdChoice$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements c {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            ATAdChoice.this.setImageBitmap(bitmap);
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }
    }

    public ATAdChoice(Context context) {
        super(context);
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void b() {
        Context context = this.e;
        if (context != null) {
            b.a(context).a(this.b, new AnonymousClass1());
        }
    }

    private void c() {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        r.a(this.e, this.d, null);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (TextUtils.isEmpty(this.d)) {
            return true;
        }
        r.a(this.e, this.d, null);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (android.text.TextUtils.isEmpty(r4.J()) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCampaign(j jVar) {
        boolean z;
        Context context;
        if (jVar instanceof com.anythink.expressad.foundation.d.c) {
            com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) jVar;
            boolean z2 = true;
            if (cVar != null && cVar.t() != null) {
                String c = cVar.t().c();
                this.b = c;
                if (!TextUtils.isEmpty(c)) {
                    String b = cVar.t().b();
                    this.d = b;
                    if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(cVar.t().d())) {
                        z = true;
                        if (!z) {
                            com.anythink.expressad.d.b.a();
                            com.anythink.expressad.foundation.b.a.b().e();
                            com.anythink.expressad.d.a b2 = com.anythink.expressad.d.b.b();
                            if (b2 != null) {
                                String I = b2.I();
                                this.b = I;
                                if (!TextUtils.isEmpty(I)) {
                                    String K = b2.K();
                                    this.d = K;
                                    if (!TextUtils.isEmpty(K)) {
                                    }
                                }
                            }
                            z2 = false;
                            z = z2;
                        }
                        setImageUrl(this.b);
                        if (z || (context = this.e) == null) {
                        }
                        b.a(context).a(this.b, new AnonymousClass1());
                        return;
                    }
                }
            }
            z = false;
            if (!z) {
            }
            setImageUrl(this.b);
            if (z) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (android.text.TextUtils.isEmpty(r4.J()) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(com.anythink.expressad.foundation.d.c cVar) {
        boolean z;
        boolean z2 = true;
        if (cVar != null && cVar.t() != null) {
            String c = cVar.t().c();
            this.b = c;
            if (!TextUtils.isEmpty(c)) {
                String b = cVar.t().b();
                this.d = b;
                if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(cVar.t().d())) {
                    z = true;
                    if (!z) {
                        com.anythink.expressad.d.b.a();
                        com.anythink.expressad.foundation.b.a.b().e();
                        com.anythink.expressad.d.a b2 = com.anythink.expressad.d.b.b();
                        if (b2 != null) {
                            String I = b2.I();
                            this.b = I;
                            if (!TextUtils.isEmpty(I)) {
                                String K = b2.K();
                                this.d = K;
                                if (!TextUtils.isEmpty(K)) {
                                }
                            }
                        }
                        z2 = false;
                        z = z2;
                    }
                    setImageUrl(this.b);
                    return z;
                }
            }
        }
        z = false;
        if (!z) {
        }
        setImageUrl(this.b);
        return z;
    }

    public ATAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = context;
        a();
    }

    public ATAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = context;
        a();
    }
}