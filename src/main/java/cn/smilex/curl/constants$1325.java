// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1325 {

    static final FunctionDescriptor LPHANDLER_FUNCTION$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LPHANDLER_FUNCTION$MH = RuntimeHelper.downcallHandle(
        constants$1325.LPHANDLER_FUNCTION$FUNC
    );
    static final FunctionDescriptor LPHANDLER_FUNCTION_EX$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPHANDLER_FUNCTION_EX$MH = RuntimeHelper.downcallHandle(
        constants$1325.LPHANDLER_FUNCTION_EX$FUNC
    );
    static final FunctionDescriptor PFN_SC_NOTIFY_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_SC_NOTIFY_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$1325.PFN_SC_NOTIFY_CALLBACK$FUNC
    );
    static final FunctionDescriptor ChangeServiceConfigA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChangeServiceConfigA$MH = RuntimeHelper.downcallHandle(
        "ChangeServiceConfigA",
        constants$1325.ChangeServiceConfigA$FUNC
    );
}


