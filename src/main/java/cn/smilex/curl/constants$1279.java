// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1279 {

    static final FunctionDescriptor VarUI4FromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromDate$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromDate",
        constants$1279.VarUI4FromDate$FUNC
    );
    static final FunctionDescriptor VarUI4FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromCy$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromCy",
        constants$1279.VarUI4FromCy$FUNC
    );
    static final FunctionDescriptor VarUI4FromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromStr$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromStr",
        constants$1279.VarUI4FromStr$FUNC
    );
    static final FunctionDescriptor VarUI4FromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromDisp$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromDisp",
        constants$1279.VarUI4FromDisp$FUNC
    );
    static final FunctionDescriptor VarUI4FromBool$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromBool$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromBool",
        constants$1279.VarUI4FromBool$FUNC
    );
    static final FunctionDescriptor VarUI4FromI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI4FromI1$MH = RuntimeHelper.downcallHandle(
        "VarUI4FromI1",
        constants$1279.VarUI4FromI1$FUNC
    );
}


