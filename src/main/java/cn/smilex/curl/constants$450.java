// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$450 {

    static final FunctionDescriptor SetColorAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetColorAdjustment$MH = RuntimeHelper.downcallHandle(
        "SetColorAdjustment",
        constants$450.SetColorAdjustment$FUNC
    );
    static final FunctionDescriptor GetColorAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetColorAdjustment$MH = RuntimeHelper.downcallHandle(
        "GetColorAdjustment",
        constants$450.GetColorAdjustment$FUNC
    );
    static final FunctionDescriptor CreateHalftonePalette$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateHalftonePalette$MH = RuntimeHelper.downcallHandle(
        "CreateHalftonePalette",
        constants$450.CreateHalftonePalette$FUNC
    );
    static final FunctionDescriptor ABORTPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ABORTPROC$MH = RuntimeHelper.downcallHandle(
        constants$450.ABORTPROC$FUNC
    );
    static final FunctionDescriptor StartDocA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartDocA$MH = RuntimeHelper.downcallHandle(
        "StartDocA",
        constants$450.StartDocA$FUNC
    );
}

