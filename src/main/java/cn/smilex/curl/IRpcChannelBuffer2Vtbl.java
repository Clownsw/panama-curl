// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IRpcChannelBuffer2Vtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetBuffer"),
        Constants$root.C_POINTER$LAYOUT.withName("SendReceive"),
        Constants$root.C_POINTER$LAYOUT.withName("FreeBuffer"),
        Constants$root.C_POINTER$LAYOUT.withName("GetDestCtx"),
        Constants$root.C_POINTER$LAYOUT.withName("IsConnected"),
        Constants$root.C_POINTER$LAYOUT.withName("GetProtocolVersion")
    ).withName("IRpcChannelBuffer2Vtbl");
    public static MemoryLayout $LAYOUT() {
        return IRpcChannelBuffer2Vtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IRpcChannelBuffer2Vtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IRpcChannelBuffer2Vtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IRpcChannelBuffer2Vtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IRpcChannelBuffer2Vtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IRpcChannelBuffer2Vtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IRpcChannelBuffer2Vtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBuffer$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.GetBuffer$FUNC
    );
    public interface GetBuffer {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetBuffer fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetBuffer.class, fi, IRpcChannelBuffer2Vtbl.GetBuffer$FUNC, session);
        }
        static GetBuffer ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.GetBuffer$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetBuffer"));
    public static VarHandle GetBuffer$VH() {
        return IRpcChannelBuffer2Vtbl.GetBuffer$VH;
    }
    public static MemoryAddress GetBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.GetBuffer$VH.get(seg);
    }
    public static void GetBuffer$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.GetBuffer$VH.set(seg, x);
    }
    public static MemoryAddress GetBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.GetBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBuffer$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.GetBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBuffer GetBuffer (MemorySegment segment, MemorySession session) {
        return GetBuffer.ofAddress(GetBuffer$get(segment), session);
    }
    static final FunctionDescriptor SendReceive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SendReceive$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.SendReceive$FUNC
    );
    public interface SendReceive {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(SendReceive fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SendReceive.class, fi, IRpcChannelBuffer2Vtbl.SendReceive$FUNC, session);
        }
        static SendReceive ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.SendReceive$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SendReceive$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SendReceive"));
    public static VarHandle SendReceive$VH() {
        return IRpcChannelBuffer2Vtbl.SendReceive$VH;
    }
    public static MemoryAddress SendReceive$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.SendReceive$VH.get(seg);
    }
    public static void SendReceive$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.SendReceive$VH.set(seg, x);
    }
    public static MemoryAddress SendReceive$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.SendReceive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SendReceive$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.SendReceive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SendReceive SendReceive (MemorySegment segment, MemorySession session) {
        return SendReceive.ofAddress(SendReceive$get(segment), session);
    }
    static final FunctionDescriptor FreeBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeBuffer$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.FreeBuffer$FUNC
    );
    public interface FreeBuffer {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(FreeBuffer fi, MemorySession session) {
            return RuntimeHelper.upcallStub(FreeBuffer.class, fi, IRpcChannelBuffer2Vtbl.FreeBuffer$FUNC, session);
        }
        static FreeBuffer ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.FreeBuffer$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle FreeBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FreeBuffer"));
    public static VarHandle FreeBuffer$VH() {
        return IRpcChannelBuffer2Vtbl.FreeBuffer$VH;
    }
    public static MemoryAddress FreeBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.FreeBuffer$VH.get(seg);
    }
    public static void FreeBuffer$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.FreeBuffer$VH.set(seg, x);
    }
    public static MemoryAddress FreeBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.FreeBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeBuffer$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.FreeBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static FreeBuffer FreeBuffer (MemorySegment segment, MemorySession session) {
        return FreeBuffer.ofAddress(FreeBuffer$get(segment), session);
    }
    static final FunctionDescriptor GetDestCtx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDestCtx$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.GetDestCtx$FUNC
    );
    public interface GetDestCtx {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(GetDestCtx fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetDestCtx.class, fi, IRpcChannelBuffer2Vtbl.GetDestCtx$FUNC, session);
        }
        static GetDestCtx ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.GetDestCtx$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetDestCtx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetDestCtx"));
    public static VarHandle GetDestCtx$VH() {
        return IRpcChannelBuffer2Vtbl.GetDestCtx$VH;
    }
    public static MemoryAddress GetDestCtx$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.GetDestCtx$VH.get(seg);
    }
    public static void GetDestCtx$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.GetDestCtx$VH.set(seg, x);
    }
    public static MemoryAddress GetDestCtx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.GetDestCtx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetDestCtx$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.GetDestCtx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetDestCtx GetDestCtx (MemorySegment segment, MemorySession session) {
        return GetDestCtx.ofAddress(GetDestCtx$get(segment), session);
    }
    static final FunctionDescriptor IsConnected$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsConnected$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.IsConnected$FUNC
    );
    public interface IsConnected {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(IsConnected fi, MemorySession session) {
            return RuntimeHelper.upcallStub(IsConnected.class, fi, IRpcChannelBuffer2Vtbl.IsConnected$FUNC, session);
        }
        static IsConnected ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.IsConnected$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsConnected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsConnected"));
    public static VarHandle IsConnected$VH() {
        return IRpcChannelBuffer2Vtbl.IsConnected$VH;
    }
    public static MemoryAddress IsConnected$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.IsConnected$VH.get(seg);
    }
    public static void IsConnected$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.IsConnected$VH.set(seg, x);
    }
    public static MemoryAddress IsConnected$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.IsConnected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsConnected$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.IsConnected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsConnected IsConnected (MemorySegment segment, MemorySession session) {
        return IsConnected.ofAddress(IsConnected$get(segment), session);
    }
    static final FunctionDescriptor GetProtocolVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProtocolVersion$MH = RuntimeHelper.downcallHandle(
        IRpcChannelBuffer2Vtbl.GetProtocolVersion$FUNC
    );
    public interface GetProtocolVersion {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetProtocolVersion fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetProtocolVersion.class, fi, IRpcChannelBuffer2Vtbl.GetProtocolVersion$FUNC, session);
        }
        static GetProtocolVersion ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IRpcChannelBuffer2Vtbl.GetProtocolVersion$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetProtocolVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetProtocolVersion"));
    public static VarHandle GetProtocolVersion$VH() {
        return IRpcChannelBuffer2Vtbl.GetProtocolVersion$VH;
    }
    public static MemoryAddress GetProtocolVersion$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.GetProtocolVersion$VH.get(seg);
    }
    public static void GetProtocolVersion$set( MemorySegment seg, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.GetProtocolVersion$VH.set(seg, x);
    }
    public static MemoryAddress GetProtocolVersion$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IRpcChannelBuffer2Vtbl.GetProtocolVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetProtocolVersion$set(MemorySegment seg, long index, MemoryAddress x) {
        IRpcChannelBuffer2Vtbl.GetProtocolVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetProtocolVersion GetProtocolVersion (MemorySegment segment, MemorySession session) {
        return GetProtocolVersion.ofAddress(GetProtocolVersion$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


