// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$689 {

    static final FunctionDescriptor PlaySoundW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PlaySoundW$MH = RuntimeHelper.downcallHandle(
        "PlaySoundW",
        constants$689.PlaySoundW$FUNC
    );
    static final FunctionDescriptor WAVECALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WAVECALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$689.WAVECALLBACK$FUNC
    );
    static final FunctionDescriptor LPWAVECALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPWAVECALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$689.LPWAVECALLBACK$FUNC
    );
    static final FunctionDescriptor waveOutGetNumDevs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle waveOutGetNumDevs$MH = RuntimeHelper.downcallHandle(
        "waveOutGetNumDevs",
        constants$689.waveOutGetNumDevs$FUNC
    );
}


