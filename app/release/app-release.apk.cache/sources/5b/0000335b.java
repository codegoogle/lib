package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.dg;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class ViewLayer {
    @NotNull
    public static final a Companion = new a(null);
    @Nullable
    private static ViewLayer viewLayer = new ViewLayer(null, null, null, null, null, null, false, null, null, dg.t, null);
    private final boolean clickable;
    @Nullable
    private final String fallback;
    @Nullable
    private final String id;
    @Nullable
    private final String nativeAdView;
    @Nullable
    private final String onClick;
    @Nullable
    private List<Style> styles;
    @Nullable
    private final String type;
    @Nullable
    private final String use;
    @Nullable
    private transient Integer viewId;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Style a(@NotNull StyleType styleType, @Nullable List<Style> list) {
            c25.p(styleType, "styleType");
            ViewLayer viewLayer = ViewLayer.viewLayer;
            if (viewLayer == null) {
                return null;
            }
            viewLayer.setStyles(list);
            return viewLayer.getStyle(styleType);
        }

        public final boolean b(@NotNull StyleType styleType, @Nullable List<Style> list) {
            c25.p(styleType, "styleType");
            return a(styleType, list) != null;
        }
    }

    public ViewLayer() {
        this(null, null, null, null, null, null, false, null, null, dg.t, null);
    }

    public ViewLayer(@Json(name = "native_ad_view") @Nullable String str, @Json(name = "type") @Nullable String str2, @Json(name = "styles") @Nullable List<Style> list, @Json(name = "id") @Nullable String str3, @Json(name = "use") @Nullable String str4, @Json(name = "fallback") @Nullable String str5, @Json(name = "clickable") boolean z, @Json(name = "on_click") @Nullable String str6, @Nullable Integer num) {
        this.nativeAdView = str;
        this.type = str2;
        this.styles = list;
        this.id = str3;
        this.use = str4;
        this.fallback = str5;
        this.clickable = z;
        this.onClick = str6;
        this.viewId = num;
    }

    @Nullable
    public final String component1() {
        return this.nativeAdView;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final List<Style> component3() {
        return this.styles;
    }

    @Nullable
    public final String component4() {
        return this.id;
    }

    @Nullable
    public final String component5() {
        return this.use;
    }

    @Nullable
    public final String component6() {
        return this.fallback;
    }

    public final boolean component7() {
        return this.clickable;
    }

    @Nullable
    public final String component8() {
        return this.onClick;
    }

    @Nullable
    public final Integer component9() {
        return this.viewId;
    }

    @NotNull
    public final ViewLayer copy(@Json(name = "native_ad_view") @Nullable String str, @Json(name = "type") @Nullable String str2, @Json(name = "styles") @Nullable List<Style> list, @Json(name = "id") @Nullable String str3, @Json(name = "use") @Nullable String str4, @Json(name = "fallback") @Nullable String str5, @Json(name = "clickable") boolean z, @Json(name = "on_click") @Nullable String str6, @Nullable Integer num) {
        return new ViewLayer(str, str2, list, str3, str4, str5, z, str6, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewLayer) {
            ViewLayer viewLayer2 = (ViewLayer) obj;
            return c25.g(this.nativeAdView, viewLayer2.nativeAdView) && c25.g(this.type, viewLayer2.type) && c25.g(this.styles, viewLayer2.styles) && c25.g(this.id, viewLayer2.id) && c25.g(this.use, viewLayer2.use) && c25.g(this.fallback, viewLayer2.fallback) && this.clickable == viewLayer2.clickable && c25.g(this.onClick, viewLayer2.onClick) && c25.g(this.viewId, viewLayer2.viewId);
        }
        return false;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    @Nullable
    public final String getFallback() {
        return this.fallback;
    }

    @NotNull
    public final String getHeight() {
        Style style = getStyle(StyleType.HEIGHT);
        String value = style == null ? null : style.getValue();
        return value == null ? ViewSize.WRAP.getValue() : value;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getNativeAdView() {
        return this.nativeAdView;
    }

    @Nullable
    public final String getOnClick() {
        return this.onClick;
    }

    @Nullable
    public final Style getStyle(@NotNull StyleType styleType) {
        c25.p(styleType, "styleType");
        List<Style> list = this.styles;
        if (list == null) {
            return null;
        }
        for (Style style : list) {
            if (c25.g(style.getKey(), styleType.getValue())) {
                return style;
            }
        }
        return null;
    }

    @Nullable
    public final List<Style> getStyles() {
        return this.styles;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUse() {
        return this.use;
    }

    @Nullable
    public final Integer getViewId() {
        return this.viewId;
    }

    @NotNull
    public final String getWidth() {
        Style style = getStyle(StyleType.WIDTH);
        String value = style == null ? null : style.getValue();
        return value == null ? ViewSize.WRAP.getValue() : value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.nativeAdView;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Style> list = this.styles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.id;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.use;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fallback;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.clickable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        String str6 = this.onClick;
        int hashCode7 = (i2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.viewId;
        return hashCode7 + (num != null ? num.hashCode() : 0);
    }

    public final void setStyles(@Nullable List<Style> list) {
        this.styles = list;
    }

    public final void setViewId(@Nullable Integer num) {
        this.viewId = num;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("ViewLayer(nativeAdView=");
        G.append((Object) this.nativeAdView);
        G.append(", type=");
        G.append((Object) this.type);
        G.append(", styles=");
        G.append(this.styles);
        G.append(", id=");
        G.append((Object) this.id);
        G.append(", use=");
        G.append((Object) this.use);
        G.append(", fallback=");
        G.append((Object) this.fallback);
        G.append(", clickable=");
        G.append(this.clickable);
        G.append(", onClick=");
        G.append((Object) this.onClick);
        G.append(", viewId=");
        G.append(this.viewId);
        G.append(')');
        return G.toString();
    }

    public /* synthetic */ ViewLayer(String str, String str2, List list, String str3, String str4, String str5, boolean z, String str6, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? true : z, (i & 128) != 0 ? "{redirect}" : str6, (i & 256) == 0 ? num : null);
    }
}