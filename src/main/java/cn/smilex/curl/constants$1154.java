// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1154 {

    static final FunctionDescriptor CoBuildVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoBuildVersion$MH = RuntimeHelper.downcallHandle(
        "CoBuildVersion",
        constants$1154.CoBuildVersion$FUNC
    );
    static final FunctionDescriptor CoInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoInitialize$MH = RuntimeHelper.downcallHandle(
        "CoInitialize",
        constants$1154.CoInitialize$FUNC
    );
    static final FunctionDescriptor CoRegisterMallocSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterMallocSpy$MH = RuntimeHelper.downcallHandle(
        "CoRegisterMallocSpy",
        constants$1154.CoRegisterMallocSpy$FUNC
    );
    static final FunctionDescriptor CoRevokeMallocSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoRevokeMallocSpy$MH = RuntimeHelper.downcallHandle(
        "CoRevokeMallocSpy",
        constants$1154.CoRevokeMallocSpy$FUNC
    );
    static final FunctionDescriptor CoCreateStandardMalloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoCreateStandardMalloc$MH = RuntimeHelper.downcallHandle(
        "CoCreateStandardMalloc",
        constants$1154.CoCreateStandardMalloc$FUNC
    );
    static final FunctionDescriptor CoRegisterInitializeSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterInitializeSpy$MH = RuntimeHelper.downcallHandle(
        "CoRegisterInitializeSpy",
        constants$1154.CoRegisterInitializeSpy$FUNC
    );
}


