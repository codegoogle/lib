package com.p7700g.p99005;

import java.util.Locale;

/* compiled from: GifError.java */
/* loaded from: classes4.dex */
public enum rx5 {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(1002, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(1003, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    
    @x1
    public final String O;
    public int P;

    rx5(int i, @x1 String str) {
        this.P = i;
        this.O = str;
    }

    public static rx5 b(int i) {
        rx5[] values = values();
        for (int i2 = 0; i2 < 21; i2++) {
            rx5 rx5Var = values[i2];
            if (rx5Var.P == i) {
                return rx5Var;
            }
        }
        rx5 rx5Var2 = UNKNOWN;
        rx5Var2.P = i;
        return rx5Var2;
    }

    public int f() {
        return this.P;
    }

    public String g() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.P), this.O);
    }
}