// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$114 {

    static final FunctionDescriptor _InterlockedExchange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _InterlockedExchange$MH = RuntimeHelper.downcallHandle(
        "_InterlockedExchange",
        constants$114._InterlockedExchange$FUNC
    );
    static final FunctionDescriptor _InterlockedExchangeAdd$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _InterlockedExchangeAdd$MH = RuntimeHelper.downcallHandle(
        "_InterlockedExchangeAdd",
        constants$114._InterlockedExchangeAdd$FUNC
    );
    static final FunctionDescriptor _InlineInterlockedAdd$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _InlineInterlockedAdd$MH = RuntimeHelper.downcallHandle(
        "_InlineInterlockedAdd",
        constants$114._InlineInterlockedAdd$FUNC
    );
    static final FunctionDescriptor _InterlockedCompareExchange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _InterlockedCompareExchange$MH = RuntimeHelper.downcallHandle(
        "_InterlockedCompareExchange",
        constants$114._InterlockedCompareExchange$FUNC
    );
    static final FunctionDescriptor _InterlockedIncrement64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _InterlockedIncrement64$MH = RuntimeHelper.downcallHandle(
        "_InterlockedIncrement64",
        constants$114._InterlockedIncrement64$FUNC
    );
    static final FunctionDescriptor _InterlockedDecrement64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _InterlockedDecrement64$MH = RuntimeHelper.downcallHandle(
        "_InterlockedDecrement64",
        constants$114._InterlockedDecrement64$FUNC
    );
}


