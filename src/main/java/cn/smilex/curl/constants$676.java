// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$676 {

    static final FunctionDescriptor LZOpenFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle LZOpenFileW$MH = RuntimeHelper.downcallHandle(
        "LZOpenFileW",
        constants$676.LZOpenFileW$FUNC
    );
    static final FunctionDescriptor LZSeek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LZSeek$MH = RuntimeHelper.downcallHandle(
        "LZSeek",
        constants$676.LZSeek$FUNC
    );
    static final FunctionDescriptor LZRead$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LZRead$MH = RuntimeHelper.downcallHandle(
        "LZRead",
        constants$676.LZRead$FUNC
    );
    static final FunctionDescriptor LZClose$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LZClose$MH = RuntimeHelper.downcallHandle(
        "LZClose",
        constants$676.LZClose$FUNC
    );
    static final FunctionDescriptor DRVCALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DRVCALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$676.DRVCALLBACK$FUNC
    );
}


