// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$240 {

    static final FunctionDescriptor InterlockedPopEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedPopEntrySList$MH = RuntimeHelper.downcallHandle(
        "InterlockedPopEntrySList",
        constants$240.InterlockedPopEntrySList$FUNC
    );
    static final FunctionDescriptor InterlockedPushEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedPushEntrySList$MH = RuntimeHelper.downcallHandle(
        "InterlockedPushEntrySList",
        constants$240.InterlockedPushEntrySList$FUNC
    );
    static final FunctionDescriptor InterlockedPushListSListEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InterlockedPushListSListEx$MH = RuntimeHelper.downcallHandle(
        "InterlockedPushListSListEx",
        constants$240.InterlockedPushListSListEx$FUNC
    );
    static final FunctionDescriptor InterlockedFlushSList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedFlushSList$MH = RuntimeHelper.downcallHandle(
        "InterlockedFlushSList",
        constants$240.InterlockedFlushSList$FUNC
    );
    static final FunctionDescriptor QueryDepthSList$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryDepthSList$MH = RuntimeHelper.downcallHandle(
        "QueryDepthSList",
        constants$240.QueryDepthSList$FUNC
    );
    static final FunctionDescriptor QueueUserAPC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle QueueUserAPC$MH = RuntimeHelper.downcallHandle(
        "QueueUserAPC",
        constants$240.QueueUserAPC$FUNC
    );
}


