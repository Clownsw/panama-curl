// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$280 {

    static final FunctionDescriptor CreateThreadpoolTimer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThreadpoolTimer$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpoolTimer",
        constants$280.CreateThreadpoolTimer$FUNC
    );
    static final FunctionDescriptor SetThreadpoolTimer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolTimer$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolTimer",
        constants$280.SetThreadpoolTimer$FUNC
    );
    static final FunctionDescriptor IsThreadpoolTimerSet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsThreadpoolTimerSet$MH = RuntimeHelper.downcallHandle(
        "IsThreadpoolTimerSet",
        constants$280.IsThreadpoolTimerSet$FUNC
    );
    static final FunctionDescriptor WaitForThreadpoolTimerCallbacks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForThreadpoolTimerCallbacks$MH = RuntimeHelper.downcallHandle(
        "WaitForThreadpoolTimerCallbacks",
        constants$280.WaitForThreadpoolTimerCallbacks$FUNC
    );
    static final FunctionDescriptor CloseThreadpoolTimer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpoolTimer$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpoolTimer",
        constants$280.CloseThreadpoolTimer$FUNC
    );
    static final FunctionDescriptor CreateThreadpoolWait$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThreadpoolWait$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpoolWait",
        constants$280.CreateThreadpoolWait$FUNC
    );
}

