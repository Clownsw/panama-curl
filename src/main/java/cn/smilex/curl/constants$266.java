// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$266 {

    static final FunctionDescriptor GetProcessWorkingSetSizeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessWorkingSetSizeEx$MH = RuntimeHelper.downcallHandle(
        "GetProcessWorkingSetSizeEx",
        constants$266.GetProcessWorkingSetSizeEx$FUNC
    );
    static final FunctionDescriptor SetProcessWorkingSetSizeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessWorkingSetSizeEx$MH = RuntimeHelper.downcallHandle(
        "SetProcessWorkingSetSizeEx",
        constants$266.SetProcessWorkingSetSizeEx$FUNC
    );
    static final FunctionDescriptor VirtualLock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VirtualLock$MH = RuntimeHelper.downcallHandle(
        "VirtualLock",
        constants$266.VirtualLock$FUNC
    );
    static final FunctionDescriptor VirtualUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VirtualUnlock$MH = RuntimeHelper.downcallHandle(
        "VirtualUnlock",
        constants$266.VirtualUnlock$FUNC
    );
    static final FunctionDescriptor GetWriteWatch$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWriteWatch$MH = RuntimeHelper.downcallHandle(
        "GetWriteWatch",
        constants$266.GetWriteWatch$FUNC
    );
    static final FunctionDescriptor ResetWriteWatch$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ResetWriteWatch$MH = RuntimeHelper.downcallHandle(
        "ResetWriteWatch",
        constants$266.ResetWriteWatch$FUNC
    );
}


