package com.p7700g.p99005;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.media.AudioAttributesCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.i2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.xbill.DNS.TTL;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public class bx {
    public static final String A = "ImageDescription";
    public static final String A0 = "FocalPlaneYResolution";
    public static final String A1 = "GPSDestBearing";
    public static final int A2 = 65535;
    public static final short A3 = 16;
    public static final short A4 = 1;
    private static final int A6 = 2;
    private static final int A7 = 14;
    public static final String B = "Make";
    public static final String B0 = "FocalPlaneResolutionUnit";
    public static final String B1 = "GPSDestDistanceRef";
    public static final short B2 = 0;
    public static final short B3 = 24;
    public static final String B4 = "A";
    private static final int B6 = 3;
    private static final Pattern B7;
    public static final String C = "Model";
    public static final String C0 = "SubjectLocation";
    public static final String C1 = "GPSDestDistance";
    public static final short C2 = 1;
    public static final short C3 = 32;
    public static final String C4 = "V";
    private static final int C5 = 4;
    public static final int C6 = 4;
    private static final Pattern C7;
    public static final String D = "Software";
    public static final String D0 = "ExposureIndex";
    public static final String D1 = "GPSProcessingMethod";
    public static final short D2 = 2;
    public static final short D3 = 64;
    public static final String D4 = "2";
    private static final int D5 = 4;
    public static final int D6 = 5;
    public static final String E = "Artist";
    public static final String E0 = "SensingMethod";
    public static final String E1 = "GPSAreaInformation";
    public static final short E2 = 3;
    public static final short E3 = 1;
    public static final String E4 = "3";
    private static final int E6 = 6;
    public static final String F = "Copyright";
    public static final String F0 = "FileSource";
    public static final String F1 = "GPSDateStamp";
    public static final short F2 = 4;
    public static final short F3 = 2;
    public static final String F4 = "K";
    private static final int F6 = 7;
    public static final String G = "ExifVersion";
    public static final String G0 = "SceneType";
    public static final String G1 = "GPSDifferential";
    public static final short G2 = 5;
    public static final short G3 = 3;
    public static final String G4 = "M";
    private static final int G5 = 4;
    private static final int G6 = 8;
    public static final String H = "FlashpixVersion";
    public static final String H0 = "CFAPattern";
    public static final String H1 = "GPSHPositioningError";
    public static final short H2 = 6;
    public static final short H3 = 4;
    public static final String H4 = "N";
    private static final int H6 = 9;
    public static final String I = "ColorSpace";
    public static final String I0 = "CustomRendered";
    public static final String I1 = "InteroperabilityIndex";
    public static final short I2 = 7;
    public static final short I3 = 5;
    public static final String I4 = "T";
    public static final f[][] I6;
    public static final String J = "Gamma";
    public static final String J0 = "ExposureMode";
    public static final String J1 = "ThumbnailImageLength";
    public static final short J2 = 8;
    public static final short J3 = 7;
    public static final String J4 = "M";
    private static final byte J5 = 47;
    private static final f[] J6;
    public static final String K = "PixelXDimension";
    public static final String K0 = "WhiteBalance";
    public static final String K1 = "ThumbnailImageWidth";
    public static final short K2 = 0;
    public static final short K3 = 8;
    public static final String K4 = "K";
    private static final f K6;
    public static final String L = "PixelYDimension";
    public static final String L0 = "DigitalZoomRatio";
    @i2({i2.a.LIBRARY})
    public static final String L1 = "ThumbnailOrientation";
    public static final short L2 = 1;
    public static final short L3 = 0;
    public static final String L4 = "M";
    private static final f L6;
    public static final String M = "ComponentsConfiguration";
    public static final String M0 = "FocalLengthIn35mmFilm";
    public static final String M1 = "DNGVersion";
    public static final short M2 = 2;
    public static final short M3 = 1;
    public static final String M4 = "N";
    private static final HashMap<Integer, f>[] M6;
    public static final String N = "CompressedBitsPerPixel";
    public static final String N0 = "SceneCaptureType";
    public static final String N1 = "DefaultCropSize";
    public static final short N2 = 3;
    public static final short N3 = 2;
    public static final short N4 = 0;
    private static final HashMap<String, f>[] N6;
    public static final String O = "MakerNote";
    public static final String O0 = "GainControl";
    public static final String O1 = "ThumbnailImage";
    public static final short O2 = 4;
    public static final short O3 = 3;
    public static final short O4 = 1;
    private static final HashSet<String> O6;
    public static final String P = "UserComment";
    public static final String P0 = "Contrast";
    public static final String P1 = "PreviewImageStart";
    public static final short P2 = 5;
    public static final short P3 = 1;
    public static final int P4 = 1;
    private static final HashMap<Integer, Integer> P6;
    public static final String Q = "RelatedSoundFile";
    public static final String Q0 = "Saturation";
    public static final String Q1 = "PreviewImageLength";
    public static final short Q2 = 6;
    public static final short Q3 = 0;
    public static final int Q4 = 2;
    private static final int Q5 = 10;
    public static final Charset Q6;
    public static final String R = "DateTimeOriginal";
    public static final String R0 = "Sharpness";
    public static final String R1 = "AspectFrame";
    public static final short R2 = 7;
    public static final short R3 = 1;
    public static final int R4 = 6;
    private static final int R5 = 4;
    public static final byte[] R6;
    public static final String S = "DateTimeDigitized";
    public static final String S0 = "DeviceSettingDescription";
    public static final String S1 = "SensorBottomBorder";
    public static final short S2 = 0;
    public static final short S3 = 0;
    public static final int S4 = 7;
    private static final int S5 = 4;
    private static final byte[] S6;
    public static final String T = "OffsetTime";
    public static final String T0 = "SubjectDistanceRange";
    public static final String T1 = "SensorLeftBorder";
    public static final short T2 = 1;
    public static final short T3 = 1;
    public static final int T4 = 8;
    private static SimpleDateFormat T5 = null;
    public static final byte T6 = -1;
    public static final String U = "OffsetTimeOriginal";
    public static final String U0 = "ImageUniqueID";
    public static final String U1 = "SensorRightBorder";
    public static final short U2 = 2;
    public static final short U3 = 2;
    public static final int U4 = 32773;
    public static final short U5 = 18761;
    public static final String V = "OffsetTimeDigitized";
    @Deprecated
    public static final String V0 = "CameraOwnerName";
    public static final String V1 = "SensorTopBorder";
    public static final short V2 = 3;
    @Deprecated
    public static final int V3 = 0;
    public static final int V4 = 34892;
    public static final short V5 = 19789;
    private static final byte V6 = -64;
    public static final String W = "SubSecTime";
    public static final String W0 = "CameraOwnerName";
    public static final String W1 = "ISO";
    public static final short W2 = 4;
    @Deprecated
    public static final int W3 = 1;
    private static final byte W6 = -63;
    public static final String X = "SubSecTimeOriginal";
    public static final String X0 = "BodySerialNumber";
    public static final String X1 = "JpgFromRaw";
    public static final short X2 = 5;
    public static final short X3 = 0;
    private static final int X5 = 8;
    private static final byte X6 = -62;
    public static final String Y = "SubSecTimeDigitized";
    public static final String Y0 = "LensSpecification";
    public static final String Y1 = "Xmp";
    public static final short Y2 = 6;
    public static final short Y3 = 1;
    private static final int Y5 = 1;
    private static final byte Y6 = -61;
    public static final String Z = "ExposureTime";
    public static final String Z0 = "LensMake";
    public static final String Z1 = "NewSubfileType";
    public static final short Z2 = 255;
    public static final short Z3 = 0;
    public static final int Z4 = 0;
    private static final int Z5 = 2;
    private static final byte Z6 = -59;
    public static final String a0 = "FNumber";
    public static final String a1 = "LensModel";
    public static final String a2 = "SubfileType";
    public static final short a3 = 0;
    public static final short a4 = 1;
    public static final int a5 = 1;
    private static final int a6 = 3;
    private static final byte a7 = -58;
    public static final String b0 = "ExposureProgram";
    public static final String b1 = "LensSerialNumber";
    private static final String b2 = "ExifIFDPointer";
    public static final short b3 = 1;
    public static final short b4 = 2;
    public static final int b5 = 2;
    private static final int b6 = 4;
    private static final byte b7 = -57;
    public static final String c = "ImageWidth";
    public static final String c0 = "SpectralSensitivity";
    public static final String c1 = "GPSVersionID";
    private static final String c2 = "GPSInfoIFDPointer";
    public static final short c3 = 2;
    public static final short c4 = 3;
    public static final int c5 = 6;
    private static final int c6 = 5;
    private static final byte c7 = -55;
    public static final String d = "ImageLength";
    @Deprecated
    public static final String d0 = "ISOSpeedRatings";
    public static final String d1 = "GPSLatitudeRef";
    private static final String d2 = "InteroperabilityIFDPointer";
    public static final short d3 = 3;
    public static final short d4 = 0;
    public static final int d5 = 0;
    private static final int d6 = 6;
    private static final byte d7 = -54;
    public static final String e = "BitsPerSample";
    public static final String e0 = "PhotographicSensitivity";
    public static final String e1 = "GPSLatitude";
    private static final String e2 = "SubIFDPointer";
    public static final short e3 = 4;
    public static final short e4 = 1;
    public static final int e5 = 1;
    private static final int e6 = 7;
    private static final byte e7 = -53;
    public static final String f = "Compression";
    public static final String f0 = "OECF";
    public static final String f1 = "GPSLongitudeRef";
    private static final String f2 = "CameraSettingsIFDPointer";
    public static final short f3 = 9;
    public static final short f4 = 2;
    public static final int f5 = 0;
    private static final int f6 = 8;
    private static final byte f7 = -51;
    public static final String g = "PhotometricInterpretation";
    public static final String g0 = "SensitivityType";
    public static final String g1 = "GPSLongitude";
    private static final String g2 = "ImageProcessingIFDPointer";
    public static final short g3 = 10;
    public static final short g4 = 3;
    public static final int g5 = 1;
    private static final int g6 = 9;
    private static final byte g7 = -50;
    public static final String h = "Orientation";
    public static final String h0 = "StandardOutputSensitivity";
    public static final String h1 = "GPSAltitudeRef";
    private static final int h2 = 512;
    public static final short h3 = 11;
    public static final short h4 = 4;
    private static final int h5 = 5000;
    private static final int h6 = 10;
    private static final byte h7 = -49;
    public static final String i = "SamplesPerPixel";
    public static final String i0 = "RecommendedExposureIndex";
    public static final String i1 = "GPSAltitude";
    public static final int i2 = 0;
    public static final short i3 = 12;
    public static final short i4 = 0;
    private static final int i6 = 11;
    private static final byte i7 = -38;
    public static final String j = "PlanarConfiguration";
    public static final String j0 = "ISOSpeed";
    public static final String j1 = "GPSTimeStamp";
    public static final int j2 = 1;
    public static final short j3 = 13;
    public static final short j4 = 1;
    private static final String j5 = "FUJIFILMCCD-RAW";
    private static final int j6 = 12;
    public static final byte j7 = -31;
    public static final String k = "YCbCrSubSampling";
    public static final String k0 = "ISOSpeedLatitudeyyy";
    public static final String k1 = "GPSSatellites";
    public static final int k2 = 2;
    public static final short k3 = 14;
    public static final short k4 = 2;
    private static final int k5 = 84;
    private static final int k6 = 13;
    private static final byte k7 = -2;
    public static final String l = "YCbCrPositioning";
    public static final String l0 = "ISOSpeedLatitudezzz";
    public static final String l1 = "GPSStatus";
    public static final int l2 = 3;
    public static final short l3 = 15;
    public static final short l4 = 0;
    private static final int l5 = 4;
    public static final byte l7 = -39;
    public static final String m = "XResolution";
    public static final String m0 = "ShutterSpeedValue";
    public static final String m1 = "GPSMeasureMode";
    public static final int m2 = 4;
    public static final short m3 = 16;
    public static final short m4 = 0;
    private static final int m7 = 0;
    public static final String n = "YResolution";
    public static final String n0 = "ApertureValue";
    public static final String n1 = "GPSDOP";
    public static final int n2 = 5;
    public static final short n3 = 17;
    public static final short n4 = 0;
    private static final int n7 = 1;
    public static final String o = "ResolutionUnit";
    public static final String o0 = "BrightnessValue";
    public static final String o1 = "GPSSpeedRef";
    public static final int o2 = 6;
    public static final short o3 = 18;
    public static final short o4 = 0;
    private static final f[] o6;
    private static final int o7 = 2;
    public static final String p = "StripOffsets";
    public static final String p0 = "ExposureBiasValue";
    public static final String p1 = "GPSSpeed";
    public static final int p2 = 7;
    public static final short p3 = 19;
    public static final short p4 = 1;
    private static final short p5 = 20306;
    private static final f[] p6;
    private static final int p7 = 3;
    public static final String q = "RowsPerStrip";
    public static final String q0 = "MaxApertureValue";
    public static final String q1 = "GPSTrackRef";
    public static final int q2 = 8;
    public static final short q3 = 20;
    public static final short q4 = 2;
    private static final short q5 = 21330;
    private static final f[] q6;
    private static final int q7 = 4;
    public static final String r = "StripByteCounts";
    public static final String r0 = "SubjectDistance";
    public static final String r1 = "GPSTrack";
    public static final short r3 = 21;
    public static final short r4 = 0;
    private static final f[] r6;
    private static final int r7 = 5;
    public static final String s = "JPEGInterchangeFormat";
    public static final String s0 = "MeteringMode";
    public static final String s1 = "GPSImgDirectionRef";
    public static final short s3 = 22;
    public static final short s4 = 1;
    private static final f[] s6;
    private static final int s7 = 6;
    public static final String t = "JPEGInterchangeFormatLength";
    public static final String t0 = "LightSource";
    public static final String t1 = "GPSImgDirection";
    public static final short t2 = 1;
    public static final short t3 = 23;
    public static final short t4 = 2;
    private static final int t5 = 8;
    private static final f t6;
    private static final int t7 = 7;
    public static final String u = "TransferFunction";
    public static final String u0 = "Flash";
    public static final String u1 = "GPSMapDatum";
    public static final short u2 = 2;
    public static final short u3 = 24;
    public static final short u4 = 3;
    private static final int u5 = 12;
    private static final f[] u6;
    private static final int u7 = 8;
    public static final String v = "WhitePoint";
    public static final String v0 = "SubjectArea";
    public static final String v1 = "GPSDestLatitudeRef";
    public static final short v2 = 1;
    public static final short v3 = 255;
    public static final String v4 = "N";
    private static final short v5 = 85;
    private static final f[] v6;
    private static final int v7 = 9;
    public static final String w = "PrimaryChromaticities";
    public static final String w0 = "FocalLength";
    public static final String w1 = "GPSDestLatitude";
    public static final short w2 = 2;
    public static final short w3 = 1;
    public static final String w4 = "S";
    private static final String w5 = "PENTAX";
    private static final f[] w6;
    private static final int w7 = 10;
    public static final String x = "YCbCrCoefficients";
    public static final String x0 = "FlashEnergy";
    public static final String x1 = "GPSDestLongitudeRef";
    public static final short x2 = 2;
    public static final short x3 = 4;
    public static final String x4 = "E";
    private static final int x5 = 6;
    private static final f[] x6;
    private static final int x7 = 11;
    public static final String y = "ReferenceBlackWhite";
    public static final String y0 = "SpatialFrequencyResponse";
    public static final String y1 = "GPSDestLongitude";
    public static final short y2 = 3;
    public static final short y3 = 6;
    public static final String y4 = "W";
    public static final int y6 = 0;
    private static final int y7 = 12;
    public static final String z = "DateTime";
    public static final String z0 = "FocalPlaneXResolution";
    public static final String z1 = "GPSDestBearingRef";
    public static final int z2 = 1;
    public static final short z3 = 8;
    public static final short z4 = 0;
    private static final int z6 = 1;
    private static final int z7 = 13;
    private String D7;
    private FileDescriptor E7;
    private AssetManager.AssetInputStream F7;
    private int G7;
    private boolean H7;
    private final HashMap<String, d>[] I7;
    private Set<Integer> J7;
    private ByteOrder K7;
    private boolean L7;
    private boolean M7;
    private boolean N7;
    private int O7;
    private int P7;
    private byte[] Q7;
    private int R7;
    private int S7;
    private int T7;
    private int U7;
    private int V7;
    private int W7;
    private boolean X7;
    private boolean Y7;
    private boolean Z7;
    private static final String a = "ExifInterface";
    private static final boolean b = Log.isLoggable(a, 3);
    private static final List<Integer> r2 = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> s2 = Arrays.asList(2, 7, 4, 5);
    public static final int[] W4 = {8, 8, 8};
    public static final int[] X4 = {4};
    public static final int[] Y4 = {8};
    private static final byte U6 = -40;
    public static final byte[] i5 = {-1, U6, -1};
    private static final byte[] m5 = {102, 116, 121, 112};
    private static final byte[] n5 = {109, 105, 102, 49};
    private static final byte[] o5 = {104, 101, 105, 99};
    private static final byte[] r5 = {79, 76, 89, 77, 80, 0};
    private static final byte[] s5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] y5 = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] z5 = {101, 88, 73, 102};
    private static final byte[] A5 = {73, 72, 68, 82};
    private static final byte[] B5 = {73, 69, 78, 68};
    private static final byte[] E5 = {82, 73, 70, 70};
    private static final byte[] F5 = {87, 69, 66, 80};
    private static final byte[] H5 = {69, 88, 73, 70};
    public static final byte W5 = 42;
    private static final byte[] I5 = {-99, 1, W5};
    private static final byte[] K5 = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] L5 = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] M5 = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] N5 = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] O5 = "ANMF".getBytes(Charset.defaultCharset());
    private static final byte[] P5 = "XMP ".getBytes(Charset.defaultCharset());
    public static final String[] l6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] m6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] n6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public class a extends MediaDataSource {
        public long s;
        public final /* synthetic */ b t;

        public a(b bVar) {
            this.t = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.s;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.t.available()) {
                        return -1;
                    }
                    this.t.e(j);
                    this.s = j;
                }
                if (i2 > this.t.available()) {
                    i2 = this.t.available();
                }
                int read = this.t.read(bArr, i, i2);
                if (read >= 0) {
                    this.s += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.s = -1L;
            return -1;
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {
        private static final ByteOrder s = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder t = ByteOrder.BIG_ENDIAN;
        private DataInputStream u;
        private ByteOrder v;
        public final int w;
        public int x;

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.w;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.u.available();
        }

        public int b() {
            return this.x;
        }

        public long d() throws IOException {
            return readInt() & 4294967295L;
        }

        public void e(long j) throws IOException {
            int i = this.x;
            if (i > j) {
                this.x = 0;
                this.u.reset();
                this.u.mark(this.w);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void f(ByteOrder byteOrder) {
            this.v = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.x++;
            return this.u.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.x++;
            return this.u.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i = this.x + 1;
            this.x = i;
            if (i <= this.w) {
                int read = this.u.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.x += 2;
            return this.u.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.x + i2;
            this.x = i3;
            if (i3 <= this.w) {
                if (this.u.read(bArr, i, i2) != i2) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i = this.x + 4;
            this.x = i;
            if (i <= this.w) {
                int read = this.u.read();
                int read2 = this.u.read();
                int read3 = this.u.read();
                int read4 = this.u.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.v;
                    if (byteOrder == s) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == t) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder G = wo1.G("Invalid byte order: ");
                    G.append(this.v);
                    throw new IOException(G.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i = this.x + 8;
            this.x = i;
            if (i <= this.w) {
                int read = this.u.read();
                int read2 = this.u.read();
                int read3 = this.u.read();
                int read4 = this.u.read();
                int read5 = this.u.read();
                int read6 = this.u.read();
                int read7 = this.u.read();
                int read8 = this.u.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.v;
                    if (byteOrder == s) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == t) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    StringBuilder G = wo1.G("Invalid byte order: ");
                    G.append(this.v);
                    throw new IOException(G.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i = this.x + 2;
            this.x = i;
            if (i <= this.w) {
                int read = this.u.read();
                int read2 = this.u.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.v;
                    if (byteOrder == s) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == t) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder G = wo1.G("Invalid byte order: ");
                    G.append(this.v);
                    throw new IOException(G.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.x += 2;
            return this.u.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.x++;
            return this.u.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i = this.x + 2;
            this.x = i;
            if (i <= this.w) {
                int read = this.u.read();
                int read2 = this.u.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.v;
                    if (byteOrder == s) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == t) {
                        return (read << 8) + read2;
                    }
                    StringBuilder G = wo1.G("Invalid byte order: ");
                    G.append(this.v);
                    throw new IOException(G.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.w - this.x);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.u.skipBytes(min - i2);
            }
            this.x += i2;
            return i2;
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.v = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.u = dataInputStream;
            int available = dataInputStream.available();
            this.w = available;
            this.x = 0;
            this.u.mark(available);
            this.v = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.u.read(bArr, i, i2);
            this.x += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.x + bArr.length;
            this.x = length;
            if (length <= this.w) {
                if (this.u.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {
        public final OutputStream s;
        private ByteOrder t;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.s = outputStream;
            this.t = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.t = byteOrder;
        }

        public void b(int i) throws IOException {
            this.s.write(i);
        }

        public void d(int i) throws IOException {
            ByteOrder byteOrder = this.t;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.s.write((i >>> 0) & 255);
                this.s.write((i >>> 8) & 255);
                this.s.write((i >>> 16) & 255);
                this.s.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.s.write((i >>> 24) & 255);
                this.s.write((i >>> 16) & 255);
                this.s.write((i >>> 8) & 255);
                this.s.write((i >>> 0) & 255);
            }
        }

        public void e(short s) throws IOException {
            ByteOrder byteOrder = this.t;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.s.write((s >>> 0) & 255);
                this.s.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.s.write((s >>> 8) & 255);
                this.s.write((s >>> 0) & 255);
            }
        }

        public void f(long j) throws IOException {
            d((int) j);
        }

        public void h(int i) throws IOException {
            e((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.s.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.s.write(bArr, i, i2);
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class d {
        public static final long a = -1;
        public final int b;
        public final int c;
        public final long d;
        public final byte[] e;

        public d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(bx.Q6);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double d, ByteOrder byteOrder) {
            return c(new double[]{d}, byteOrder);
        }

        public static d c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[bx.m6[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d d(int i, ByteOrder byteOrder) {
            return e(new int[]{i}, byteOrder);
        }

        public static d e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[bx.m6[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d f(h hVar, ByteOrder byteOrder) {
            return g(new h[]{hVar}, byteOrder);
        }

        public static d g(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[bx.m6[10] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.a);
                wrap.putInt((int) hVar.b);
            }
            return new d(10, hVarArr.length, wrap.array());
        }

        public static d h(String str) {
            byte[] bytes = (str + (char) 0).getBytes(bx.Q6);
            return new d(2, bytes.length, bytes);
        }

        public static d i(long j, ByteOrder byteOrder) {
            return j(new long[]{j}, byteOrder);
        }

        public static d j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[bx.m6[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d k(h hVar, ByteOrder byteOrder) {
            return l(new h[]{hVar}, byteOrder);
        }

        public static d l(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[bx.m6[5] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.a);
                wrap.putInt((int) hVar.b);
            }
            return new d(5, hVarArr.length, wrap.array());
        }

        public static d m(int i, ByteOrder byteOrder) {
            return n(new int[]{i}, byteOrder);
        }

        public static d n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[bx.m6[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double o(ByteOrder byteOrder) {
            Object r = r(byteOrder);
            if (r != null) {
                if (r instanceof String) {
                    return Double.parseDouble((String) r);
                }
                if (r instanceof long[]) {
                    long[] jArr = (long[]) r;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof int[]) {
                    int[] iArr = (int[]) r;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof double[]) {
                    double[] dArr = (double[]) r;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof h[]) {
                    h[] hVarArr = (h[]) r;
                    if (hVarArr.length == 1) {
                        return hVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int p(ByteOrder byteOrder) {
            Object r = r(byteOrder);
            if (r != null) {
                if (r instanceof String) {
                    return Integer.parseInt((String) r);
                }
                if (r instanceof long[]) {
                    long[] jArr = (long[]) r;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof int[]) {
                    int[] iArr = (int[]) r;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String q(ByteOrder byteOrder) {
            Object r = r(byteOrder);
            if (r == null) {
                return null;
            }
            if (r instanceof String) {
                return (String) r;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (r instanceof long[]) {
                long[] jArr = (long[]) r;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (r instanceof int[]) {
                int[] iArr = (int[]) r;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (r instanceof double[]) {
                double[] dArr = (double[]) r;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (r instanceof h[]) {
                h[] hVarArr = (h[]) r;
                while (i < hVarArr.length) {
                    sb.append(hVarArr[i].a);
                    sb.append(j14.P);
                    sb.append(hVarArr[i].b);
                    i++;
                    if (i != hVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        public Object r(ByteOrder byteOrder) {
            b bVar;
            byte b;
            byte[] bArr;
            b bVar2 = null;
            try {
                bVar = new b(this.e);
                try {
                    bVar.f(byteOrder);
                    boolean z = true;
                    int i = 0;
                    switch (this.b) {
                        case 1:
                        case 6:
                            byte[] bArr2 = this.e;
                            if (bArr2.length == 1 && bArr2[0] >= 0 && bArr2[0] <= 1) {
                                String str = new String(new char[]{(char) (this.e[0] + 48)});
                                try {
                                    bVar.close();
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(this.e, bx.Q6);
                            try {
                                bVar.close();
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.c >= bx.n6.length) {
                                int i2 = 0;
                                while (true) {
                                    bArr = bx.n6;
                                    if (i2 < bArr.length) {
                                        if (this.e[i2] != bArr[i2]) {
                                            z = false;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                if (z) {
                                    i = bArr.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i < this.c && (b = this.e[i]) != 0) {
                                if (b >= 32) {
                                    sb.append((char) b);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            String sb2 = sb.toString();
                            try {
                                bVar.close();
                            } catch (IOException unused3) {
                            }
                            return sb2;
                        case 3:
                            int[] iArr = new int[this.c];
                            while (i < this.c) {
                                iArr[i] = bVar.readUnsignedShort();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.c];
                            while (i < this.c) {
                                jArr[i] = bVar.d();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            h[] hVarArr = new h[this.c];
                            while (i < this.c) {
                                hVarArr[i] = new h(bVar.d(), bVar.d());
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused6) {
                            }
                            return hVarArr;
                        case 8:
                            int[] iArr2 = new int[this.c];
                            while (i < this.c) {
                                iArr2[i] = bVar.readShort();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.c];
                            while (i < this.c) {
                                iArr3[i] = bVar.readInt();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            h[] hVarArr2 = new h[this.c];
                            while (i < this.c) {
                                hVarArr2[i] = new h(bVar.readInt(), bVar.readInt());
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused9) {
                            }
                            return hVarArr2;
                        case 11:
                            double[] dArr = new double[this.c];
                            while (i < this.c) {
                                dArr[i] = bVar.readFloat();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.c];
                            while (i < this.c) {
                                dArr2[i] = bVar.readDouble();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                bVar.close();
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        try {
                            bVar2.close();
                        } catch (IOException unused15) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused16) {
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public int s() {
            return bx.m6[this.b] * this.c;
        }

        public String toString() {
            StringBuilder G = wo1.G("(");
            G.append(bx.l6[this.b]);
            G.append(", data length:");
            return wo1.z(G, this.e.length, ")");
        }

        public d(int i, int i2, long j, byte[] bArr) {
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* compiled from: ExifInterface.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class h {
        public final long a;
        public final long b;

        public h(double d) {
            this((long) (d * 10000.0d), gc0.c);
        }

        public double a() {
            return this.a / this.b;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }

        public h(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = j;
            this.b = j2;
        }
    }

    static {
        f[] fVarArr;
        f[] fVarArr2 = {new f(Z1, 254, 4), new f(a2, 255, 4), new f(c, 256, 3, 4), new f(d, 257, 3, 4), new f(e, 258, 3), new f(f, 259, 3), new f(g, 262, 3), new f(A, 270, 2), new f(B, 271, 2), new f(C, 272, 2), new f(p, AudioAttributesCompat.N, 3, 4), new f(h, 274, 3), new f(i, 277, 3), new f(q, com.anythink.expressad.foundation.g.a.aS, 3, 4), new f(r, com.anythink.expressad.foundation.g.a.aT, 3, 4), new f(m, 282, 5), new f(n, 283, 5), new f(j, 284, 3), new f(o, com.anythink.expressad.foundation.g.a.aP, 3), new f(u, 301, 3), new f(D, 305, 2), new f(z, 306, 2), new f(E, 315, 2), new f(v, aa.a.s, 5), new f(w, 319, 5), new f(e2, 330, 4), new f(s, oq.j, 4), new f(t, IronSourceConstants.INIT_COMPLETE, 4), new f(x, 529, 5), new f(k, 530, 3), new f(l, 531, 3), new f(y, 532, 5), new f(F, 33432, 2), new f(b2, 34665, 4), new f(c2, 34853, 4), new f(V1, 4, 4), new f(T1, 5, 4), new f(S1, 6, 4), new f(U1, 7, 4), new f(W1, 23, 3), new f(X1, 46, 7), new f(Y1, aa.h.j, 1)};
        o6 = fVarArr2;
        f[] fVarArr3 = {new f(Z, 33434, 5), new f(a0, 33437, 5), new f(b0, 34850, 3), new f(c0, 34852, 2), new f(e0, 34855, 3), new f(f0, 34856, 7), new f(g0, 34864, 3), new f(h0, 34865, 4), new f(i0, 34866, 4), new f(j0, 34867, 4), new f(k0, 34868, 4), new f(l0, 34869, 4), new f(G, 36864, 2), new f(R, 36867, 2), new f(S, 36868, 2), new f(T, 36880, 2), new f(U, 36881, 2), new f(V, 36882, 2), new f(M, 37121, 7), new f(N, 37122, 5), new f(m0, 37377, 10), new f(n0, 37378, 5), new f(o0, 37379, 10), new f(p0, 37380, 10), new f(q0, 37381, 5), new f(r0, 37382, 5), new f(s0, 37383, 3), new f(t0, 37384, 3), new f(u0, 37385, 3), new f(w0, 37386, 5), new f(v0, 37396, 3), new f(O, 37500, 7), new f(P, 37510, 7), new f(W, 37520, 2), new f(X, 37521, 2), new f(Y, 37522, 2), new f(H, 40960, 7), new f(I, 40961, 3), new f(K, 40962, 3, 4), new f(L, 40963, 3, 4), new f(Q, 40964, 2), new f(d2, 40965, 4), new f(x0, 41483, 5), new f(y0, 41484, 7), new f(z0, 41486, 5), new f(A0, 41487, 5), new f(B0, 41488, 3), new f(C0, 41492, 3), new f(D0, 41493, 5), new f(E0, 41495, 3), new f(F0, 41728, 7), new f(G0, 41729, 7), new f(H0, 41730, 7), new f(I0, 41985, 3), new f(J0, 41986, 3), new f(K0, 41987, 3), new f(L0, 41988, 5), new f(M0, 41989, 3), new f(N0, 41990, 3), new f(O0, 41991, 3), new f(P0, 41992, 3), new f(Q0, 41993, 3), new f(R0, 41994, 3), new f(S0, 41995, 7), new f(T0, 41996, 3), new f(U0, 42016, 2), new f("CameraOwnerName", 42032, 2), new f(X0, 42033, 2), new f(Y0, 42034, 5), new f(Z0, 42035, 2), new f(a1, 42036, 2), new f(J, 42240, 5), new f(M1, 50706, 1), new f(N1, 50720, 3, 4)};
        p6 = fVarArr3;
        f[] fVarArr4 = {new f(c1, 0, 1), new f(d1, 1, 2), new f(e1, 2, 5), new f(f1, 3, 2), new f(g1, 4, 5), new f(h1, 5, 1), new f(i1, 6, 5), new f(j1, 7, 5), new f(k1, 8, 2), new f(l1, 9, 2), new f(m1, 10, 2), new f(n1, 11, 5), new f(o1, 12, 2), new f(p1, 13, 5), new f(q1, 14, 2), new f(r1, 15, 5), new f(s1, 16, 2), new f(t1, 17, 5), new f(u1, 18, 2), new f(v1, 19, 2), new f(w1, 20, 5), new f(x1, 21, 2), new f(y1, 22, 5), new f(z1, 23, 2), new f(A1, 24, 5), new f(B1, 25, 2), new f(C1, 26, 5), new f(D1, 27, 7), new f(E1, 28, 7), new f(F1, 29, 2), new f(G1, 30, 3), new f(H1, 31, 5)};
        q6 = fVarArr4;
        f[] fVarArr5 = {new f(I1, 1, 2)};
        r6 = fVarArr5;
        f[] fVarArr6 = {new f(Z1, 254, 4), new f(a2, 255, 4), new f(K1, 256, 3, 4), new f(J1, 257, 3, 4), new f(e, 258, 3), new f(f, 259, 3), new f(g, 262, 3), new f(A, 270, 2), new f(B, 271, 2), new f(C, 272, 2), new f(p, AudioAttributesCompat.N, 3, 4), new f(L1, 274, 3), new f(i, 277, 3), new f(q, com.anythink.expressad.foundation.g.a.aS, 3, 4), new f(r, com.anythink.expressad.foundation.g.a.aT, 3, 4), new f(m, 282, 5), new f(n, 283, 5), new f(j, 284, 3), new f(o, com.anythink.expressad.foundation.g.a.aP, 3), new f(u, 301, 3), new f(D, 305, 2), new f(z, 306, 2), new f(E, 315, 2), new f(v, aa.a.s, 5), new f(w, 319, 5), new f(e2, 330, 4), new f(s, oq.j, 4), new f(t, IronSourceConstants.INIT_COMPLETE, 4), new f(x, 529, 5), new f(k, 530, 3), new f(l, 531, 3), new f(y, 532, 5), new f(F, 33432, 2), new f(b2, 34665, 4), new f(c2, 34853, 4), new f(M1, 50706, 1), new f(N1, 50720, 3, 4)};
        s6 = fVarArr6;
        t6 = new f(p, AudioAttributesCompat.N, 3);
        f[] fVarArr7 = {new f(O1, 256, 7), new f(f2, 8224, 4), new f(g2, 8256, 4)};
        u6 = fVarArr7;
        f[] fVarArr8 = {new f(P1, 257, 4), new f(Q1, 258, 4)};
        v6 = fVarArr8;
        f[] fVarArr9 = {new f(R1, 4371, 3)};
        w6 = fVarArr9;
        f[] fVarArr10 = {new f(I, 55, 3)};
        x6 = fVarArr10;
        f[][] fVarArr11 = {fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr6, fVarArr2, fVarArr7, fVarArr8, fVarArr9, fVarArr10};
        I6 = fVarArr11;
        J6 = new f[]{new f(e2, 330, 4), new f(b2, 34665, 4), new f(c2, 34853, 4), new f(d2, 40965, 4), new f(f2, 8224, 1), new f(g2, 8256, 1)};
        K6 = new f(s, oq.j, 4);
        L6 = new f(t, IronSourceConstants.INIT_COMPLETE, 4);
        M6 = new HashMap[fVarArr11.length];
        N6 = new HashMap[fVarArr11.length];
        O6 = new HashSet<>(Arrays.asList(a0, L0, Z, r0, j1));
        P6 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        Q6 = forName;
        R6 = "Exif\u0000\u0000".getBytes(forName);
        S6 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        T5 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(md2.a));
        int i8 = 0;
        while (true) {
            f[][] fVarArr12 = I6;
            if (i8 < fVarArr12.length) {
                M6[i8] = new HashMap<>();
                N6[i8] = new HashMap<>();
                for (f fVar : fVarArr12[i8]) {
                    M6[i8].put(Integer.valueOf(fVar.a), fVar);
                    N6[i8].put(fVar.b, fVar);
                }
                i8++;
            } else {
                HashMap<Integer, Integer> hashMap = P6;
                f[] fVarArr13 = J6;
                hashMap.put(Integer.valueOf(fVarArr13[0].a), 5);
                hashMap.put(Integer.valueOf(fVarArr13[1].a), 1);
                hashMap.put(Integer.valueOf(fVarArr13[2].a), 2);
                hashMap.put(Integer.valueOf(fVarArr13[3].a), 3);
                hashMap.put(Integer.valueOf(fVarArr13[4].a), 7);
                hashMap.put(Integer.valueOf(fVarArr13[5].a), 8);
                B7 = Pattern.compile(".*[1-9].*");
                C7 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public bx(@x1 File file) throws IOException {
        f[][] fVarArr = I6;
        this.I7 = new HashMap[fVarArr.length];
        this.J7 = new HashSet(fVarArr.length);
        this.K7 = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(file, "file cannot be null");
        U(file.getAbsolutePath());
    }

    private int C(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (Y(bArr)) {
            return 4;
        }
        if (b0(bArr)) {
            return 9;
        }
        if (X(bArr)) {
            return 12;
        }
        if (Z(bArr)) {
            return 7;
        }
        if (c0(bArr)) {
            return 10;
        }
        if (a0(bArr)) {
            return 13;
        }
        return j0(bArr) ? 14 : 0;
    }

    private void D(b bVar) throws IOException {
        G(bVar);
        d dVar = this.I7[1].get(O);
        if (dVar != null) {
            b bVar2 = new b(dVar.e);
            bVar2.f(this.K7);
            byte[] bArr = r5;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.e(0L);
            byte[] bArr3 = s5;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.e(12L);
            }
            q0(bVar2, 6);
            d dVar2 = this.I7[7].get(P1);
            d dVar3 = this.I7[7].get(Q1);
            if (dVar2 != null && dVar3 != null) {
                this.I7[5].put(s, dVar2);
                this.I7[5].put(t, dVar3);
            }
            d dVar4 = this.I7[8].get(R1);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.r(this.K7);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i8 = (iArr[2] - iArr[0]) + 1;
                    int i9 = (iArr[3] - iArr[1]) + 1;
                    if (i8 < i9) {
                        int i10 = i8 + i9;
                        i9 = i10 - i9;
                        i8 = i10 - i9;
                    }
                    d m8 = d.m(i8, this.K7);
                    d m9 = d.m(i9, this.K7);
                    this.I7[0].put(c, m8);
                    this.I7[0].put(d, m9);
                    return;
                }
                Arrays.toString(iArr);
            }
        }
    }

    private void E(b bVar) throws IOException {
        if (b) {
            String str = "getPngAttributes starting with: " + bVar;
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        byte[] bArr = y5;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i8 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i9 = i8 + 4;
                    if (i9 == 16 && !Arrays.equals(bArr2, A5)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, B5)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, z5)) {
                        byte[] bArr3 = new byte[readInt];
                        if (bVar.read(bArr3) == readInt) {
                            int readInt2 = bVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.S7 = i9;
                                p0(bArr3, 0);
                                I0();
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int i10 = readInt + 4;
                    bVar.skipBytes(i10);
                    length = i9 + i10;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void E0(b bVar) throws IOException {
        HashMap<String, d> hashMap = this.I7[4];
        d dVar = hashMap.get(f);
        if (dVar != null) {
            int p8 = dVar.p(this.K7);
            this.R7 = p8;
            if (p8 != 1) {
                if (p8 == 6) {
                    Q(bVar, hashMap);
                    return;
                } else if (p8 != 7) {
                    return;
                }
            }
            if (e0(hashMap)) {
                R(bVar, hashMap);
                return;
            }
            return;
        }
        this.R7 = 6;
        Q(bVar, hashMap);
    }

    private void F(b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        z(bVar, i8, 5);
        bVar.e(i9);
        bVar.f(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        boolean z8 = b;
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == t6.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m8 = d.m(readShort, this.K7);
                d m9 = d.m(readShort2, this.K7);
                this.I7[0].put(d, m8);
                this.I7[0].put(c, m9);
                boolean z9 = b;
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private static boolean F0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    private void G(b bVar) throws IOException {
        d dVar;
        m0(bVar, bVar.available());
        q0(bVar, 0);
        H0(bVar, 0);
        H0(bVar, 5);
        H0(bVar, 4);
        I0();
        if (this.G7 != 8 || (dVar = this.I7[1].get(O)) == null) {
            return;
        }
        b bVar2 = new b(dVar.e);
        bVar2.f(this.K7);
        bVar2.e(6L);
        q0(bVar2, 9);
        d dVar2 = this.I7[9].get(I);
        if (dVar2 != null) {
            this.I7[1].put(I, dVar2);
        }
    }

    private void G0(int i8, int i9) throws IOException {
        if (!this.I7[i8].isEmpty() && !this.I7[i9].isEmpty()) {
            d dVar = this.I7[i8].get(d);
            d dVar2 = this.I7[i8].get(c);
            d dVar3 = this.I7[i9].get(d);
            d dVar4 = this.I7[i9].get(c);
            if (dVar == null || dVar2 == null) {
                boolean z8 = b;
                return;
            } else if (dVar3 != null && dVar4 != null) {
                int p8 = dVar.p(this.K7);
                int p9 = dVar2.p(this.K7);
                int p10 = dVar3.p(this.K7);
                int p11 = dVar4.p(this.K7);
                if (p8 >= p10 || p9 >= p11) {
                    return;
                }
                HashMap<String, d>[] hashMapArr = this.I7;
                HashMap<String, d> hashMap = hashMapArr[i8];
                hashMapArr[i8] = hashMapArr[i9];
                hashMapArr[i9] = hashMap;
                return;
            } else {
                boolean z9 = b;
                return;
            }
        }
        boolean z10 = b;
    }

    private void H0(b bVar, int i8) throws IOException {
        d m8;
        d m9;
        d dVar = this.I7[i8].get(N1);
        d dVar2 = this.I7[i8].get(V1);
        d dVar3 = this.I7[i8].get(T1);
        d dVar4 = this.I7[i8].get(S1);
        d dVar5 = this.I7[i8].get(U1);
        if (dVar != null) {
            if (dVar.b == 5) {
                h[] hVarArr = (h[]) dVar.r(this.K7);
                if (hVarArr != null && hVarArr.length == 2) {
                    m8 = d.k(hVarArr[0], this.K7);
                    m9 = d.k(hVarArr[1], this.K7);
                } else {
                    Arrays.toString(hVarArr);
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar.r(this.K7);
                if (iArr != null && iArr.length == 2) {
                    m8 = d.m(iArr[0], this.K7);
                    m9 = d.m(iArr[1], this.K7);
                } else {
                    Arrays.toString(iArr);
                    return;
                }
            }
            this.I7[i8].put(c, m8);
            this.I7[i8].put(d, m9);
        } else if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int p8 = dVar2.p(this.K7);
            int p9 = dVar4.p(this.K7);
            int p10 = dVar5.p(this.K7);
            int p11 = dVar3.p(this.K7);
            if (p9 <= p8 || p10 <= p11) {
                return;
            }
            d m10 = d.m(p9 - p8, this.K7);
            d m11 = d.m(p10 - p11, this.K7);
            this.I7[i8].put(d, m10);
            this.I7[i8].put(c, m11);
        } else {
            t0(bVar, i8);
        }
    }

    private void I(b bVar) throws IOException {
        G(bVar);
        if (this.I7[0].get(X1) != null) {
            z(bVar, this.W7, 5);
        }
        d dVar = this.I7[0].get(W1);
        d dVar2 = this.I7[1].get(e0);
        if (dVar == null || dVar2 != null) {
            return;
        }
        this.I7[1].put(e0, dVar);
    }

    private void I0() throws IOException {
        G0(0, 5);
        G0(0, 4);
        G0(5, 4);
        d dVar = this.I7[1].get(K);
        d dVar2 = this.I7[1].get(L);
        if (dVar != null && dVar2 != null) {
            this.I7[0].put(c, dVar);
            this.I7[0].put(d, dVar2);
        }
        if (this.I7[4].isEmpty() && h0(this.I7[5])) {
            HashMap<String, d>[] hashMapArr = this.I7;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        h0(this.I7[4]);
    }

    private void J(b bVar) throws IOException {
        byte[] bArr = R6;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.S7 = bArr.length;
        p0(bArr2, 0);
    }

    private int J0(c cVar) throws IOException {
        f[][] fVarArr = I6;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : J6) {
            r0(fVar.b);
        }
        r0(K6.b);
        r0(L6.b);
        for (int i8 = 0; i8 < I6.length; i8++) {
            for (Object obj : this.I7[i8].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.I7[i8].remove(entry.getKey());
                }
            }
        }
        if (!this.I7[1].isEmpty()) {
            this.I7[0].put(J6[1].b, d.i(0L, this.K7));
        }
        if (!this.I7[2].isEmpty()) {
            this.I7[0].put(J6[2].b, d.i(0L, this.K7));
        }
        if (!this.I7[3].isEmpty()) {
            this.I7[1].put(J6[3].b, d.i(0L, this.K7));
        }
        if (this.L7) {
            this.I7[4].put(K6.b, d.i(0L, this.K7));
            this.I7[4].put(L6.b, d.i(this.P7, this.K7));
        }
        for (int i9 = 0; i9 < I6.length; i9++) {
            int i10 = 0;
            for (Map.Entry<String, d> entry2 : this.I7[i9].entrySet()) {
                int s8 = entry2.getValue().s();
                if (s8 > 4) {
                    i10 += s8;
                }
            }
            iArr2[i9] = iArr2[i9] + i10;
        }
        int i11 = 8;
        for (int i12 = 0; i12 < I6.length; i12++) {
            if (!this.I7[i12].isEmpty()) {
                iArr[i12] = i11;
                i11 = (this.I7[i12].size() * 12) + 2 + 4 + iArr2[i12] + i11;
            }
        }
        if (this.L7) {
            this.I7[4].put(K6.b, d.i(i11, this.K7));
            this.O7 = this.S7 + i11;
            i11 += this.P7;
        }
        if (this.G7 == 4) {
            i11 += 8;
        }
        if (b) {
            for (int i13 = 0; i13 < I6.length; i13++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i13), Integer.valueOf(iArr[i13]), Integer.valueOf(this.I7[i13].size()), Integer.valueOf(iArr2[i13]), Integer.valueOf(i11));
            }
        }
        if (!this.I7[1].isEmpty()) {
            this.I7[0].put(J6[1].b, d.i(iArr[1], this.K7));
        }
        if (!this.I7[2].isEmpty()) {
            this.I7[0].put(J6[2].b, d.i(iArr[2], this.K7));
        }
        if (!this.I7[3].isEmpty()) {
            this.I7[1].put(J6[3].b, d.i(iArr[3], this.K7));
        }
        int i14 = this.G7;
        if (i14 == 4) {
            cVar.h(i11);
            cVar.write(R6);
        } else if (i14 == 13) {
            cVar.d(i11);
            cVar.write(z5);
        } else if (i14 == 14) {
            cVar.write(H5);
            cVar.d(i11);
        }
        cVar.e(this.K7 == ByteOrder.BIG_ENDIAN ? V5 : U5);
        cVar.a(this.K7);
        cVar.h(42);
        cVar.f(8L);
        for (int i15 = 0; i15 < I6.length; i15++) {
            if (!this.I7[i15].isEmpty()) {
                cVar.h(this.I7[i15].size());
                int size = (this.I7[i15].size() * 12) + iArr[i15] + 2 + 4;
                for (Map.Entry<String, d> entry3 : this.I7[i15].entrySet()) {
                    int i16 = N6[i15].get(entry3.getKey()).a;
                    d value = entry3.getValue();
                    int s9 = value.s();
                    cVar.h(i16);
                    cVar.h(value.b);
                    cVar.d(value.c);
                    if (s9 > 4) {
                        cVar.f(size);
                        size += s9;
                    } else {
                        cVar.write(value.e);
                        if (s9 < 4) {
                            while (s9 < 4) {
                                cVar.b(0);
                                s9++;
                            }
                        }
                    }
                }
                if (i15 == 0 && !this.I7[4].isEmpty()) {
                    cVar.f(iArr[4]);
                } else {
                    cVar.f(0L);
                }
                for (Map.Entry<String, d> entry4 : this.I7[i15].entrySet()) {
                    byte[] bArr = entry4.getValue().e;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.L7) {
            cVar.write(M());
        }
        if (this.G7 == 14 && i11 % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i11;
    }

    private void O(b bVar) throws IOException {
        if (b) {
            r0 = "getWebpAttributes starting with: " + bVar;
        }
        bVar.f(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(E5.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(F5.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i8 = skipBytes + 4 + 4;
                    if (Arrays.equals(H5, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.S7 = i8;
                            p0(bArr2, 0);
                            this.S7 = i8;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i9 = i8 + readInt2;
                    if (i9 == readInt) {
                        return;
                    }
                    if (i9 <= readInt) {
                        int skipBytes2 = bVar.skipBytes(readInt2);
                        if (skipBytes2 != readInt2) {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                        skipBytes = i8 + skipBytes2;
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> P(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> P7 = P(split[0]);
            if (((Integer) P7.first).intValue() == 2) {
                return P7;
            }
            for (int i8 = 1; i8 < split.length; i8++) {
                Pair<Integer, Integer> P8 = P(split[i8]);
                int intValue = (((Integer) P8.first).equals(P7.first) || ((Integer) P8.second).equals(P7.first)) ? ((Integer) P7.first).intValue() : -1;
                int intValue2 = (((Integer) P7.second).intValue() == -1 || !(((Integer) P8.first).equals(P7.second) || ((Integer) P8.second).equals(P7.second))) ? -1 : ((Integer) P7.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    P7 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    P7 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return P7;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= TTL.MAX_VALUE && parseDouble2 <= TTL.MAX_VALUE) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= av5.s) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair<>(2, -1);
            }
        }
    }

    private void Q(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(s);
        d dVar2 = (d) hashMap.get(t);
        if (dVar == null || dVar2 == null) {
            return;
        }
        int p8 = dVar.p(this.K7);
        int p9 = dVar2.p(this.K7);
        if (this.G7 == 7) {
            p8 += this.T7;
        }
        int min = Math.min(p9, bVar.a() - p8);
        if (p8 > 0 && min > 0) {
            this.L7 = true;
            int i8 = p8 + this.S7;
            this.O7 = i8;
            this.P7 = min;
            if (this.D7 == null && this.F7 == null && this.E7 == null) {
                byte[] bArr = new byte[min];
                bVar.e(i8);
                bVar.readFully(bArr);
                this.Q7 = bArr;
            }
        }
        boolean z8 = b;
    }

    private void R(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(p);
        d dVar2 = (d) hashMap.get(r);
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] g8 = g(dVar.r(this.K7));
        long[] g9 = g(dVar2.r(this.K7));
        if (g8 == null || g8.length == 0 || g9 == null || g9.length == 0 || g8.length != g9.length) {
            return;
        }
        long j8 = 0;
        for (long j9 : g9) {
            j8 += j9;
        }
        int i8 = (int) j8;
        byte[] bArr = new byte[i8];
        this.N7 = true;
        this.M7 = true;
        this.L7 = true;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < g8.length; i11++) {
            int i12 = (int) g8[i11];
            int i13 = (int) g9[i11];
            if (i11 < g8.length - 1 && i12 + i13 != g8[i11 + 1]) {
                this.N7 = false;
            }
            int i14 = i12 - i9;
            bVar.e(i14);
            int i15 = i9 + i14;
            byte[] bArr2 = new byte[i13];
            bVar.read(bArr2);
            i9 = i15 + i13;
            System.arraycopy(bArr2, 0, bArr, i10, i13);
            i10 += i13;
        }
        this.Q7 = bArr;
        if (this.N7) {
            this.O7 = ((int) g8[0]) + this.S7;
            this.P7 = i8;
        }
    }

    private void U(String str) throws IOException {
        FileInputStream fileInputStream;
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream2 = null;
        this.F7 = null;
        this.D7 = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (d0(fileInputStream.getFD())) {
                this.E7 = fileInputStream.getFD();
            } else {
                this.E7 = null;
            }
            k0(fileInputStream);
            d(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            d(fileInputStream2);
            throw th;
        }
    }

    private static boolean V(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = R6;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr3 = R6;
            if (i8 >= bArr3.length) {
                return true;
            }
            if (bArr2[i8] != bArr3[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean X(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception unused) {
                    bVar2 = bVar;
                    boolean z8 = b;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
        if (!Arrays.equals(bArr2, m5)) {
            bVar.close();
            return false;
        }
        long j8 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j8 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j9 = readInt - j8;
        if (j9 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z9 = false;
        boolean z10 = false;
        for (long j10 = 0; j10 < j9 / 4; j10++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j10 != 1) {
                if (Arrays.equals(bArr3, n5)) {
                    z9 = true;
                } else if (Arrays.equals(bArr3, o5)) {
                    z10 = true;
                }
                if (z9 && z10) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean Y(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = i5;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean Z(byte[] bArr) throws IOException {
        b bVar;
        boolean z8 = false;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder o02 = o0(bVar);
            this.K7 = o02;
            bVar.f(o02);
            short readShort = bVar.readShort();
            z8 = (readShort == 20306 || readShort == 21330) ? true : true;
            bVar.close();
            return z8;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private void a() {
        String o8 = o(R);
        if (o8 != null && o(z) == null) {
            this.I7[0].put(z, d.h(o8));
        }
        if (o(c) == null) {
            this.I7[0].put(c, d.i(0L, this.K7));
        }
        if (o(d) == null) {
            this.I7[0].put(d, d.i(0L, this.K7));
        }
        if (o(h) == null) {
            this.I7[0].put(h, d.i(0L, this.K7));
        }
        if (o(t0) == null) {
            this.I7[1].put(t0, d.i(0L, this.K7));
        }
    }

    private boolean a0(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = y5;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i8])));
        }
        return sb.toString();
    }

    private boolean b0(byte[] bArr) throws IOException {
        byte[] bytes = j5.getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < bytes.length; i8++) {
            if (bArr[i8] != bytes[i8]) {
                return false;
            }
        }
        return true;
    }

    private static void c(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
        }
    }

    private boolean c0(byte[] bArr) throws IOException {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder o02 = o0(bVar);
            this.K7 = o02;
            bVar.f(o02);
            boolean z8 = bVar.readShort() == 85;
            bVar.close();
            return z8;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    private static boolean d0(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            boolean z8 = b;
            return false;
        }
    }

    private String e(double d8) {
        long j8 = (long) d8;
        double d9 = d8 - j8;
        long j9 = (long) (d9 * 60.0d);
        long round = Math.round((d9 - (j9 / 60.0d)) * 3600.0d * 1.0E7d);
        return j8 + "/1," + j9 + "/1," + round + "/10000000";
    }

    private boolean e0(HashMap hashMap) throws IOException {
        d dVar;
        d dVar2 = (d) hashMap.get(e);
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.r(this.K7);
            int[] iArr2 = W4;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.G7 != 3 || (dVar = (d) hashMap.get(g)) == null) {
                return false;
            }
            int p8 = dVar.p(this.K7);
            return (p8 == 1 && Arrays.equals(iArr, Y4)) || (p8 == 6 && Arrays.equals(iArr, iArr2));
        }
        return false;
    }

    private static double f(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble2 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals(y4)) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble2;
            }
            return -parseDouble2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private boolean f0() {
        if (this.X7) {
            int i8 = this.G7;
            return i8 == 4 || i8 == 13 || i8 == 14;
        }
        return false;
    }

    private static long[] g(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                jArr[i8] = iArr[i8];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static boolean g0(@x1 String str) {
        Objects.requireNonNull(str, "mimeType shouldn't be null");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        char c8 = 65535;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    c8 = 2;
                    break;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    c8 = 3;
                    break;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    c8 = 4;
                    break;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    c8 = 5;
                    break;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    c8 = 6;
                    break;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    c8 = 7;
                    break;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    c8 = '\b';
                    break;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    c8 = '\t';
                    break;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    c8 = '\n';
                    break;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    c8 = 11;
                    break;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    c8 = '\f';
                    break;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    c8 = '\r';
                    break;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    c8 = 14;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return true;
            default:
                return false;
        }
    }

    private static int h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i8 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i8;
            }
            i8 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    private boolean h0(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(d);
        d dVar2 = (d) hashMap.get(c);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.p(this.K7) <= 512 && dVar2.p(this.K7) <= 512;
    }

    private static void i(InputStream inputStream, OutputStream outputStream, int i8) throws IOException {
        byte[] bArr = new byte[8192];
        while (i8 > 0) {
            int min = Math.min(i8, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i8 -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    private void j(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String sb;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder G7 = wo1.G("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = Q6;
                G7.append(new String(bArr, charset));
                if (bArr2 == null) {
                    sb = "";
                } else {
                    StringBuilder G8 = wo1.G(" or ");
                    G8.append(new String(bArr2, charset));
                    sb = G8.toString();
                }
                G7.append(sb);
                throw new IOException(G7.toString());
            }
            k(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private boolean j0(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = E5;
            if (i8 >= bArr2.length) {
                int i9 = 0;
                while (true) {
                    byte[] bArr3 = F5;
                    if (i9 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[E5.length + i9 + 4] != bArr3[i9]) {
                        return false;
                    }
                    i9++;
                }
            } else if (bArr[i8] != bArr2[i8]) {
                return false;
            } else {
                i8++;
            }
        }
    }

    private void k(b bVar, c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.d(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        i(bVar, cVar, readInt);
    }

    private void k0(@x1 InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i8 = 0; i8 < I6.length; i8++) {
            try {
                try {
                    this.I7[i8] = new HashMap<>();
                } catch (IOException unused) {
                    this.X7 = false;
                    boolean z8 = b;
                    a();
                    if (!z8) {
                        return;
                    }
                }
            } finally {
                a();
                if (b) {
                    n0();
                }
            }
        }
        if (!this.H7) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.G7 = C(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.H7) {
            switch (this.G7) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    G(bVar);
                    break;
                case 4:
                    z(bVar, 0, 0);
                    break;
                case 7:
                    D(bVar);
                    break;
                case 9:
                    F(bVar);
                    break;
                case 10:
                    I(bVar);
                    break;
                case 12:
                    y(bVar);
                    break;
                case 13:
                    E(bVar);
                    break;
                case 14:
                    O(bVar);
                    break;
            }
        } else {
            J(bVar);
        }
        E0(bVar);
        this.X7 = true;
    }

    private static long l0(@z1 String str, @z1 String str2) {
        if (str != null && B7.matcher(str).matches()) {
            try {
                Date parse = T5.parse(str, new ParsePosition(0));
                if (parse == null) {
                    return -1L;
                }
                long time = parse.getTime();
                if (str2 != null) {
                    try {
                        long parseLong = Long.parseLong(str2);
                        while (parseLong > 1000) {
                            parseLong /= 10;
                        }
                        return time + parseLong;
                    } catch (NumberFormatException unused) {
                        return time;
                    }
                }
                return time;
            } catch (IllegalArgumentException unused2) {
            }
        }
        return -1L;
    }

    private void m0(b bVar, int i8) throws IOException {
        ByteOrder o02 = o0(bVar);
        this.K7 = o02;
        bVar.f(o02);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i9 = this.G7;
        if (i9 != 7 && i9 != 10 && readUnsignedShort != 42) {
            StringBuilder G7 = wo1.G("Invalid start code: ");
            G7.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(G7.toString());
        }
        int readInt = bVar.readInt();
        if (readInt >= 8 && readInt < i8) {
            int i10 = readInt - 8;
            if (i10 > 0 && bVar.skipBytes(i10) != i10) {
                throw new IOException(wo1.l("Couldn't jump to first Ifd: ", i10));
            }
            return;
        }
        throw new IOException(wo1.l("Invalid first Ifd offset: ", readInt));
    }

    private void n0() {
        int i8 = 0;
        while (true) {
            HashMap<String, d>[] hashMapArr = this.I7;
            if (i8 >= hashMapArr.length) {
                return;
            }
            hashMapArr[i8].size();
            for (Map.Entry<String, d> entry : this.I7[i8].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.q(this.K7);
            }
            i8++;
        }
    }

    private ByteOrder o0(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder G7 = wo1.G("Invalid byte order: ");
            G7.append(Integer.toHexString(readShort));
            throw new IOException(G7.toString());
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void p0(byte[] bArr, int i8) throws IOException {
        b bVar = new b(bArr);
        m0(bVar, bArr.length);
        q0(bVar, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q0(b bVar, int i8) throws IOException {
        int[] iArr;
        long j8;
        long j9;
        boolean z8;
        short s8;
        short s9;
        String str;
        int i9;
        boolean z9;
        int i10;
        int readUnsignedShort;
        this.J7.add(Integer.valueOf(bVar.x));
        if (bVar.x + 2 > bVar.w) {
            return;
        }
        short readShort = bVar.readShort();
        if ((readShort * 12) + bVar.x > bVar.w || readShort <= 0) {
            return;
        }
        char c8 = 0;
        short s10 = 0;
        while (s10 < readShort) {
            int readUnsignedShort2 = bVar.readUnsignedShort();
            int readUnsignedShort3 = bVar.readUnsignedShort();
            int readInt = bVar.readInt();
            long b8 = bVar.b() + 4;
            f fVar = M6[i8].get(Integer.valueOf(readUnsignedShort2));
            boolean z10 = b;
            if (z10) {
                Object[] objArr = new Object[5];
                objArr[c8] = Integer.valueOf(i8);
                objArr[1] = Integer.valueOf(readUnsignedShort2);
                objArr[2] = fVar != null ? fVar.b : null;
                objArr[3] = Integer.valueOf(readUnsignedShort3);
                objArr[4] = Integer.valueOf(readInt);
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr);
            }
            if (fVar != null && readUnsignedShort3 > 0) {
                if (readUnsignedShort3 < m6.length) {
                    if (fVar.a(readUnsignedShort3)) {
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = fVar.c;
                        }
                        j8 = b8;
                        j9 = readInt * iArr[readUnsignedShort3];
                        if (j9 >= 0 && j9 <= TTL.MAX_VALUE) {
                            z8 = true;
                            if (!z8) {
                                bVar.e(j8);
                                s8 = readShort;
                                s9 = s10;
                            } else {
                                long j10 = j8;
                                if (j9 > 4) {
                                    int readInt2 = bVar.readInt();
                                    s8 = readShort;
                                    int i11 = this.G7;
                                    s9 = s10;
                                    if (i11 == 7) {
                                        if (O.equals(fVar.b)) {
                                            this.T7 = readInt2;
                                        } else if (i8 == 6 && O1.equals(fVar.b)) {
                                            this.U7 = readInt2;
                                            this.V7 = readInt;
                                            d m8 = d.m(6, this.K7);
                                            i9 = readUnsignedShort3;
                                            z9 = z10;
                                            d i12 = d.i(this.U7, this.K7);
                                            i10 = readInt;
                                            d i13 = d.i(this.V7, this.K7);
                                            this.I7[4].put(f, m8);
                                            this.I7[4].put(s, i12);
                                            this.I7[4].put(t, i13);
                                        }
                                        i9 = readUnsignedShort3;
                                        z9 = z10;
                                        i10 = readInt;
                                    } else {
                                        i9 = readUnsignedShort3;
                                        z9 = z10;
                                        i10 = readInt;
                                        if (i11 == 10 && X1.equals(fVar.b)) {
                                            this.W7 = readInt2;
                                        }
                                    }
                                    long j11 = readInt2;
                                    int i14 = bVar.w;
                                    str = f;
                                    if (j11 + j9 <= i14) {
                                        bVar.e(j11);
                                    } else {
                                        bVar.e(j10);
                                    }
                                } else {
                                    s8 = readShort;
                                    s9 = s10;
                                    str = f;
                                    i9 = readUnsignedShort3;
                                    z9 = z10;
                                    i10 = readInt;
                                }
                                Integer num = P6.get(Integer.valueOf(readUnsignedShort2));
                                if (z9) {
                                    String str2 = "nextIfdType: " + num + " byteCount: " + j9;
                                }
                                if (num != null) {
                                    long j12 = -1;
                                    int i15 = i9;
                                    if (i15 == 3) {
                                        readUnsignedShort = bVar.readUnsignedShort();
                                    } else {
                                        if (i15 == 4) {
                                            j12 = bVar.d();
                                        } else if (i15 == 8) {
                                            readUnsignedShort = bVar.readShort();
                                        } else if (i15 == 9 || i15 == 13) {
                                            readUnsignedShort = bVar.readInt();
                                        }
                                        if (z9) {
                                            String.format("Offset: %d, tagName: %s", Long.valueOf(j12), fVar.b);
                                        }
                                        if (j12 > 0 && j12 < bVar.w) {
                                            if (this.J7.contains(Integer.valueOf((int) j12))) {
                                                bVar.e(j12);
                                                q0(bVar, num.intValue());
                                            } else if (z9) {
                                                String str3 = "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")";
                                            }
                                        }
                                        bVar.e(j10);
                                    }
                                    j12 = readUnsignedShort;
                                    if (z9) {
                                    }
                                    if (j12 > 0) {
                                        if (this.J7.contains(Integer.valueOf((int) j12))) {
                                        }
                                    }
                                    bVar.e(j10);
                                } else {
                                    byte[] bArr = new byte[(int) j9];
                                    bVar.readFully(bArr);
                                    d dVar = new d(i9, i10, bVar.b() + this.S7, bArr);
                                    this.I7[i8].put(fVar.b, dVar);
                                    if (M1.equals(fVar.b)) {
                                        this.G7 = 3;
                                    }
                                    if (((B.equals(fVar.b) || C.equals(fVar.b)) && dVar.q(this.K7).contains(w5)) || (str.equals(fVar.b) && dVar.p(this.K7) == 65535)) {
                                        this.G7 = 8;
                                    }
                                    if (bVar.b() != j10) {
                                        bVar.e(j10);
                                    }
                                }
                                s10 = (short) (s9 + 1);
                                readShort = s8;
                                c8 = 0;
                            }
                            s10 = (short) (s9 + 1);
                            readShort = s8;
                            c8 = 0;
                        }
                        z8 = false;
                        if (!z8) {
                        }
                        s10 = (short) (s9 + 1);
                        readShort = s8;
                        c8 = 0;
                    } else if (z10) {
                        String str4 = l6[readUnsignedShort3];
                    }
                }
            }
            j8 = b8;
            j9 = 0;
            z8 = false;
            if (!z8) {
            }
            s10 = (short) (s9 + 1);
            readShort = s8;
            c8 = 0;
        }
        if (bVar.b() + 4 <= bVar.w) {
            int readInt3 = bVar.readInt();
            if (b) {
                String.format("nextIfdOffset: %d", Integer.valueOf(readInt3));
            }
            long j13 = readInt3;
            if (j13 <= 0 || readInt3 >= bVar.w || this.J7.contains(Integer.valueOf(readInt3))) {
                return;
            }
            bVar.e(j13);
            if (this.I7[4].isEmpty()) {
                q0(bVar, 4);
            } else if (this.I7[5].isEmpty()) {
                q0(bVar, 5);
            }
        }
    }

    private void r0(String str) {
        for (int i8 = 0; i8 < I6.length; i8++) {
            this.I7[i8].remove(str);
        }
    }

    private void t0(b bVar, int i8) throws IOException {
        d dVar;
        d dVar2 = this.I7[i8].get(d);
        d dVar3 = this.I7[i8].get(c);
        if ((dVar2 == null || dVar3 == null) && (dVar = this.I7[i8].get(s)) != null) {
            z(bVar, dVar.p(this.K7), i8);
        }
    }

    @z1
    private d w(@x1 String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if (d0.equals(str)) {
            boolean z8 = b;
            str = e0;
        }
        for (int i8 = 0; i8 < I6.length; i8++) {
            d dVar = this.I7[i8].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void w0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (b) {
            String str = "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")";
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            cVar.b(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.b(-40);
                d dVar = null;
                if (o(Y1) != null && this.Z7) {
                    dVar = this.I7[0].remove(Y1);
                }
                cVar.b(-1);
                cVar.b(-31);
                J0(cVar);
                if (dVar != null) {
                    this.I7[0].put(Y1, dVar);
                }
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.b(-1);
                        cVar.b(readByte);
                        h(dataInputStream, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.b(-1);
                        cVar.b(readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        cVar.h(readUnsignedShort);
                        int i8 = readUnsignedShort - 2;
                        if (i8 < 0) {
                            throw new IOException("Invalid length");
                        }
                        while (i8 > 0) {
                            int read = dataInputStream.read(bArr, 0, Math.min(i8, 4096));
                            if (read >= 0) {
                                cVar.write(bArr, 0, read);
                                i8 -= read;
                            }
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) == 6) {
                                    if (Arrays.equals(bArr2, R6)) {
                                        int i9 = readUnsignedShort2 - 6;
                                        if (dataInputStream.skipBytes(i9) != i9) {
                                            throw new IOException("Invalid length");
                                        }
                                    }
                                } else {
                                    throw new IOException("Invalid exif");
                                }
                            }
                            cVar.b(-1);
                            cVar.b(readByte);
                            cVar.h(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 >= 0) {
                                    cVar.write(bArr, 0, read2);
                                    readUnsignedShort2 -= read2;
                                }
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void x0(InputStream inputStream, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (b) {
            String str = "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")";
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = y5;
        i(dataInputStream, cVar, bArr.length);
        int i8 = this.S7;
        if (i8 == 0) {
            int readInt = dataInputStream.readInt();
            cVar.d(readInt);
            i(dataInputStream, cVar, readInt + 4 + 4);
        } else {
            i(dataInputStream, cVar, ((i8 - bArr.length) - 4) - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            J0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.s).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.d((int) crc32.getValue());
            d(byteArrayOutputStream);
            h(dataInputStream, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            d(byteArrayOutputStream2);
            throw th;
        }
    }

    private void y(b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new a(bVar));
            } else {
                FileDescriptor fileDescriptor = this.E7;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str3 = this.D7;
                    if (str3 == null) {
                        return;
                    }
                    mediaMetadataRetriever.setDataSource(str3);
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str4 = null;
            if (k21.g.equals(extractMetadata3)) {
                str4 = mediaMetadataRetriever.extractMetadata(29);
                str = mediaMetadataRetriever.extractMetadata(30);
                str2 = mediaMetadataRetriever.extractMetadata(31);
            } else if (k21.g.equals(extractMetadata4)) {
                str4 = mediaMetadataRetriever.extractMetadata(18);
                str = mediaMetadataRetriever.extractMetadata(19);
                str2 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
            }
            if (str4 != null) {
                this.I7[0].put(c, d.m(Integer.parseInt(str4), this.K7));
            }
            if (str != null) {
                this.I7[0].put(d, d.m(Integer.parseInt(str), this.K7));
            }
            if (str2 != null) {
                int i8 = 1;
                int parseInt = Integer.parseInt(str2);
                if (parseInt == 90) {
                    i8 = 6;
                } else if (parseInt == 180) {
                    i8 = 3;
                } else if (parseInt == 270) {
                    i8 = 8;
                }
                this.I7[0].put(h, d.m(i8, this.K7));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.e(parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i9 = parseInt2 + 6;
                        int i10 = parseInt3 - 6;
                        if (Arrays.equals(bArr, R6)) {
                            byte[] bArr2 = new byte[i10];
                            if (bVar.read(bArr2) == i10) {
                                this.S7 = i9;
                                p0(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            boolean z8 = b;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    private void y0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (b) {
            String str = "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")";
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = E5;
        i(bVar, cVar, bArr.length);
        byte[] bArr2 = F5;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i8 = this.S7;
                    if (i8 != 0) {
                        i(bVar, cVar2, ((i8 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        bVar.skipBytes(4);
                        bVar.skipBytes(bVar.readInt());
                        J0(cVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) == 4) {
                            byte[] bArr4 = K5;
                            if (Arrays.equals(bArr3, bArr4)) {
                                int readInt = bVar.readInt();
                                boolean z8 = true;
                                byte[] bArr5 = new byte[readInt % 2 == 1 ? readInt + 1 : readInt];
                                bVar.read(bArr5);
                                bArr5[0] = (byte) (bArr5[0] | 8);
                                if (((bArr5[0] >> 1) & 1) != 1) {
                                    z8 = false;
                                }
                                cVar2.write(bArr4);
                                cVar2.d(readInt);
                                cVar2.write(bArr5);
                                if (z8) {
                                    j(bVar, cVar2, N5, null);
                                    while (true) {
                                        byte[] bArr6 = new byte[4];
                                        inputStream.read(bArr6);
                                        if (!Arrays.equals(bArr6, O5)) {
                                            break;
                                        }
                                        k(bVar, cVar2, bArr6);
                                    }
                                    J0(cVar2);
                                } else {
                                    j(bVar, cVar2, M5, L5);
                                    J0(cVar2);
                                }
                            } else if (Arrays.equals(bArr3, M5) || Arrays.equals(bArr3, L5)) {
                                throw new IOException("WebP files with only VP8 or VP8L chunks are currently not supported");
                            }
                        } else {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                    }
                    h(bVar, cVar2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr7 = F5;
                    cVar.d(size + bArr7.length);
                    cVar.write(bArr7);
                    byteArrayOutputStream2.writeTo(cVar);
                    d(byteArrayOutputStream2);
                } catch (Exception e8) {
                    e = e8;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    d(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
        r13.f(r12.K7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void z(b bVar, int i8, int i9) throws IOException {
        if (b) {
            String str = "getJpegAttributes starting with: " + bVar;
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        bVar.e(i8);
        byte readByte = bVar.readByte();
        byte b8 = -1;
        if (readByte == -1) {
            int i10 = 1;
            int i11 = i8 + 1;
            if (bVar.readByte() != -40) {
                StringBuilder G7 = wo1.G("Invalid marker: ");
                G7.append(Integer.toHexString(readByte & 255));
                throw new IOException(G7.toString());
            }
            int i12 = i11 + 1;
            while (true) {
                byte readByte2 = bVar.readByte();
                if (readByte2 == b8) {
                    int i13 = i12 + i10;
                    byte readByte3 = bVar.readByte();
                    boolean z8 = b;
                    if (z8) {
                        Integer.toHexString(readByte3 & 255);
                    }
                    int i14 = i13 + i10;
                    if (readByte3 != -39 && readByte3 != -38) {
                        int readUnsignedShort = bVar.readUnsignedShort() - 2;
                        int i15 = i14 + 2;
                        if (z8) {
                            Integer.toHexString(readByte3 & 255);
                        }
                        if (readUnsignedShort < 0) {
                            throw new IOException("Invalid length");
                        }
                        if (readByte3 == -31) {
                            byte[] bArr = new byte[readUnsignedShort];
                            bVar.readFully(bArr);
                            int i16 = i15 + readUnsignedShort;
                            byte[] bArr2 = R6;
                            if (F0(bArr, bArr2)) {
                                byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, readUnsignedShort);
                                this.S7 = i15 + bArr2.length;
                                p0(copyOfRange, i9);
                            } else {
                                byte[] bArr3 = S6;
                                if (F0(bArr, bArr3)) {
                                    int length = i15 + bArr3.length;
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, readUnsignedShort);
                                    if (o(Y1) == null) {
                                        this.I7[0].put(Y1, new d(1, copyOfRange2.length, length, copyOfRange2));
                                        this.Z7 = true;
                                    }
                                }
                            }
                            i15 = i16;
                        } else if (readByte3 != -2) {
                            switch (readByte3) {
                                default:
                                    switch (readByte3) {
                                        default:
                                            switch (readByte3) {
                                                default:
                                                    switch (readByte3) {
                                                    }
                                                case -55:
                                                case -54:
                                                case -53:
                                                    if (bVar.skipBytes(i10) == i10) {
                                                        this.I7[i9].put(d, d.i(bVar.readUnsignedShort(), this.K7));
                                                        this.I7[i9].put(c, d.i(bVar.readUnsignedShort(), this.K7));
                                                        readUnsignedShort -= 5;
                                                        break;
                                                    } else {
                                                        throw new IOException("Invalid SOFx");
                                                    }
                                            }
                                        case -59:
                                        case -58:
                                        case -57:
                                            break;
                                    }
                                case -64:
                                case -63:
                                case -62:
                                case -61:
                                    break;
                            }
                            if (readUnsignedShort < 0) {
                                if (bVar.skipBytes(readUnsignedShort) != readUnsignedShort) {
                                    throw new IOException("Invalid JPEG segment");
                                }
                                i12 = i15 + readUnsignedShort;
                                b8 = -1;
                                i10 = 1;
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            byte[] bArr4 = new byte[readUnsignedShort];
                            if (bVar.read(bArr4) == readUnsignedShort) {
                                if (o(P) == null) {
                                    this.I7[i10].put(P, d.h(new String(bArr4, Q6)));
                                }
                            } else {
                                throw new IOException("Invalid exif");
                            }
                        }
                        readUnsignedShort = 0;
                        if (readUnsignedShort < 0) {
                        }
                    }
                } else {
                    StringBuilder G8 = wo1.G("Invalid marker:");
                    G8.append(Integer.toHexString(readByte2 & 255));
                    throw new IOException(G8.toString());
                }
            }
        } else {
            StringBuilder G9 = wo1.G("Invalid marker: ");
            G9.append(Integer.toHexString(readByte & 255));
            throw new IOException(G9.toString());
        }
    }

    @Deprecated
    public boolean A(float[] fArr) {
        double[] B8 = B();
        if (B8 == null) {
            return false;
        }
        fArr[0] = (float) B8[0];
        fArr[1] = (float) B8[1];
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void A0(@x1 String str, @z1 String str2) {
        f fVar;
        int i8;
        int i9;
        Matcher matcher;
        String str3 = str;
        String str4 = str2;
        Objects.requireNonNull(str3, "tag shouldn't be null");
        if (d0.equals(str3)) {
            str3 = e0;
        }
        int i10 = 2;
        int i11 = 1;
        if (str4 != null && O6.contains(str3)) {
            if (str3.equals(j1)) {
                if (!C7.matcher(str4).find()) {
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new h(Double.parseDouble(str2)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        char c8 = 0;
        int i12 = 0;
        while (i12 < I6.length) {
            if ((i12 != 4 || this.L7) && (fVar = N6[i12].get(str3)) != null) {
                if (str4 == null) {
                    this.I7[i12].remove(str3);
                } else {
                    Pair<Integer, Integer> P7 = P(str4);
                    if (fVar.c != ((Integer) P7.first).intValue() && fVar.c != ((Integer) P7.second).intValue()) {
                        int i13 = fVar.d;
                        if (i13 != -1 && (i13 == ((Integer) P7.first).intValue() || fVar.d == ((Integer) P7.second).intValue())) {
                            i8 = fVar.d;
                        } else {
                            int i14 = fVar.c;
                            if (i14 == i11 || i14 == 7 || i14 == i10) {
                                i8 = i14;
                            } else if (b) {
                                String[] strArr = l6;
                                String str5 = strArr[i14];
                                if (fVar.d != -1) {
                                    StringBuilder G7 = wo1.G(", ");
                                    G7.append(strArr[fVar.d]);
                                    G7.toString();
                                }
                                String str6 = strArr[((Integer) P7.first).intValue()];
                                if (((Integer) P7.second).intValue() != -1) {
                                    StringBuilder G8 = wo1.G(", ");
                                    G8.append(strArr[((Integer) P7.second).intValue()]);
                                    G8.toString();
                                }
                            }
                        }
                    } else {
                        i8 = fVar.c;
                    }
                    switch (i8) {
                        case 1:
                            i9 = i12;
                            this.I7[i9].put(str3, d.a(str4));
                            continue;
                            i12 = i9 + 1;
                            i10 = 2;
                            i11 = 1;
                            c8 = 0;
                        case 2:
                        case 7:
                            i9 = i12;
                            this.I7[i9].put(str3, d.h(str4));
                            continue;
                            i12 = i9 + 1;
                            i10 = 2;
                            i11 = 1;
                            c8 = 0;
                        case 3:
                            i9 = i12;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i15 = 0; i15 < split.length; i15++) {
                                iArr[i15] = Integer.parseInt(split[i15]);
                            }
                            this.I7[i9].put(str3, d.n(iArr, this.K7));
                            continue;
                            i12 = i9 + 1;
                            i10 = 2;
                            i11 = 1;
                            c8 = 0;
                        case 4:
                            i9 = i12;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i16 = 0; i16 < split2.length; i16++) {
                                jArr[i16] = Long.parseLong(split2[i16]);
                            }
                            this.I7[i9].put(str3, d.j(jArr, this.K7));
                            continue;
                            i12 = i9 + 1;
                            i10 = 2;
                            i11 = 1;
                            c8 = 0;
                        case 5:
                            i9 = i12;
                            String[] split3 = str4.split(",", -1);
                            h[] hVarArr = new h[split3.length];
                            for (int i17 = 0; i17 < split3.length; i17++) {
                                String[] split4 = split3[i17].split("/", -1);
                                hVarArr[i17] = new h((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            this.I7[i9].put(str3, d.l(hVarArr, this.K7));
                            continue;
                            i12 = i9 + 1;
                            i10 = 2;
                            i11 = 1;
                            c8 = 0;
                        case 9:
                            i9 = i12;
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i18 = 0; i18 < split5.length; i18++) {
                                iArr2[i18] = Integer.parseInt(split5[i18]);
                            }
                            this.I7[i9].put(str3, d.e(iArr2, this.K7));
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            h[] hVarArr2 = new h[split6.length];
                            int i19 = 0;
                            while (i19 < split6.length) {
                                String[] split7 = split6[i19].split("/", -1);
                                hVarArr2[i19] = new h((long) Double.parseDouble(split7[c8]), (long) Double.parseDouble(split7[i11]));
                                i19++;
                                i11 = 1;
                                i12 = i12;
                                c8 = 0;
                            }
                            i9 = i12;
                            this.I7[i9].put(str3, d.g(hVarArr2, this.K7));
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i20 = 0; i20 < split8.length; i20++) {
                                dArr[i20] = Double.parseDouble(split8[i20]);
                            }
                            this.I7[i12].put(str3, d.c(dArr, this.K7));
                            break;
                    }
                    i12 = i9 + 1;
                    i10 = 2;
                    i11 = 1;
                    c8 = 0;
                }
            }
            i9 = i12;
            i12 = i9 + 1;
            i10 = 2;
            i11 = 1;
            c8 = 0;
        }
    }

    @z1
    public double[] B() {
        String o8 = o(e1);
        String o9 = o(d1);
        String o10 = o(g1);
        String o11 = o(f1);
        if (o8 == null || o9 == null || o10 == null || o11 == null) {
            return null;
        }
        try {
            return new double[]{f(o8, o9), f(o10, o11)};
        } catch (IllegalArgumentException unused) {
            String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", o8, o9, o10, o11);
            return null;
        }
    }

    @i2({i2.a.LIBRARY})
    public void B0(long j8) {
        A0(z, T5.format(new Date(j8)));
        A0(W, Long.toString(j8 % 1000));
    }

    public void C0(Location location) {
        if (location == null) {
            return;
        }
        A0(D1, location.getProvider());
        D0(location.getLatitude(), location.getLongitude());
        z0(location.getAltitude());
        A0(o1, "K");
        A0(p1, new h((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        String[] split = T5.format(new Date(location.getTime())).split("\\s+", -1);
        A0(F1, split[0]);
        A0(j1, split[1]);
    }

    public void D0(double d8, double d9) {
        if (d8 >= -90.0d && d8 <= 90.0d && !Double.isNaN(d8)) {
            if (d9 >= -180.0d && d9 <= 180.0d && !Double.isNaN(d9)) {
                A0(d1, d8 >= zg2.s ? "N" : "S");
                A0(e1, e(Math.abs(d8)));
                A0(f1, d9 >= zg2.s ? "E" : y4);
                A0(g1, e(Math.abs(d9)));
                return;
            }
            throw new IllegalArgumentException("Longitude value " + d9 + " is not valid.");
        }
        throw new IllegalArgumentException("Latitude value " + d8 + " is not valid.");
    }

    public int H() {
        switch (r(h, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @z1
    public byte[] K() {
        int i8 = this.R7;
        if (i8 == 6 || i8 == 7) {
            return M();
        }
        return null;
    }

    @z1
    public Bitmap L() {
        if (this.L7) {
            if (this.Q7 == null) {
                this.Q7 = M();
            }
            int i8 = this.R7;
            if (i8 == 6 || i8 == 7) {
                return BitmapFactory.decodeByteArray(this.Q7, 0, this.P7);
            }
            if (i8 == 1) {
                int length = this.Q7.length / 3;
                int[] iArr = new int[length];
                for (int i9 = 0; i9 < length; i9++) {
                    byte[] bArr = this.Q7;
                    int i10 = i9 * 3;
                    iArr[i9] = (bArr[i10] << 16) + 0 + (bArr[i10 + 1] << 8) + bArr[i10 + 2];
                }
                d dVar = this.I7[4].get(d);
                d dVar2 = this.I7[4].get(c);
                if (dVar != null && dVar2 != null) {
                    return Bitmap.createBitmap(iArr, dVar2.p(this.K7), dVar.p(this.K7), Bitmap.Config.ARGB_8888);
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[Catch: all -> 0x008a, Exception -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x00a3, all -> 0x008a, blocks: (B:33:0x0057, B:36:0x0067, B:38:0x0073, B:43:0x007e, B:44:0x0083, B:45:0x0084, B:46:0x0089, B:50:0x008f, B:51:0x0094), top: B:67:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f A[Catch: all -> 0x008a, Exception -> 0x00a3, TryCatch #6 {Exception -> 0x00a3, all -> 0x008a, blocks: (B:33:0x0057, B:36:0x0067, B:38:0x0073, B:43:0x007e, B:44:0x0083, B:45:0x0084, B:46:0x0089, B:50:0x008f, B:51:0x0094), top: B:67:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] M() {
        Throwable th;
        FileDescriptor fileDescriptor;
        InputStream inputStream;
        Throwable th2;
        InputStream inputStream2 = null;
        if (!this.L7) {
            return null;
        }
        byte[] bArr = this.Q7;
        if (bArr != null) {
            return bArr;
        }
        try {
            inputStream = this.F7;
            try {
                if (inputStream != null) {
                    try {
                        if (inputStream.markSupported()) {
                            inputStream.reset();
                        } else {
                            d(inputStream);
                            return null;
                        }
                    } catch (Exception unused) {
                        fileDescriptor = null;
                        d(inputStream);
                        if (fileDescriptor != null) {
                        }
                        return null;
                    } catch (Throwable th3) {
                        inputStream2 = inputStream;
                        th = th3;
                        fileDescriptor = null;
                        d(inputStream2);
                        if (fileDescriptor != null) {
                        }
                        throw th;
                    }
                } else if (this.D7 != null) {
                    inputStream = new FileInputStream(this.D7);
                } else {
                    FileDescriptor fileDescriptor2 = this.E7;
                    if (fileDescriptor2 != null) {
                        FileDescriptor dup = Os.dup(fileDescriptor2);
                        try {
                            Os.lseek(dup, 0L, OsConstants.SEEK_SET);
                            fileDescriptor = dup;
                            inputStream = new FileInputStream(dup);
                        } catch (Exception unused2) {
                            fileDescriptor = dup;
                            inputStream = null;
                            d(inputStream);
                            if (fileDescriptor != null) {
                                c(fileDescriptor);
                            }
                            return null;
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileDescriptor = dup;
                            th = th2;
                            d(inputStream2);
                            if (fileDescriptor != null) {
                                c(fileDescriptor);
                            }
                            throw th;
                        }
                    } else {
                        inputStream = null;
                        fileDescriptor = null;
                    }
                    if (inputStream == null) {
                        if (inputStream.skip(this.O7) == this.O7) {
                            byte[] bArr2 = new byte[this.P7];
                            if (inputStream.read(bArr2) == this.P7) {
                                this.Q7 = bArr2;
                                d(inputStream);
                                if (fileDescriptor != null) {
                                    c(fileDescriptor);
                                }
                                return bArr2;
                            }
                            throw new IOException("Corrupted image");
                        }
                        throw new IOException("Corrupted image");
                    }
                    throw new FileNotFoundException();
                }
                if (inputStream == null) {
                }
            } catch (Exception unused3) {
                d(inputStream);
                if (fileDescriptor != null) {
                }
                return null;
            } catch (Throwable th5) {
                th2 = th5;
                inputStream2 = inputStream;
                th = th2;
                d(inputStream2);
                if (fileDescriptor != null) {
                }
                throw th;
            }
            fileDescriptor = null;
        } catch (Exception unused4) {
            inputStream = null;
            fileDescriptor = null;
        } catch (Throwable th6) {
            th = th6;
            fileDescriptor = null;
        }
    }

    @z1
    public long[] N() {
        if (!this.Y7) {
            if (this.L7) {
                if (!this.M7 || this.N7) {
                    return new long[]{this.O7, this.P7};
                }
                return null;
            }
            return null;
        }
        throw new IllegalStateException("The underlying file has been modified since being parsed");
    }

    public boolean S(@x1 String str) {
        return w(str) != null;
    }

    public boolean T() {
        return this.L7;
    }

    public boolean W() {
        int r8 = r(h, 1);
        return r8 == 2 || r8 == 7 || r8 == 4 || r8 == 5;
    }

    public boolean i0() {
        if (this.L7) {
            int i8 = this.R7;
            return i8 == 6 || i8 == 7;
        }
        return false;
    }

    public void l() {
        int i8 = 1;
        switch (r(h, 1)) {
            case 1:
                i8 = 2;
                break;
            case 2:
                break;
            case 3:
                i8 = 4;
                break;
            case 4:
                i8 = 3;
                break;
            case 5:
                i8 = 6;
                break;
            case 6:
                i8 = 5;
                break;
            case 7:
                i8 = 8;
                break;
            case 8:
                i8 = 7;
                break;
            default:
                i8 = 0;
                break;
        }
        A0(h, Integer.toString(i8));
    }

    public void m() {
        int i8 = 1;
        switch (r(h, 1)) {
            case 1:
                i8 = 4;
                break;
            case 2:
                i8 = 3;
                break;
            case 3:
                i8 = 2;
                break;
            case 4:
                break;
            case 5:
                i8 = 8;
                break;
            case 6:
                i8 = 7;
                break;
            case 7:
                i8 = 6;
                break;
            case 8:
                i8 = 5;
                break;
            default:
                i8 = 0;
                break;
        }
        A0(h, Integer.toString(i8));
    }

    public double n(double d8) {
        double q8 = q(i1, -1.0d);
        int r8 = r(h1, -1);
        if (q8 < zg2.s || r8 < 0) {
            return d8;
        }
        return q8 * (r8 != 1 ? 1 : -1);
    }

    @z1
    public String o(@x1 String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d w8 = w(str);
        if (w8 != null) {
            if (!O6.contains(str)) {
                return w8.q(this.K7);
            }
            if (str.equals(j1)) {
                int i8 = w8.b;
                if (i8 == 5 || i8 == 10) {
                    h[] hVarArr = (h[]) w8.r(this.K7);
                    if (hVarArr != null && hVarArr.length == 3) {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) hVarArr[0].a) / ((float) hVarArr[0].b))), Integer.valueOf((int) (((float) hVarArr[1].a) / ((float) hVarArr[1].b))), Integer.valueOf((int) (((float) hVarArr[2].a) / ((float) hVarArr[2].b))));
                    }
                    Arrays.toString(hVarArr);
                    return null;
                }
                return null;
            }
            try {
                return Double.toString(w8.o(this.K7));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @z1
    public byte[] p(@x1 String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d w8 = w(str);
        if (w8 != null) {
            return w8.e;
        }
        return null;
    }

    public double q(@x1 String str, double d8) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d w8 = w(str);
        if (w8 == null) {
            return d8;
        }
        try {
            return w8.o(this.K7);
        } catch (NumberFormatException unused) {
            return d8;
        }
    }

    public int r(@x1 String str, int i8) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d w8 = w(str);
        if (w8 == null) {
            return i8;
        }
        try {
            return w8.p(this.K7);
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    @z1
    public long[] s(@x1 String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if (!this.Y7) {
            d w8 = w(str);
            if (w8 != null) {
                return new long[]{w8.d, w8.e.length};
            }
            return null;
        }
        throw new IllegalStateException("The underlying file has been modified since being parsed");
    }

    public void s0() {
        A0(h, Integer.toString(1));
    }

    @i2({i2.a.LIBRARY})
    public long t() {
        return l0(o(z), o(W));
    }

    @i2({i2.a.LIBRARY})
    public long u() {
        return l0(o(S), o(Y));
    }

    public void u0(int i8) {
        if (i8 % 90 == 0) {
            int r8 = r(h, 1);
            List<Integer> list = r2;
            if (list.contains(Integer.valueOf(r8))) {
                int indexOf = ((i8 / 90) + list.indexOf(Integer.valueOf(r8))) % 4;
                r4 = list.get(indexOf + (indexOf < 0 ? 4 : 0)).intValue();
            } else {
                List<Integer> list2 = s2;
                if (list2.contains(Integer.valueOf(r8))) {
                    int indexOf2 = ((i8 / 90) + list2.indexOf(Integer.valueOf(r8))) % 4;
                    r4 = list2.get(indexOf2 + (indexOf2 < 0 ? 4 : 0)).intValue();
                }
            }
            A0(h, Integer.toString(r4));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }

    @i2({i2.a.LIBRARY})
    public long v() {
        return l0(o(R), o(X));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(6:(2:16|(1:18)(2:70|71))(2:72|(17:74|75|76|77|78|20|21|22|(1:24)(2:62|(1:64)(1:65))|25|27|28|29|30|(1:32)(2:35|(1:37)(2:38|(1:40)))|33|34)(1:96))|29|30|(0)(0)|33|34)|21|22|(0)(0)|25|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fe, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0103, code lost:
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2 A[Catch: all -> 0x0106, Exception -> 0x0109, TryCatch #13 {Exception -> 0x0109, all -> 0x0106, blocks: (B:41:0x00a9, B:43:0x00b2, B:48:0x00cc, B:44:0x00ba, B:46:0x00be), top: B:101:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[Catch: all -> 0x0106, Exception -> 0x0109, TryCatch #13 {Exception -> 0x0109, all -> 0x0106, blocks: (B:41:0x00a9, B:43:0x00b2, B:48:0x00cc, B:44:0x00ba, B:46:0x00be), top: B:101:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[Catch: all -> 0x00fa, Exception -> 0x00fc, TryCatch #11 {Exception -> 0x00fc, all -> 0x00fa, blocks: (B:50:0x00d6, B:52:0x00db, B:55:0x00e3, B:58:0x00eb), top: B:105:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v0() throws IOException {
        ?? r62;
        File file;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        BufferedInputStream bufferedInputStream;
        int i8;
        if (f0()) {
            if (this.E7 == null && this.D7 == null) {
                throw new IOException("ExifInterface does not support saving attributes for the current input.");
            }
            this.Y7 = true;
            this.Q7 = K();
            InputStream inputStream = null;
            File file2 = this.D7 != null ? new File(this.D7) : null;
            try {
                try {
                    try {
                        if (this.D7 != null) {
                            file = new File(this.D7 + ".tmp");
                            if (!file2.renameTo(file)) {
                                throw new IOException("Couldn't rename to " + file.getAbsolutePath());
                            }
                            fileInputStream = null;
                        } else if (this.E7 != null) {
                            file = File.createTempFile("temp", "tmp");
                            Os.lseek(this.E7, 0L, OsConstants.SEEK_SET);
                            fileInputStream = new FileInputStream(this.E7);
                            try {
                                r62 = new FileOutputStream(file);
                            } catch (Exception e8) {
                                e = e8;
                                r62 = 0;
                            } catch (Throwable th) {
                                th = th;
                                r62 = 0;
                            }
                            try {
                                h(fileInputStream, r62);
                                fileInputStream2 = r62;
                                d(fileInputStream);
                                d(fileInputStream2);
                                FileInputStream fileInputStream3 = new FileInputStream(file);
                                if (this.D7 == null) {
                                    fileOutputStream = new FileOutputStream(this.D7);
                                } else {
                                    FileDescriptor fileDescriptor = this.E7;
                                    if (fileDescriptor != null) {
                                        Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream = new FileOutputStream(this.E7);
                                    } else {
                                        fileOutputStream = null;
                                    }
                                }
                                bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                i8 = this.G7;
                                if (i8 != 4) {
                                    w0(bufferedInputStream, bufferedOutputStream);
                                } else if (i8 == 13) {
                                    x0(bufferedInputStream, bufferedOutputStream);
                                } else if (i8 == 14) {
                                    y0(bufferedInputStream, bufferedOutputStream);
                                }
                                d(bufferedInputStream);
                                d(bufferedOutputStream);
                                file.delete();
                                this.Q7 = null;
                                return;
                            } catch (Exception e9) {
                                e = e9;
                                inputStream = fileInputStream;
                                r62 = r62;
                                try {
                                    throw new IOException("Failed to copy original file to temp file", e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    d(inputStream);
                                    d(r62);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = fileInputStream;
                                d(inputStream);
                                d(r62);
                                throw th;
                            }
                        } else {
                            file = null;
                            fileInputStream = null;
                        }
                        i8 = this.G7;
                        if (i8 != 4) {
                        }
                        d(bufferedInputStream);
                        d(bufferedOutputStream);
                        file.delete();
                        this.Q7 = null;
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        inputStream = bufferedInputStream;
                        try {
                            if (this.D7 != null && !file.renameTo(file2)) {
                                throw new IOException("Couldn't restore original file: " + file2.getAbsolutePath());
                            }
                            throw new IOException("Failed to save new file", e);
                        } catch (Throwable th4) {
                            th = th4;
                            d(inputStream);
                            d(bufferedOutputStream);
                            file.delete();
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = bufferedInputStream;
                        d(inputStream);
                        d(bufferedOutputStream);
                        file.delete();
                        throw th;
                    }
                    FileInputStream fileInputStream32 = new FileInputStream(file);
                    if (this.D7 == null) {
                    }
                    bufferedInputStream = new BufferedInputStream(fileInputStream32);
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                } catch (Exception e11) {
                    e = e11;
                    bufferedOutputStream = null;
                } catch (Throwable th6) {
                    th = th6;
                    bufferedOutputStream = null;
                }
                fileInputStream2 = fileInputStream;
                d(fileInputStream);
                d(fileInputStream2);
            } catch (Exception e12) {
                e = e12;
                r62 = 0;
            } catch (Throwable th7) {
                th = th7;
                r62 = 0;
            }
        } else {
            throw new IOException("ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats.");
        }
    }

    @i2({i2.a.LIBRARY})
    public long x() {
        String o8 = o(F1);
        String o9 = o(j1);
        if (o8 != null && o9 != null) {
            Pattern pattern = B7;
            if (pattern.matcher(o8).matches() || pattern.matcher(o9).matches()) {
                try {
                    Date parse = T5.parse(o8 + gl4.R + o9, new ParsePosition(0));
                    if (parse == null) {
                        return -1L;
                    }
                    return parse.getTime();
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return -1L;
    }

    public void z0(double d8) {
        String str = d8 >= zg2.s ? "0" : "1";
        A0(i1, new h(Math.abs(d8)).toString());
        A0(h1, str);
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class f {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public f(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public f(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public bx(@x1 String str) throws IOException {
        f[][] fVarArr = I6;
        this.I7 = new HashMap[fVarArr.length];
        this.J7 = new HashSet(fVarArr.length);
        this.K7 = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        U(str);
    }

    public bx(@x1 FileDescriptor fileDescriptor) throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        f[][] fVarArr = I6;
        this.I7 = new HashMap[fVarArr.length];
        this.J7 = new HashSet(fVarArr.length);
        this.K7 = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(fileDescriptor, "fileDescriptor cannot be null");
        this.F7 = null;
        this.D7 = null;
        boolean z8 = false;
        if (d0(fileDescriptor)) {
            this.E7 = fileDescriptor;
            try {
                fileDescriptor = Os.dup(fileDescriptor);
                z8 = true;
            } catch (Exception e8) {
                throw new IOException("Failed to duplicate file descriptor", e8);
            }
        } else {
            this.E7 = null;
        }
        try {
            fileInputStream = new FileInputStream(fileDescriptor);
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            k0(fileInputStream);
            d(fileInputStream);
            if (z8) {
                c(fileDescriptor);
            }
        } catch (Throwable th3) {
            th = th3;
            d(fileInputStream);
            if (z8) {
                c(fileDescriptor);
            }
            throw th;
        }
    }

    public bx(@x1 InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public bx(@x1 InputStream inputStream, int i8) throws IOException {
        this(inputStream, i8 == 1);
    }

    private bx(@x1 InputStream inputStream, boolean z8) throws IOException {
        f[][] fVarArr = I6;
        this.I7 = new HashMap[fVarArr.length];
        this.J7 = new HashSet(fVarArr.length);
        this.K7 = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.D7 = null;
        if (z8) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            if (!V(bufferedInputStream)) {
                return;
            }
            this.H7 = true;
            this.F7 = null;
            this.E7 = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.F7 = (AssetManager.AssetInputStream) inputStream;
            this.E7 = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (d0(fileInputStream.getFD())) {
                    this.F7 = null;
                    this.E7 = fileInputStream.getFD();
                }
            }
            this.F7 = null;
            this.E7 = null;
        }
        k0(inputStream);
    }
}