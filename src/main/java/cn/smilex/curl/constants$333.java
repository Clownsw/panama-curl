// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$333 {

    static final FunctionDescriptor GetCommState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommState$MH = RuntimeHelper.downcallHandle(
        "GetCommState",
        constants$333.GetCommState$FUNC
    );
    static final FunctionDescriptor GetCommTimeouts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommTimeouts$MH = RuntimeHelper.downcallHandle(
        "GetCommTimeouts",
        constants$333.GetCommTimeouts$FUNC
    );
    static final FunctionDescriptor PurgeComm$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PurgeComm$MH = RuntimeHelper.downcallHandle(
        "PurgeComm",
        constants$333.PurgeComm$FUNC
    );
    static final FunctionDescriptor SetCommBreak$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCommBreak$MH = RuntimeHelper.downcallHandle(
        "SetCommBreak",
        constants$333.SetCommBreak$FUNC
    );
    static final FunctionDescriptor SetCommConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCommConfig$MH = RuntimeHelper.downcallHandle(
        "SetCommConfig",
        constants$333.SetCommConfig$FUNC
    );
    static final FunctionDescriptor SetCommMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCommMask$MH = RuntimeHelper.downcallHandle(
        "SetCommMask",
        constants$333.SetCommMask$FUNC
    );
}

