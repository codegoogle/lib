package com.google.android.gms.ads.mediation;

import android.location.Location;
import com.p7700g.p99005.x1;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface MediationAdRequest {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @x1
    @Deprecated
    Date getBirthday();

    @Deprecated
    int getGender();

    @x1
    Set<String> getKeywords();

    @x1
    Location getLocation();

    @Deprecated
    boolean isDesignedForFamilies();

    boolean isTesting();

    int taggedForChildDirectedTreatment();
}