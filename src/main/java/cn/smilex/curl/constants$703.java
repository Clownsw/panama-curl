// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$703 {

    static final FunctionDescriptor midiInUnprepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        "midiInUnprepareHeader",
        constants$703.midiInUnprepareHeader$FUNC
    );
    static final FunctionDescriptor midiInAddBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInAddBuffer$MH = RuntimeHelper.downcallHandle(
        "midiInAddBuffer",
        constants$703.midiInAddBuffer$FUNC
    );
    static final FunctionDescriptor midiInStart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInStart$MH = RuntimeHelper.downcallHandle(
        "midiInStart",
        constants$703.midiInStart$FUNC
    );
    static final FunctionDescriptor midiInStop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInStop$MH = RuntimeHelper.downcallHandle(
        "midiInStop",
        constants$703.midiInStop$FUNC
    );
    static final FunctionDescriptor midiInReset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInReset$MH = RuntimeHelper.downcallHandle(
        "midiInReset",
        constants$703.midiInReset$FUNC
    );
    static final FunctionDescriptor midiInGetID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInGetID$MH = RuntimeHelper.downcallHandle(
        "midiInGetID",
        constants$703.midiInGetID$FUNC
    );
}


