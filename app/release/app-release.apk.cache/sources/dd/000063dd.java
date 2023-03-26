package com.p7700g.p99005;

import android.location.Location;
import org.jetbrains.annotations.NotNull;

/* compiled from: Location.kt */
@vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n¨\u0006\u0004"}, d2 = {"component1", "", "Landroid/location/Location;", "component2", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class wl {
    public static final double a(@NotNull Location location) {
        c25.p(location, "<this>");
        return location.getLatitude();
    }

    public static final double b(@NotNull Location location) {
        c25.p(location, "<this>");
        return location.getLongitude();
    }
}