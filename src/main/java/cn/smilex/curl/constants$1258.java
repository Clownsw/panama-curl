// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1258 {

    static final FunctionDescriptor VarR4FromUI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR4FromUI1$MH = RuntimeHelper.downcallHandle(
        "VarR4FromUI1",
        constants$1258.VarR4FromUI1$FUNC
    );
    static final FunctionDescriptor VarR4FromI2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR4FromI2$MH = RuntimeHelper.downcallHandle(
        "VarR4FromI2",
        constants$1258.VarR4FromI2$FUNC
    );
    static final FunctionDescriptor VarR4FromI4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR4FromI4$MH = RuntimeHelper.downcallHandle(
        "VarR4FromI4",
        constants$1258.VarR4FromI4$FUNC
    );
    static final FunctionDescriptor VarR4FromI8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR4FromI8$MH = RuntimeHelper.downcallHandle(
        "VarR4FromI8",
        constants$1258.VarR4FromI8$FUNC
    );
    static final FunctionDescriptor VarR4FromR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR4FromR8$MH = RuntimeHelper.downcallHandle(
        "VarR4FromR8",
        constants$1258.VarR4FromR8$FUNC
    );
    static final FunctionDescriptor VarR4FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR4FromCy$MH = RuntimeHelper.downcallHandle(
        "VarR4FromCy",
        constants$1258.VarR4FromCy$FUNC
    );
}


