// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$131 {

    static final FunctionDescriptor ReadRaw16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw16$MH = RuntimeHelper.downcallHandle(
        "ReadRaw16",
        constants$131.ReadRaw16$FUNC
    );
    static final FunctionDescriptor WriteRaw16$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle WriteRaw16$MH = RuntimeHelper.downcallHandle(
        "WriteRaw16",
        constants$131.WriteRaw16$FUNC
    );
    static final FunctionDescriptor ReadRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw$MH = RuntimeHelper.downcallHandle(
        "ReadRaw",
        constants$131.ReadRaw$FUNC
    );
    static final FunctionDescriptor WriteRaw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteRaw$MH = RuntimeHelper.downcallHandle(
        "WriteRaw",
        constants$131.WriteRaw$FUNC
    );
    static final FunctionDescriptor ReadRaw64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw64$MH = RuntimeHelper.downcallHandle(
        "ReadRaw64",
        constants$131.ReadRaw64$FUNC
    );
    static final FunctionDescriptor WriteRaw64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteRaw64$MH = RuntimeHelper.downcallHandle(
        "WriteRaw64",
        constants$131.WriteRaw64$FUNC
    );
}

