// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$122 {

    static final FunctionDescriptor __popcnt64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __popcnt64$MH = RuntimeHelper.downcallHandle(
        "__popcnt64",
        constants$122.__popcnt64$FUNC
    );
    static final FunctionDescriptor __shiftleft128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle __shiftleft128$MH = RuntimeHelper.downcallHandle(
        "__shiftleft128",
        constants$122.__shiftleft128$FUNC
    );
    static final FunctionDescriptor __shiftright128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle __shiftright128$MH = RuntimeHelper.downcallHandle(
        "__shiftright128",
        constants$122.__shiftright128$FUNC
    );
    static final FunctionDescriptor _mul128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mul128$MH = RuntimeHelper.downcallHandle(
        "_mul128",
        constants$122._mul128$FUNC
    );
    static final FunctionDescriptor _umul128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _umul128$MH = RuntimeHelper.downcallHandle(
        "_umul128",
        constants$122._umul128$FUNC
    );
    static final FunctionDescriptor MultiplyExtract128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle MultiplyExtract128$MH = RuntimeHelper.downcallHandle(
        "MultiplyExtract128",
        constants$122.MultiplyExtract128$FUNC
    );
}


