// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1247 {

    static final FunctionDescriptor VariantClear$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VariantClear$MH = RuntimeHelper.downcallHandle(
        "VariantClear",
        constants$1247.VariantClear$FUNC
    );
    static final FunctionDescriptor VariantCopy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VariantCopy$MH = RuntimeHelper.downcallHandle(
        "VariantCopy",
        constants$1247.VariantCopy$FUNC
    );
    static final FunctionDescriptor VariantCopyInd$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VariantCopyInd$MH = RuntimeHelper.downcallHandle(
        "VariantCopyInd",
        constants$1247.VariantCopyInd$FUNC
    );
    static final FunctionDescriptor VariantChangeType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle VariantChangeType$MH = RuntimeHelper.downcallHandle(
        "VariantChangeType",
        constants$1247.VariantChangeType$FUNC
    );
    static final FunctionDescriptor VariantChangeTypeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle VariantChangeTypeEx$MH = RuntimeHelper.downcallHandle(
        "VariantChangeTypeEx",
        constants$1247.VariantChangeTypeEx$FUNC
    );
    static final FunctionDescriptor VectorFromBstr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VectorFromBstr$MH = RuntimeHelper.downcallHandle(
        "VectorFromBstr",
        constants$1247.VectorFromBstr$FUNC
    );
}


