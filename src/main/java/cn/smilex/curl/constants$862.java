// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$862 {

    static final FunctionDescriptor CertCreateSelfSignCertificate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCreateSelfSignCertificate$MH = RuntimeHelper.downcallHandle(
        "CertCreateSelfSignCertificate",
        constants$862.CertCreateSelfSignCertificate$FUNC
    );
    static final FunctionDescriptor CryptGetKeyIdentifierProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetKeyIdentifierProperty$MH = RuntimeHelper.downcallHandle(
        "CryptGetKeyIdentifierProperty",
        constants$862.CryptGetKeyIdentifierProperty$FUNC
    );
    static final FunctionDescriptor CryptSetKeyIdentifierProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptSetKeyIdentifierProperty$MH = RuntimeHelper.downcallHandle(
        "CryptSetKeyIdentifierProperty",
        constants$862.CryptSetKeyIdentifierProperty$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_ENUM_KEYID_PROP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ENUM_KEYID_PROP$MH = RuntimeHelper.downcallHandle(
        constants$862.PFN_CRYPT_ENUM_KEYID_PROP$FUNC
    );
    static final FunctionDescriptor CryptEnumKeyIdentifierProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumKeyIdentifierProperties$MH = RuntimeHelper.downcallHandle(
        "CryptEnumKeyIdentifierProperties",
        constants$862.CryptEnumKeyIdentifierProperties$FUNC
    );
}


