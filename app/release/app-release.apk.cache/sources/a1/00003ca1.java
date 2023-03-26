package com.p7700g.p99005;

import android.net.Uri;
import android.os.Build;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.jb0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/* compiled from: WorkTypeConverters.java */
/* loaded from: classes.dex */
public class cf0 {

    /* compiled from: WorkTypeConverters.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            xb0.values();
            int[] iArr = new int[2];
            d = iArr;
            try {
                iArr[xb0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[xb0.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            ub0.values();
            int[] iArr2 = new int[6];
            c = iArr2;
            try {
                iArr2[ub0.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[ub0.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[ub0.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[ub0.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[ub0.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            gb0.values();
            int[] iArr3 = new int[2];
            b = iArr3;
            try {
                iArr3[gb0.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[gb0.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            dc0.a.values();
            int[] iArr4 = new int[6];
            a = iArr4;
            try {
                iArr4[dc0.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[dc0.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[dc0.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[dc0.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[dc0.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[dc0.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: WorkTypeConverters.java */
    /* loaded from: classes.dex */
    public interface b {
        public static final int a = 0;
        public static final int b = 1;
    }

    /* compiled from: WorkTypeConverters.java */
    /* loaded from: classes.dex */
    public interface c {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
    }

    /* compiled from: WorkTypeConverters.java */
    /* loaded from: classes.dex */
    public interface d {
        public static final int a = 0;
        public static final int b = 1;
    }

    /* compiled from: WorkTypeConverters.java */
    /* loaded from: classes.dex */
    public interface e {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final String g = "(2, 3, 5)";
    }

    private cf0() {
    }

    @p50
    public static int a(gb0 backoffPolicy) {
        int ordinal = backoffPolicy.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0053 -> B:33:0x0056). Please submit an issue!!! */
    @p50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jb0 b(byte[] bytes) {
        ObjectInputStream objectInputStream;
        Throwable th;
        IOException e2;
        jb0 jb0Var = new jb0();
        if (bytes == null) {
            return jb0Var;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e3) {
                objectInputStream = null;
                e2 = e3;
            } catch (Throwable th2) {
                objectInputStream = null;
                th = th2;
                if (objectInputStream != null) {
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        try {
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    jb0Var.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th = th3;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e8) {
            e2 = e8;
            e2.printStackTrace();
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            byteArrayInputStream.close();
            return jb0Var;
        }
        return jb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x006a). Please submit an issue!!! */
    @p50
    public static byte[] c(jb0 triggers) {
        boolean hasNext;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;
        objectOutputStream = null;
        if (triggers.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
        } catch (IOException e2) {
            e2.printStackTrace();
            objectOutputStream = objectOutputStream;
        }
        try {
            try {
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream3.writeInt(triggers.c());
                    Iterator<jb0.a> it = triggers.b().iterator();
                    while (true) {
                        hasNext = it.hasNext();
                        if (hasNext != 0) {
                            jb0.a next = it.next();
                            objectOutputStream3.writeUTF(next.a().toString());
                            objectOutputStream3.writeBoolean(next.b());
                        } else {
                            try {
                                break;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    objectOutputStream3.close();
                    byteArrayOutputStream.close();
                    objectOutputStream = hasNext;
                } catch (IOException e4) {
                    e = e4;
                    objectOutputStream2 = objectOutputStream3;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    objectOutputStream = objectOutputStream2;
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream3;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @p50
    public static gb0 d(int value) {
        if (value != 0) {
            if (value == 1) {
                return gb0.LINEAR;
            }
            throw new IllegalArgumentException(wo1.n("Could not convert ", value, " to BackoffPolicy"));
        }
        return gb0.EXPONENTIAL;
    }

    @p50
    public static ub0 e(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        if (value != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && value == 5) {
                                return ub0.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(wo1.n("Could not convert ", value, " to NetworkType"));
                        }
                        return ub0.METERED;
                    }
                    return ub0.NOT_ROAMING;
                }
                return ub0.UNMETERED;
            }
            return ub0.CONNECTED;
        }
        return ub0.NOT_REQUIRED;
    }

    @x1
    @p50
    public static xb0 f(int value) {
        if (value != 0) {
            if (value == 1) {
                return xb0.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException(wo1.n("Could not convert ", value, " to OutOfQuotaPolicy"));
        }
        return xb0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    @p50
    public static dc0.a g(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        if (value != 4) {
                            if (value == 5) {
                                return dc0.a.CANCELLED;
                            }
                            throw new IllegalArgumentException(wo1.n("Could not convert ", value, " to State"));
                        }
                        return dc0.a.BLOCKED;
                    }
                    return dc0.a.FAILED;
                }
                return dc0.a.SUCCEEDED;
            }
            return dc0.a.RUNNING;
        }
        return dc0.a.ENQUEUED;
    }

    @p50
    public static int h(ub0 networkType) {
        int ordinal = networkType.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        i = 4;
                        if (ordinal != 4) {
                            if (Build.VERSION.SDK_INT < 30 || networkType != ub0.TEMPORARILY_UNMETERED) {
                                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                            }
                            return 5;
                        }
                    }
                }
            }
            return i;
        }
        return 0;
    }

    @p50
    public static int i(@x1 xb0 policy) {
        int ordinal = policy.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + policy + " to int");
        }
        return 0;
    }

    @p50
    public static int j(dc0.a state) {
        int ordinal = state.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        i = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + state + " to int");
                        }
                    }
                }
            }
            return i;
        }
        return 0;
    }
}