// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$255 {

    static final FunctionDescriptor CreateProcessAsUserA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProcessAsUserA$MH = RuntimeHelper.downcallHandle(
        "CreateProcessAsUserA",
        constants$255.CreateProcessAsUserA$FUNC
    );
    static final FunctionDescriptor GetProcessShutdownParameters$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessShutdownParameters$MH = RuntimeHelper.downcallHandle(
        "GetProcessShutdownParameters",
        constants$255.GetProcessShutdownParameters$FUNC
    );
    static final FunctionDescriptor SetThreadDescription$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadDescription$MH = RuntimeHelper.downcallHandle(
        "SetThreadDescription",
        constants$255.SetThreadDescription$FUNC
    );
    static final FunctionDescriptor GetThreadDescription$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadDescription$MH = RuntimeHelper.downcallHandle(
        "GetThreadDescription",
        constants$255.GetThreadDescription$FUNC
    );
    static final FunctionDescriptor GlobalMemoryStatusEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalMemoryStatusEx$MH = RuntimeHelper.downcallHandle(
        "GlobalMemoryStatusEx",
        constants$255.GlobalMemoryStatusEx$FUNC
    );
    static final FunctionDescriptor GetSystemInfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemInfo$MH = RuntimeHelper.downcallHandle(
        "GetSystemInfo",
        constants$255.GetSystemInfo$FUNC
    );
}


