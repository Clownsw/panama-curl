// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$846 {

    static final FunctionDescriptor PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$846.PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$846.PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$846.PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC$FUNC
    );
}

