// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$120 {

    static final FunctionDescriptor __readpmc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __readpmc$MH = RuntimeHelper.downcallHandle(
        "__readpmc",
        constants$120.__readpmc$FUNC
    );
    static final FunctionDescriptor __rdtsc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle __rdtsc$MH = RuntimeHelper.downcallHandle(
        "__rdtsc",
        constants$120.__rdtsc$FUNC
    );
    static final FunctionDescriptor __movsb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __movsb$MH = RuntimeHelper.downcallHandle(
        "__movsb",
        constants$120.__movsb$FUNC
    );
    static final FunctionDescriptor __movsw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __movsw$MH = RuntimeHelper.downcallHandle(
        "__movsw",
        constants$120.__movsw$FUNC
    );
    static final FunctionDescriptor __movsd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __movsd$MH = RuntimeHelper.downcallHandle(
        "__movsd",
        constants$120.__movsd$FUNC
    );
    static final FunctionDescriptor __movsq$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __movsq$MH = RuntimeHelper.downcallHandle(
        "__movsq",
        constants$120.__movsq$FUNC
    );
}


