// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IDispatchVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetTypeInfoCount"),
        Constants$root.C_POINTER$LAYOUT.withName("GetTypeInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("GetIDsOfNames"),
        Constants$root.C_POINTER$LAYOUT.withName("Invoke")
    ).withName("IDispatchVtbl");
    public static MemoryLayout $LAYOUT() {
        return IDispatchVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IDispatchVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IDispatchVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IDispatchVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IDispatchVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IDispatchVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IDispatchVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IDispatchVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IDispatchVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDispatchVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IDispatchVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IDispatchVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IDispatchVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IDispatchVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IDispatchVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IDispatchVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IDispatchVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IDispatchVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IDispatchVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetTypeInfoCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTypeInfoCount$MH = RuntimeHelper.downcallHandle(
        IDispatchVtbl.GetTypeInfoCount$FUNC
    );
    public interface GetTypeInfoCount {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetTypeInfoCount fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetTypeInfoCount.class, fi, IDispatchVtbl.GetTypeInfoCount$FUNC, session);
        }
        static GetTypeInfoCount ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IDispatchVtbl.GetTypeInfoCount$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfoCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetTypeInfoCount"));
    public static VarHandle GetTypeInfoCount$VH() {
        return IDispatchVtbl.GetTypeInfoCount$VH;
    }
    public static MemoryAddress GetTypeInfoCount$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.GetTypeInfoCount$VH.get(seg);
    }
    public static void GetTypeInfoCount$set( MemorySegment seg, MemoryAddress x) {
        IDispatchVtbl.GetTypeInfoCount$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeInfoCount$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.GetTypeInfoCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfoCount$set(MemorySegment seg, long index, MemoryAddress x) {
        IDispatchVtbl.GetTypeInfoCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfoCount GetTypeInfoCount (MemorySegment segment, MemorySession session) {
        return GetTypeInfoCount.ofAddress(GetTypeInfoCount$get(segment), session);
    }
    static final FunctionDescriptor GetTypeInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTypeInfo$MH = RuntimeHelper.downcallHandle(
        IDispatchVtbl.GetTypeInfo$FUNC
    );
    public interface GetTypeInfo {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(GetTypeInfo fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetTypeInfo.class, fi, IDispatchVtbl.GetTypeInfo$FUNC, session);
        }
        static GetTypeInfo ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IDispatchVtbl.GetTypeInfo$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetTypeInfo"));
    public static VarHandle GetTypeInfo$VH() {
        return IDispatchVtbl.GetTypeInfo$VH;
    }
    public static MemoryAddress GetTypeInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.GetTypeInfo$VH.get(seg);
    }
    public static void GetTypeInfo$set( MemorySegment seg, MemoryAddress x) {
        IDispatchVtbl.GetTypeInfo$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.GetTypeInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        IDispatchVtbl.GetTypeInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfo GetTypeInfo (MemorySegment segment, MemorySession session) {
        return GetTypeInfo.ofAddress(GetTypeInfo$get(segment), session);
    }
    static final FunctionDescriptor GetIDsOfNames$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetIDsOfNames$MH = RuntimeHelper.downcallHandle(
        IDispatchVtbl.GetIDsOfNames$FUNC
    );
    public interface GetIDsOfNames {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3, int _x4, java.lang.foreign.MemoryAddress _x5);
        static MemorySegment allocate(GetIDsOfNames fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetIDsOfNames.class, fi, IDispatchVtbl.GetIDsOfNames$FUNC, session);
        }
        static GetIDsOfNames ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3, int __x4, java.lang.foreign.MemoryAddress __x5) -> {
                try {
                    return (int)IDispatchVtbl.GetIDsOfNames$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3, __x4, (java.lang.foreign.Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetIDsOfNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetIDsOfNames"));
    public static VarHandle GetIDsOfNames$VH() {
        return IDispatchVtbl.GetIDsOfNames$VH;
    }
    public static MemoryAddress GetIDsOfNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.GetIDsOfNames$VH.get(seg);
    }
    public static void GetIDsOfNames$set( MemorySegment seg, MemoryAddress x) {
        IDispatchVtbl.GetIDsOfNames$VH.set(seg, x);
    }
    public static MemoryAddress GetIDsOfNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.GetIDsOfNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetIDsOfNames$set(MemorySegment seg, long index, MemoryAddress x) {
        IDispatchVtbl.GetIDsOfNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetIDsOfNames GetIDsOfNames (MemorySegment segment, MemorySession session) {
        return GetIDsOfNames.ofAddress(GetIDsOfNames$get(segment), session);
    }
    static final FunctionDescriptor Invoke$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Invoke$MH = RuntimeHelper.downcallHandle(
        IDispatchVtbl.Invoke$FUNC
    );
    public interface Invoke {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, int _x3, short _x4, java.lang.foreign.MemoryAddress _x5, java.lang.foreign.MemoryAddress _x6, java.lang.foreign.MemoryAddress _x7, java.lang.foreign.MemoryAddress _x8);
        static MemorySegment allocate(Invoke fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Invoke.class, fi, IDispatchVtbl.Invoke$FUNC, session);
        }
        static Invoke ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, int __x3, short __x4, java.lang.foreign.MemoryAddress __x5, java.lang.foreign.MemoryAddress __x6, java.lang.foreign.MemoryAddress __x7, java.lang.foreign.MemoryAddress __x8) -> {
                try {
                    return (int)IDispatchVtbl.Invoke$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, __x3, __x4, (java.lang.foreign.Addressable)__x5, (java.lang.foreign.Addressable)__x6, (java.lang.foreign.Addressable)__x7, (java.lang.foreign.Addressable)__x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Invoke$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Invoke"));
    public static VarHandle Invoke$VH() {
        return IDispatchVtbl.Invoke$VH;
    }
    public static MemoryAddress Invoke$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.Invoke$VH.get(seg);
    }
    public static void Invoke$set( MemorySegment seg, MemoryAddress x) {
        IDispatchVtbl.Invoke$VH.set(seg, x);
    }
    public static MemoryAddress Invoke$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IDispatchVtbl.Invoke$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Invoke$set(MemorySegment seg, long index, MemoryAddress x) {
        IDispatchVtbl.Invoke$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Invoke Invoke (MemorySegment segment, MemorySession session) {
        return Invoke.ofAddress(Invoke$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


