// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$384 {

    static final FunctionDescriptor RegisterWaitForSingleObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterWaitForSingleObject$MH = RuntimeHelper.downcallHandle(
        "RegisterWaitForSingleObject",
        constants$384.RegisterWaitForSingleObject$FUNC
    );
    static final FunctionDescriptor UnregisterWait$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterWait$MH = RuntimeHelper.downcallHandle(
        "UnregisterWait",
        constants$384.UnregisterWait$FUNC
    );
    static final FunctionDescriptor BindIoCompletionCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BindIoCompletionCallback$MH = RuntimeHelper.downcallHandle(
        "BindIoCompletionCallback",
        constants$384.BindIoCompletionCallback$FUNC
    );
    static final FunctionDescriptor SetTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "SetTimerQueueTimer",
        constants$384.SetTimerQueueTimer$FUNC
    );
    static final FunctionDescriptor CancelTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "CancelTimerQueueTimer",
        constants$384.CancelTimerQueueTimer$FUNC
    );
    static final FunctionDescriptor DeleteTimerQueue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteTimerQueue$MH = RuntimeHelper.downcallHandle(
        "DeleteTimerQueue",
        constants$384.DeleteTimerQueue$FUNC
    );
}

