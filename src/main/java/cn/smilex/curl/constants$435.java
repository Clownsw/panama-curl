// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$435 {

    static final FunctionDescriptor RectVisible$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RectVisible$MH = RuntimeHelper.downcallHandle(
        "RectVisible",
        constants$435.RectVisible$FUNC
    );
    static final FunctionDescriptor Rectangle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Rectangle$MH = RuntimeHelper.downcallHandle(
        "Rectangle",
        constants$435.Rectangle$FUNC
    );
    static final FunctionDescriptor RestoreDC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RestoreDC$MH = RuntimeHelper.downcallHandle(
        "RestoreDC",
        constants$435.RestoreDC$FUNC
    );
    static final FunctionDescriptor ResetDCA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetDCA$MH = RuntimeHelper.downcallHandle(
        "ResetDCA",
        constants$435.ResetDCA$FUNC
    );
    static final FunctionDescriptor ResetDCW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetDCW$MH = RuntimeHelper.downcallHandle(
        "ResetDCW",
        constants$435.ResetDCW$FUNC
    );
    static final FunctionDescriptor RealizePalette$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RealizePalette$MH = RuntimeHelper.downcallHandle(
        "RealizePalette",
        constants$435.RealizePalette$FUNC
    );
}


