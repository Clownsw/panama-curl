// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$835 {

    static final FunctionDescriptor CertDeleteCRLFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDeleteCRLFromStore$MH = RuntimeHelper.downcallHandle(
        "CertDeleteCRLFromStore",
        constants$835.CertDeleteCRLFromStore$FUNC
    );
    static final FunctionDescriptor CertSerializeCertificateStoreElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSerializeCertificateStoreElement$MH = RuntimeHelper.downcallHandle(
        "CertSerializeCertificateStoreElement",
        constants$835.CertSerializeCertificateStoreElement$FUNC
    );
    static final FunctionDescriptor CertSerializeCRLStoreElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSerializeCRLStoreElement$MH = RuntimeHelper.downcallHandle(
        "CertSerializeCRLStoreElement",
        constants$835.CertSerializeCRLStoreElement$FUNC
    );
    static final FunctionDescriptor CertDuplicateCTLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDuplicateCTLContext$MH = RuntimeHelper.downcallHandle(
        "CertDuplicateCTLContext",
        constants$835.CertDuplicateCTLContext$FUNC
    );
    static final FunctionDescriptor CertCreateCTLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCreateCTLContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateCTLContext",
        constants$835.CertCreateCTLContext$FUNC
    );
    static final FunctionDescriptor CertFreeCTLContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCTLContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeCTLContext",
        constants$835.CertFreeCTLContext$FUNC
    );
}


