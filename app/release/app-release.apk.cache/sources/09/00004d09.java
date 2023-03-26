package com.p7700g.p99005;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import com.p7700g.p99005.i2;

/* compiled from: DragAndDropPermissionsCompat.java */
/* loaded from: classes.dex */
public final class kq {
    private final DragAndDropPermissions a;

    /* compiled from: DragAndDropPermissionsCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @e1
        public static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private kq(DragAndDropPermissions dragAndDropPermissions) {
        this.a = dragAndDropPermissions;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public static kq b(@x1 Activity activity, @x1 DragEvent dragEvent) {
        DragAndDropPermissions b;
        if (Build.VERSION.SDK_INT < 24 || (b = a.b(activity, dragEvent)) == null) {
            return null;
        }
        return new kq(b);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(this.a);
        }
    }
}