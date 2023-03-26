package com.greedygame.mystique.models;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class TemplateModel {
    @Nullable
    private final List<Layer> a;
    @Nullable
    private final List<Layer> b;

    public TemplateModel() {
        this(null, null, 3, null);
    }

    public TemplateModel(@Nullable List<Layer> list, @Json(name = "fallback_layers") @Nullable List<Layer> list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplateModel c(TemplateModel templateModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = templateModel.a;
        }
        if ((i & 2) != 0) {
            list2 = templateModel.b;
        }
        return templateModel.copy(list, list2);
    }

    @Nullable
    public final List<Layer> a() {
        return this.a;
    }

    @Nullable
    public final List<Layer> b() {
        return this.b;
    }

    @NotNull
    public final TemplateModel copy(@Nullable List<Layer> list, @Json(name = "fallback_layers") @Nullable List<Layer> list2) {
        return new TemplateModel(list, list2);
    }

    @Nullable
    public final Layer d(@NotNull Layer layer) {
        c25.p(layer, "layer");
        List<Layer> list = this.b;
        if (list != null) {
            for (Layer layer2 : list) {
                int j = layer.j();
                Integer k = layer2.k();
                if (k != null && j == k.intValue()) {
                    return layer2;
                }
            }
            return null;
        }
        return null;
    }

    @Nullable
    public final List<Layer> e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TemplateModel) {
            TemplateModel templateModel = (TemplateModel) obj;
            return c25.g(this.a, templateModel.a) && c25.g(this.b, templateModel.b);
        }
        return false;
    }

    @Nullable
    public final List<Layer> f() {
        return this.a;
    }

    public final boolean g() {
        boolean z;
        List<Layer> list = this.a;
        if (list == null) {
            return false;
        }
        Iterator<Layer> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!it.next().t()) {
                z = false;
                break;
            }
        }
        return (this.a.isEmpty() ^ true) && z;
    }

    public int hashCode() {
        List<Layer> list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Layer> list2 = this.b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("TemplateModel(layers=");
        G.append(this.a);
        G.append(", fallbackLayers=");
        G.append(this.b);
        G.append(')');
        return G.toString();
    }

    public /* synthetic */ TemplateModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}