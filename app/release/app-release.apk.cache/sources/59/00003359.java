package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.greedygame.commons.models.BaseTemplate;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.js4;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Template extends BaseTemplate {
    @Nullable
    private final String height;
    @Nullable
    private final Boolean impression;
    @Nullable
    private final Float ratio;
    @Nullable
    private List<Style> styles;
    @Nullable
    private List<ViewLayer> views;
    @Nullable
    private final String width;

    public Template() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ Template(List list, Float f, String str, String str2, Boolean bool, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? null : list2);
    }

    public static /* synthetic */ Template copy$default(Template template, List list, Float f, String str, String str2, Boolean bool, List list2, int i, Object obj) {
        List<ViewLayer> list3 = list;
        if ((i & 1) != 0) {
            list3 = template.views;
        }
        if ((i & 2) != 0) {
            f = template.ratio;
        }
        Float f2 = f;
        if ((i & 4) != 0) {
            str = template.height;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = template.width;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = template.impression;
        }
        Boolean bool2 = bool;
        List<Style> list4 = list2;
        if ((i & 32) != 0) {
            list4 = template.styles;
        }
        return template.copy(list3, f2, str3, str4, bool2, list4);
    }

    @Nullable
    public final List<ViewLayer> component1() {
        return this.views;
    }

    @Nullable
    public final Float component2() {
        return this.ratio;
    }

    @Nullable
    public final String component3() {
        return this.height;
    }

    @Nullable
    public final String component4() {
        return this.width;
    }

    @Nullable
    public final Boolean component5() {
        return this.impression;
    }

    @Nullable
    public final List<Style> component6() {
        return this.styles;
    }

    @NotNull
    public final Template copy(@Json(name = "views") @Nullable List<ViewLayer> list, @Json(name = "ratio") @Nullable Float f, @Json(name = "height") @Nullable String str, @Json(name = "width") @Nullable String str2, @Json(name = "impression") @Nullable Boolean bool, @Json(name = "styles") @Nullable List<Style> list2) {
        return new Template(list, f, str, str2, bool, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Template) {
            Template template = (Template) obj;
            return c25.g(this.views, template.views) && c25.g(this.ratio, template.ratio) && c25.g(this.height, template.height) && c25.g(this.width, template.width) && c25.g(this.impression, template.impression) && c25.g(this.styles, template.styles);
        }
        return false;
    }

    @Nullable
    public final String getHeight() {
        return this.height;
    }

    @Nullable
    public final Boolean getImpression() {
        return this.impression;
    }

    @Nullable
    public final Float getRatio() {
        return this.ratio;
    }

    @Nullable
    public final List<Style> getStyles() {
        return this.styles;
    }

    @Nullable
    public final List<ViewLayer> getViews() {
        return this.views;
    }

    @Nullable
    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        List<ViewLayer> list = this.views;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Float f = this.ratio;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.height;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.width;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.impression;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Style> list2 = this.styles;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setStyles(@Nullable List<Style> list) {
        this.styles = list;
    }

    public final void setViews(@Nullable List<ViewLayer> list) {
        this.views = list;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("H:");
        G.append((Object) this.height);
        G.append(" W:");
        G.append((Object) this.width);
        G.append(" ratio:");
        G.append(this.ratio);
        G.append(" imp:");
        G.append(this.impression);
        G.append(" VC:");
        List<ViewLayer> list = this.views;
        G.append(list == null ? "0" : Integer.valueOf(list.size()));
        return G.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Template(@Json(name = "views") @Nullable List<ViewLayer> list, @Json(name = "ratio") @Nullable Float f, @Json(name = "height") @Nullable String str, @Json(name = "width") @Nullable String str2, @Json(name = "impression") @Nullable Boolean bool, @Json(name = "styles") @Nullable List<Style> list2) {
        List list3;
        this.views = list;
        this.ratio = f;
        this.height = str;
        this.width = str2;
        this.impression = bool;
        this.styles = list2;
        if (list == null) {
            list3 = null;
        } else {
            List arrayList = new ArrayList();
            for (Object obj : list) {
                String type = ((ViewLayer) obj).getType();
                if (!(type == null || type.length() == 0)) {
                    arrayList.add(obj);
                }
            }
            list3 = arrayList;
        }
        this.views = list3 == null ? js4.F() : list3;
    }
}