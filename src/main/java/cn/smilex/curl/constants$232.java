// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$232 {

    static final FunctionDescriptor InitOnceExecuteOnce$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitOnceExecuteOnce$MH = RuntimeHelper.downcallHandle(
        "InitOnceExecuteOnce",
        constants$232.InitOnceExecuteOnce$FUNC
    );
    static final FunctionDescriptor InitOnceBeginInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitOnceBeginInitialize$MH = RuntimeHelper.downcallHandle(
        "InitOnceBeginInitialize",
        constants$232.InitOnceBeginInitialize$FUNC
    );
    static final FunctionDescriptor InitOnceComplete$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitOnceComplete$MH = RuntimeHelper.downcallHandle(
        "InitOnceComplete",
        constants$232.InitOnceComplete$FUNC
    );
    static final FunctionDescriptor InitializeConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeConditionVariable$MH = RuntimeHelper.downcallHandle(
        "InitializeConditionVariable",
        constants$232.InitializeConditionVariable$FUNC
    );
    static final FunctionDescriptor WakeConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WakeConditionVariable$MH = RuntimeHelper.downcallHandle(
        "WakeConditionVariable",
        constants$232.WakeConditionVariable$FUNC
    );
    static final FunctionDescriptor WakeAllConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WakeAllConditionVariable$MH = RuntimeHelper.downcallHandle(
        "WakeAllConditionVariable",
        constants$232.WakeAllConditionVariable$FUNC
    );
}


