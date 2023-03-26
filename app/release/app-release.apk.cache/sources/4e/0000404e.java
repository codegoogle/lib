package com.p7700g.p99005;

import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.greedygame.mystique2.models.DefaultValues;
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
public final class ed3 extends hd3 {
    @NotNull
    public static final a m = new a(null);
    @NotNull
    private static final String n = "ButtonLayer";
    @NotNull
    private final hd3.a o;

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
    public ed3(@NotNull hd3.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
        this.o = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0315  */
    @Override // com.p7700g.p99005.hd3
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View o() {
        String use;
        String value;
        yq4 yq4Var;
        Style style;
        Style style2;
        Style style3;
        int i;
        int i2;
        String value2;
        Float J0;
        String value3;
        String value4;
        String value5;
        TextUtils.TruncateAt truncateAt;
        String fallback;
        AppCompatButton appCompatButton = new AppCompatButton(c());
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, appCompatButton.getContext().getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 8.0f, appCompatButton.getContext().getResources().getDisplayMetrics());
        appCompatButton.setPadding(applyDimension, applyDimension2, applyDimension, applyDimension2);
        String use2 = g().getUse();
        String str = "";
        if (!c25.g(use2, "{title}") ? !(!c25.g(use2, "{cta}") ? (use = g().getUse()) != null : (use = h().b()) != null) : (use = h().g()) == null) {
            use = "";
        }
        appCompatButton.setText(use);
        CharSequence text = appCompatButton.getText();
        c25.o(text, "text");
        if (text.length() == 0) {
            String fallback2 = g().getFallback();
            if (!c25.g(fallback2, "{title}") ? !c25.g(fallback2, "{cta}") ? (fallback = g().getFallback()) != null : (fallback = h().b()) != null : (fallback = h().g()) != null) {
                str = fallback;
            }
            appCompatButton.setText(str);
        }
        appCompatButton.setEllipsize(TextUtils.TruncateAt.END);
        Style style4 = g().getStyle(StyleType.ELLIPSIZE);
        if (style4 != null && (value5 = style4.getValue()) != null) {
            if (c25.g(value5, EllipsizeAt.START.getValue())) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (c25.g(value5, EllipsizeAt.END.getValue())) {
                truncateAt = TextUtils.TruncateAt.END;
            } else if (c25.g(value5, EllipsizeAt.MIDDLE.getValue())) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else {
                truncateAt = c25.g(value5, EllipsizeAt.NONE.getValue()) ? null : TextUtils.TruncateAt.END;
            }
            appCompatButton.setEllipsize(truncateAt);
        }
        Style style5 = g().getStyle(StyleType.COLOR);
        if ((style5 == null ? null : style5.getValue()) != null) {
            if (!c25.g(style5 == null ? null : style5.getValue(), "{dynamic}")) {
                if (style5 == null) {
                    value4 = null;
                } else {
                    try {
                        value4 = style5.getValue();
                    } catch (Exception e) {
                        xz2.b(n, "invalid text color", e);
                    }
                }
                appCompatButton.setTextColor(Color.parseColor(value4));
            } else if (c25.g(g().getUse(), "{cta}")) {
                appCompatButton.setTextColor(d());
            } else {
                appCompatButton.setTextColor(i());
            }
        }
        DefaultValues defaultValues = DefaultValues.MAX_LINES;
        appCompatButton.setMaxLines(((Integer) defaultValues.getValue()).intValue());
        Style style6 = g().getStyle(StyleType.MAX_LINES);
        if ((style6 == null ? null : style6.getValue()) != null) {
            Integer X0 = (style6 == null || (value3 = style6.getValue()) == null) ? null : a95.X0(value3);
            appCompatButton.setMaxLines(X0 == null ? ((Number) defaultValues.getValue()).intValue() : X0.intValue());
        }
        Style style7 = g().getStyle(StyleType.TEXT_SIZE);
        if (style7 != null && (value = style7.getValue()) != null) {
            if (b95.u2(value, "@", false, 2, null)) {
                Float J02 = z85.J0(c95.c4(value, "@"));
                if (J02 != null) {
                    appCompatButton.setTextSize(2, J02.floatValue());
                    yq4Var = yq4.a;
                }
            } else {
                Float J03 = z85.J0(value);
                if (J03 != null) {
                    appCompatButton.setTextSize(0, J03.floatValue());
                    yq4Var = yq4.a;
                }
            }
            if (yq4Var == null) {
                xz2.c(n, "Text Size property is null");
            }
            if (this.o.q() == null) {
                appCompatButton.setTypeface(this.o.q());
            } else {
                Style style8 = g().getStyle(StyleType.FONT);
                if ((style8 == null ? null : style8.getValue()) != null) {
                    xx2 a2 = a();
                    String value6 = style8 == null ? null : style8.getValue();
                    c25.m(value6);
                    Uri b2 = a2.b(value6);
                    String uri = b2.toString();
                    c25.o(uri, "fontUri.toString()");
                    if (uri.length() > 0) {
                        String uri2 = b2.toString();
                        c25.o(uri2, "fontUri.toString()");
                        try {
                            appCompatButton.setTypeface(Typeface.createFromFile(uri2));
                        } catch (Exception e2) {
                            xz2.b(n, "[ERROR] Not able to create TypeFace", e2);
                        }
                    } else {
                        xz2.c(n, "[ERROR] Font not available");
                    }
                }
            }
            style = g().getStyle(StyleType.OPACITY);
            if ((style != null ? null : style.getValue()) != null) {
                float f = 1.0f;
                if (style != null && (value2 = style.getValue()) != null && (J0 = z85.J0(value2)) != null) {
                    f = J0.floatValue();
                }
                appCompatButton.setAlpha(f);
            }
            appCompatButton.setTextAlignment(1);
            appCompatButton.setGravity(17);
            style2 = g().getStyle(StyleType.TEXT_XALIGN);
            if ((style2 != null ? null : style2.getValue()) != null) {
                jz2.a aVar = jz2.s;
                String value7 = style2 == null ? null : style2.getValue();
                if (value7 == null) {
                    value7 = jz2.CENTER.g();
                }
                int i3 = b.a[aVar.a(value7).ordinal()];
                if (i3 == 1) {
                    i2 = 1;
                } else if (i3 == 2) {
                    i2 = nq.b;
                } else if (i3 != 3) {
                    throw new wo4();
                } else {
                    i2 = nq.c;
                }
                appCompatButton.setGravity(i2);
            }
            appCompatButton.setGravity(17 | appCompatButton.getGravity());
            style3 = g().getStyle(StyleType.TEXT_YALIGN);
            if ((style3 != null ? null : style3.getValue()) != null) {
                int gravity = appCompatButton.getGravity();
                kz2.a aVar2 = kz2.s;
                String value8 = style3 != null ? style3.getValue() : null;
                if (value8 == null) {
                    value8 = kz2.CENTER.g();
                }
                int i4 = b.b[aVar2.a(value8).ordinal()];
                if (i4 == 1) {
                    appCompatButton.getTextAlignment();
                    i = 16;
                } else if (i4 == 2) {
                    i = 48;
                } else if (i4 != 3) {
                    throw new wo4();
                } else {
                    i = 80;
                }
                appCompatButton.setGravity(i | gravity);
            }
            return appCompatButton;
        }
        yq4Var = null;
        if (yq4Var == null) {
        }
        if (this.o.q() == null) {
        }
        style = g().getStyle(StyleType.OPACITY);
        if ((style != null ? null : style.getValue()) != null) {
        }
        appCompatButton.setTextAlignment(1);
        appCompatButton.setGravity(17);
        style2 = g().getStyle(StyleType.TEXT_XALIGN);
        if ((style2 != null ? null : style2.getValue()) != null) {
        }
        appCompatButton.setGravity(17 | appCompatButton.getGravity());
        style3 = g().getStyle(StyleType.TEXT_YALIGN);
        if ((style3 != null ? null : style3.getValue()) != null) {
        }
        return appCompatButton;
    }
}