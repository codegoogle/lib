package com.p7700g.p99005;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: MediaDescriptionCompatApi23.java */
@e2(23)
/* loaded from: classes.dex */
public class k {

    /* compiled from: MediaDescriptionCompatApi23.java */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static void a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    private k() {
    }

    public static Uri a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}