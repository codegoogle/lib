package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.p7700g.p99005.bx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class I3 {
    public static byte[] A02;
    public static String[] A03;
    public final File A00;
    public final File A01;

    static {
        A03();
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        String[] strArr = A03;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[3] = "fGFO0zCAStGKoiZFpD51M0TKKg27e0CP";
        strArr2[2] = "DvOfDhfpity1gtQUN9QT4js3IOkVb8st";
        A02 = new byte[]{Flags.CD, 95, 68, Flags.CD, 73, 74, 72, 64, 94, 91, Flags.CD, 77, 66, 71, 78, Flags.CD, 21, 89, 90, 80, 97, 84, 79, 77, 73, 67, 102, 73, 76, 69, 118, 90, 64, 89, 81, 91, 18, 65, 21, 86, 71, 80, 84, 65, 80, 21, bx.W5, 6, 28, 5, 13, 7, 78, 29, 73, 10, 27, 12, 8, 29, 12, 73, 13, 0, 27, 12, 10, 29, 6, 27, 16, 73, Flags.CD, 39, 61, 36, 44, 38, 111, 60, 104, 58, 45, 38, 41, 37, 45, 104, 46, 33, 36, 45, 104};
    }

    public static void A03() {
        A03 = new String[]{"96B3cy9RZxtPR6KnOI2R9lSlbjENtNov", "vgY", "0Agn9JxSXdIjUr3w2sjNTgL3mmZAwFqU", "7DjUWPQBmfUfGNRSVlZnb128L2jCTSEC", "djfNau1l", "022WBhTdrqIqCcjTdyCCKSxEz17VR1Wc", "V7ZvpNUTDqHe8GQN4ix", "qc3aTE7BEdzrXIQnZyWq9L6n5Sm1DvD"};
    }

    public I3(File file) {
        this.A01 = file;
        this.A00 = new File(file.getPath() + A00(16, 4, 108));
    }

    private void A01() {
        if (this.A00.exists()) {
            this.A01.delete();
            this.A00.renameTo(this.A01);
        }
    }

    public final InputStream A04() throws FileNotFoundException {
        A01();
        return new FileInputStream(this.A01);
    }

    public final OutputStream A05() throws IOException {
        if (this.A01.exists()) {
            if (!this.A00.exists()) {
                if (!this.A01.renameTo(this.A00)) {
                    Log.w(A00(20, 10, 119), A00(72, 21, 31) + this.A01 + A00(0, 16, 124) + this.A00);
                }
            } else {
                this.A01.delete();
            }
        }
        try {
            return new I2(this.A01);
        } catch (FileNotFoundException e) {
            File parent = this.A01.getParentFile();
            if (parent.mkdirs()) {
                try {
                    File parent2 = this.A01;
                    return new I2(parent2);
                } catch (FileNotFoundException e2) {
                    throw new IOException(A00(30, 16, 98) + this.A01, e2);
                }
            }
            throw new IOException(A00(46, 26, 62) + this.A01, e);
        }
    }

    public final void A06() {
        this.A01.delete();
        this.A00.delete();
    }

    public final void A07(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.A00.delete();
    }
}