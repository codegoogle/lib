package com.bumptech.glide.load;

import com.p7700g.p99005.is1;
import com.p7700g.p99005.x1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface ImageHeaderParser {
    public static final int a = -1;

    /* loaded from: classes2.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        UNKNOWN(false);
        
        private final boolean s;

        ImageType(boolean z) {
            this.s = z;
        }

        public boolean hasAlpha() {
            return this.s;
        }

        public boolean isWebp() {
            int ordinal = ordinal();
            return ordinal == 5 || ordinal == 6 || ordinal == 7;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            ImageType.values();
            int[] iArr = new int[10];
            a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @x1
    ImageType a(@x1 ByteBuffer byteBuffer) throws IOException;

    int b(@x1 ByteBuffer byteBuffer, @x1 is1 is1Var) throws IOException;

    @x1
    ImageType c(@x1 InputStream inputStream) throws IOException;

    int d(@x1 InputStream inputStream, @x1 is1 is1Var) throws IOException;
}