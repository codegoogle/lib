package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzhj;
import com.p7700g.p99005.h2;
import com.p7700g.p99005.j2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.2 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class AppMeasurementSdk {
    private final zzee zza;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.2 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ConditionalUserProperty {
        @x1
        @KeepForSdk
        public static final String ACTIVE = "active";
        @x1
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        @x1
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        @x1
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        @x1
        @KeepForSdk
        public static final String NAME = "name";
        @x1
        @KeepForSdk
        public static final String ORIGIN = "origin";
        @x1
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        @x1
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        @x1
        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";
        @x1
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        @x1
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        @x1
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        @x1
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        @x1
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        @x1
        @KeepForSdk
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.2 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface EventInterceptor extends zzhi {
        @Override // com.google.android.gms.measurement.internal.zzhi
        @ShowFirstParty
        @KeepForSdk
        @s2
        void interceptEvent(@x1 String str, @x1 String str2, @x1 Bundle bundle, long j);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.2 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface OnEventListener extends zzhj {
        @Override // com.google.android.gms.measurement.internal.zzhj
        @ShowFirstParty
        @KeepForSdk
        @s2
        void onEvent(@x1 String str, @x1 String str2, @x1 Bundle bundle, long j);
    }

    public AppMeasurementSdk(zzee zzeeVar) {
        this.zza = zzeeVar;
    }

    @x1
    @ShowFirstParty
    @KeepForSdk
    @h2(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurementSdk getInstance(@x1 Context context) {
        return zzee.zzg(context, null, null, null, null).zzd();
    }

    @KeepForSdk
    public void beginAdUnitExposure(@x1 @j2(min = 1) String str) {
        this.zza.zzu(str);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@x1 @j2(max = 24, min = 1) String str, @z1 String str2, @z1 Bundle bundle) {
        this.zza.zzv(str, str2, bundle);
    }

    @KeepForSdk
    public void endAdUnitExposure(@x1 @j2(min = 1) String str) {
        this.zza.zzw(str);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.zza.zzb();
    }

    @KeepForSdk
    @z1
    public String getAppIdOrigin() {
        return this.zza.zzj();
    }

    @KeepForSdk
    @z1
    public String getAppInstanceId() {
        return this.zza.zzl();
    }

    @x1
    @KeepForSdk
    @s2
    public List<Bundle> getConditionalUserProperties(@z1 String str, @j2(max = 23, min = 1) @z1 String str2) {
        return this.zza.zzp(str, str2);
    }

    @KeepForSdk
    @z1
    public String getCurrentScreenClass() {
        return this.zza.zzm();
    }

    @KeepForSdk
    @z1
    public String getCurrentScreenName() {
        return this.zza.zzn();
    }

    @KeepForSdk
    @z1
    public String getGmpAppId() {
        return this.zza.zzo();
    }

    @KeepForSdk
    @s2
    public int getMaxUserProperties(@x1 @j2(min = 1) String str) {
        return this.zza.zza(str);
    }

    @x1
    @KeepForSdk
    @s2
    public Map<String, Object> getUserProperties(@z1 String str, @j2(max = 24, min = 1) @z1 String str2, boolean z) {
        return this.zza.zzq(str, str2, z);
    }

    @KeepForSdk
    public void logEvent(@x1 String str, @x1 String str2, @x1 Bundle bundle) {
        this.zza.zzy(str, str2, bundle);
    }

    @KeepForSdk
    public void logEventNoInterceptor(@x1 String str, @x1 String str2, @x1 Bundle bundle, long j) {
        this.zza.zzz(str, str2, bundle, j);
    }

    @KeepForSdk
    @z1
    public void performAction(@x1 Bundle bundle) {
        this.zza.zzc(bundle, false);
    }

    @KeepForSdk
    @z1
    public Bundle performActionWithResponse(@x1 Bundle bundle) {
        return this.zza.zzc(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@x1 OnEventListener onEventListener) {
        this.zza.zzB(onEventListener);
    }

    @KeepForSdk
    public void setConditionalUserProperty(@x1 Bundle bundle) {
        this.zza.zzD(bundle);
    }

    @KeepForSdk
    public void setConsent(@x1 Bundle bundle) {
        this.zza.zzE(bundle);
    }

    @KeepForSdk
    public void setCurrentScreen(@x1 Activity activity, @j2(max = 36, min = 1) @z1 String str, @j2(max = 36, min = 1) @z1 String str2) {
        this.zza.zzG(activity, str, str2);
    }

    @ShowFirstParty
    @KeepForSdk
    @s2
    public void setEventInterceptor(@x1 EventInterceptor eventInterceptor) {
        this.zza.zzJ(eventInterceptor);
    }

    @KeepForSdk
    public void setMeasurementEnabled(@z1 Boolean bool) {
        this.zza.zzK(bool);
    }

    @KeepForSdk
    public void setUserProperty(@x1 String str, @x1 String str2, @x1 Object obj) {
        this.zza.zzN(str, str2, obj, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@x1 OnEventListener onEventListener) {
        this.zza.zzO(onEventListener);
    }

    public final void zza(boolean z) {
        this.zza.zzH(z);
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z) {
        this.zza.zzK(Boolean.valueOf(z));
    }

    @x1
    @KeepForSdk
    @h2(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurementSdk getInstance(@x1 Context context, @x1 String str, @x1 String str2, @z1 String str3, @x1 Bundle bundle) {
        return zzee.zzg(context, str, str2, str3, bundle).zzd();
    }
}