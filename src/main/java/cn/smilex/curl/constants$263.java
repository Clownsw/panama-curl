// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$263 {

    static final FunctionDescriptor SetComputerNameExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameExA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameExA",
        constants$263.SetComputerNameExA$FUNC
    );
    static final FunctionDescriptor VirtualAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualAlloc$MH = RuntimeHelper.downcallHandle(
        "VirtualAlloc",
        constants$263.VirtualAlloc$FUNC
    );
    static final FunctionDescriptor VirtualProtect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VirtualProtect$MH = RuntimeHelper.downcallHandle(
        "VirtualProtect",
        constants$263.VirtualProtect$FUNC
    );
    static final FunctionDescriptor VirtualFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualFree$MH = RuntimeHelper.downcallHandle(
        "VirtualFree",
        constants$263.VirtualFree$FUNC
    );
    static final FunctionDescriptor VirtualQuery$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VirtualQuery$MH = RuntimeHelper.downcallHandle(
        "VirtualQuery",
        constants$263.VirtualQuery$FUNC
    );
    static final FunctionDescriptor VirtualAllocEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualAllocEx$MH = RuntimeHelper.downcallHandle(
        "VirtualAllocEx",
        constants$263.VirtualAllocEx$FUNC
    );
}


