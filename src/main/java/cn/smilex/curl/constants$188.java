// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$188 {

    static final FunctionDescriptor TpSetCallbackPersistent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackPersistent$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackPersistent",
        constants$188.TpSetCallbackPersistent$FUNC
    );
    static final FunctionDescriptor TpDestroyCallbackEnviron$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpDestroyCallbackEnviron$MH = RuntimeHelper.downcallHandle(
        "TpDestroyCallbackEnviron",
        constants$188.TpDestroyCallbackEnviron$FUNC
    );
    static final FunctionDescriptor PTP_WORK_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_WORK_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$188.PTP_WORK_CALLBACK$FUNC
    );
    static final FunctionDescriptor PTP_TIMER_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_TIMER_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$188.PTP_TIMER_CALLBACK$FUNC
    );
}


