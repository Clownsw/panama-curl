// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$365 {

    static final FunctionDescriptor CopyFileTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyFileTransactedW$MH = RuntimeHelper.downcallHandle(
        "CopyFileTransactedW",
        constants$365.CopyFileTransactedW$FUNC
    );
    static final FunctionDescriptor PCOPYFILE2_PROGRESS_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PCOPYFILE2_PROGRESS_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$365.PCOPYFILE2_PROGRESS_ROUTINE$FUNC
    );
    static final FunctionDescriptor CopyFile2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyFile2$MH = RuntimeHelper.downcallHandle(
        "CopyFile2",
        constants$365.CopyFile2$FUNC
    );
    static final FunctionDescriptor MoveFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MoveFileA$MH = RuntimeHelper.downcallHandle(
        "MoveFileA",
        constants$365.MoveFileA$FUNC
    );
    static final FunctionDescriptor MoveFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MoveFileW$MH = RuntimeHelper.downcallHandle(
        "MoveFileW",
        constants$365.MoveFileW$FUNC
    );
}

