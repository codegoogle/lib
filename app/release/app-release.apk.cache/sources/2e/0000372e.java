package com.microsoft.appcenter.crashes.utils;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.appcompat.widget.ActivityChooserModel;
import com.microsoft.appcenter.Constants;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.crashes.ingestion.models.Exception;
import com.microsoft.appcenter.crashes.ingestion.models.ManagedErrorLog;
import com.microsoft.appcenter.crashes.ingestion.models.StackFrame;
import com.microsoft.appcenter.crashes.ingestion.models.Thread;
import com.microsoft.appcenter.crashes.model.ErrorReport;
import com.microsoft.appcenter.ingestion.models.Device;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import com.microsoft.appcenter.utils.context.UserIdContext;
import com.microsoft.appcenter.utils.storage.FileManager;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class ErrorLogHelper {
    @r2
    public static final int CAUSE_LIMIT = 16;
    private static final int CAUSE_LIMIT_HALF = 8;
    public static final String DEVICE_INFO_FILE = "deviceInfo";
    @r2
    public static String DEVICE_INFO_KEY = "DEVICE_INFO";
    @r2
    public static final String ERROR_DIRECTORY = "error";
    public static final String ERROR_LOG_FILE_EXTENSION = ".json";
    @r2
    public static final int FRAME_LIMIT = 256;
    private static final int FRAME_LIMIT_HALF = 128;
    private static final int MAX_PROPERTY_COUNT = 20;
    public static final int MAX_PROPERTY_ITEM_LENGTH = 125;
    private static final String MINIDUMP_DIRECTORY = "minidump";
    public static final String MINIDUMP_FILE_EXTENSION = ".dmp";
    private static final String NEW_MINIDUMP_DIRECTORY = "new";
    private static final String PENDING_MINIDUMP_DIRECTORY = "pending";
    public static final String THROWABLE_FILE_EXTENSION = ".throwable";
    @r2
    public static String USER_ID_KEY = "USER_ID";
    private static File sErrorLogDirectory;
    private static File sNewMinidumpDirectory;
    private static File sPendingMinidumpDirectory;

    public static void cleanPendingMinidumps() {
        FileManager.cleanDirectory(getPendingMinidumpDirectory());
    }

    @r2
    public static void clearStaticState() {
        sNewMinidumpDirectory = null;
        sErrorLogDirectory = null;
        sPendingMinidumpDirectory = null;
    }

    @x1
    public static ManagedErrorLog createErrorLog(@x1 Context context, @x1 Thread thread, @x1 Throwable th, @x1 Map<Thread, StackTraceElement[]> map, long j) {
        return createErrorLog(context, thread, getModelExceptionFromThrowable(th), map, j, true);
    }

    @TargetApi(21)
    private static String getArchitecture() {
        return Build.SUPPORTED_ABIS[0];
    }

    public static String getContextInformation(File file) {
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.microsoft.appcenter.crashes.utils.ErrorLogHelper.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return str.equals(ErrorLogHelper.DEVICE_INFO_FILE);
            }
        });
        if (listFiles != null && listFiles.length != 0) {
            String read = FileManager.read(listFiles[0]);
            if (read == null) {
                AppCenterLog.error(Crashes.LOG_TAG, "Failed to read stored device info.");
                return null;
            }
            return read;
        }
        AppCenterLog.warn(Crashes.LOG_TAG, "No stored deviceinfo file found in a minidump folder.");
        return null;
    }

    @x1
    public static ErrorReport getErrorReportFromErrorLog(@x1 ManagedErrorLog managedErrorLog, String str) {
        ErrorReport errorReport = new ErrorReport();
        errorReport.setId(managedErrorLog.getId().toString());
        errorReport.setThreadName(managedErrorLog.getErrorThreadName());
        errorReport.setStackTrace(str);
        errorReport.setAppStartTime(managedErrorLog.getAppLaunchTimestamp());
        errorReport.setAppErrorTime(managedErrorLog.getTimestamp());
        errorReport.setDevice(managedErrorLog.getDevice());
        return errorReport;
    }

    @x1
    public static synchronized File getErrorStorageDirectory() {
        File file;
        synchronized (ErrorLogHelper.class) {
            if (sErrorLogDirectory == null) {
                File file2 = new File(Constants.FILES_PATH, "error");
                sErrorLogDirectory = file2;
                FileManager.mkdir(file2.getAbsolutePath());
            }
            file = sErrorLogDirectory;
        }
        return file;
    }

    @z1
    public static File getLastErrorLogFile() {
        return FileManager.lastModifiedFile(getErrorStorageDirectory(), new FilenameFilter() { // from class: com.microsoft.appcenter.crashes.utils.ErrorLogHelper.4
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(ErrorLogHelper.ERROR_LOG_FILE_EXTENSION);
            }
        });
    }

    @x1
    public static Exception getModelExceptionFromThrowable(@x1 Throwable th) {
        LinkedList<Throwable> linkedList = new LinkedList();
        while (th != null) {
            linkedList.add(th);
            th = th.getCause();
        }
        if (linkedList.size() > 16) {
            StringBuilder G = wo1.G("Crash causes truncated from ");
            G.append(linkedList.size());
            G.append(" to ");
            G.append(16);
            G.append(" causes.");
            AppCenterLog.warn(Crashes.LOG_TAG, G.toString());
            linkedList.subList(8, linkedList.size() - 8).clear();
        }
        Exception exception = null;
        Exception exception2 = null;
        for (Throwable th2 : linkedList) {
            Exception exception3 = new Exception();
            exception3.setType(th2.getClass().getName());
            exception3.setMessage(th2.getMessage());
            exception3.setFrames(getModelFramesFromStackTrace(th2));
            if (exception == null) {
                exception = exception3;
            } else {
                exception2.setInnerExceptions(Collections.singletonList(exception3));
            }
            exception2 = exception3;
        }
        return exception;
    }

    @x1
    private static List<StackFrame> getModelFramesFromStackTrace(@x1 Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > 256) {
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[256];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, 128);
            System.arraycopy(stackTrace, stackTrace.length - 128, stackTraceElementArr, 128, 128);
            th.setStackTrace(stackTraceElementArr);
            StringBuilder G = wo1.G("Crash frames truncated from ");
            G.append(stackTrace.length);
            G.append(" to ");
            G.append(256);
            G.append(" frames.");
            AppCenterLog.warn(Crashes.LOG_TAG, G.toString());
            stackTrace = stackTraceElementArr;
        }
        return getModelFramesFromStackTrace(stackTrace);
    }

    @x1
    private static StackFrame getModelStackFrame(StackTraceElement stackTraceElement) {
        StackFrame stackFrame = new StackFrame();
        stackFrame.setClassName(stackTraceElement.getClassName());
        stackFrame.setMethodName(stackTraceElement.getMethodName());
        stackFrame.setLineNumber(Integer.valueOf(stackTraceElement.getLineNumber()));
        stackFrame.setFileName(stackTraceElement.getFileName());
        return stackFrame;
    }

    @x1
    public static synchronized File getNewMinidumpDirectory() {
        File file;
        synchronized (ErrorLogHelper.class) {
            file = new File(new File(getErrorStorageDirectory().getAbsolutePath(), "minidump"), NEW_MINIDUMP_DIRECTORY);
        }
        return file;
    }

    @x1
    public static File[] getNewMinidumpFiles() {
        File[] listFiles = getNewMinidumpDirectory().listFiles();
        return listFiles != null ? listFiles : new File[0];
    }

    @x1
    public static synchronized File getNewMinidumpSubfolder() {
        File file;
        synchronized (ErrorLogHelper.class) {
            if (sNewMinidumpDirectory == null) {
                File file2 = new File(getNewMinidumpDirectory(), UUID.randomUUID().toString());
                sNewMinidumpDirectory = file2;
                FileManager.mkdir(file2.getPath());
            }
            file = sNewMinidumpDirectory;
        }
        return file;
    }

    @x1
    public static synchronized File getNewMinidumpSubfolderWithContextData(Context context) {
        File newMinidumpSubfolder;
        synchronized (ErrorLogHelper.class) {
            newMinidumpSubfolder = getNewMinidumpSubfolder();
            File file = new File(newMinidumpSubfolder, DEVICE_INFO_FILE);
            try {
                Device deviceInfo = DeviceInfoHelper.getDeviceInfo(context);
                String userId = UserIdContext.getInstance().getUserId();
                deviceInfo.setWrapperSdkName(Constants.WRAPPER_SDK_NAME_NDK);
                JSONStringer jSONStringer = new JSONStringer();
                jSONStringer.object();
                deviceInfo.write(jSONStringer);
                jSONStringer.endObject();
                String jSONStringer2 = jSONStringer.toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DEVICE_INFO_KEY, jSONStringer2);
                jSONObject.put(USER_ID_KEY, userId);
                FileManager.write(file, jSONObject.toString());
            } catch (DeviceInfoHelper.DeviceInfoException | IOException | JSONException e) {
                AppCenterLog.error(Crashes.LOG_TAG, "Failed to store device info in a minidump folder.", e);
                file.delete();
            }
        }
        return newMinidumpSubfolder;
    }

    @x1
    public static synchronized File getPendingMinidumpDirectory() {
        File file;
        synchronized (ErrorLogHelper.class) {
            if (sPendingMinidumpDirectory == null) {
                File file2 = new File(new File(getErrorStorageDirectory().getAbsolutePath(), "minidump"), PENDING_MINIDUMP_DIRECTORY);
                sPendingMinidumpDirectory = file2;
                FileManager.mkdir(file2.getPath());
            }
            file = sPendingMinidumpDirectory;
        }
        return file;
    }

    @z1
    public static Device getStoredDeviceInfo(File file) {
        String contextInformation = getContextInformation(file);
        if (contextInformation == null) {
            return null;
        }
        return parseDevice(contextInformation);
    }

    @z1
    public static File getStoredErrorLogFile(@x1 UUID uuid) {
        return getStoredFile(uuid, ERROR_LOG_FILE_EXTENSION);
    }

    @x1
    public static File[] getStoredErrorLogFiles() {
        File[] listFiles = getErrorStorageDirectory().listFiles(new FilenameFilter() { // from class: com.microsoft.appcenter.crashes.utils.ErrorLogHelper.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(ErrorLogHelper.ERROR_LOG_FILE_EXTENSION);
            }
        });
        return listFiles != null ? listFiles : new File[0];
    }

    @z1
    private static File getStoredFile(@x1 final UUID uuid, @x1 final String str) {
        File[] listFiles = getErrorStorageDirectory().listFiles(new FilenameFilter() { // from class: com.microsoft.appcenter.crashes.utils.ErrorLogHelper.6
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2.startsWith(uuid.toString()) && str2.endsWith(str);
            }
        });
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        return listFiles[0];
    }

    @z1
    public static File getStoredThrowableFile(@x1 UUID uuid) {
        return getStoredFile(uuid, THROWABLE_FILE_EXTENSION);
    }

    public static String getStoredUserInfo(File file) {
        String contextInformation = getContextInformation(file);
        if (contextInformation == null) {
            return null;
        }
        return parseUserId(contextInformation);
    }

    @r2
    public static Device parseDevice(String str) {
        try {
            Device device = new Device();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(DEVICE_INFO_KEY)) {
                jSONObject = new JSONObject(jSONObject.getString(DEVICE_INFO_KEY));
            }
            device.read(jSONObject);
            return device;
        } catch (JSONException e) {
            AppCenterLog.error(Crashes.LOG_TAG, "Failed to deserialize device info.", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UUID parseLogFolderUuid(File file) {
        UUID fromString;
        if (file.isDirectory()) {
            try {
                fromString = UUID.fromString(file.getName());
            } catch (IllegalArgumentException e) {
                AppCenterLog.warn(Crashes.LOG_TAG, "Cannot parse minidump folder name to UUID.", e);
            }
            return fromString != null ? UUID.randomUUID() : fromString;
        }
        fromString = null;
        if (fromString != null) {
        }
    }

    @r2
    public static String parseUserId(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(USER_ID_KEY)) {
                return jSONObject.getString(USER_ID_KEY);
            }
            return null;
        } catch (JSONException e) {
            AppCenterLog.error(Crashes.LOG_TAG, "Failed to deserialize user info.", e);
            return null;
        }
    }

    public static void removeLostThrowableFiles() {
        File[] listFiles = getErrorStorageDirectory().listFiles(new FilenameFilter() { // from class: com.microsoft.appcenter.crashes.utils.ErrorLogHelper.5
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(ErrorLogHelper.THROWABLE_FILE_EXTENSION);
            }
        });
        if (listFiles == null || listFiles.length <= 0) {
            return;
        }
        for (File file : listFiles) {
            removeStoredThrowableFile(UUID.fromString(file.getName().replaceFirst("\\.[^.]+$", "")));
        }
    }

    public static void removeMinidumpFolder() {
        FileManager.deleteDirectory(new File(getErrorStorageDirectory().getAbsolutePath(), "minidump"));
    }

    public static void removeStaleMinidumpSubfolders() {
        File[] listFiles = getNewMinidumpDirectory().listFiles(new FilenameFilter() { // from class: com.microsoft.appcenter.crashes.utils.ErrorLogHelper.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (ErrorLogHelper.sNewMinidumpDirectory != null) {
                    return !str.equals(ErrorLogHelper.sNewMinidumpDirectory.getName());
                }
                return true;
            }
        });
        if (listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                FileManager.deleteDirectory(file);
            }
            return;
        }
        AppCenterLog.debug(Crashes.LOG_TAG, "No previous minidump sub-folders.");
    }

    public static void removeStoredErrorLogFile(@x1 UUID uuid) {
        File storedErrorLogFile = getStoredErrorLogFile(uuid);
        if (storedErrorLogFile != null) {
            StringBuilder G = wo1.G("Deleting error log file ");
            G.append(storedErrorLogFile.getName());
            AppCenterLog.info(Crashes.LOG_TAG, G.toString());
            FileManager.delete(storedErrorLogFile);
        }
    }

    public static void removeStoredThrowableFile(@x1 UUID uuid) {
        File storedThrowableFile = getStoredThrowableFile(uuid);
        if (storedThrowableFile != null) {
            StringBuilder G = wo1.G("Deleting throwable file ");
            G.append(storedThrowableFile.getName());
            AppCenterLog.info(Crashes.LOG_TAG, G.toString());
            FileManager.delete(storedThrowableFile);
        }
    }

    public static void setErrorLogDirectory(File file) {
        sErrorLogDirectory = file;
    }

    public static Map<String, String> validateProperties(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (hashMap.size() >= 20) {
                AppCenterLog.warn(Crashes.LOG_TAG, String.format("%s : properties cannot contain more than %s items. Skipping other properties.", str, 20));
                break;
            } else if (key == null || key.isEmpty()) {
                AppCenterLog.warn(Crashes.LOG_TAG, String.format("%s : a property key cannot be null or empty. Property will be skipped.", str));
            } else if (value == null) {
                AppCenterLog.warn(Crashes.LOG_TAG, String.format("%s : property '%s' : property value cannot be null. Property '%s' will be skipped.", str, key, key));
            } else {
                if (key.length() > 125) {
                    AppCenterLog.warn(Crashes.LOG_TAG, String.format("%s : property '%s' : property key length cannot be longer than %s characters. Property key will be truncated.", str, key, 125));
                    key = key.substring(0, 125);
                }
                if (value.length() > 125) {
                    AppCenterLog.warn(Crashes.LOG_TAG, String.format("%s : property '%s' : property value cannot be longer than %s characters. Property value will be truncated.", str, key, 125));
                    value = value.substring(0, 125);
                }
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    @x1
    public static ManagedErrorLog createErrorLog(@x1 Context context, @x1 Thread thread, @x1 Exception exception, @x1 Map<Thread, StackTraceElement[]> map, long j, boolean z) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ManagedErrorLog managedErrorLog = new ManagedErrorLog();
        managedErrorLog.setId(UUID.randomUUID());
        managedErrorLog.setTimestamp(new Date());
        managedErrorLog.setUserId(UserIdContext.getInstance().getUserId());
        try {
            managedErrorLog.setDevice(DeviceInfoHelper.getDeviceInfo(context));
        } catch (DeviceInfoHelper.DeviceInfoException e) {
            AppCenterLog.error(Crashes.LOG_TAG, "Could not attach device properties snapshot to error log, will attach at sending time", e);
        }
        managedErrorLog.setProcessId(Integer.valueOf(Process.myPid()));
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == Process.myPid()) {
                    managedErrorLog.setProcessName(runningAppProcessInfo.processName);
                }
            }
        }
        if (managedErrorLog.getProcessName() == null) {
            managedErrorLog.setProcessName("");
        }
        managedErrorLog.setArchitecture(getArchitecture());
        managedErrorLog.setErrorThreadId(Long.valueOf(thread.getId()));
        managedErrorLog.setErrorThreadName(thread.getName());
        managedErrorLog.setFatal(Boolean.valueOf(z));
        managedErrorLog.setAppLaunchTimestamp(new Date(j));
        managedErrorLog.setException(exception);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread thread2 = new Thread();
            thread2.setId(entry.getKey().getId());
            thread2.setName(entry.getKey().getName());
            thread2.setFrames(getModelFramesFromStackTrace(entry.getValue()));
            arrayList.add(thread2);
        }
        managedErrorLog.setThreads(arrayList);
        return managedErrorLog;
    }

    @x1
    private static List<StackFrame> getModelFramesFromStackTrace(@x1 StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(getModelStackFrame(stackTraceElement));
        }
        return arrayList;
    }
}