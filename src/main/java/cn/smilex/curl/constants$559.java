// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$559 {

    static final FunctionDescriptor FillRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FillRect$MH = RuntimeHelper.downcallHandle(
        "FillRect",
        constants$559.FillRect$FUNC
    );
    static final FunctionDescriptor FrameRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FrameRect$MH = RuntimeHelper.downcallHandle(
        "FrameRect",
        constants$559.FrameRect$FUNC
    );
    static final FunctionDescriptor InvertRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InvertRect$MH = RuntimeHelper.downcallHandle(
        "InvertRect",
        constants$559.InvertRect$FUNC
    );
    static final FunctionDescriptor SetRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetRect$MH = RuntimeHelper.downcallHandle(
        "SetRect",
        constants$559.SetRect$FUNC
    );
    static final FunctionDescriptor SetRectEmpty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetRectEmpty$MH = RuntimeHelper.downcallHandle(
        "SetRectEmpty",
        constants$559.SetRectEmpty$FUNC
    );
    static final FunctionDescriptor CopyRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyRect$MH = RuntimeHelper.downcallHandle(
        "CopyRect",
        constants$559.CopyRect$FUNC
    );
}


