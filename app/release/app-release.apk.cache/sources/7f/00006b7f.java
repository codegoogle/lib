package org.xbill.DNS;

import com.p7700g.p99005.av5;
import com.p7700g.p99005.wo1;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbill.DNS.utils.base16;
import org.xbill.DNS.utils.base32;
import org.xbill.DNS.utils.base64;

/* loaded from: classes4.dex */
public class Tokenizer {
    public static final int COMMENT = 5;
    public static final int EOF = 0;
    public static final int EOL = 1;
    public static final int IDENTIFIER = 3;
    public static final int QUOTED_STRING = 4;
    public static final int WHITESPACE = 2;
    private static String delim = " \t\n;()\"";
    private static String quotes = "\"";
    private Token current;
    private String delimiters;
    private String filename;
    private PushbackInputStream is;
    private int line;
    private int multiline;
    private boolean quoting;
    private StringBuffer sb;
    private boolean ungottenToken;
    private boolean wantClose;

    /* loaded from: classes4.dex */
    public static class Token {
        public int type;
        public String value;

        /* JADX INFO: Access modifiers changed from: private */
        public Token set(int i, StringBuffer stringBuffer) {
            if (i >= 0) {
                this.type = i;
                this.value = stringBuffer == null ? null : stringBuffer.toString();
                return this;
            }
            throw new IllegalArgumentException();
        }

        public boolean isEOL() {
            int i = this.type;
            return i == 1 || i == 0;
        }

        public boolean isString() {
            int i = this.type;
            return i == 3 || i == 4;
        }

