// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$695 {

    static final FunctionDescriptor waveInUnprepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        "waveInUnprepareHeader",
        constants$695.waveInUnprepareHeader$FUNC
    );
    static final FunctionDescriptor waveInAddBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInAddBuffer$MH = RuntimeHelper.downcallHandle(
        "waveInAddBuffer",
        constants$695.waveInAddBuffer$FUNC
    );
    static final FunctionDescriptor waveInStart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInStart$MH = RuntimeHelper.downcallHandle(
        "waveInStart",
        constants$695.waveInStart$FUNC
    );
    static final FunctionDescriptor waveInStop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInStop$MH = RuntimeHelper.downcallHandle(
        "waveInStop",
        constants$695.waveInStop$FUNC
    );
    static final FunctionDescriptor waveInReset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInReset$MH = RuntimeHelper.downcallHandle(
        "waveInReset",
        constants$695.waveInReset$FUNC
    );
    static final FunctionDescriptor waveInGetPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetPosition$MH = RuntimeHelper.downcallHandle(
        "waveInGetPosition",
        constants$695.waveInGetPosition$FUNC
    );
}


