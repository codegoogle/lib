package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public class ClientSubnetOption extends EDNSOption {
    private static final long serialVersionUID = -3868158449890266347L;
    private InetAddress address;
    private int family;
    private int scopeNetmask;
    private int sourceNetmask;

    public ClientSubnetOption() {
        super(8);
    }

    private static int checkMaskLength(String str, int i, int i2) {
        int addressLength = Address.addressLength(i) * 8;
        if (i2 < 0 || i2 > addressLength) {
            StringBuilder sb = new StringBuilder();
            sb.append("\"");
            sb.append(str);
            sb.append("\" ");
            sb.append(i2);
            sb.append(" must be in the range [0..");
            throw new IllegalArgumentException(wo1.z(sb, addressLength, "]"));
        }
        return i2;
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public int getFamily() {
        return this.family;
    }

    public int getScopeNetmask() {
        return this.scopeNetmask;
    }

    public int getSourceNetmask() {
        return this.sourceNetmask;
    }

    @Override // org.xbill.DNS.EDNSOption
    public void optionFromWire(DNSInput dNSInput) throws WireParseException {
        int readU16 = dNSInput.readU16();
        this.family = readU16;
        if (readU16 != 1 && readU16 != 2) {
            throw new WireParseException("unknown address family");
        }
        int readU8 = dNSInput.readU8();
        this.sourceNetmask = readU8;
        if (readU8 <= Address.addressLength(this.family) * 8) {
            int readU82 = dNSInput.readU8();
            this.scopeNetmask = readU82;
            if (readU82 <= Address.addressLength(this.family) * 8) {
                byte[] readByteArray = dNSInput.readByteArray();
                if (readByteArray.length == (this.sourceNetmask + 7) / 8) {
                    byte[] bArr = new byte[Address.addressLength(this.family)];
                    System.arraycopy(readByteArray, 0, bArr, 0, readByteArray.length);
                    try {
                        InetAddress byAddress = InetAddress.getByAddress(bArr);
                        this.address = byAddress;
                        if (!Address.truncate(byAddress, this.sourceNetmask).equals(this.address)) {
                            throw new WireParseException("invalid padding");
                        }
                        return;
                    } catch (UnknownHostException e) {
                        throw new WireParseException("invalid address", e);
                    }
                }
                throw new WireParseException("invalid address");
            }
            throw new WireParseException("invalid scope netmask");
        }
        throw new WireParseException("invalid source netmask");
    }

    @Override // org.xbill.DNS.EDNSOption
    public String optionToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.address.getHostAddress());
        stringBuffer.append("/");
        stringBuffer.append(this.sourceNetmask);
        stringBuffer.append(", scope netmask ");
        stringBuffer.append(this.scopeNetmask);
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.EDNSOption
    public void optionToWire(DNSOutput dNSOutput) {
        dNSOutput.writeU16(this.family);
        dNSOutput.writeU8(this.sourceNetmask);
        dNSOutput.writeU8(this.scopeNetmask);
        dNSOutput.writeByteArray(this.address.getAddress(), 0, (this.sourceNetmask + 7) / 8);
    }

    public ClientSubnetOption(int i, int i2, InetAddress inetAddress) {
        super(8);
        int familyOf = Address.familyOf(inetAddress);
        this.family = familyOf;
        this.sourceNetmask = checkMaskLength("source netmask", familyOf, i);
        this.scopeNetmask = checkMaskLength("scope netmask", this.family, i2);
        InetAddress truncate = Address.truncate(inetAddress, i);
        this.address = truncate;
        if (!inetAddress.equals(truncate)) {
            throw new IllegalArgumentException("source netmask is not valid for address");
        }
    }

    public ClientSubnetOption(int i, InetAddress inetAddress) {
        this(i, 0, inetAddress);
    }
}