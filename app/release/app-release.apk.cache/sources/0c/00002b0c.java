package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzftm implements FilenameFilter {
    private final Pattern zza;

    public zzftm(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.zza = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }
}