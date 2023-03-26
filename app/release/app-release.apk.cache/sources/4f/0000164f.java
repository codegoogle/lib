package com.facebook.soloader;

import com.p7700g.p99005.av5;
import com.p7700g.p99005.tq4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* compiled from: MinElf.java */
/* loaded from: classes2.dex */
public final class r {
    public static final int a = 1179403647;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 5;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 65535;

    /* compiled from: MinElf.java */
    /* loaded from: classes2.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static String[] a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return b(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    public static String[] b(FileChannel fileChannel) throws IOException {
        long c2;
        long e2;
        int e3;
        long j;
        boolean z;
        long c3;
        long j2;
        long c4;
        long j3;
        long c5;
        long c6;
        long f2;
        long j4;
        long c7;
        long c8;
        long c9;
        long f3;
        long c10;
        long f4;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (f(fileChannel, allocate, 0L) == 1179403647) {
            boolean z2 = g(fileChannel, allocate, 4L) == 1;
            if (g(fileChannel, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z2) {
                c2 = f(fileChannel, allocate, 28L);
            } else {
                c2 = c(fileChannel, allocate, 32L);
            }
            if (z2) {
                e2 = e(fileChannel, allocate, 44L);
            } else {
                e2 = e(fileChannel, allocate, 56L);
            }
            if (z2) {
                e3 = e(fileChannel, allocate, 42L);
            } else {
                e3 = e(fileChannel, allocate, 54L);
            }
            if (e2 == av5.s) {
                if (z2) {
                    c10 = f(fileChannel, allocate, 32L);
                } else {
                    c10 = c(fileChannel, allocate, 40L);
                }
                if (z2) {
                    f4 = f(fileChannel, allocate, c10 + 28);
                } else {
                    f4 = f(fileChannel, allocate, c10 + 44);
                }
                e2 = f4;
            }
            long j5 = c2;
            long j6 = 0;
            while (true) {
                if (j6 >= e2) {
                    j = 0;
                    break;
                }
                if (z2) {
                    f3 = f(fileChannel, allocate, j5 + 0);
                } else {
                    f3 = f(fileChannel, allocate, j5 + 0);
                }
                if (f3 != 2) {
                    j5 += e3;
                    j6++;
                } else if (z2) {
                    j = f(fileChannel, allocate, j5 + 4);
                } else {
                    j = c(fileChannel, allocate, j5 + 8);
                }
            }
            long j7 = 0;
            if (j == 0) {
                throw new a("ELF file does not contain dynamic linking information");
            }
            long j8 = j;
            long j9 = 0;
            int i = 0;
            while (true) {
                if (z2) {
                    z = z2;
                    c3 = f(fileChannel, allocate, j8 + j7);
                } else {
                    z = z2;
                    c3 = c(fileChannel, allocate, j8 + j7);
                }
                if (c3 == 1) {
                    j2 = j;
                    if (i == Integer.MAX_VALUE) {
                        throw new a("malformed DT_NEEDED section");
                    }
                    i++;
                } else {
                    j2 = j;
                    if (c3 == 5) {
                        if (z) {
                            c4 = f(fileChannel, allocate, j8 + 4);
                        } else {
                            c4 = c(fileChannel, allocate, j8 + 8);
                        }
                        j9 = c4;
                    }
                }
                long j10 = 16;
                j8 += z ? 8L : 16L;
                j7 = 0;
                if (c3 != 0) {
                    z2 = z;
                    j = j2;
                } else if (j9 == 0) {
                    throw new a("Dynamic section string-table not found");
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= e2) {
                            j3 = 0;
                            break;
                        }
                        if (z) {
                            f2 = f(fileChannel, allocate, c2 + j7);
                        } else {
                            f2 = f(fileChannel, allocate, c2 + j7);
                        }
                        if (f2 == 1) {
                            if (z) {
                                c7 = f(fileChannel, allocate, c2 + 8);
                            } else {
                                c7 = c(fileChannel, allocate, c2 + j10);
                            }
                            if (z) {
                                j4 = e2;
                                c8 = f(fileChannel, allocate, c2 + 20);
                            } else {
                                j4 = e2;
                                c8 = c(fileChannel, allocate, c2 + 40);
                            }
                            if (c7 <= j9 && j9 < c8 + c7) {
                                if (z) {
                                    c9 = f(fileChannel, allocate, c2 + 4);
                                } else {
                                    c9 = c(fileChannel, allocate, c2 + 8);
                                }
                                j3 = c9 + (j9 - c7);
                            }
                        } else {
                            j4 = e2;
                        }
                        c2 += e3;
                        i2++;
                        e2 = j4;
                        j10 = 16;
                        j7 = 0;
                    }
                    long j11 = 0;
                    if (j3 != 0) {
                        String[] strArr = new String[i];
                        int i3 = 0;
                        while (true) {
                            if (z) {
                                c5 = f(fileChannel, allocate, j2 + j11);
                            } else {
                                c5 = c(fileChannel, allocate, j2 + j11);
                            }
                            if (c5 == 1) {
                                if (z) {
                                    c6 = f(fileChannel, allocate, j2 + 4);
                                } else {
                                    c6 = c(fileChannel, allocate, j2 + 8);
                                }
                                strArr[i3] = d(fileChannel, allocate, c6 + j3);
                                if (i3 == Integer.MAX_VALUE) {
                                    throw new a("malformed DT_NEEDED section");
                                }
                                i3++;
                            }
                            j2 += z ? 8L : 16L;
                            if (c5 == 0) {
                                if (i3 == i) {
                                    return strArr;
                                }
                                throw new a("malformed DT_NEEDED section");
                            }
                            j11 = 0;
                        }
                    } else {
                        throw new a("did not find file offset of DT_STRTAB table");
                    }
                }
            }
        } else {
            throw new a("file is not ELF");
        }
    }

    private static long c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        h(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static String d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short g2 = g(fileChannel, byteBuffer, j);
            if (g2 != 0) {
                sb.append((char) g2);
                j = j2;
            } else {
                return sb.toString();
            }
        }
    }

    private static int e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        h(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & tq4.u;
    }

    private static long f(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        h(fileChannel, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static short g(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        h(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    private static void h(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new a("ELF file truncated");
    }
}