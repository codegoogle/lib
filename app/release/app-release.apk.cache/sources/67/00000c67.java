package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.sq1;
import com.p7700g.p99005.x1;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class ParcelFileDescriptorRewinder implements sq1<ParcelFileDescriptor> {
    private final InternalRewinder a;

    @e2(21)
    /* loaded from: classes2.dex */
    public static final class InternalRewinder {
        private final ParcelFileDescriptor a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @e2(21)
    /* loaded from: classes2.dex */
    public static final class a implements sq1.a<ParcelFileDescriptor> {
        @Override // com.p7700g.p99005.sq1.a
        @x1
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.p7700g.p99005.sq1.a
        @x1
        /* renamed from: c */
        public sq1<ParcelFileDescriptor> b(@x1 ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @e2(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return true;
    }

    @Override // com.p7700g.p99005.sq1
    public void b() {
    }

    @Override // com.p7700g.p99005.sq1
    @e2(21)
    @x1
    /* renamed from: d */
    public ParcelFileDescriptor a() throws IOException {
        return this.a.rewind();
    }
}