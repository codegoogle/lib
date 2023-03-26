package com.anythink.basead.a.a;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import java.io.FileDescriptor;

/* loaded from: classes2.dex */
public final class e {

    /* loaded from: classes2.dex */
    public static class a {
        public int a;
        public int b;
    }

    public static a a(String str) {
        a aVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            a aVar2 = new a();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                mediaMetadataRetriever.release();
                aVar2.a = Integer.parseInt(extractMetadata);
                aVar2.b = Integer.parseInt(extractMetadata2);
                return aVar2;
            } catch (Exception e) {
                e = e;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static a a(FileDescriptor fileDescriptor) {
        a aVar = null;
        if (fileDescriptor == null) {
            return null;
        }
        try {
            a aVar2 = new a();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(fileDescriptor);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                mediaMetadataRetriever.release();
                aVar2.a = Integer.parseInt(extractMetadata);
                aVar2.b = Integer.parseInt(extractMetadata2);
                return aVar2;
            } catch (Exception e) {
                e = e;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static a a(String str, int i, int i2) {
        a a2 = a(str);
        if (a2 == null) {
            return null;
        }
        float f = (a2.a * 1.0f) / a2.b;
        if (f < (i * 1.0f) / i2) {
            a2.b = i2;
            a2.a = (int) (i2 * f);
        } else {
            a2.a = i;
            a2.b = (int) (i / f);
        }
        return a2;
    }

    private static a a(FileDescriptor fileDescriptor, int i, int i2) {
        a a2 = a(fileDescriptor);
        if (a2 == null) {
            return null;
        }
        float f = (a2.a * 1.0f) / a2.b;
        if (f < (i * 1.0f) / i2) {
            a2.b = i2;
            a2.a = (int) Math.ceil(i2 * f);
        } else {
            a2.a = i;
            a2.b = (int) Math.ceil(i / f);
        }
        return a2;
    }
}