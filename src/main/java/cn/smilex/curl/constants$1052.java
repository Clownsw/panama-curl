// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1052 {

    static final FunctionDescriptor CoIncrementMTAUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoIncrementMTAUsage$MH = RuntimeHelper.downcallHandle(
        "CoIncrementMTAUsage",
        constants$1052.CoIncrementMTAUsage$FUNC
    );
    static final FunctionDescriptor CoDecrementMTAUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoDecrementMTAUsage$MH = RuntimeHelper.downcallHandle(
        "CoDecrementMTAUsage",
        constants$1052.CoDecrementMTAUsage$FUNC
    );
    static final FunctionDescriptor CoAllowUnmarshalerCLSID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoAllowUnmarshalerCLSID$MH = RuntimeHelper.downcallHandle(
        "CoAllowUnmarshalerCLSID",
        constants$1052.CoAllowUnmarshalerCLSID$FUNC
    );
    static final FunctionDescriptor CoGetObjectContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetObjectContext$MH = RuntimeHelper.downcallHandle(
        "CoGetObjectContext",
        constants$1052.CoGetObjectContext$FUNC
    );
    static final FunctionDescriptor CoGetClassObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetClassObject$MH = RuntimeHelper.downcallHandle(
        "CoGetClassObject",
        constants$1052.CoGetClassObject$FUNC
    );
    static final FunctionDescriptor CoRegisterClassObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterClassObject$MH = RuntimeHelper.downcallHandle(
        "CoRegisterClassObject",
        constants$1052.CoRegisterClassObject$FUNC
    );
}


