// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$784 {

    static final FunctionDescriptor SHSetUnreadMailCountA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHSetUnreadMailCountA$MH = RuntimeHelper.downcallHandle(
        "SHSetUnreadMailCountA",
        constants$784.SHSetUnreadMailCountA$FUNC
    );
    static final FunctionDescriptor SHSetUnreadMailCountW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHSetUnreadMailCountW$MH = RuntimeHelper.downcallHandle(
        "SHSetUnreadMailCountW",
        constants$784.SHSetUnreadMailCountW$FUNC
    );
    static final FunctionDescriptor SHTestTokenMembership$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHTestTokenMembership$MH = RuntimeHelper.downcallHandle(
        "SHTestTokenMembership",
        constants$784.SHTestTokenMembership$FUNC
    );
    static final FunctionDescriptor SHGetImageList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetImageList$MH = RuntimeHelper.downcallHandle(
        "SHGetImageList",
        constants$784.SHGetImageList$FUNC
    );
    static final FunctionDescriptor PFNCANSHAREFOLDERW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNCANSHAREFOLDERW$MH = RuntimeHelper.downcallHandle(
        constants$784.PFNCANSHAREFOLDERW$FUNC
    );
}


