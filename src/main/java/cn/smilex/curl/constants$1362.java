// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1362 {

    static final FunctionDescriptor WSASocketA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASocketA$MH = RuntimeHelper.downcallHandle(
        "WSASocketA",
        constants$1362.WSASocketA$FUNC
    );
    static final FunctionDescriptor WSASocketW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASocketW$MH = RuntimeHelper.downcallHandle(
        "WSASocketW",
        constants$1362.WSASocketW$FUNC
    );
    static final FunctionDescriptor WSAWaitForMultipleEvents$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAWaitForMultipleEvents$MH = RuntimeHelper.downcallHandle(
        "WSAWaitForMultipleEvents",
        constants$1362.WSAWaitForMultipleEvents$FUNC
    );
    static final FunctionDescriptor WSAAddressToStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSAAddressToStringA$MH = RuntimeHelper.downcallHandle(
        "WSAAddressToStringA",
        constants$1362.WSAAddressToStringA$FUNC
    );
    static final FunctionDescriptor WSAAddressToStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSAAddressToStringW$MH = RuntimeHelper.downcallHandle(
        "WSAAddressToStringW",
        constants$1362.WSAAddressToStringW$FUNC
    );
    static final FunctionDescriptor WSAStringToAddressA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSAStringToAddressA$MH = RuntimeHelper.downcallHandle(
        "WSAStringToAddressA",
        constants$1362.WSAStringToAddressA$FUNC
    );
}


