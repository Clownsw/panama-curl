// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$324 {

    static final FunctionDescriptor ConvertThreadToFiberEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ConvertThreadToFiberEx$MH = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiberEx",
        constants$324.ConvertThreadToFiberEx$FUNC
    );
    static final FunctionDescriptor CreateFiber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFiber$MH = RuntimeHelper.downcallHandle(
        "CreateFiber",
        constants$324.CreateFiber$FUNC
    );
    static final FunctionDescriptor ConvertThreadToFiber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConvertThreadToFiber$MH = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiber",
        constants$324.ConvertThreadToFiber$FUNC
    );
    static final FunctionDescriptor PUMS_SCHEDULER_ENTRY_POINT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PUMS_SCHEDULER_ENTRY_POINT$MH = RuntimeHelper.downcallHandle(
        constants$324.PUMS_SCHEDULER_ENTRY_POINT$FUNC
    );
    static final FunctionDescriptor CreateUmsCompletionList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateUmsCompletionList$MH = RuntimeHelper.downcallHandle(
        "CreateUmsCompletionList",
        constants$324.CreateUmsCompletionList$FUNC
    );
}

