// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1240 {

    static final FunctionDescriptor SysReleaseString$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysReleaseString$MH = RuntimeHelper.downcallHandle(
        "SysReleaseString",
        constants$1240.SysReleaseString$FUNC
    );
    static final FunctionDescriptor SysFreeString$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysFreeString$MH = RuntimeHelper.downcallHandle(
        "SysFreeString",
        constants$1240.SysFreeString$FUNC
    );
    static final FunctionDescriptor SysStringLen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysStringLen$MH = RuntimeHelper.downcallHandle(
        "SysStringLen",
        constants$1240.SysStringLen$FUNC
    );
    static final FunctionDescriptor SysStringByteLen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysStringByteLen$MH = RuntimeHelper.downcallHandle(
        "SysStringByteLen",
        constants$1240.SysStringByteLen$FUNC
    );
    static final FunctionDescriptor SysAllocStringByteLen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SysAllocStringByteLen$MH = RuntimeHelper.downcallHandle(
        "SysAllocStringByteLen",
        constants$1240.SysAllocStringByteLen$FUNC
    );
    static final FunctionDescriptor DosDateTimeToVariantTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DosDateTimeToVariantTime$MH = RuntimeHelper.downcallHandle(
        "DosDateTimeToVariantTime",
        constants$1240.DosDateTimeToVariantTime$FUNC
    );
}


