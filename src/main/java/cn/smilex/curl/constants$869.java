// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$869 {

    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET$MH = RuntimeHelper.downcallHandle(
        constants$869.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE$MH = RuntimeHelper.downcallHandle(
        constants$869.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD$MH = RuntimeHelper.downcallHandle(
        constants$869.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


