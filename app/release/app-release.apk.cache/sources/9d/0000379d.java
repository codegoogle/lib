package com.microsoft.appcenter.utils.crypto;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.CertificateExpiredException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/* loaded from: classes3.dex */
public class CryptoUtils {
    @r2
    public static final ICryptoFactory DEFAULT_CRYPTO_FACTORY = new ICryptoFactory() { // from class: com.microsoft.appcenter.utils.crypto.CryptoUtils.1
        @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICryptoFactory
        public ICipher getCipher(String str, String str2) throws Exception {
            final Cipher cipher;
            if (str2 != null) {
                cipher = Cipher.getInstance(str, str2);
            } else {
                cipher = Cipher.getInstance(str);
            }
            return new ICipher() { // from class: com.microsoft.appcenter.utils.crypto.CryptoUtils.1.2
                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICipher
                public byte[] doFinal(byte[] bArr) throws Exception {
                    return cipher.doFinal(bArr);
                }

                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICipher
                public String getAlgorithm() {
                    return cipher.getAlgorithm();
                }

                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICipher
                public int getBlockSize() {
                    return cipher.getBlockSize();
                }

                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICipher
                public byte[] getIV() {
                    return cipher.getIV();
                }

                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICipher
                public String getProvider() {
                    return cipher.getProvider().getName();
                }

                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICipher
                public void init(int i, Key key) throws Exception {
                    cipher.init(i, key);
                }

                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICipher
                public byte[] doFinal(byte[] bArr, int i, int i2) throws Exception {
                    return cipher.doFinal(bArr, i, i2);
                }

                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICipher
                public void init(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec) throws Exception {
                    cipher.init(i, key, algorithmParameterSpec);
                }
            };
        }

        @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.ICryptoFactory
        public IKeyGenerator getKeyGenerator(String str, String str2) throws Exception {
            final KeyGenerator keyGenerator = KeyGenerator.getInstance(str, str2);
            return new IKeyGenerator() { // from class: com.microsoft.appcenter.utils.crypto.CryptoUtils.1.1
                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.IKeyGenerator
                public void generateKey() {
                    keyGenerator.generateKey();
                }

                @Override // com.microsoft.appcenter.utils.crypto.CryptoUtils.IKeyGenerator
                public void init(AlgorithmParameterSpec algorithmParameterSpec) throws Exception {
                    keyGenerator.init(algorithmParameterSpec);
                }
            };
        }
    };
    private static final String M_KEY_EXPIRED_EXCEPTION = "android.security.keystore.KeyExpiredException";
    @SuppressLint({"StaticFieldLeak"})
    private static CryptoUtils sInstance;
    private final int mApiLevel;
    private final Context mContext;
    private final ICryptoFactory mCryptoFactory;
    private final Map<String, CryptoHandlerEntry> mCryptoHandlers;
    private final KeyStore mKeyStore;

    @r2
    /* loaded from: classes3.dex */
    public static class CryptoHandlerEntry {
        public int mAliasIndex;
        public final CryptoHandler mCryptoHandler;

        public CryptoHandlerEntry(int i, CryptoHandler cryptoHandler) {
            this.mAliasIndex = i;
            this.mCryptoHandler = cryptoHandler;
        }
    }

    /* loaded from: classes3.dex */
    public static class DecryptedData {
        public final String mDecryptedData;
        public final String mNewEncryptedData;

        @r2
        public DecryptedData(String str, String str2) {
            this.mDecryptedData = str;
            this.mNewEncryptedData = str2;
        }

        public String getDecryptedData() {
            return this.mDecryptedData;
        }

        public String getNewEncryptedData() {
            return this.mNewEncryptedData;
        }
    }

    /* loaded from: classes3.dex */
    public interface ICipher {
        byte[] doFinal(byte[] bArr) throws Exception;

        byte[] doFinal(byte[] bArr, int i, int i2) throws Exception;

        @r2
        String getAlgorithm();

        int getBlockSize();

        byte[] getIV();

        @r2
        String getProvider();

