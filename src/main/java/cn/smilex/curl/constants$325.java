// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$325 {

    static final FunctionDescriptor DequeueUmsCompletionListItems$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DequeueUmsCompletionListItems$MH = RuntimeHelper.downcallHandle(
        "DequeueUmsCompletionListItems",
        constants$325.DequeueUmsCompletionListItems$FUNC
    );
    static final FunctionDescriptor GetUmsCompletionListEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUmsCompletionListEvent$MH = RuntimeHelper.downcallHandle(
        "GetUmsCompletionListEvent",
        constants$325.GetUmsCompletionListEvent$FUNC
    );
    static final FunctionDescriptor ExecuteUmsThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExecuteUmsThread$MH = RuntimeHelper.downcallHandle(
        "ExecuteUmsThread",
        constants$325.ExecuteUmsThread$FUNC
    );
    static final FunctionDescriptor UmsThreadYield$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UmsThreadYield$MH = RuntimeHelper.downcallHandle(
        "UmsThreadYield",
        constants$325.UmsThreadYield$FUNC
    );
    static final FunctionDescriptor DeleteUmsCompletionList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteUmsCompletionList$MH = RuntimeHelper.downcallHandle(
        "DeleteUmsCompletionList",
        constants$325.DeleteUmsCompletionList$FUNC
    );
    static final FunctionDescriptor GetCurrentUmsThread$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCurrentUmsThread$MH = RuntimeHelper.downcallHandle(
        "GetCurrentUmsThread",
        constants$325.GetCurrentUmsThread$FUNC
    );
}


