// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1293 {

    static final FunctionDescriptor VarBstrCat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrCat$MH = RuntimeHelper.downcallHandle(
        "VarBstrCat",
        constants$1293.VarBstrCat$FUNC
    );
    static final FunctionDescriptor VarBstrCmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VarBstrCmp$MH = RuntimeHelper.downcallHandle(
        "VarBstrCmp",
        constants$1293.VarBstrCmp$FUNC
    );
    static final FunctionDescriptor VarR8Pow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8Pow$MH = RuntimeHelper.downcallHandle(
        "VarR8Pow",
        constants$1293.VarR8Pow$FUNC
    );
    static final FunctionDescriptor VarR4CmpR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle VarR4CmpR8$MH = RuntimeHelper.downcallHandle(
        "VarR4CmpR8",
        constants$1293.VarR4CmpR8$FUNC
    );
    static final FunctionDescriptor VarR8Round$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8Round$MH = RuntimeHelper.downcallHandle(
        "VarR8Round",
        constants$1293.VarR8Round$FUNC
    );
    static final FunctionDescriptor VarDateFromUdate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDateFromUdate$MH = RuntimeHelper.downcallHandle(
        "VarDateFromUdate",
        constants$1293.VarDateFromUdate$FUNC
    );
}

