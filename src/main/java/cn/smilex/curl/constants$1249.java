// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1249 {

    static final FunctionDescriptor VarUI1FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI1FromCy$MH = RuntimeHelper.downcallHandle(
        "VarUI1FromCy",
        constants$1249.VarUI1FromCy$FUNC
    );
    static final FunctionDescriptor VarUI1FromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI1FromDate$MH = RuntimeHelper.downcallHandle(
        "VarUI1FromDate",
        constants$1249.VarUI1FromDate$FUNC
    );
    static final FunctionDescriptor VarUI1FromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI1FromStr$MH = RuntimeHelper.downcallHandle(
        "VarUI1FromStr",
        constants$1249.VarUI1FromStr$FUNC
    );
    static final FunctionDescriptor VarUI1FromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI1FromDisp$MH = RuntimeHelper.downcallHandle(
        "VarUI1FromDisp",
        constants$1249.VarUI1FromDisp$FUNC
    );
    static final FunctionDescriptor VarUI1FromBool$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI1FromBool$MH = RuntimeHelper.downcallHandle(
        "VarUI1FromBool",
        constants$1249.VarUI1FromBool$FUNC
    );
    static final FunctionDescriptor VarUI1FromI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI1FromI1$MH = RuntimeHelper.downcallHandle(
        "VarUI1FromI1",
        constants$1249.VarUI1FromI1$FUNC
    );
}


