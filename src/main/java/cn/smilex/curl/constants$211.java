// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$211 {

    static final FunctionDescriptor AreFileApisANSI$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle AreFileApisANSI$MH = RuntimeHelper.downcallHandle(
        "AreFileApisANSI",
        constants$211.AreFileApisANSI$FUNC
    );
    static final FunctionDescriptor GetTempPathA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTempPathA$MH = RuntimeHelper.downcallHandle(
        "GetTempPathA",
        constants$211.GetTempPathA$FUNC
    );
    static final FunctionDescriptor FindFirstFileNameW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFileNameW$MH = RuntimeHelper.downcallHandle(
        "FindFirstFileNameW",
        constants$211.FindFirstFileNameW$FUNC
    );
    static final FunctionDescriptor FindNextFileNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNextFileNameW$MH = RuntimeHelper.downcallHandle(
        "FindNextFileNameW",
        constants$211.FindNextFileNameW$FUNC
    );
    static final FunctionDescriptor GetVolumeInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetVolumeInformationA$MH = RuntimeHelper.downcallHandle(
        "GetVolumeInformationA",
        constants$211.GetVolumeInformationA$FUNC
    );
    static final FunctionDescriptor GetTempFileNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTempFileNameA$MH = RuntimeHelper.downcallHandle(
        "GetTempFileNameA",
        constants$211.GetTempFileNameA$FUNC
    );
}


