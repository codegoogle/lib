package org.xbill.DNS;

import com.p7700g.p99005.h95;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import org.xbill.DNS.Tokenizer;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public abstract class Record implements Cloneable, Comparable<Record>, Serializable {
    private static final DecimalFormat byteFormat;
    private static final long serialVersionUID = 2694906050116005466L;
    public int dclass;
    public Name name;
    public long ttl;
    public int type;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        byteFormat = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    public Record() {
    }

    public static byte[] byteArrayFromString(String str) throws TextParseException {
        boolean z;
        byte[] bytes = str.getBytes();
        int i = 0;
        while (true) {
            if (i >= bytes.length) {
                z = false;
                break;
            } else if (bytes[i] == 92) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            if (bytes.length <= 255) {
                return bytes;
            }
            throw new TextParseException("text string too long");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        for (int i4 = 0; i4 < bytes.length; i4++) {
            byte b = bytes[i4];
            if (z2) {
                if (b >= 48 && b <= 57 && i2 < 3) {
                    i2++;
                    i3 = (i3 * 10) + (b - 48);
                    if (i3 > 255) {
                        throw new TextParseException("bad escape");
                    }
                    if (i2 >= 3) {
                        b = (byte) i3;
                    }
                } else if (i2 > 0 && i2 < 3) {
                    throw new TextParseException("bad escape");
                }
                byteArrayOutputStream.write(b);
                z2 = false;
            } else if (bytes[i4] == 92) {
                i2 = 0;
                z2 = true;
                i3 = 0;
            } else {
                byteArrayOutputStream.write(bytes[i4]);
            }
        }
        if (i2 > 0 && i2 < 3) {
            throw new TextParseException("bad escape");
        }
        if (byteArrayOutputStream.toByteArray().length <= 255) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new TextParseException("text string too long");
    }

    public static String byteArrayToString(byte[] bArr, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        if (z) {
            stringBuffer.append(h95.b);
        }
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 32 || i >= 127) {
                stringBuffer.append('\\');
                stringBuffer.append(byteFormat.format(i));
            } else if (i != 34 && i != 92) {
                stringBuffer.append((char) i);
            } else {
                stringBuffer.append('\\');
                stringBuffer.append((char) i);
            }
        }
        if (z) {
            stringBuffer.append(h95.b);
        }
        return stringBuffer.toString();
    }

    public static byte[] checkByteArrayLength(String str, byte[] bArr, int i) {
        if (bArr.length <= 65535) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new IllegalArgumentException("\"" + str + "\" array must have no more than " + i + " elements");
    }

    public static Name checkName(String str, Name name) {
        if (name.isAbsolute()) {
            return name;
        }
        throw new RelativeNameException(name);
    }

    public static int checkU16(String str, int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 16 bit value");
        }
        return i;
    }

    public static long checkU32(String str, long j) {
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("\"" + str + "\" " + j + " must be an unsigned 32 bit value");
        }
        return j;
    }

    public static int checkU8(String str, int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 8 bit value");
        }
        return i;
    }

    public static Record fromString(Name name, int i, int i2, long j, Tokenizer tokenizer, Name name2) throws IOException {
        if (name.isAbsolute()) {
            Type.check(i);
            DClass.check(i2);
            TTL.check(j);
            Tokenizer.Token token = tokenizer.get();
            if (token.type == 3 && token.value.equals("\\#")) {
                int uInt16 = tokenizer.getUInt16();
                byte[] hex = tokenizer.getHex();
                if (hex == null) {
                    hex = new byte[0];
                }
                if (uInt16 == hex.length) {
                    return newRecord(name, i, i2, j, uInt16, new DNSInput(hex));
                }
                throw tokenizer.exception("invalid unknown RR encoding: length mismatch");
            }
            tokenizer.unget();
            Record emptyRecord = getEmptyRecord(name, i, i2, j, true);
            emptyRecord.rdataFromString(tokenizer, name2);
            int i3 = tokenizer.get().type;
            if (i3 == 1 || i3 == 0) {
                return emptyRecord;
            }
            throw tokenizer.exception("unexpected tokens at end of record");
        }
        throw new RelativeNameException(name);
    }

    public static Record fromWire(DNSInput dNSInput, int i, boolean z) throws IOException {
        Name name = new Name(dNSInput);
        int readU16 = dNSInput.readU16();
        int readU162 = dNSInput.readU16();
        if (i == 0) {
            return newRecord(name, readU16, readU162);
        }
        long readU32 = dNSInput.readU32();
        int readU163 = dNSInput.readU16();
        if (readU163 == 0 && z && (i == 1 || i == 2)) {
            return newRecord(name, readU16, readU162, readU32);
        }
        return newRecord(name, readU16, readU162, readU32, readU163, dNSInput);
    }

    private static final Record getEmptyRecord(Name name, int i, int i2, long j, boolean z) {
        Record emptyRecord;
        if (z) {
            Record proto = Type.getProto(i);
            if (proto != null) {
                emptyRecord = proto.getObject();
            } else {
                emptyRecord = new UNKRecord();
            }
        } else {
            emptyRecord = new EmptyRecord();
        }
        emptyRecord.name = name;
        emptyRecord.type = i;
        emptyRecord.dclass = i2;
        emptyRecord.ttl = j;
        return emptyRecord;
    }

    private static Record newRecord(Name name, int i, int i2, long j, int i3, DNSInput dNSInput) throws IOException {
        Record emptyRecord = getEmptyRecord(name, i, i2, j, dNSInput != null);
        if (dNSInput != null) {
            if (dNSInput.remaining() >= i3) {
                dNSInput.setActive(i3);
                emptyRecord.rrFromWire(dNSInput);
                if (dNSInput.remaining() <= 0) {
                    dNSInput.clearActive();
                } else {
                    throw new WireParseException("invalid record length");
                }
            } else {
                throw new WireParseException("truncated record");
            }
        }
        return emptyRecord;
    }

    private void toWireCanonical(DNSOutput dNSOutput, boolean z) {
        this.name.toWireCanonical(dNSOutput);
        dNSOutput.writeU16(this.type);
        dNSOutput.writeU16(this.dclass);
        if (z) {
            dNSOutput.writeU32(0L);
        } else {
            dNSOutput.writeU32(this.ttl);
        }
        int current = dNSOutput.current();
        dNSOutput.writeU16(0);
        rrToWire(dNSOutput, null, true);
        dNSOutput.writeU16At((dNSOutput.current() - current) - 2, current);
    }

    public static String unknownToString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\\# ");
        stringBuffer.append(bArr.length);
        stringBuffer.append(" ");
        stringBuffer.append(base16.toString(bArr));
        return stringBuffer.toString();
    }

    public Record cloneRecord() {
        try {
            return (Record) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Record)) {
            Record record = (Record) obj;
            if (this.type == record.type && this.dclass == record.dclass && this.name.equals(record.name)) {
                return Arrays.equals(rdataToWireCanonical(), record.rdataToWireCanonical());
            }
        }
        return false;
    }

    public Name getAdditionalName() {
        return null;
    }

    public int getDClass() {
        return this.dclass;
    }

    public Name getName() {
        return this.name;
    }

    public abstract Record getObject();

    public int getRRsetType() {
        int i = this.type;
        return i == 46 ? ((RRSIGRecord) this).getTypeCovered() : i;
    }

    public long getTTL() {
        return this.ttl;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i = 0;
        for (byte b : toWireCanonical(true)) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public abstract void rdataFromString(Tokenizer tokenizer, Name name) throws IOException;

    public String rdataToString() {
        return rrToString();
    }

    public byte[] rdataToWireCanonical() {
        DNSOutput dNSOutput = new DNSOutput();
        rrToWire(dNSOutput, null, true);
        return dNSOutput.toByteArray();
    }

    public abstract void rrFromWire(DNSInput dNSInput) throws IOException;

    public abstract String rrToString();

    public abstract void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z);

    public boolean sameRRset(Record record) {
        return getRRsetType() == record.getRRsetType() && this.dclass == record.dclass && this.name.equals(record.name);
    }

    public void setTTL(long j) {
        this.ttl = j;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.name);
        if (stringBuffer.length() < 8) {
            stringBuffer.append("\t");
        }
        if (stringBuffer.length() < 16) {
            stringBuffer.append("\t");
        }
        stringBuffer.append("\t");
        if (Options.check("BINDTTL")) {
            stringBuffer.append(TTL.format(this.ttl));
        } else {
            stringBuffer.append(this.ttl);
        }
        stringBuffer.append("\t");
        if (this.dclass != 1 || !Options.check("noPrintIN")) {
            stringBuffer.append(DClass.string(this.dclass));
            stringBuffer.append("\t");
        }
        stringBuffer.append(Type.string(this.type));
        String rrToString = rrToString();
        if (!rrToString.equals("")) {
            stringBuffer.append("\t");
            stringBuffer.append(rrToString);
        }
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput, int i, Compression compression) {
        this.name.toWire(dNSOutput, compression);
        dNSOutput.writeU16(this.type);
        dNSOutput.writeU16(this.dclass);
        if (i == 0) {
            return;
        }
        dNSOutput.writeU32(this.ttl);
        int current = dNSOutput.current();
        dNSOutput.writeU16(0);
        rrToWire(dNSOutput, compression, false);
        dNSOutput.writeU16At((dNSOutput.current() - current) - 2, current);
    }

    public Record withDClass(int i, long j) {
        Record cloneRecord = cloneRecord();
        cloneRecord.dclass = i;
        cloneRecord.ttl = j;
        return cloneRecord;
    }

    public Record withName(Name name) {
        if (name.isAbsolute()) {
            Record cloneRecord = cloneRecord();
            cloneRecord.name = name;
            return cloneRecord;
        }
        throw new RelativeNameException(name);
    }

    public Record(Name name, int i, int i2, long j) {
        if (name.isAbsolute()) {
            Type.check(i);
            DClass.check(i2);
            TTL.check(j);
            this.name = name;
            this.type = i;
            this.dclass = i2;
            this.ttl = j;
            return;
        }
        throw new RelativeNameException(name);
    }

    @Override // java.lang.Comparable
    public int compareTo(Record record) {
        if (this == record) {
            return 0;
        }
        int compareTo = this.name.compareTo(record.name);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = this.dclass - record.dclass;
        if (i != 0) {
            return i;
        }
        int i2 = this.type - record.type;
        if (i2 != 0) {
            return i2;
        }
        byte[] rdataToWireCanonical = rdataToWireCanonical();
        byte[] rdataToWireCanonical2 = record.rdataToWireCanonical();
        for (int i3 = 0; i3 < rdataToWireCanonical.length && i3 < rdataToWireCanonical2.length; i3++) {
            int i4 = (rdataToWireCanonical[i3] & 255) - (rdataToWireCanonical2[i3] & 255);
            if (i4 != 0) {
                return i4;
            }
        }
        return rdataToWireCanonical.length - rdataToWireCanonical2.length;
    }

    public static Record fromWire(DNSInput dNSInput, int i) throws IOException {
        return fromWire(dNSInput, i, false);
    }

    public static Record newRecord(Name name, int i, int i2, long j, int i3, byte[] bArr) {
        if (name.isAbsolute()) {
            Type.check(i);
            DClass.check(i2);
            TTL.check(j);
            try {
                return newRecord(name, i, i2, j, i3, bArr != null ? new DNSInput(bArr) : null);
            } catch (IOException unused) {
                return null;
            }
        }
        throw new RelativeNameException(name);
    }

    public static Record fromWire(byte[] bArr, int i) throws IOException {
        return fromWire(new DNSInput(bArr), i, false);
    }

    public byte[] toWire(int i) {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput, i, null);
        return dNSOutput.toByteArray();
    }

    private byte[] toWireCanonical(boolean z) {
        DNSOutput dNSOutput = new DNSOutput();
        toWireCanonical(dNSOutput, z);
        return dNSOutput.toByteArray();
    }

    public byte[] toWireCanonical() {
        return toWireCanonical(false);
    }

    public static Record newRecord(Name name, int i, int i2, long j, byte[] bArr) {
        return newRecord(name, i, i2, j, bArr.length, bArr);
    }

    public static Record newRecord(Name name, int i, int i2, long j) {
        if (name.isAbsolute()) {
            Type.check(i);
            DClass.check(i2);
            TTL.check(j);
            return getEmptyRecord(name, i, i2, j, false);
        }
        throw new RelativeNameException(name);
    }

    public static Record fromString(Name name, int i, int i2, long j, String str, Name name2) throws IOException {
        return fromString(name, i, i2, j, new Tokenizer(str), name2);
    }

    public static Record newRecord(Name name, int i, int i2) {
        return newRecord(name, i, i2, 0L);
    }
}