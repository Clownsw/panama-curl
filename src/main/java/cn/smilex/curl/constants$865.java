// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$865 {

    static final FunctionDescriptor CryptStringToBinaryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptStringToBinaryW$MH = RuntimeHelper.downcallHandle(
        "CryptStringToBinaryW",
        constants$865.CryptStringToBinaryW$FUNC
    );
    static final FunctionDescriptor CryptBinaryToStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptBinaryToStringA$MH = RuntimeHelper.downcallHandle(
        "CryptBinaryToStringA",
        constants$865.CryptBinaryToStringA$FUNC
    );
    static final FunctionDescriptor CryptBinaryToStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptBinaryToStringW$MH = RuntimeHelper.downcallHandle(
        "CryptBinaryToStringW",
        constants$865.CryptBinaryToStringW$FUNC
    );
    static final FunctionDescriptor PFXImportCertStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFXImportCertStore$MH = RuntimeHelper.downcallHandle(
        "PFXImportCertStore",
        constants$865.PFXImportCertStore$FUNC
    );
    static final FunctionDescriptor PFXIsPFXBlob$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFXIsPFXBlob$MH = RuntimeHelper.downcallHandle(
        "PFXIsPFXBlob",
        constants$865.PFXIsPFXBlob$FUNC
    );
    static final FunctionDescriptor PFXVerifyPassword$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFXVerifyPassword$MH = RuntimeHelper.downcallHandle(
        "PFXVerifyPassword",
        constants$865.PFXVerifyPassword$FUNC
    );
}


