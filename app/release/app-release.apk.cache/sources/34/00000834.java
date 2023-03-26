package com.anythink.expressad.foundation.g.f.f;

import android.os.SystemClock;
import com.anythink.expressad.foundation.g.f.g;
import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.g.f.l;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.video.module.a.a.m;
import com.p7700g.p99005.pg1;
import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLProtocolException;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes2.dex */
public class a implements g {
    private static final String a = "a";
    private static final int b = 3000;
    private com.anythink.expressad.foundation.g.f.e.a c;
    private com.anythink.expressad.foundation.g.f.c d;

    public a(com.anythink.expressad.foundation.g.f.e.a aVar, com.anythink.expressad.foundation.g.f.c cVar) {
        this.c = aVar;
        this.d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    @Override // com.anythink.expressad.foundation.g.f.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c a(i<?> iVar) {
        String str;
        b bVar;
        byte[] bArr;
        String str2;
        b bVar2;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l l = iVar != null ? iVar.l() : null;
        String str3 = "IOException ex= ";
        if ((l != null ? l.a() : 0) <= 0) {
            if (!iVar.f()) {
                try {
                    try {
                        try {
                            iVar.i();
                            bVar2 = this.c.a(iVar);
                        } catch (ConnectException e) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            a("ConnectException ex= " + e.getMessage(), elapsedRealtime2, iVar);
                            throw new com.anythink.expressad.foundation.g.f.a.a(12, null);
                        } catch (MalformedURLException e2) {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            a("MalformedURLException ex= " + e2.getMessage(), elapsedRealtime3, iVar);
                            throw new com.anythink.expressad.foundation.g.f.a.a(4, null);
                        } catch (UnknownHostException e3) {
                            long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            a("UnknownHostException ex= " + e3.getMessage(), elapsedRealtime4, iVar);
                            throw new com.anythink.expressad.foundation.g.f.a.a(9, null);
                        } catch (SSLProtocolException e4) {
                            long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            a("SSLProtocolException ex= " + e4.getMessage(), elapsedRealtime5, iVar);
                            throw new com.anythink.expressad.foundation.g.f.a.a(11, null);
                        } catch (ConnectTimeoutException e5) {
                            long elapsedRealtime6 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            a("ConnectTimeoutException ex= " + e5.getMessage(), elapsedRealtime6, iVar);
                            throw new com.anythink.expressad.foundation.g.f.a.a(3, null);
                        }
                    } catch (SocketTimeoutException e6) {
                        e = e6;
                        str2 = "SocketTimeoutException ex= ";
                    }
                    try {
                        int a2 = bVar2.a();
                        bArr2 = iVar.a(bVar2, this.d);
                        try {
                            str2 = "SocketTimeoutException ex= ";
                            try {
                                a(SystemClock.elapsedRealtime() - elapsedRealtime, iVar, bArr2, a2);
                                if (a2 >= 200 && a2 <= 399) {
                                    return new c(a2, bArr2, bVar2.b());
                                }
                                throw new IOException();
                            } catch (SocketTimeoutException e7) {
                                e = e7;
                                long elapsedRealtime7 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                a(str2 + e.getMessage(), elapsedRealtime7, iVar);
                                throw new com.anythink.expressad.foundation.g.f.a.a(10, null);
                            }
                        } catch (IOException e8) {
                            e = e8;
                            long elapsedRealtime8 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            a("IOException ex= " + e.getMessage(), elapsedRealtime8, iVar);
                            if (bVar2 == null) {
                            }
                        }
                    } catch (IOException e9) {
                        e = e9;
                        bArr2 = null;
                        long elapsedRealtime82 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        a("IOException ex= " + e.getMessage(), elapsedRealtime82, iVar);
                        if (bVar2 == null) {
                            int a3 = bVar2.a();
                            if (bArr2 != null) {
                                c cVar = new c(a3, bArr2, bVar2.b());
                                if (a3 < 400 || a3 > 499) {
                                    if (a3 >= 500 && a3 <= 599) {
                                        throw new com.anythink.expressad.foundation.g.f.a.a(7, cVar);
                                    }
                                    throw new com.anythink.expressad.foundation.g.f.a.a(2, cVar);
                                }
                                throw new com.anythink.expressad.foundation.g.f.a.a(6, cVar);
                            }
                            throw new com.anythink.expressad.foundation.g.f.a.a(2, null);
                        }
                        throw new com.anythink.expressad.foundation.g.f.a.a(2, null);
                    }
                } catch (IOException e10) {
                    e = e10;
                    bVar2 = null;
                }
            } else {
                iVar.c();
                this.d.b(iVar);
                throw new com.anythink.expressad.foundation.g.f.a.a(-2, null);
            }
        } else {
            String str4 = "SocketTimeoutException ex= ";
            while (!iVar.f()) {
                try {
                    try {
                        iVar.i();
                        bVar = this.c.a(iVar);
                        try {
                            int a4 = bVar.a();
                            bArr = iVar.a(bVar, this.d);
                            try {
                                str = str3;
                                try {
                                    a(SystemClock.elapsedRealtime() - elapsedRealtime, iVar, bArr, a4);
                                    if (a4 >= 200 && a4 <= 399) {
                                        return new c(a4, bArr, bVar.b());
                                    }
                                    throw new IOException();
                                } catch (IOException e11) {
                                    e = e11;
                                    String str5 = str4;
                                    a(str + e.getMessage(), SystemClock.elapsedRealtime() - elapsedRealtime, iVar);
                                    if (bVar == null) {
                                    }
                                }
                            } catch (IOException e12) {
                                e = e12;
                                str = str3;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            str = str3;
                            bArr = null;
                            String str52 = str4;
                            a(str + e.getMessage(), SystemClock.elapsedRealtime() - elapsedRealtime, iVar);
                            if (bVar == null) {
                                int a5 = bVar.a();
                                if (bArr != null) {
                                    c cVar2 = new c(a5, bArr, bVar.b());
                                    if (a5 < 400 || a5 > 499) {
                                        if (a5 >= 500 && a5 <= 599) {
                                            throw new com.anythink.expressad.foundation.g.f.a.a(7, cVar2);
                                        }
                                        throw new com.anythink.expressad.foundation.g.f.a.a(2, cVar2);
                                    }
                                    throw new com.anythink.expressad.foundation.g.f.a.a(6, cVar2);
                                }
                                com.anythink.expressad.foundation.g.f.a.a aVar = new com.anythink.expressad.foundation.g.f.a.a(2, null);
                                if (iVar.l().d()) {
                                    this.d.e(iVar);
                                    str3 = str;
                                    str4 = str52;
                                } else {
                                    throw aVar;
                                }
                            } else {
                                throw new com.anythink.expressad.foundation.g.f.a.a(2, null);
                            }
                        }
                    } catch (ConnectException e14) {
                        long elapsedRealtime9 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        a("ConnectException ex= " + e14.getMessage(), elapsedRealtime9, iVar);
                        throw new com.anythink.expressad.foundation.g.f.a.a(12, null);
                    } catch (MalformedURLException e15) {
                        long elapsedRealtime10 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        a("MalformedURLException ex= " + e15.getMessage(), elapsedRealtime10, iVar);
                        throw new com.anythink.expressad.foundation.g.f.a.a(4, null);
                    } catch (SocketTimeoutException e16) {
                        long elapsedRealtime11 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        a(str4 + e16.getMessage(), elapsedRealtime11, iVar);
                        throw new com.anythink.expressad.foundation.g.f.a.a(10, null);
                    } catch (UnknownHostException e17) {
                        long elapsedRealtime12 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        a("UnknownHostException ex= " + e17.getMessage(), elapsedRealtime12, iVar);
                        throw new com.anythink.expressad.foundation.g.f.a.a(9, null);
                    } catch (SSLProtocolException e18) {
                        long elapsedRealtime13 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        a("SSLProtocolException ex= " + e18.getMessage(), elapsedRealtime13, iVar);
                        throw new com.anythink.expressad.foundation.g.f.a.a(11, null);
                    } catch (ConnectTimeoutException e19) {
                        long elapsedRealtime14 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        a("ConnectTimeoutException ex= " + e19.getMessage(), elapsedRealtime14, iVar);
                        throw new com.anythink.expressad.foundation.g.f.a.a(3, null);
                    }
                } catch (IOException e20) {
                    e = e20;
                    str = str3;
                    bVar = null;
                }
            }
            iVar.c();
            this.d.b(iVar);
            throw new com.anythink.expressad.foundation.g.f.a.a(-2, null);
        }
    }

