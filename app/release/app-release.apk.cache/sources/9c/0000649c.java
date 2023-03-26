package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.anchorfree.hdr.AFHydra;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileUtils.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010%¨\u0006)"}, d2 = {"Lcom/p7700g/p99005/wz2;", "", "", "fileName", "", "b", "(Ljava/lang/String;)Z", "Ljava/io/File;", o31.b, "a", "(Ljava/io/File;)Z", "", "response", "outFilename", "f", "([BLjava/lang/String;)Z", "outFile", "e", "([BLjava/io/File;)Z", "Landroid/graphics/Bitmap;", "finalBitmap", la1.k, "i", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Z", "h", "(Landroid/graphics/Bitmap;Ljava/io/File;)Z", "c", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/io/FileOutputStream;", "fileOutputStream", com.anythink.basead.d.g.i, "(Landroid/graphics/Bitmap;Ljava/io/FileOutputStream;)Z", "Ljava/lang/String;", "TAG", "", AFHydra.STATUS_IDLE, "DEFAULT_BYTE_SIZE", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class wz2 {
    @NotNull
    public static final wz2 a = new wz2();
    @NotNull
    private static final String b = "FileUtl";
    private static final int c = 4096;

    private wz2() {
    }

    @jz4
    public static final boolean a(@Nullable File file) {
        try {
            if (file == null) {
                xz2.c(b, "[ERROR] FileUtils.delete called with a null File object");
                return false;
            } else if (!file.exists()) {
                xz2.c(b, "[ERROR] FileUtils.delete called with a file that doesn't exist.");
                return false;
            } else {
                if (file.isDirectory()) {
                    xz2.c(b, c25.C("Removing Directory: ", file.getName()));
                    File[] listFiles = file.listFiles();
                    c25.o(listFiles, "file.listFiles()");
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        i++;
                        a(file2);
                    }
                }
                if (file.delete()) {
                    xz2.c(b, c25.C("Removed file: ", file.getName()));
                    return true;
                }
                xz2.c(b, c25.C("[ERROR] Failed to delete file: ", file.getName()));
                return false;
            }
        } catch (SecurityException e) {
            xz2.b(b, "Security Exception while trying to delete file", e);
            return false;
        } catch (Exception e2) {
            xz2.b(b, "Exception while trying to delete file", e2);
            return false;
        }
    }

    @jz4
    public static final boolean b(@NotNull String str) {
        c25.p(str, "fileName");
        return a(new File(str));
    }

    @jz4
    @Nullable
    public static final Bitmap c(@NotNull String str) {
        c25.p(str, o31.b);
        if (str.length() == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeFile(str, options);
    }

    @jz4
    @NotNull
    public static final String d(@NotNull String str) {
        c25.p(str, o31.b);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        try {
            StringBuilder sb = new StringBuilder();
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                sb.append(readLine);
                sb.append("\n");
            }
            String sb2 = sb.toString();
            c25.o(sb2, "sb.toString()");
            ux4.a(bufferedReader, null);
            return sb2;
        } finally {
        }
    }

    @jz4
    public static final boolean e(@Nullable byte[] bArr, @NotNull File file) throws IOException {
        int read;
        c25.p(file, "outFile");
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                xz2.c(b, c25.C("AcceptedFileLength is: ", Integer.valueOf(bArr.length)));
                long length = bArr.length;
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[4096];
                StringBuilder G = wo1.G("Saving file ");
                G.append((Object) file.getName());
                G.append(" initialize length ");
                G.append(bArr.length);
                xz2.c(b, G.toString());
                long j = 0;
                do {
                    read = byteArrayInputStream.read(bArr2);
                    if (read != -1) {
                        j += read;
                        fileOutputStream.write(bArr2, 0, read);
                        continue;
                    }
                } while (read != -1);
                if (length != j) {
                    xz2.c(b, "[ERROR] File write length does not match response byte length. Possible corruption. Deleting");
                    fileOutputStream.flush();
                    a(file);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return false;
                }
                fileOutputStream.close();
                byteArrayInputStream.close();
                return true;
            }
        }
        xz2.c(b, "[ERROR] Not a valid response to be saved");
        return false;
    }

    @jz4
    public static final boolean f(@Nullable byte[] bArr, @NotNull String str) throws IOException {
        c25.p(str, "outFilename");
        File file = new File(str);
        file.createNewFile();
        return e(bArr, file);
    }

    @jz4
    public static final boolean h(@NotNull Bitmap bitmap, @NotNull File file) {
        c25.p(bitmap, "finalBitmap");
        c25.p(file, o31.b);
        try {
            file.mkdirs();
            wz2 wz2Var = a;
            a(file);
            return wz2Var.g(bitmap, new FileOutputStream(file));
        } catch (SecurityException e) {
            xz2.b(b, "Exception trying to create a directory", e);
            return false;
        }
    }

    @jz4
    public static final boolean i(@NotNull Bitmap bitmap, @NotNull String str) {
        c25.p(bitmap, "finalBitmap");
        c25.p(str, la1.k);
        return h(bitmap, new File(str));
    }

    @r2(otherwise = 2)
    public final boolean g(@NotNull Bitmap bitmap, @NotNull FileOutputStream fileOutputStream) {
        c25.p(bitmap, "finalBitmap");
        c25.p(fileOutputStream, "fileOutputStream");
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            return true;
        } catch (Exception e) {
            xz2.c(b, c25.C("[ERROR] Error storing file: ", e.getLocalizedMessage()));
            return false;
        }
    }
}