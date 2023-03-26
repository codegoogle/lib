package org.xbill.DNS;

import com.p7700g.p99005.gl4;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.xbill.DNS.utils.base16;
import org.xbill.DNS.utils.base32;

/* loaded from: classes4.dex */
public class NSEC3Record extends Record {
    public static final int SHA1_DIGEST_ID = 1;
    private static final base32 b32 = new base32(base32.Alphabet.BASE32HEX, false, false);
    private static final long serialVersionUID = -7123504635968932855L;
    private int flags;
    private int hashAlg;
    private int iterations;
    private byte[] next;
    private byte[] salt;
    private TypeBitmap types;

    /* loaded from: classes4.dex */
    public static class Digest {
        public static final int SHA1 = 1;

        private Digest() {
        }
    }

    /* loaded from: classes4.dex */
    public static class Flags {
        public static final int OPT_OUT = 1;

        private Flags() {
        }
    }

    public NSEC3Record() {
    }

    public static byte[] hashName(Name name, int i, int i2, byte[] bArr) throws NoSuchAlgorithmException {
        if (i == 1) {
            MessageDigest messageDigest = MessageDigest.getInstance("sha-1");
            byte[] bArr2 = null;
            for (int i3 = 0; i3 <= i2; i3++) {
                messageDigest.reset();
                if (i3 == 0) {
                    messageDigest.update(name.toWireCanonical());
                } else {
                    messageDigest.update(bArr2);
                }
                if (bArr != null) {
                    messageDigest.update(bArr);
                }
                bArr2 = messageDigest.digest();
            }
            return bArr2;
        }
        throw new NoSuchAlgorithmException(wo1.l("Unknown NSEC3 algorithmidentifier: ", i));
    }

    public int getFlags() {
        return this.flags;
    }

    public int getHashAlgorithm() {
        return this.hashAlg;
    }

    public int getIterations() {
        return this.iterations;
    }

    public byte[] getNext() {
        return this.next;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NSEC3Record();
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public int[] getTypes() {
        return this.types.toArray();
    }

    public boolean hasType(int i) {
        return this.types.contains(i);
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.hashAlg = tokenizer.getUInt8();
        this.flags = tokenizer.getUInt8();
        this.iterations = tokenizer.getUInt16();
        if (tokenizer.getString().equals("-")) {
            this.salt = null;
        } else {
            tokenizer.unget();
            byte[] hexString = tokenizer.getHexString();
            this.salt = hexString;
            if (hexString.length > 255) {
                throw tokenizer.exception("salt value too long");
            }
        }
        this.next = tokenizer.getBase32String(b32);
        this.types = new TypeBitmap(tokenizer);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.hashAlg = dNSInput.readU8();
        this.flags = dNSInput.readU8();
        this.iterations = dNSInput.readU16();
        int readU8 = dNSInput.readU8();
        if (readU8 > 0) {
            this.salt = dNSInput.readByteArray(readU8);
        } else {
            this.salt = null;
        }
        this.next = dNSInput.readByteArray(dNSInput.readU8());
        this.types = new TypeBitmap(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.hashAlg);
        stringBuffer.append(gl4.R);
        stringBuffer.append(this.flags);
        stringBuffer.append(gl4.R);
        stringBuffer.append(this.iterations);
        stringBuffer.append(gl4.R);
        byte[] bArr = this.salt;
        if (bArr == null) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append(base16.toString(bArr));
        }
        stringBuffer.append(gl4.R);
        stringBuffer.append(b32.toString(this.next));
        if (!this.types.empty()) {
            stringBuffer.append(gl4.R);
            stringBuffer.append(this.types.toString());
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(this.hashAlg);
        dNSOutput.writeU8(this.flags);
        dNSOutput.writeU16(this.iterations);
        byte[] bArr = this.salt;
        if (bArr != null) {
            dNSOutput.writeU8(bArr.length);
            dNSOutput.writeByteArray(this.salt);
        } else {
            dNSOutput.writeU8(0);
        }
        dNSOutput.writeU8(this.next.length);
        dNSOutput.writeByteArray(this.next);
        this.types.toWire(dNSOutput);
    }

    public NSEC3Record(Name name, int i, long j, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, int[] iArr) {
        super(name, 50, i, j);
        this.hashAlg = Record.checkU8("hashAlg", i2);
        this.flags = Record.checkU8("flags", i3);
        this.iterations = Record.checkU16("iterations", i4);
        if (bArr != null) {
            if (bArr.length <= 255) {
                if (bArr.length > 0) {
                    byte[] bArr3 = new byte[bArr.length];
                    this.salt = bArr3;
                    System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                }
            } else {
                throw new IllegalArgumentException("Invalid salt");
            }
        }
        if (bArr2.length <= 255) {
            byte[] bArr4 = new byte[bArr2.length];
            this.next = bArr4;
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            this.types = new TypeBitmap(iArr);
            return;
        }
        throw new IllegalArgumentException("Invalid next hash");
    }

    public byte[] hashName(Name name) throws NoSuchAlgorithmException {
        return hashName(name, this.hashAlg, this.iterations, this.salt);
    }
}