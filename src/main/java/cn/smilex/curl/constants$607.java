// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$607 {

    static final FunctionDescriptor GetCPInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfo$MH = RuntimeHelper.downcallHandle(
        "GetCPInfo",
        constants$607.GetCPInfo$FUNC
    );
    static final FunctionDescriptor GetCPInfoExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfoExA$MH = RuntimeHelper.downcallHandle(
        "GetCPInfoExA",
        constants$607.GetCPInfoExA$FUNC
    );
    static final FunctionDescriptor GetCPInfoExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfoExW$MH = RuntimeHelper.downcallHandle(
        "GetCPInfoExW",
        constants$607.GetCPInfoExW$FUNC
    );
    static final FunctionDescriptor CompareStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompareStringA$MH = RuntimeHelper.downcallHandle(
        "CompareStringA",
        constants$607.CompareStringA$FUNC
    );
    static final FunctionDescriptor FindNLSString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNLSString$MH = RuntimeHelper.downcallHandle(
        "FindNLSString",
        constants$607.FindNLSString$FUNC
    );
    static final FunctionDescriptor LCMapStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LCMapStringW$MH = RuntimeHelper.downcallHandle(
        "LCMapStringW",
        constants$607.LCMapStringW$FUNC
    );
}


