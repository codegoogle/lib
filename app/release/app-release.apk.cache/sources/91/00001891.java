package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    @x1
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    @NotOnlyInitialized
    private final zzdr zza;
    private final String zzb;

    public /* synthetic */ SearchAdRequest(zzb zzbVar, zzc zzcVar) {
        String str;
        zzdq zzdqVar;
        str = zzbVar.zzb;
        this.zzb = str;
        zzdqVar = zzbVar.zza;
        this.zza = new zzdr(zzdqVar, this);
    }

    @Deprecated
    public int getAnchorTextColor() {
        return 0;
    }

    @Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public int getBackgroundGradientBottom() {
        return 0;
    }

    @Deprecated
    public int getBackgroundGradientTop() {
        return 0;
    }

    @Deprecated
    public int getBorderColor() {
        return 0;
    }

    @Deprecated
    public int getBorderThickness() {
        return 0;
    }

    @Deprecated
    public int getBorderType() {
        return 0;
    }

    @Deprecated
    public int getCallButtonColor() {
        return 0;
    }

    @z1
    @Deprecated
    public String getCustomChannels() {
        return null;
    }

    @z1
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@x1 Class<T> cls) {
        return this.zza.zzd(cls);
    }

    @Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @z1
    @Deprecated
    public String getFontFace() {
        return null;
    }

    @Deprecated
    public int getHeaderTextColor() {
        return 0;
    }

    @Deprecated
    public int getHeaderTextSize() {
        return 0;
    }

    @x1
    public Location getLocation() {
        return null;
    }

    @z1
    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(@x1 Class<T> cls) {
        return (T) this.zza.zzh(cls);
    }

    @z1
    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(@x1 Class<T> cls) {
        return this.zza.zzf(cls);
    }

    @x1
    public String getQuery() {
        return this.zzb;
    }

    public boolean isTestDevice(@x1 Context context) {
        return this.zza.zzt(context);
    }

    public final zzdr zza() {
        return this.zza;
    }
}