// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$668 {

    static final FunctionDescriptor ImpersonateDdeClientWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImpersonateDdeClientWindow$MH = RuntimeHelper.downcallHandle(
        "ImpersonateDdeClientWindow",
        constants$668.ImpersonateDdeClientWindow$FUNC
    );
    static final FunctionDescriptor PackDDElParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PackDDElParam$MH = RuntimeHelper.downcallHandle(
        "PackDDElParam",
        constants$668.PackDDElParam$FUNC
    );
    static final FunctionDescriptor UnpackDDElParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnpackDDElParam$MH = RuntimeHelper.downcallHandle(
        "UnpackDDElParam",
        constants$668.UnpackDDElParam$FUNC
    );
    static final FunctionDescriptor FreeDDElParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle FreeDDElParam$MH = RuntimeHelper.downcallHandle(
        "FreeDDElParam",
        constants$668.FreeDDElParam$FUNC
    );
    static final FunctionDescriptor ReuseDDElParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ReuseDDElParam$MH = RuntimeHelper.downcallHandle(
        "ReuseDDElParam",
        constants$668.ReuseDDElParam$FUNC
    );
    static final FunctionDescriptor FNCALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}


