// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$340 {

    static final FunctionDescriptor OpenEncryptedFileRawA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEncryptedFileRawA$MH = RuntimeHelper.downcallHandle(
        "OpenEncryptedFileRawA",
        constants$340.OpenEncryptedFileRawA$FUNC
    );
    static final FunctionDescriptor OpenEncryptedFileRawW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEncryptedFileRawW$MH = RuntimeHelper.downcallHandle(
        "OpenEncryptedFileRawW",
        constants$340.OpenEncryptedFileRawW$FUNC
    );
    static final FunctionDescriptor ReadEncryptedFileRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadEncryptedFileRaw$MH = RuntimeHelper.downcallHandle(
        "ReadEncryptedFileRaw",
        constants$340.ReadEncryptedFileRaw$FUNC
    );
    static final FunctionDescriptor WriteEncryptedFileRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteEncryptedFileRaw$MH = RuntimeHelper.downcallHandle(
        "WriteEncryptedFileRaw",
        constants$340.WriteEncryptedFileRaw$FUNC
    );
    static final FunctionDescriptor CloseEncryptedFileRaw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseEncryptedFileRaw$MH = RuntimeHelper.downcallHandle(
        "CloseEncryptedFileRaw",
        constants$340.CloseEncryptedFileRaw$FUNC
    );
    static final FunctionDescriptor lstrcmpA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lstrcmpA$MH = RuntimeHelper.downcallHandle(
        "lstrcmpA",
        constants$340.lstrcmpA$FUNC
    );
}


