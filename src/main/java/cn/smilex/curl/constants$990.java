// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$990 {

    static final FunctionDescriptor atexit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$x0$MH = RuntimeHelper.downcallHandle(
        constants$990.atexit$x0$FUNC
    );
    static final FunctionDescriptor atexit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atexit$MH = RuntimeHelper.downcallHandle(
        "atexit",
        constants$990.atexit$FUNC
    );
    static final FunctionDescriptor _onexit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _onexit$MH = RuntimeHelper.downcallHandle(
        "_onexit",
        constants$990._onexit$FUNC
    );
    static final FunctionDescriptor at_quick_exit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle at_quick_exit$x0$MH = RuntimeHelper.downcallHandle(
        constants$990.at_quick_exit$x0$FUNC
    );
}


