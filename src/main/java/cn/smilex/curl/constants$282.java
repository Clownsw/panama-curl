// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$282 {

    static final FunctionDescriptor WaitForThreadpoolIoCallbacks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForThreadpoolIoCallbacks$MH = RuntimeHelper.downcallHandle(
        "WaitForThreadpoolIoCallbacks",
        constants$282.WaitForThreadpoolIoCallbacks$FUNC
    );
    static final FunctionDescriptor CloseThreadpoolIo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpoolIo$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpoolIo",
        constants$282.CloseThreadpoolIo$FUNC
    );
    static final FunctionDescriptor SetThreadpoolTimerEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolTimerEx$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolTimerEx",
        constants$282.SetThreadpoolTimerEx$FUNC
    );
    static final FunctionDescriptor SetThreadpoolWaitEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolWaitEx$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolWaitEx",
        constants$282.SetThreadpoolWaitEx$FUNC
    );
    static final FunctionDescriptor IsProcessInJob$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsProcessInJob$MH = RuntimeHelper.downcallHandle(
        "IsProcessInJob",
        constants$282.IsProcessInJob$FUNC
    );
    static final FunctionDescriptor CreateJobObjectW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateJobObjectW$MH = RuntimeHelper.downcallHandle(
        "CreateJobObjectW",
        constants$282.CreateJobObjectW$FUNC
    );
}


