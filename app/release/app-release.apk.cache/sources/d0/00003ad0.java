package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.greedygame.mystique.models.Alignment;
import com.greedygame.mystique.models.Operation;
import com.greedygame.mystique.models.Position;
import com.p7700g.p99005.g33;
import com.p7700g.p99005.ry2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bd3 extends g33 {
    @NotNull
    public static final a j = new a(null);
    private final float k;
    private float l;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Bitmap a(@NotNull View view) {
            c25.p(view, com.ironsource.sdk.controller.v.a);
            if (view.getMeasuredHeight() >= 0) {
                view.measure(-2, -2);
                Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.draw(canvas);
                return createBitmap;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            jz2.values();
            int[] iArr = new int[3];
            iArr[jz2.CENTER.ordinal()] = 1;
            iArr[jz2.LEFT.ordinal()] = 2;
            iArr[jz2.RIGHT.ordinal()] = 3;
            a = iArr;
            kz2.values();
            int[] iArr2 = new int[3];
            iArr2[kz2.TOP.ordinal()] = 1;
            iArr2[kz2.BOTTOM.ordinal()] = 2;
            iArr2[kz2.CENTER.ordinal()] = 3;
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd3(@NotNull g33.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
        this.k = dy2.a(70.0f, d(), 2.0f);
        this.l = dy2.a(10.0f, d(), 2.0f);
        if (e().l() == -1.0f) {
            return;
        }
        float a2 = dy2.a(e().l(), d(), 2.0f);
        this.l = a2;
        xz2.c("TxtLayr", c25.C("Min font size available: ", Float.valueOf(a2)));
    }

    private final void m(Canvas canvas, Bitmap bitmap) {
        int width;
        Alignment a2 = e().o().a();
        c25.m(a2);
        jz2 a3 = a2.a();
        Alignment a4 = e().o().a();
        c25.m(a4);
        kz2 b2 = a4.b();
        int i = a3 == null ? -1 : b.a[a3.ordinal()];
        int i2 = 0;
        if (i != 1) {
            width = (i == 2 || i != 3) ? 0 : canvas.getWidth() - j().getWidth();
        } else {
            width = (canvas.getWidth() - j().getWidth()) / 2;
        }
        int i3 = b2 != null ? b.b[b2.ordinal()] : -1;
        if (i3 != 1) {
            if (i3 == 2) {
                i2 = canvas.getHeight() - j().getHeight();
            } else if (i3 == 3) {
                i2 = (canvas.getHeight() - j().getHeight()) / 2;
            }
        }
        c25.m(bitmap);
        canvas.drawBitmap(bitmap, width, i2, (Paint) null);
    }

    private final void n(TextView textView, Alignment alignment) {
        jz2 a2 = alignment == null ? null : alignment.a();
        int i = a2 == null ? -1 : b.a[a2.ordinal()];
        if (i == 1) {
            textView.setGravity(1);
        } else if (i == 2) {
            textView.setGravity(nq.b);
        } else if (i == 3) {
            textView.setGravity(nq.c);
        }
        textView.getGravity();
        kz2 b2 = alignment != null ? alignment.b() : null;
        if (b2 == null) {
            return;
        }
        int i2 = b.b[b2.ordinal()];
    }

    private final Operation p() {
        for (Operation operation : i()) {
            if (c25.g(operation.l(), i33.a.d())) {
                return operation;
            }
        }
        return null;
    }

    private final Operation q() {
        for (Operation operation : i()) {
            if (c25.g(operation.l(), i33.a.e())) {
                return operation;
            }
        }
        return null;
    }

    private final Operation r() {
        for (Operation operation : i()) {
            if (c25.g(operation.l(), i33.a.i())) {
                return operation;
            }
        }
        return null;
    }

    private final Operation s() {
        for (Operation operation : i()) {
            if (c25.g(operation.l(), i33.a.b())) {
                return operation;
            }
        }
        return null;
    }

    private final Operation t() {
        for (Operation operation : i()) {
            if (c25.g(operation.l(), i33.a.g())) {
                return operation;
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.g33
    @Nullable
    public Bitmap c() {
        String l;
        xz2.c("TxtLayr", "Text layer started");
        ry2.a aVar = ry2.a;
        Position c = e().o().c();
        c25.m(c);
        Position c2 = e().o().c();
        c25.m(c2);
        Bitmap.Config config = h().getConfig();
        c25.o(config, "baseContainer.config");
        a(aVar.b((int) c.f(), (int) c2.a(), config));
        StringBuilder G = wo1.G("Max font size: ");
        G.append(this.k);
        G.append(" | Min font size: ");
        G.append(this.l);
        xz2.c("TxtLayr", G.toString());
        if (e().q()) {
            l = o();
        } else {
            l = l();
        }
        Typeface typeface = null;
        if (l == null || l.length() == 0) {
            xz2.c("TxtLayr", "[ERROR] Text not available for Text Layer");
            b("Text not available");
            e().u(true);
            return null;
        }
        Canvas canvas = new Canvas(j());
        int i = sr.t;
        Operation s = s();
        if ((s == null ? null : s.i()) != null && l33.a.a(s.i().toString())) {
            i = Color.parseColor(s.i().toString());
        }
        Operation r = r();
        if ((r == null ? null : r.j()) != null) {
            l33 l33Var = l33.a;
            String j2 = r.j();
            c25.m(j2);
            if (l33Var.a(j2)) {
                Color.parseColor(r.j());
                Float n = r.n();
                c25.m(n);
                n.floatValue();
            }
        }
        Operation p = p();
        if (p != null) {
            Uri b2 = g().b(String.valueOf(p.i()));
            String uri = b2.toString();
            c25.o(uri, "fontUri.toString()");
            if (uri.length() > 0) {
                String uri2 = b2.toString();
                c25.o(uri2, "fontUri.toString()");
                try {
                    typeface = Typeface.createFromFile(uri2);
                } catch (Exception e) {
                    b("Not able to create Typeface");
                    xz2.b("TxtLayr", "[ERROR] Not able to create TypeFace", e);
                    return null;
                }
            } else {
                xz2.c("TxtLayr", "[ERROR] Font not available");
                b("Font not available");
                e().u(true);
                return null;
            }
        }
        Operation t = t();
        if (t != null) {
            Float valueOf = Float.valueOf(String.valueOf(t.i()));
            c25.o(valueOf, "valueOf(opacityOperation.argument.toString())");
            valueOf.floatValue();
        }
        Operation q = q();
        int parseDouble = q != null ? (int) Double.parseDouble(String.valueOf(q.i())) : 1;
        TextView textView = new TextView(d());
        textView.setText(l);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(i);
        textView.setTypeface(typeface);
        textView.setAlpha(textView.getAlpha());
        textView.setWidth(j().getWidth());
        textView.setHeight(j().getHeight());
        textView.setMaxLines(parseDouble);
        n(textView, e().o().a());
        nt.r(textView, (int) this.l, (int) this.k, 1, 0);
        Bitmap a2 = j.a(textView);
        m(canvas, a2);
        c25.m(a2);
        aVar.g(a2);
        xz2.c("TxtLayr", "Text layer finished");
        return j();
    }

    @Nullable
    public final String l() {
        return f().b();
    }

    @Nullable
    public final String o() {
        return f().g();
    }
}