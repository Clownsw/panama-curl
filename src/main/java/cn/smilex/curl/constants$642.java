// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$642 {

    static final FunctionDescriptor VerInstallFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VerInstallFileA$MH = RuntimeHelper.downcallHandle(
        "VerInstallFileA",
        constants$642.VerInstallFileA$FUNC
    );
    static final FunctionDescriptor VerInstallFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VerInstallFileW$MH = RuntimeHelper.downcallHandle(
        "VerInstallFileW",
        constants$642.VerInstallFileW$FUNC
    );
    static final FunctionDescriptor GetFileVersionInfoSizeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileVersionInfoSizeA$MH = RuntimeHelper.downcallHandle(
        "GetFileVersionInfoSizeA",
        constants$642.GetFileVersionInfoSizeA$FUNC
    );
    static final FunctionDescriptor GetFileVersionInfoSizeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileVersionInfoSizeW$MH = RuntimeHelper.downcallHandle(
        "GetFileVersionInfoSizeW",
        constants$642.GetFileVersionInfoSizeW$FUNC
    );
    static final FunctionDescriptor GetFileVersionInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileVersionInfoA$MH = RuntimeHelper.downcallHandle(
        "GetFileVersionInfoA",
        constants$642.GetFileVersionInfoA$FUNC
    );
    static final FunctionDescriptor GetFileVersionInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileVersionInfoW$MH = RuntimeHelper.downcallHandle(
        "GetFileVersionInfoW",
        constants$642.GetFileVersionInfoW$FUNC
    );
}


