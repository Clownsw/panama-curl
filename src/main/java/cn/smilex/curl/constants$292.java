// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$292 {

    static final FunctionDescriptor LoadStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadStringW$MH = RuntimeHelper.downcallHandle(
        "LoadStringW",
        constants$292.LoadStringW$FUNC
    );
    static final FunctionDescriptor LockResource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LockResource$MH = RuntimeHelper.downcallHandle(
        "LockResource",
        constants$292.LockResource$FUNC
    );
    static final FunctionDescriptor SizeofResource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SizeofResource$MH = RuntimeHelper.downcallHandle(
        "SizeofResource",
        constants$292.SizeofResource$FUNC
    );
    static final FunctionDescriptor AddDllDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddDllDirectory$MH = RuntimeHelper.downcallHandle(
        "AddDllDirectory",
        constants$292.AddDllDirectory$FUNC
    );
    static final FunctionDescriptor RemoveDllDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveDllDirectory$MH = RuntimeHelper.downcallHandle(
        "RemoveDllDirectory",
        constants$292.RemoveDllDirectory$FUNC
    );
    static final FunctionDescriptor SetDefaultDllDirectories$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDefaultDllDirectories$MH = RuntimeHelper.downcallHandle(
        "SetDefaultDllDirectories",
        constants$292.SetDefaultDllDirectories$FUNC
    );
}


