// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$881 {

    static final FunctionDescriptor XMIT_HELPER_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XMIT_HELPER_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$881.XMIT_HELPER_ROUTINE$FUNC
    );
    static final FunctionDescriptor USER_MARSHAL_SIZING_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle USER_MARSHAL_SIZING_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$881.USER_MARSHAL_SIZING_ROUTINE$FUNC
    );
    static final FunctionDescriptor USER_MARSHAL_MARSHALLING_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle USER_MARSHAL_MARSHALLING_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$881.USER_MARSHAL_MARSHALLING_ROUTINE$FUNC
    );
    static final FunctionDescriptor USER_MARSHAL_UNMARSHALLING_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