        public String toString() {
            int i = this.type;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return i != 5 ? "<unknown>" : wo1.C(wo1.G("<comment: "), this.value, ">");
                            }
                            return wo1.C(wo1.G("<quoted_string: "), this.value, ">");
                        }
                        return wo1.C(wo1.G("<identifier: "), this.value, ">");
                    }
                    return "<whitespace>";
                }
                return "<eol>";
            }
            return "<eof>";
        }

        private Token() {
            this.type = -1;
            this.value = null;
        }
    }

    /* loaded from: classes4.dex */
    public static class TokenizerException extends TextParseException {
        public String message;

        public TokenizerException(String str, int i, String str2) {
            super(str + ":" + i + ": " + str2);
            this.message = str2;
        }

        public String getBaseMessage() {
            return this.message;
        }
    }

    public Tokenizer(InputStream inputStream) {
        this.is = new PushbackInputStream(inputStream instanceof BufferedInputStream ? inputStream : new BufferedInputStream(inputStream), 2);
        this.ungottenToken = false;
        this.multiline = 0;
        this.quoting = false;
        this.delimiters = delim;
        this.current = new Token();
        this.sb = new StringBuffer();
        this.filename = "<none>";
        this.line = 1;
    }

    private String _getIdentifier(String str) throws IOException {
        Token token = get();
        if (token.type == 3) {
            return token.value;
        }
        throw wo1.X("expected ", str, this);
    }

    private void checkUnbalancedParens() throws TextParseException {
        if (this.multiline > 0) {
            throw exception("unbalanced parentheses");
        }
    }

    private int getChar() throws IOException {
        int read = this.is.read();
        if (read == 13) {
            int read2 = this.is.read();
            if (read2 != 10) {
                this.is.unread(read2);
            }
            read = 10;
        }
        if (read == 10) {
            this.line++;
        }
        return read;
    }

    private String remainingStrings() throws IOException {
        StringBuffer stringBuffer = null;
        while (true) {
            Token token = get();
            if (!token.isString()) {
                break;
            }
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            stringBuffer.append(token.value);
        }
        unget();
        if (stringBuffer == null) {
            return null;
        }
        return stringBuffer.toString();
    }

    private int skipWhitespace() throws IOException {
        int i;
        int i2;
        while (true) {
            i2 = getChar();
            i = (i2 == 32 || i2 == 9 || (i2 == 10 && this.multiline > 0)) ? i + 1 : 0;
        }
        ungetChar(i2);
        return i;
    }

    private void ungetChar(int i) throws IOException {
        if (i == -1) {
            return;
        }
        this.is.unread(i);
        if (i == 10) {
            this.line--;
        }
    }

    public void close() {
        if (this.wantClose) {
            try {
                this.is.close();
            } catch (IOException unused) {
            }
        }
    }

    public TextParseException exception(String str) {
        return new TokenizerException(this.filename, this.line, str);
    }

    public void finalize() {
        close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0139, code lost:
        ungetChar(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0142, code lost:
        if (r9.sb.length() != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0144, code lost:
        if (r10 == 4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0146, code lost:
        checkUnbalancedParens();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014f, code lost:
        return r9.current.set(0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0158, code lost:
        return r9.current.set(r10, r9.sb);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Token get(boolean z, boolean z2) throws IOException {
        int i;
        if (this.ungottenToken) {
            this.ungottenToken = false;
            Token token = this.current;
            int i2 = token.type;
            if (i2 == 2) {
                if (z) {
                    return token;
                }
            } else if (i2 != 5) {
                if (i2 == 1) {
                    this.line++;
                }
                return token;
            } else if (z2) {
                return token;
            }
        }
        if (skipWhitespace() > 0 && z) {
            return this.current.set(2, null);
        }
        int i3 = 3;
        this.sb.setLength(0);
        while (true) {
            int i4 = getChar();
            if (i4 != -1 && this.delimiters.indexOf(i4) == -1) {
                if (i4 == 92) {
                    i4 = getChar();
                    if (i4 != -1) {
                        this.sb.append('\\');
                    } else {
                        throw exception("unterminated escape sequence");
                    }
                } else if (this.quoting && i4 == 10) {
                    throw exception("newline in quoted string");
                }
                this.sb.append((char) i4);
            } else if (i4 == -1) {
                if (this.quoting) {
                    throw exception("EOF in quoted string");
                }
                return this.sb.length() == 0 ? this.current.set(0, null) : this.current.set(i3, this.sb);
            } else if (this.sb.length() != 0 || i3 == 4) {
                break;
            } else if (i4 == 40) {
                this.multiline++;
                skipWhitespace();
            } else if (i4 == 41) {
                int i5 = this.multiline;
                if (i5 > 0) {
                    this.multiline = i5 - 1;
                    skipWhitespace();
                } else {
                    throw exception("invalid close parenthesis");
                }
            } else if (i4 == 34) {
                if (!this.quoting) {
                    this.quoting = true;
                    this.delimiters = quotes;
                    i3 = 4;
                } else {
                    this.quoting = false;
                    this.delimiters = delim;
                    skipWhitespace();
                }
            } else if (i4 == 10) {
                return this.current.set(1, null);
            } else {
                if (i4 != 59) {
                    throw new IllegalStateException();
                }
                while (true) {
                    i = getChar();
                    if (i == 10 || i == -1) {
                        break;
                    }
                    this.sb.append((char) i);
                }
                if (z2) {
                    ungetChar(i);
                    return this.current.set(5, this.sb);
                } else if (i == -1 && i3 != 4) {
                    checkUnbalancedParens();
                    return this.current.set(0, null);
                } else if (this.multiline <= 0) {
                    return this.current.set(1, null);
                } else {
                    skipWhitespace();
                    this.sb.setLength(0);
                }
            }
        }
    }

    public InetAddress getAddress(int i) throws IOException {
        try {
            return Address.getByAddress(_getIdentifier("an address"), i);
        } catch (UnknownHostException e) {
            throw exception(e.getMessage());
        }
    }

    public byte[] getAddressBytes(int i) throws IOException {
        String _getIdentifier = _getIdentifier("an address");
        byte[] byteArray = Address.toByteArray(_getIdentifier, i);
        if (byteArray != null) {
            return byteArray;
        }
        throw wo1.X("Invalid address: ", _getIdentifier, this);
    }

    public byte[] getBase32String(base32 base32Var) throws IOException {
        byte[] fromString = base32Var.fromString(_getIdentifier("a base32 string"));
        if (fromString != null) {
            return fromString;
        }
        throw exception("invalid base32 encoding");
    }

    public byte[] getBase64(boolean z) throws IOException {
        String remainingStrings = remainingStrings();
        if (remainingStrings == null) {
            if (z) {
                throw exception("expected base64 encoded string");
            }
            return null;
        }
        byte[] fromString = base64.fromString(remainingStrings);
        if (fromString != null) {
            return fromString;
        }
        throw exception("invalid base64 encoding");
    }

    public void getEOL() throws IOException {
        int i = get().type;
        if (i != 1 && i != 0) {
            throw exception("expected EOL or EOF");
        }
    }

    public byte[] getHex(boolean z) throws IOException {
        String remainingStrings = remainingStrings();
        if (remainingStrings == null) {
            if (z) {
                throw exception("expected hex encoded string");
            }
            return null;
        }
        byte[] fromString = base16.fromString(remainingStrings);
        if (fromString != null) {
            return fromString;
        }
        throw exception("invalid hex encoding");
    }

    public byte[] getHexString() throws IOException {
        byte[] fromString = base16.fromString(_getIdentifier("a hex string"));
        if (fromString != null) {
            return fromString;
        }
        throw exception("invalid hex encoding");
    }

    public String getIdentifier() throws IOException {
        return _getIdentifier("an identifier");
    }

    public long getLong() throws IOException {
        String _getIdentifier = _getIdentifier("an integer");
        if (Character.isDigit(_getIdentifier.charAt(0))) {
            try {
                return Long.parseLong(_getIdentifier);
            } catch (NumberFormatException unused) {
                throw exception("expected an integer");
            }
        }
        throw exception("expected an integer");
    }

    public Name getName(Name name) throws IOException {
        try {
            Name fromString = Name.fromString(_getIdentifier("a name"), name);
            if (fromString.isAbsolute()) {
                return fromString;
            }
            throw new RelativeNameException(fromString);
        } catch (TextParseException e) {
            throw exception(e.getMessage());
        }
    }

    public String getString() throws IOException {
        Token token = get();
        if (token.isString()) {
            return token.value;
        }
        throw exception("expected a string");
    }

    public long getTTL() throws IOException {
        try {
            return TTL.parseTTL(_getIdentifier("a TTL value"));
        } catch (NumberFormatException unused) {
            throw exception("expected a TTL value");
        }
    }

    public long getTTLLike() throws IOException {
        try {
            return TTL.parse(_getIdentifier("a TTL-like value"), false);
        } catch (NumberFormatException unused) {
            throw exception("expected a TTL-like value");
        }
    }

    public int getUInt16() throws IOException {
        long j = getLong();
        if (j < 0 || j > av5.s) {
            throw exception("expected an 16 bit unsigned integer");
        }
        return (int) j;
    }

    public long getUInt32() throws IOException {
        long j = getLong();
        if (j < 0 || j > 4294967295L) {
            throw exception("expected an 32 bit unsigned integer");
        }
        return j;
    }

    public int getUInt8() throws IOException {
        long j = getLong();
        if (j < 0 || j > 255) {
            throw exception("expected an 8 bit unsigned integer");
        }
        return (int) j;
    }

    public void unget() {
        if (!this.ungottenToken) {
            if (this.current.type == 1) {
                this.line--;
            }
            this.ungottenToken = true;
            return;
        }
        throw new IllegalStateException("Cannot unget multiple tokens");
    }

    public byte[] getBase64() throws IOException {
        return getBase64(false);
    }

    public byte[] getHex() throws IOException {
        return getHex(false);
    }

    public Tokenizer(String str) {
        this(new ByteArrayInputStream(str.getBytes()));
    }

    public Tokenizer(File file) throws FileNotFoundException {
        this(new FileInputStream(file));
        this.wantClose = true;
        this.filename = file.getName();
    }

    public Token get() throws IOException {
        return get(false, false);
    }
}