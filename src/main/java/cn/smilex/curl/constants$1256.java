// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1256 {

    static final FunctionDescriptor VarI8FromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromR4$MH = RuntimeHelper.downcallHandle(
        "VarI8FromR4",
        constants$1256.VarI8FromR4$FUNC
    );
    static final FunctionDescriptor VarI8FromR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromR8$MH = RuntimeHelper.downcallHandle(
        "VarI8FromR8",
        constants$1256.VarI8FromR8$FUNC
    );
    static final FunctionDescriptor VarI8FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromCy$MH = RuntimeHelper.downcallHandle(
        "VarI8FromCy",
        constants$1256.VarI8FromCy$FUNC
    );
    static final FunctionDescriptor VarI8FromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromDate$MH = RuntimeHelper.downcallHandle(
        "VarI8FromDate",
        constants$1256.VarI8FromDate$FUNC
    );
    static final FunctionDescriptor VarI8FromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromStr$MH = RuntimeHelper.downcallHandle(
        "VarI8FromStr",
        constants$1256.VarI8FromStr$FUNC
    );
    static final FunctionDescriptor VarI8FromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI8FromDisp$MH = RuntimeHelper.downcallHandle(
        "VarI8FromDisp",
        constants$1256.VarI8FromDisp$FUNC
    );
}


