package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.p7700g.p99005.q7;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    @x1
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zzb();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    @x1
    @SafeParcelable.Field(id = 1)
    private Intent zza;
    @GuardedBy("this")
    private Map<String, String> zzb;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@x1 @SafeParcelable.Param(id = 1) Intent intent) {
        this.zza = intent;
    }

    private static int zza(@z1 String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @z1
    public final String getCollapseKey() {
        return this.zza.getStringExtra(rs2.d.e);
    }

    @x1
    public final synchronized Map<String, String> getData() {
        if (this.zzb == null) {
            Bundle extras = this.zza.getExtras();
            q7 q7Var = new q7();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str.startsWith(rs2.d.a) && !str.equals("from") && !str.equals(rs2.d.d) && !str.equals(rs2.d.e)) {
                            q7Var.put(str, str2);
                        }
                    }
                }
            }
            this.zzb = q7Var;
        }
        return this.zzb;
    }

    @z1
    public final String getFrom() {
        return this.zza.getStringExtra("from");
    }

    @x1
    public final Intent getIntent() {
        return this.zza;
    }

    @z1
    public final String getMessageId() {
        String stringExtra = this.zza.getStringExtra(rs2.d.h);
        return stringExtra == null ? this.zza.getStringExtra("message_id") : stringExtra;
    }

    @z1
    public final String getMessageType() {
        return this.zza.getStringExtra(rs2.d.d);
    }

    public final int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra(rs2.d.k);
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra(rs2.d.m);
        }
        return zza(stringExtra);
    }

    public final int getPriority() {
        String stringExtra = this.zza.getStringExtra(rs2.d.l);
        if (stringExtra == null) {
            if ("1".equals(this.zza.getStringExtra(rs2.d.n))) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra(rs2.d.m);
        }
        return zza(stringExtra);
    }

    @z1
    public final byte[] getRawData() {
        return this.zza.getByteArrayExtra(rs2.d.c);
    }

    @z1
    public final String getSenderId() {
        return this.zza.getStringExtra(rs2.d.p);
    }

    public final long getSentTime() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get("google.sent_time") : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                String.valueOf(obj).length();
                return 0L;
            }
        }
        return 0L;
    }

    @z1
    public final String getTo() {
        return this.zza.getStringExtra(rs2.d.g);
    }

    public final int getTtl() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get("google.ttl") : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String.valueOf(obj).length();
                return 0;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@x1 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}