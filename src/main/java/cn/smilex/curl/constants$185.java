// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$185 {

    static final FunctionDescriptor PSECURE_MEMORY_CACHE_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PSECURE_MEMORY_CACHE_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$185.PSECURE_MEMORY_CACHE_CALLBACK$FUNC
    );
    static final FunctionDescriptor RtlGetDeviceFamilyInfoEnum$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlGetDeviceFamilyInfoEnum$MH = RuntimeHelper.downcallHandle(
        "RtlGetDeviceFamilyInfoEnum",
        constants$185.RtlGetDeviceFamilyInfoEnum$FUNC
    );
    static final FunctionDescriptor RtlConvertDeviceFamilyInfoToString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlConvertDeviceFamilyInfoToString$MH = RuntimeHelper.downcallHandle(
        "RtlConvertDeviceFamilyInfoToString",
        constants$185.RtlConvertDeviceFamilyInfoToString$FUNC
    );
    static final FunctionDescriptor RtlSwitchedVVI$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlSwitchedVVI$MH = RuntimeHelper.downcallHandle(
        "RtlSwitchedVVI",
        constants$185.RtlSwitchedVVI$FUNC
    );
    static final FunctionDescriptor PTP_SIMPLE_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


