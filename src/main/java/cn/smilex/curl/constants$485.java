// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$485 {

    static final FunctionDescriptor TrackMouseEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackMouseEvent$MH = RuntimeHelper.downcallHandle(
        "TrackMouseEvent",
        constants$485.TrackMouseEvent$FUNC
    );
    static final FunctionDescriptor DrawEdge$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawEdge$MH = RuntimeHelper.downcallHandle(
        "DrawEdge",
        constants$485.DrawEdge$FUNC
    );
    static final FunctionDescriptor DrawFrameControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawFrameControl$MH = RuntimeHelper.downcallHandle(
        "DrawFrameControl",
        constants$485.DrawFrameControl$FUNC
    );
    static final FunctionDescriptor DrawCaption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawCaption$MH = RuntimeHelper.downcallHandle(
        "DrawCaption",
        constants$485.DrawCaption$FUNC
    );
    static final FunctionDescriptor DrawAnimatedRects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawAnimatedRects$MH = RuntimeHelper.downcallHandle(
        "DrawAnimatedRects",
        constants$485.DrawAnimatedRects$FUNC
    );
    static final FunctionDescriptor GetMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMessageA$MH = RuntimeHelper.downcallHandle(
        "GetMessageA",
        constants$485.GetMessageA$FUNC
    );
}


