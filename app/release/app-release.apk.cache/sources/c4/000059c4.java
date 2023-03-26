package com.p7700g.p99005;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.p7700g.p99005.rd1;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import org.xbill.DNS.AAAARecord;
import org.xbill.DNS.ARecord;
import org.xbill.DNS.DecorableProtectedResolver;
import org.xbill.DNS.DecorateInfo;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.SocketDecorator;
import org.xbill.DNS.TextParseException;

/* compiled from: ProtectedDns.java */
/* loaded from: classes2.dex */
public class rd1 implements uq5 {
    @x1
    private static final kj1 c = kj1.b("ProtectedDns");
    @x1
    private final td1 d;

    private rd1(@x1 td1 td1Var) {
        this.d = td1Var;
    }

    @x1
    private InetAddress d(@x1 String str, @x1 Record record) throws UnknownHostException {
        InetAddress address;
        if (record instanceof ARecord) {
            address = ((ARecord) record).getAddress();
        } else {
            address = ((AAAARecord) record).getAddress();
        }
        return InetAddress.getByAddress(str, address.getAddress());
    }

    @z1
    public static rd1 e(@x1 Context context, @x1 td1 td1Var) {
        try {
            Lookup.refreshDefault(context);
            return new rd1(td1Var);
        } catch (Throwable th) {
            c.f(th);
            return null;
        }
    }

    @x1
    private InetAddress[] f(@x1 String str) throws UnknownHostException {
        Record[] g = g(str);
        InetAddress[] inetAddressArr = new InetAddress[g.length];
        for (int i = 0; i < g.length; i++) {
            inetAddressArr[i] = d(str, g[i]);
        }
        return inetAddressArr;
    }

    @x1
    private Record[] g(@x1 String str) throws UnknownHostException {
        try {
            Lookup lookup = new Lookup(str, 1);
            DecorableProtectedResolver create = DecorableProtectedResolver.create("8.8.8.8", new a());
            create.setTimeout(3);
            lookup.setResolver(create);
            Record[] run = lookup.run();
            if (run == null) {
                if (lookup.getResult() == 4) {
                    Lookup lookup2 = new Lookup(str, 28);
                    lookup2.setResolver(create);
                    Record[] run2 = lookup2.run();
                    if (run2 != null) {
                        return run2;
                    }
                }
                throw new UnknownHostException(str);
            }
            Lookup lookup3 = new Lookup(str, 28);
            lookup3.setResolver(create);
            Record[] run3 = lookup3.run();
            if (run3 == null) {
                return run;
            }
            Record[] recordArr = new Record[run.length + run3.length];
            System.arraycopy(run, 0, recordArr, 0, run.length);
            System.arraycopy(run3, 0, recordArr, run.length, run3.length);
            return recordArr;
        } catch (TextParseException unused) {
            throw new UnknownHostException(str);
        }
    }

    @Override // com.p7700g.p99005.uq5
    @x1
    public List<InetAddress> a(@x1 String str) throws UnknownHostException {
        return Arrays.asList(f(str));
    }

    /* compiled from: ProtectedDns.java */
    /* loaded from: classes2.dex */
    public class a implements SocketDecorator {
        public a() {
            rd1.this = r1;
        }

        @x1
        private DecorateInfo a(@x1 final ParcelFileDescriptor parcelFileDescriptor) {
            rd1.this.d.k(parcelFileDescriptor);
            return new DecorateInfo() { // from class: com.p7700g.p99005.ed1
                @Override // org.xbill.DNS.DecorateInfo
                public final void close() {
                    rd1.a.b(parcelFileDescriptor);
                }
            };
        }

        public static /* synthetic */ void b(ParcelFileDescriptor parcelFileDescriptor) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                rd1.c.f(e);
            }
        }

        public static /* synthetic */ void c() {
        }

        public static /* synthetic */ void d() {
        }

        @Override // org.xbill.DNS.SocketDecorator
        @x1
        public DecorateInfo decorate(@x1 Socket socket) {
            try {
                return a(ParcelFileDescriptor.fromSocket(socket));
            } catch (Throwable unused) {
                return fd1.a;
            }
        }

        @Override // org.xbill.DNS.SocketDecorator
        @x1
        public DecorateInfo decorate(@x1 DatagramSocket datagramSocket) {
            try {
                return a(ParcelFileDescriptor.fromDatagramSocket(datagramSocket));
            } catch (Throwable unused) {
                return dd1.a;
            }
        }
    }
}