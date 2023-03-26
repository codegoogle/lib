package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface SafeParcelable extends Parcelable {
    @x1
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public @interface Class {
        @x1
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public @interface Constructor {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public @interface Field {
        @x1
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @x1
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @x1
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @x1
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public @interface Indicator {
        @x1
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public @interface Param {
        int id();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public @interface RemovedParam {
        @x1
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @x1
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public @interface Reserved {
        @x1
        int[] value();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public @interface VersionField {
        @x1
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @x1
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}