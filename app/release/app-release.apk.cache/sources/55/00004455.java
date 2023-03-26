package com.p7700g.p99005;

import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.greedygame.mystique2.models.EllipsizeAt;
import com.greedygame.mystique2.models.Style;
import com.greedygame.mystique2.models.StyleType;
import com.p7700g.p99005.hd3;
import com.p7700g.p99005.jz2;
import com.p7700g.p99005.kz2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gd3 extends hd3 {
    @NotNull
    public static final a m = new a(null);
    @NotNull
    private final hd3.a n;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
            iArr2[kz2.CENTER.ordinal()] = 1;
            iArr2[kz2.TOP.ordinal()] = 2;
            iArr2[kz2.BOTTOM.ordinal()] = 3;
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd3(@NotNull hd3.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
        this.n = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
        r0.setText(r9);
     */
    @Override // com.p7700g.p99005.hd3
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View o() {
        String use;
        String value;
        yq4 yq4Var;
        boolean z;
        int i;
        Float J0;
        Integer X0;
        String value2;
        Integer X02;
        String value3;
        Integer X03;
        String value4;
        TextUtils.TruncateAt truncateAt;
        String fallback;
        TextView textView = new TextView(c());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        String use2 = g().getUse();
        String str = "";
        if (use2 != null) {
            int hashCode = use2.hashCode();
            if (hashCode != -678107023) {
                if (hashCode != 116657000) {
                    if (hashCode == 915317088 && use2.equals("{title}")) {
                        use = h().g();
                    }
                } else if (use2.equals("{cta}")) {
                    use = h().b();
                }
            } else if (use2.equals("{desc}")) {
                use = h().c();
            }
            textView.setText(use);
            CharSequence text = textView.getText();
            c25.o(text, "textView.text");
            if (text.length() == 0) {
                String fallback2 = g().getFallback();
                if (fallback2 != null) {
                    int hashCode2 = fallback2.hashCode();
                    if (hashCode2 != -678107023) {
                        if (hashCode2 != 116657000) {
                            if (hashCode2 == 915317088 && fallback2.equals("{title}")) {
                                fallback = h().g();
                            }
                        } else if (fallback2.equals("{cta}")) {
                            fallback = h().b();
                        }
                    } else if (fallback2.equals("{desc}")) {
                        fallback = h().c();
                    }
                }
                fallback = g().getFallback();
            }
            Style style = g().getStyle(StyleType.ELLIPSIZE);
            if (style != null && (value4 = style.getValue()) != null) {
                if (c25.g(value4, EllipsizeAt.START.getValue())) {
                    truncateAt = TextUtils.TruncateAt.START;
                } else if (c25.g(value4, EllipsizeAt.END.getValue())) {
                    truncateAt = TextUtils.TruncateAt.END;
                } else if (c25.g(value4, EllipsizeAt.MIDDLE.getValue())) {
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                } else {
                    truncateAt = c25.g(value4, EllipsizeAt.NONE.getValue()) ? null : TextUtils.TruncateAt.END;
                }
                textView.setEllipsize(truncateAt);
            }
            Style style2 = g().getStyle(StyleType.TEXT_SIZE);
            if (style2 == null || (value = style2.getValue()) == null) {
                yq4Var = null;
                z = false;
            } else if (b95.u2(value, "@", false, 2, null)) {
                Float J02 = z85.J0(c95.c4(value, "@"));
                if (J02 != null) {
                    textView.setTextSize(2, J02.floatValue());
                    yq4Var = yq4.a;
                    z = true;
                }
                yq4Var = null;
                z = true;
            } else {
                Float J03 = z85.J0(value);
                if (J03 != null) {
                    textView.setTextSize(0, J03.floatValue());
                    yq4Var = yq4.a;
                    z = true;
                }
                yq4Var = null;
                z = true;
            }
            if (yq4Var == null) {
                xz2.c("TxtLayr", "Text Size property is null");
            }
            Style style3 = g().getStyle(StyleType.TEXT_SIZE_MAX);
            int i2 = 20;
            if (style3 != null && (value3 = style3.getValue()) != null && b95.u2(value3, "@", false, 2, null) && (X03 = a95.X0(c95.c4(value3, "@"))) != null) {
                i2 = X03.intValue();
            }
            Style style4 = g().getStyle(StyleType.TEXT_SIZE_MIN);
            int i3 = 10;
            if (style4 != null && (value2 = style4.getValue()) != null && b95.u2(value2, "@", false, 2, null) && (X02 = a95.X0(c95.c4(value2, "@"))) != null) {
                i3 = X02.intValue();
            }
            Style style5 = g().getStyle(StyleType.COLOR);
            if ((style5 == null ? null : style5.getValue()) != null) {
                if (c25.g(style5.getValue(), "{dynamic}")) {
                    if (c25.g(g().getUse(), "{cta}")) {
                        textView.setTextColor(d());
                    } else {
                        textView.setTextColor(i());
                    }
                } else {
                    try {
                        textView.setTextColor(Color.parseColor(style5.getValue()));
                    } catch (Exception e) {
                        e.printStackTrace();
                        xz2.c("TxtLayr", "Error in parsing color");
                    }
                }
            }
            Style style6 = g().getStyle(StyleType.MAX_LINES);
            if (style6 != null) {
                String value5 = style6.getValue();
                textView.setMaxLines((value5 == null || (X0 = a95.X0(value5)) == null) ? 1 : X0.intValue());
            }
            if (this.n.q() != null) {
                textView.setTypeface(this.n.q());
            } else {
                Style style7 = g().getStyle(StyleType.FONT);
                if ((style7 == null ? null : style7.getValue()) != null) {
                    xx2 a2 = a();
                    String value6 = style7.getValue();
                    c25.m(value6);
                    Uri b2 = a2.b(value6);
                    String uri = b2.toString();
                    c25.o(uri, "fontUri.toString()");
                    if (uri.length() > 0) {
                        String uri2 = b2.toString();
                        c25.o(uri2, "fontUri.toString()");
                        try {
                            textView.setTypeface(Typeface.createFromFile(uri2));
                        } catch (Exception e2) {
                            xz2.b("TxtLayr", "[ERROR] Not able to create TypeFace", e2);
                            return null;
                        }
                    } else {
                        xz2.c("TxtLayr", "[ERROR] Font not available");
                        return null;
                    }
                }
            }
            Style style8 = g().getStyle(StyleType.OPACITY);
            if ((style8 == null ? null : style8.getValue()) != null) {
                String value7 = style8.getValue();
                float f = 1.0f;
                if (value7 != null && (J0 = z85.J0(value7)) != null) {
                    f = J0.floatValue();
                }
                textView.setAlpha(f);
            }
            Style style9 = g().getStyle(StyleType.TEXT_XALIGN);
            int i4 = 17;
            if ((style9 == null ? null : style9.getValue()) != null) {
                jz2.a aVar = jz2.s;
                String value8 = style9.getValue();
                if (value8 == null) {
                    value8 = jz2.CENTER.g();
                }
                int i5 = b.a[aVar.a(value8).ordinal()];
                if (i5 == 1) {
                    i = 17;
                } else if (i5 == 2) {
                    i = nq.b;
                } else if (i5 != 3) {
                    throw new wo4();
                } else {
                    i = nq.c;
                }
                textView.setGravity(i);
            }
            Style style10 = g().getStyle(StyleType.TEXT_YALIGN);
            if ((style10 != null ? style10.getValue() : null) != null) {
                int gravity = textView.getGravity();
                kz2.a aVar2 = kz2.s;
                String value9 = style10.getValue();
                if (value9 == null) {
                    value9 = kz2.CENTER.g();
                }
                int i6 = b.b[aVar2.a(value9).ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        i4 = 48;
                    } else if (i6 != 3) {
                        throw new wo4();
                    } else {
                        i4 = 80;
                    }
                }
                textView.setGravity(gravity | i4);
            }
            if (!z) {
                nt.r(textView, i3, i2, 1, 2);
            }
            return textView;
        }
        use = g().getUse();
    }
}