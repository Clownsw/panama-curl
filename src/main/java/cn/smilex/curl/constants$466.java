// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$466 {

    static final FunctionDescriptor wglDeleteContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglDeleteContext$MH = RuntimeHelper.downcallHandle(
        "wglDeleteContext",
        constants$466.wglDeleteContext$FUNC
    );
    static final FunctionDescriptor wglGetCurrentContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle wglGetCurrentContext$MH = RuntimeHelper.downcallHandle(
        "wglGetCurrentContext",
        constants$466.wglGetCurrentContext$FUNC
    );
    static final FunctionDescriptor wglGetCurrentDC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle wglGetCurrentDC$MH = RuntimeHelper.downcallHandle(
        "wglGetCurrentDC",
        constants$466.wglGetCurrentDC$FUNC
    );
    static final FunctionDescriptor wglGetProcAddress$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglGetProcAddress$MH = RuntimeHelper.downcallHandle(
        "wglGetProcAddress",
        constants$466.wglGetProcAddress$FUNC
    );
    static final FunctionDescriptor wglMakeCurrent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglMakeCurrent$MH = RuntimeHelper.downcallHandle(
        "wglMakeCurrent",
        constants$466.wglMakeCurrent$FUNC
    );
    static final FunctionDescriptor wglShareLists$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglShareLists$MH = RuntimeHelper.downcallHandle(
        "wglShareLists",
        constants$466.wglShareLists$FUNC
    );
}


