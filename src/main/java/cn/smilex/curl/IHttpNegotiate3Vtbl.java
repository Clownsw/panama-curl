// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IHttpNegotiate3Vtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("BeginningTransaction"),
        Constants$root.C_POINTER$LAYOUT.withName("OnResponse"),
        Constants$root.C_POINTER$LAYOUT.withName("GetRootSecurityId"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSerializedClientCertContext")
    ).withName("IHttpNegotiate3Vtbl");
    public static MemoryLayout $LAYOUT() {
        return IHttpNegotiate3Vtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiate3Vtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IHttpNegotiate3Vtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IHttpNegotiate3Vtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IHttpNegotiate3Vtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiate3Vtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiate3Vtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiate3Vtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IHttpNegotiate3Vtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IHttpNegotiate3Vtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IHttpNegotiate3Vtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiate3Vtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiate3Vtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiate3Vtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IHttpNegotiate3Vtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IHttpNegotiate3Vtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IHttpNegotiate3Vtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiate3Vtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiate3Vtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor BeginningTransaction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BeginningTransaction$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiate3Vtbl.BeginningTransaction$FUNC
    );
    public interface BeginningTransaction {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(BeginningTransaction fi, MemorySession session) {
            return RuntimeHelper.upcallStub(BeginningTransaction.class, fi, IHttpNegotiate3Vtbl.BeginningTransaction$FUNC, session);
        }
        static BeginningTransaction ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IHttpNegotiate3Vtbl.BeginningTransaction$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle BeginningTransaction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BeginningTransaction"));
    public static VarHandle BeginningTransaction$VH() {
        return IHttpNegotiate3Vtbl.BeginningTransaction$VH;
    }
    public static MemoryAddress BeginningTransaction$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.BeginningTransaction$VH.get(seg);
    }
    public static void BeginningTransaction$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiate3Vtbl.BeginningTransaction$VH.set(seg, x);
    }
    public static MemoryAddress BeginningTransaction$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.BeginningTransaction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BeginningTransaction$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiate3Vtbl.BeginningTransaction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static BeginningTransaction BeginningTransaction (MemorySegment segment, MemorySession session) {
        return BeginningTransaction.ofAddress(BeginningTransaction$get(segment), session);
    }
    static final FunctionDescriptor OnResponse$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnResponse$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiate3Vtbl.OnResponse$FUNC
    );
    public interface OnResponse {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(OnResponse fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnResponse.class, fi, IHttpNegotiate3Vtbl.OnResponse$FUNC, session);
        }
        static OnResponse ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IHttpNegotiate3Vtbl.OnResponse$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnResponse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnResponse"));
    public static VarHandle OnResponse$VH() {
        return IHttpNegotiate3Vtbl.OnResponse$VH;
    }
    public static MemoryAddress OnResponse$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.OnResponse$VH.get(seg);
    }
    public static void OnResponse$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiate3Vtbl.OnResponse$VH.set(seg, x);
    }
    public static MemoryAddress OnResponse$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.OnResponse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnResponse$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiate3Vtbl.OnResponse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnResponse OnResponse (MemorySegment segment, MemorySession session) {
        return OnResponse.ofAddress(OnResponse$get(segment), session);
    }
    static final FunctionDescriptor GetRootSecurityId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GetRootSecurityId$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiate3Vtbl.GetRootSecurityId$FUNC
    );
    public interface GetRootSecurityId {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, long _x3);
        static MemorySegment allocate(GetRootSecurityId fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetRootSecurityId.class, fi, IHttpNegotiate3Vtbl.GetRootSecurityId$FUNC, session);
        }
        static GetRootSecurityId ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, long __x3) -> {
                try {
                    return (int)IHttpNegotiate3Vtbl.GetRootSecurityId$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetRootSecurityId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetRootSecurityId"));
    public static VarHandle GetRootSecurityId$VH() {
        return IHttpNegotiate3Vtbl.GetRootSecurityId$VH;
    }
    public static MemoryAddress GetRootSecurityId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.GetRootSecurityId$VH.get(seg);
    }
    public static void GetRootSecurityId$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiate3Vtbl.GetRootSecurityId$VH.set(seg, x);
    }
    public static MemoryAddress GetRootSecurityId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.GetRootSecurityId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetRootSecurityId$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiate3Vtbl.GetRootSecurityId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetRootSecurityId GetRootSecurityId (MemorySegment segment, MemorySession session) {
        return GetRootSecurityId.ofAddress(GetRootSecurityId$get(segment), session);
    }
    static final FunctionDescriptor GetSerializedClientCertContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSerializedClientCertContext$MH = RuntimeHelper.downcallHandle(
        IHttpNegotiate3Vtbl.GetSerializedClientCertContext$FUNC
    );
    public interface GetSerializedClientCertContext {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetSerializedClientCertContext fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetSerializedClientCertContext.class, fi, IHttpNegotiate3Vtbl.GetSerializedClientCertContext$FUNC, session);
        }
        static GetSerializedClientCertContext ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IHttpNegotiate3Vtbl.GetSerializedClientCertContext$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSerializedClientCertContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSerializedClientCertContext"));
    public static VarHandle GetSerializedClientCertContext$VH() {
        return IHttpNegotiate3Vtbl.GetSerializedClientCertContext$VH;
    }
    public static MemoryAddress GetSerializedClientCertContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.GetSerializedClientCertContext$VH.get(seg);
    }
    public static void GetSerializedClientCertContext$set( MemorySegment seg, MemoryAddress x) {
        IHttpNegotiate3Vtbl.GetSerializedClientCertContext$VH.set(seg, x);
    }
    public static MemoryAddress GetSerializedClientCertContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IHttpNegotiate3Vtbl.GetSerializedClientCertContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSerializedClientCertContext$set(MemorySegment seg, long index, MemoryAddress x) {
        IHttpNegotiate3Vtbl.GetSerializedClientCertContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSerializedClientCertContext GetSerializedClientCertContext (MemorySegment segment, MemorySession session) {
        return GetSerializedClientCertContext.ofAddress(GetSerializedClientCertContext$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


