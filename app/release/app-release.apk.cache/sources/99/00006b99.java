package org.xbill.DNS.spi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import org.xbill.DNS.AAAARecord;
import org.xbill.DNS.ARecord;
import org.xbill.DNS.ExtendedResolver;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Name;
import org.xbill.DNS.PTRRecord;
import org.xbill.DNS.Record;
import org.xbill.DNS.ReverseMap;
import org.xbill.DNS.TextParseException;

/* loaded from: classes4.dex */
public class DNSJavaNameService implements InvocationHandler {
    private static final String domainProperty = "sun.net.spi.nameservice.domain";
    private static final String nsProperty = "sun.net.spi.nameservice.nameservers";
    private static final String v6Property = "java.net.preferIPv6Addresses";
    private boolean preferV6;

    public DNSJavaNameService() {
        this.preferV6 = false;
        String property = System.getProperty(nsProperty);
        String property2 = System.getProperty(domainProperty);
        String property3 = System.getProperty(v6Property);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            String[] strArr = new String[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                strArr[i] = stringTokenizer.nextToken();
                i++;
            }
            try {
                Lookup.setDefaultResolver(new ExtendedResolver(strArr));
            } catch (UnknownHostException unused) {
                System.err.println("DNSJavaNameService: invalid sun.net.spi.nameservice.nameservers");
            }
        }
        if (property2 != null) {
            try {
                Lookup.setDefaultSearchPath(new String[]{property2});
            } catch (TextParseException unused2) {
                System.err.println("DNSJavaNameService: invalid sun.net.spi.nameservice.domain");
            }
        }
        if (property3 == null || !property3.equalsIgnoreCase("true")) {
            return;
        }
        this.preferV6 = true;
    }

    public String getHostByAddr(byte[] bArr) throws UnknownHostException {
        Record[] run = new Lookup(ReverseMap.fromAddress(InetAddress.getByAddress(bArr)), 12).run();
        if (run != null) {
            return ((PTRRecord) run[0]).getTarget().toString();
        }
        throw new UnknownHostException();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals("getHostByAddr")) {
                return getHostByAddr((byte[]) objArr[0]);
            }
            if (method.getName().equals("lookupAllHostAddr")) {
                InetAddress[] lookupAllHostAddr = lookupAllHostAddr((String) objArr[0]);
                Class<?> returnType = method.getReturnType();
                if (returnType.equals(InetAddress[].class)) {
                    return lookupAllHostAddr;
                }
                if (returnType.equals(byte[][].class)) {
                    int length = lookupAllHostAddr.length;
                    byte[][] bArr = new byte[length];
                    for (int i = 0; i < length; i++) {
                        bArr[i] = lookupAllHostAddr[i].getAddress();
                    }
                    return bArr;
                }
            }
            throw new IllegalArgumentException("Unknown function name or arguments.");
        } catch (Throwable th) {
            System.err.println("DNSJavaNameService: Unexpected error.");
            th.printStackTrace();
            throw th;
        }
    }

    public InetAddress[] lookupAllHostAddr(String str) throws UnknownHostException {
        try {
            Name name = new Name(str);
            Record[] run = this.preferV6 ? new Lookup(name, 28).run() : null;
            if (run == null) {
                run = new Lookup(name, 1).run();
            }
            if (run == null && !this.preferV6) {
                run = new Lookup(name, 28).run();
            }
            if (run != null) {
                InetAddress[] inetAddressArr = new InetAddress[run.length];
                for (int i = 0; i < run.length; i++) {
                    Record record = run[i];
                    if (run[i] instanceof ARecord) {
                        inetAddressArr[i] = ((ARecord) run[i]).getAddress();
                    } else {
                        inetAddressArr[i] = ((AAAARecord) run[i]).getAddress();
                    }
                }
                return inetAddressArr;
            }
            throw new UnknownHostException(str);
        } catch (TextParseException unused) {
            throw new UnknownHostException(str);
        }
    }
}