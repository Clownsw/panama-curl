// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1315 {

    static final FunctionDescriptor ChooseFontA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChooseFontA$MH = RuntimeHelper.downcallHandle(
        "ChooseFontA",
        constants$1315.ChooseFontA$FUNC
    );
    static final FunctionDescriptor ChooseFontW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChooseFontW$MH = RuntimeHelper.downcallHandle(
        "ChooseFontW",
        constants$1315.ChooseFontW$FUNC
    );
    static final FunctionDescriptor LPPRINTHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPPRINTHOOKPROC$MH = RuntimeHelper.downcallHandle(
        constants$1315.LPPRINTHOOKPROC$FUNC
    );
    static final FunctionDescriptor LPSETUPHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPSETUPHOOKPROC$MH = RuntimeHelper.downcallHandle(
        constants$1315.LPSETUPHOOKPROC$FUNC
    );
}


