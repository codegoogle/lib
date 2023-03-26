package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import javax.annotation.Nonnull;

/* compiled from: LibraryVersion.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class iv2 {
    public static iv2 a(String str, String str2) {
        return new ev2(str, str2);
    }

    @Nonnull
    public abstract String b();

    @Nonnull
    public abstract String c();
}