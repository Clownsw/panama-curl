// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$860 {

    static final FunctionDescriptor PFN_CRYPT_CANCEL_RETRIEVAL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_CANCEL_RETRIEVAL$MH = RuntimeHelper.downcallHandle(
        constants$860.PFN_CRYPT_CANCEL_RETRIEVAL$FUNC
    );
    static final FunctionDescriptor CryptInstallCancelRetrieval$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptInstallCancelRetrieval$MH = RuntimeHelper.downcallHandle(
        "CryptInstallCancelRetrieval",
        constants$860.CryptInstallCancelRetrieval$FUNC
    );
    static final FunctionDescriptor CryptUninstallCancelRetrieval$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptUninstallCancelRetrieval$MH = RuntimeHelper.downcallHandle(
        "CryptUninstallCancelRetrieval",
        constants$860.CryptUninstallCancelRetrieval$FUNC
    );
    static final FunctionDescriptor CryptCancelAsyncRetrieval$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCancelAsyncRetrieval$MH = RuntimeHelper.downcallHandle(
        "CryptCancelAsyncRetrieval",
        constants$860.CryptCancelAsyncRetrieval$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


