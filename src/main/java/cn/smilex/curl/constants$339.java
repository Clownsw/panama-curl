// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$339 {

    static final FunctionDescriptor FileEncryptionStatusA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileEncryptionStatusA$MH = RuntimeHelper.downcallHandle(
        "FileEncryptionStatusA",
        constants$339.FileEncryptionStatusA$FUNC
    );
    static final FunctionDescriptor FileEncryptionStatusW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileEncryptionStatusW$MH = RuntimeHelper.downcallHandle(
        "FileEncryptionStatusW",
        constants$339.FileEncryptionStatusW$FUNC
    );
    static final FunctionDescriptor PFE_EXPORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFE_EXPORT_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$339.PFE_EXPORT_FUNC$FUNC
    );
    static final FunctionDescriptor PFE_IMPORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFE_IMPORT_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$339.PFE_IMPORT_FUNC$FUNC
    );
}