    private static void a(long j, i<?> iVar, byte[] bArr, int i) {
        if (com.anythink.expressad.a.a) {
            Object obj = pg1.d;
            if (j > m.af) {
                try {
                    String str = a;
                    Object[] objArr = new Object[6];
                    objArr[0] = iVar.d();
                    objArr[1] = Integer.valueOf(iVar.a());
                    objArr[2] = Long.valueOf(j);
                    if (bArr != null) {
                        obj = Integer.valueOf(bArr.length);
                    }
                    objArr[3] = obj;
                    objArr[4] = Integer.valueOf(i);
                    objArr[5] = Integer.valueOf(iVar.l().c());
                    n.b(str, String.format("Slow HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", objArr));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            try {
                String str2 = a;
                Object[] objArr2 = new Object[6];
                objArr2[0] = iVar.d();
                objArr2[1] = Integer.valueOf(iVar.a());
                objArr2[2] = Long.valueOf(j);
                if (bArr != null) {
                    obj = Integer.valueOf(bArr.length);
                }
                objArr2[3] = obj;
                objArr2[4] = Integer.valueOf(i);
                objArr2[5] = Integer.valueOf(iVar.l().c());
                n.b(str2, String.format("Normal HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", objArr2));
            } catch (Exception unused2) {
            }
        }
    }

    private static void a(String str, long j, i<?> iVar) {
        if (com.anythink.expressad.a.a) {
            try {
                String str2 = a;
                Object[] objArr = new Object[4];
                objArr[0] = iVar.d();
                objArr[1] = Long.valueOf(j);
                if (str == null) {
                    str = pg1.d;
                }
                objArr[2] = str;
                objArr[3] = Integer.valueOf(iVar.l().c());
                n.b(str2, String.format("HTTP exception for request=<%s> [lifetime=%d], [size=%s], [retryCount=%s]", objArr));
            } catch (Exception unused) {
            }
        }
    }

    private void a(i<?> iVar, com.anythink.expressad.foundation.g.f.a.a aVar) {
        if (iVar.l().d()) {
            this.d.e(iVar);
            return;
        }
        throw aVar;
    }
}