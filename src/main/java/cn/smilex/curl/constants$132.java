// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$132 {

    static final FunctionDescriptor ReadUCharAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUCharAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadUCharAcquire",
        constants$132.ReadUCharAcquire$FUNC
    );
    static final FunctionDescriptor ReadUCharNoFence$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUCharNoFence$MH = RuntimeHelper.downcallHandle(
        "ReadUCharNoFence",
        constants$132.ReadUCharNoFence$FUNC
    );
    static final FunctionDescriptor ReadBooleanAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadBooleanAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadBooleanAcquire",
        constants$132.ReadBooleanAcquire$FUNC
    );
    static final FunctionDescriptor ReadBooleanNoFence$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadBooleanNoFence$MH = RuntimeHelper.downcallHandle(
        "ReadBooleanNoFence",
        constants$132.ReadBooleanNoFence$FUNC
    );
    static final FunctionDescriptor ReadUCharRaw$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUCharRaw$MH = RuntimeHelper.downcallHandle(
        "ReadUCharRaw",
        constants$132.ReadUCharRaw$FUNC
    );
    static final FunctionDescriptor WriteUCharRelease$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteUCharRelease$MH = RuntimeHelper.downcallHandle(
        "WriteUCharRelease",
        constants$132.WriteUCharRelease$FUNC
    );
}


