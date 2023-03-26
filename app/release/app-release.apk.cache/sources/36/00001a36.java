package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    @z1
    public static String getXmlAttributeString(@x1 String str, @x1 String str2, @x1 Context context, @x1 AttributeSet attributeSet, boolean z, boolean z2, @x1 String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                resources.getValue(packageName + ":string/" + substring, typedValue, true);
            } catch (Resources.NotFoundException unused) {
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                return charSequence.toString();
            }
            typedValue.toString();
            return attributeValue;
        }
        return attributeValue;
    }
}