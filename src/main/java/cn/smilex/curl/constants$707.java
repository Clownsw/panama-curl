// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$707 {

    static final FunctionDescriptor mixerGetControlDetailsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mixerGetControlDetailsA$MH = RuntimeHelper.downcallHandle(
        "mixerGetControlDetailsA",
        constants$707.mixerGetControlDetailsA$FUNC
    );
    static final FunctionDescriptor mixerGetControlDetailsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mixerGetControlDetailsW$MH = RuntimeHelper.downcallHandle(
        "mixerGetControlDetailsW",
        constants$707.mixerGetControlDetailsW$FUNC
    );
    static final FunctionDescriptor mixerSetControlDetails$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mixerSetControlDetails$MH = RuntimeHelper.downcallHandle(
        "mixerSetControlDetails",
        constants$707.mixerSetControlDetails$FUNC
    );
    static final FunctionDescriptor timeGetSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle timeGetSystemTime$MH = RuntimeHelper.downcallHandle(
        "timeGetSystemTime",
        constants$707.timeGetSystemTime$FUNC
    );
    static final FunctionDescriptor timeGetTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle timeGetTime$MH = RuntimeHelper.downcallHandle(
        "timeGetTime",
        constants$707.timeGetTime$FUNC
    );
    static final FunctionDescriptor timeGetDevCaps$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle timeGetDevCaps$MH = RuntimeHelper.downcallHandle(
        "timeGetDevCaps",
        constants$707.timeGetDevCaps$FUNC
    );
}


