// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$760 {

    static final FunctionDescriptor RpcNsBindingLookupBeginW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingLookupBeginW$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingLookupBeginW",
        constants$760.RpcNsBindingLookupBeginW$FUNC
    );
    static final FunctionDescriptor RpcNsBindingLookupNext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingLookupNext$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingLookupNext",
        constants$760.RpcNsBindingLookupNext$FUNC
    );
    static final FunctionDescriptor RpcNsBindingLookupDone$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingLookupDone$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingLookupDone",
        constants$760.RpcNsBindingLookupDone$FUNC
    );
    static final FunctionDescriptor RpcNsGroupDeleteA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsGroupDeleteA$MH = RuntimeHelper.downcallHandle(
        "RpcNsGroupDeleteA",
        constants$760.RpcNsGroupDeleteA$FUNC
    );
    static final FunctionDescriptor RpcNsGroupMbrAddA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsGroupMbrAddA$MH = RuntimeHelper.downcallHandle(
        "RpcNsGroupMbrAddA",
        constants$760.RpcNsGroupMbrAddA$FUNC
    );
    static final FunctionDescriptor RpcNsGroupMbrRemoveA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsGroupMbrRemoveA$MH = RuntimeHelper.downcallHandle(
        "RpcNsGroupMbrRemoveA",
        constants$760.RpcNsGroupMbrRemoveA$FUNC
    );
}

