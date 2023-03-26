package com.greedygame.commons.models;

import com.anythink.expressad.foundation.g.a;
import com.p7700g.p99005.vo4;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseTemplate.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/greedygame/commons/models/BaseTemplate;", "", "", a.h, "Ljava/lang/Integer;", "getVersion", "()Ljava/lang/Integer;", "getVersion$annotations", "()V", "<init>", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public class BaseTemplate {
    @Nullable
    private final Integer version;

    @Json(name = "views")
    public static /* synthetic */ void getVersion$annotations() {
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }
}