        void init(int i, Key key) throws Exception;

        void init(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec) throws Exception;
    }

    /* loaded from: classes3.dex */
    public interface ICryptoFactory {
        ICipher getCipher(String str, String str2) throws Exception;

        IKeyGenerator getKeyGenerator(String str, String str2) throws Exception;
    }

    /* loaded from: classes3.dex */
    public interface IKeyGenerator {
        void generateKey();

        void init(AlgorithmParameterSpec algorithmParameterSpec) throws Exception;
    }

    private CryptoUtils(@x1 Context context) {
        this(context, DEFAULT_CRYPTO_FACTORY, Build.VERSION.SDK_INT);
    }

    @x1
    private String getAlias(@x1 CryptoHandler cryptoHandler, int i) {
        StringBuilder H = wo1.H("appcenter.", i, CryptoConstants.ALIAS_SEPARATOR);
        H.append(cryptoHandler.getAlgorithm());
        return H.toString();
    }

    @x1
    private DecryptedData getDecryptedData(CryptoHandler cryptoHandler, int i, String str) throws Exception {
        String str2 = new String(cryptoHandler.decrypt(this.mCryptoFactory, this.mApiLevel, getKeyStoreEntry(cryptoHandler, i), Base64.decode(str, 0)), "UTF-8");
        return new DecryptedData(str2, cryptoHandler != this.mCryptoHandlers.values().iterator().next().mCryptoHandler ? encrypt(str2) : null);
    }

    public static CryptoUtils getInstance(@x1 Context context) {
        if (sInstance == null) {
            sInstance = new CryptoUtils(context);
        }
        return sInstance;
    }

    @z1
    private KeyStore.Entry getKeyStoreEntry(@x1 CryptoHandlerEntry cryptoHandlerEntry) throws Exception {
        return getKeyStoreEntry(cryptoHandlerEntry.mCryptoHandler, cryptoHandlerEntry.mAliasIndex);
    }

    private void registerHandler(@x1 CryptoHandler cryptoHandler) throws Exception {
        int i = 0;
        String alias = getAlias(cryptoHandler, 0);
        String alias2 = getAlias(cryptoHandler, 1);
        Date creationDate = this.mKeyStore.getCreationDate(alias);
        Date creationDate2 = this.mKeyStore.getCreationDate(alias2);
        if (creationDate2 != null && creationDate2.after(creationDate)) {
            alias = alias2;
            i = 1;
        }
        if (this.mCryptoHandlers.isEmpty() && !this.mKeyStore.containsAlias(alias)) {
            AppCenterLog.debug("AppCenter", "Creating alias: " + alias);
            cryptoHandler.generateKey(this.mCryptoFactory, alias, this.mContext);
        }
        AppCenterLog.debug("AppCenter", "Using " + alias);
        this.mCryptoHandlers.put(cryptoHandler.getAlgorithm(), new CryptoHandlerEntry(i, cryptoHandler));
    }

    @x1
    public DecryptedData decrypt(@z1 String str) {
        if (str == null) {
            return new DecryptedData(null, null);
        }
        String[] split = str.split(":");
        CryptoHandlerEntry cryptoHandlerEntry = split.length == 2 ? this.mCryptoHandlers.get(split[0]) : null;
        CryptoHandler cryptoHandler = cryptoHandlerEntry == null ? null : cryptoHandlerEntry.mCryptoHandler;
        if (cryptoHandler == null) {
            AppCenterLog.error("AppCenter", "Failed to decrypt data.");
            return new DecryptedData(str, null);
        }
        try {
            try {
                return getDecryptedData(cryptoHandler, cryptoHandlerEntry.mAliasIndex, split[1]);
            } catch (Exception unused) {
                AppCenterLog.error("AppCenter", "Failed to decrypt data.");
                return new DecryptedData(str, null);
            }
        } catch (Exception unused2) {
            return getDecryptedData(cryptoHandler, cryptoHandlerEntry.mAliasIndex ^ 1, split[1]);
        }
    }

