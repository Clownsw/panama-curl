// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$605 {

    static final FunctionDescriptor GEO_ENUMNAMEPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GEO_ENUMNAMEPROC$MH = RuntimeHelper.downcallHandle(
        constants$605.GEO_ENUMNAMEPROC$FUNC
    );
    static final FunctionDescriptor CompareStringEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CompareStringEx$MH = RuntimeHelper.downcallHandle(
        "CompareStringEx",
        constants$605.CompareStringEx$FUNC
    );
    static final FunctionDescriptor CompareStringOrdinal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompareStringOrdinal$MH = RuntimeHelper.downcallHandle(
        "CompareStringOrdinal",
        constants$605.CompareStringOrdinal$FUNC
    );
    static final FunctionDescriptor CompareStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompareStringW$MH = RuntimeHelper.downcallHandle(
        "CompareStringW",
        constants$605.CompareStringW$FUNC
    );
    static final FunctionDescriptor FoldStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FoldStringW$MH = RuntimeHelper.downcallHandle(
        "FoldStringW",
        constants$605.FoldStringW$FUNC
    );
    static final FunctionDescriptor GetStringTypeExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStringTypeExW$MH = RuntimeHelper.downcallHandle(
        "GetStringTypeExW",
        constants$605.GetStringTypeExW$FUNC
    );
}


