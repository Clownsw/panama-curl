// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$702 {

    static final FunctionDescriptor midiInGetDevCapsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInGetDevCapsW$MH = RuntimeHelper.downcallHandle(
        "midiInGetDevCapsW",
        constants$702.midiInGetDevCapsW$FUNC
    );
    static final FunctionDescriptor midiInGetErrorTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInGetErrorTextA$MH = RuntimeHelper.downcallHandle(
        "midiInGetErrorTextA",
        constants$702.midiInGetErrorTextA$FUNC
    );
    static final FunctionDescriptor midiInGetErrorTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInGetErrorTextW$MH = RuntimeHelper.downcallHandle(
        "midiInGetErrorTextW",
        constants$702.midiInGetErrorTextW$FUNC
    );
    static final FunctionDescriptor midiInOpen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInOpen$MH = RuntimeHelper.downcallHandle(
        "midiInOpen",
        constants$702.midiInOpen$FUNC
    );
    static final FunctionDescriptor midiInClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInClose$MH = RuntimeHelper.downcallHandle(
        "midiInClose",
        constants$702.midiInClose$FUNC
    );
    static final FunctionDescriptor midiInPrepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInPrepareHeader$MH = RuntimeHelper.downcallHandle(
        "midiInPrepareHeader",
        constants$702.midiInPrepareHeader$FUNC
    );
}