    @z1
    public String encrypt(@z1 String str) {
        if (str == null) {
            return null;
        }
        try {
            CryptoHandlerEntry next = this.mCryptoHandlers.values().iterator().next();
            CryptoHandler cryptoHandler = next.mCryptoHandler;
            try {
                String encodeToString = Base64.encodeToString(cryptoHandler.encrypt(this.mCryptoFactory, this.mApiLevel, getKeyStoreEntry(next), str.getBytes("UTF-8")), 0);
                return cryptoHandler.getAlgorithm() + ":" + encodeToString;
            } catch (InvalidKeyException e) {
                if (!(e.getCause() instanceof CertificateExpiredException) && !M_KEY_EXPIRED_EXCEPTION.equals(e.getClass().getName())) {
                    throw e;
                }
                AppCenterLog.debug("AppCenter", "Alias expired: " + next.mAliasIndex);
                int i = next.mAliasIndex ^ 1;
                next.mAliasIndex = i;
                String alias = getAlias(cryptoHandler, i);
                if (this.mKeyStore.containsAlias(alias)) {
                    AppCenterLog.debug("AppCenter", "Deleting alias: " + alias);
                    this.mKeyStore.deleteEntry(alias);
                }
                AppCenterLog.debug("AppCenter", "Creating alias: " + alias);
                cryptoHandler.generateKey(this.mCryptoFactory, alias, this.mContext);
                return encrypt(str);
            }
        } catch (Exception unused) {
            AppCenterLog.error("AppCenter", "Failed to encrypt data.");
            return str;
        }
    }

    @r2
    public ICryptoFactory getCryptoFactory() {
        return this.mCryptoFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @r2
    @TargetApi(23)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CryptoUtils(@x1 Context context, @x1 ICryptoFactory iCryptoFactory, int i) {
        KeyStore keyStore;
        this.mCryptoHandlers = new LinkedHashMap();
        this.mContext = context.getApplicationContext();
        this.mCryptoFactory = iCryptoFactory;
        this.mApiLevel = i;
        KeyStore keyStore2 = null;
        try {
            keyStore = KeyStore.getInstance(CryptoConstants.ANDROID_KEY_STORE);
            try {
                keyStore.load(null);
            } catch (Exception unused) {
                keyStore2 = keyStore;
                AppCenterLog.error("AppCenter", "Cannot use secure keystore on this device.");
                keyStore = keyStore2;
                this.mKeyStore = keyStore;
                if (keyStore != null) {
                    try {
                        registerHandler(new CryptoAesAndEtmHandler());
                        registerHandler(new CryptoAesHandler());
                    } catch (Exception unused2) {
                        AppCenterLog.error("AppCenter", "Cannot use modern encryption on this device.");
                    }
                }
                if (keyStore != null) {
                }
                CryptoNoOpHandler cryptoNoOpHandler = new CryptoNoOpHandler();
                this.mCryptoHandlers.put(cryptoNoOpHandler.getAlgorithm(), new CryptoHandlerEntry(0, cryptoNoOpHandler));
            }
        } catch (Exception unused3) {
        }
        this.mKeyStore = keyStore;
        if (keyStore != null && i >= 23) {
            registerHandler(new CryptoAesAndEtmHandler());
            registerHandler(new CryptoAesHandler());
        }
        if (keyStore != null) {
            try {
                registerHandler(new CryptoRsaHandler());
            } catch (Exception unused4) {
                AppCenterLog.error("AppCenter", "Cannot use old encryption on this device.");
            }
        }
        CryptoNoOpHandler cryptoNoOpHandler2 = new CryptoNoOpHandler();
        this.mCryptoHandlers.put(cryptoNoOpHandler2.getAlgorithm(), new CryptoHandlerEntry(0, cryptoNoOpHandler2));
    }

    @z1
    private KeyStore.Entry getKeyStoreEntry(CryptoHandler cryptoHandler, int i) throws Exception {
        if (this.mKeyStore == null) {
            return null;
        }
        return this.mKeyStore.getEntry(getAlias(cryptoHandler, i), null);
    }
}