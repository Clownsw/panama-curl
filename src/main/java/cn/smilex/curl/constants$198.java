// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$198 {

    static final FunctionDescriptor DeleteVolumeMountPointW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteVolumeMountPointW$MH = RuntimeHelper.downcallHandle(
        "DeleteVolumeMountPointW",
        constants$198.DeleteVolumeMountPointW$FUNC
    );
    static final FunctionDescriptor FileTimeToLocalFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileTimeToLocalFileTime$MH = RuntimeHelper.downcallHandle(
        "FileTimeToLocalFileTime",
        constants$198.FileTimeToLocalFileTime$FUNC
    );
    static final FunctionDescriptor FindClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindClose$MH = RuntimeHelper.downcallHandle(
        "FindClose",
        constants$198.FindClose$FUNC
    );
    static final FunctionDescriptor FindCloseChangeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindCloseChangeNotification$MH = RuntimeHelper.downcallHandle(
        "FindCloseChangeNotification",
        constants$198.FindCloseChangeNotification$FUNC
    );
    static final FunctionDescriptor FindFirstChangeNotificationA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstChangeNotificationA$MH = RuntimeHelper.downcallHandle(
        "FindFirstChangeNotificationA",
        constants$198.FindFirstChangeNotificationA$FUNC
    );
    static final FunctionDescriptor FindFirstChangeNotificationW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindFirstChangeNotificationW$MH = RuntimeHelper.downcallHandle(
        "FindFirstChangeNotificationW",
        constants$198.FindFirstChangeNotificationW$FUNC
    );
}


