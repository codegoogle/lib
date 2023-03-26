package com.p7700g.p99005;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class o22 {
    @x1
    public static final String a = "0.0.0";
    @x1
    public static final String b = "Ads";
    @x1
    public static final String c = "B3EEABB8EE11C2BE770B684D95219ECB";

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public enum a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        
        private final String x;

        a(String str) {
            this.x = str;
        }

        @Override // java.lang.Enum
        @x1
        public String toString() {
            return this.x;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public enum b {
        UNKNOWN,
        MALE,
        FEMALE
    }

    private o22() {
    }
}