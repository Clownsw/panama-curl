// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$530 {

    static final FunctionDescriptor CreateAcceleratorTableA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateAcceleratorTableA$MH = RuntimeHelper.downcallHandle(
        "CreateAcceleratorTableA",
        constants$530.CreateAcceleratorTableA$FUNC
    );
    static final FunctionDescriptor CreateAcceleratorTableW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateAcceleratorTableW$MH = RuntimeHelper.downcallHandle(
        "CreateAcceleratorTableW",
        constants$530.CreateAcceleratorTableW$FUNC
    );
    static final FunctionDescriptor DestroyAcceleratorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyAcceleratorTable$MH = RuntimeHelper.downcallHandle(
        "DestroyAcceleratorTable",
        constants$530.DestroyAcceleratorTable$FUNC
    );
    static final FunctionDescriptor CopyAcceleratorTableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyAcceleratorTableA$MH = RuntimeHelper.downcallHandle(
        "CopyAcceleratorTableA",
        constants$530.CopyAcceleratorTableA$FUNC
    );
    static final FunctionDescriptor CopyAcceleratorTableW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyAcceleratorTableW$MH = RuntimeHelper.downcallHandle(
        "CopyAcceleratorTableW",
        constants$530.CopyAcceleratorTableW$FUNC
    );
    static final FunctionDescriptor TranslateAcceleratorA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TranslateAcceleratorA$MH = RuntimeHelper.downcallHandle(
        "TranslateAcceleratorA",
        constants$530.TranslateAcceleratorA$FUNC
    );
}


