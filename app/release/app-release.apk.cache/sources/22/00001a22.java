package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ToStringHelper {
        private final List zza;
        private final Object zzb;

        public /* synthetic */ ToStringHelper(Object obj, zzah zzahVar) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new ArrayList();
        }

        @CanIgnoreReturnValue
        @x1
        @KeepForSdk
        public ToStringHelper add(@x1 String str, @z1 Object obj) {
            List list = this.zza;
            Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            list.add(str + AppCenter.KEY_VALUE_DELIMITER + valueOf);
            return this;
        }

        @x1
        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.zzb.getClass().getSimpleName());
            sb.append('{');
            int size = this.zza.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.zza.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@x1 Bundle bundle, @x1 Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            Set<String> keySet = bundle.keySet();
            if (keySet.containsAll(bundle2.keySet())) {
                for (String str : keySet) {
                    if (!equal(bundle.get(str), bundle2.get(str))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    @KeepForSdk
    public static boolean equal(@z1 Object obj, @z1 Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @KeepForSdk
    public static int hashCode(@x1 Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @x1
    @KeepForSdk
    public static ToStringHelper toStringHelper(@x1 Object obj) {
        return new ToStringHelper(obj, null);
    }
}