// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1284 {

    static final FunctionDescriptor VarDecFromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromDate$MH = RuntimeHelper.downcallHandle(
        "VarDecFromDate",
        constants$1284.VarDecFromDate$FUNC
    );
    static final FunctionDescriptor VarDecFromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromCy$MH = RuntimeHelper.downcallHandle(
        "VarDecFromCy",
        constants$1284.VarDecFromCy$FUNC
    );
    static final FunctionDescriptor VarDecFromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromStr$MH = RuntimeHelper.downcallHandle(
        "VarDecFromStr",
        constants$1284.VarDecFromStr$FUNC
    );
    static final FunctionDescriptor VarDecFromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromDisp$MH = RuntimeHelper.downcallHandle(
        "VarDecFromDisp",
        constants$1284.VarDecFromDisp$FUNC
    );
    static final FunctionDescriptor VarDecFromBool$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromBool$MH = RuntimeHelper.downcallHandle(
        "VarDecFromBool",
        constants$1284.VarDecFromBool$FUNC
    );
    static final FunctionDescriptor VarDecFromI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDecFromI1$MH = RuntimeHelper.downcallHandle(
        "VarDecFromI1",
        constants$1284.VarDecFromI1$FUNC
    );
}


