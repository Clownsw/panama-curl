// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$376 {

    static final FunctionDescriptor GetFileSecurityA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileSecurityA$MH = RuntimeHelper.downcallHandle(
        "GetFileSecurityA",
        constants$376.GetFileSecurityA$FUNC
    );
    static final FunctionDescriptor ReadDirectoryChangesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadDirectoryChangesW$MH = RuntimeHelper.downcallHandle(
        "ReadDirectoryChangesW",
        constants$376.ReadDirectoryChangesW$FUNC
    );
    static final FunctionDescriptor ReadDirectoryChangesExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ReadDirectoryChangesExW$MH = RuntimeHelper.downcallHandle(
        "ReadDirectoryChangesExW",
        constants$376.ReadDirectoryChangesExW$FUNC
    );
    static final FunctionDescriptor MapViewOfFileExNuma$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MapViewOfFileExNuma$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFileExNuma",
        constants$376.MapViewOfFileExNuma$FUNC
    );
    static final FunctionDescriptor IsBadReadPtr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IsBadReadPtr$MH = RuntimeHelper.downcallHandle(
        "IsBadReadPtr",
        constants$376.IsBadReadPtr$FUNC
    );
    static final FunctionDescriptor IsBadWritePtr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IsBadWritePtr$MH = RuntimeHelper.downcallHandle(
        "IsBadWritePtr",
        constants$376.IsBadWritePtr$FUNC
    );
}

