// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$115 {

    static final FunctionDescriptor _InterlockedExchange64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _InterlockedExchange64$MH = RuntimeHelper.downcallHandle(
        "_InterlockedExchange64",
        constants$115._InterlockedExchange64$FUNC
    );
    static final FunctionDescriptor _InterlockedExchangeAdd64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _InterlockedExchangeAdd64$MH = RuntimeHelper.downcallHandle(
        "_InterlockedExchangeAdd64",
        constants$115._InterlockedExchangeAdd64$FUNC
    );
    static final FunctionDescriptor _InlineInterlockedAdd64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _InlineInterlockedAdd64$MH = RuntimeHelper.downcallHandle(
        "_InlineInterlockedAdd64",
        constants$115._InlineInterlockedAdd64$FUNC
    );
    static final FunctionDescriptor _InterlockedCompareExchange64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _InterlockedCompareExchange64$MH = RuntimeHelper.downcallHandle(
        "_InterlockedCompareExchange64",
        constants$115._InterlockedCompareExchange64$FUNC
    );
    static final FunctionDescriptor _InterlockedCompareExchange128$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _InterlockedCompareExchange128$MH = RuntimeHelper.downcallHandle(
        "_InterlockedCompareExchange128",
        constants$115._InterlockedCompareExchange128$FUNC
    );
    static final FunctionDescriptor _InterlockedCompareExchangePointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _InterlockedCompareExchangePointer$MH = RuntimeHelper.downcallHandle(
        "_InterlockedCompareExchangePointer",
        constants$115._InterlockedCompareExchangePointer$FUNC
    );
}


