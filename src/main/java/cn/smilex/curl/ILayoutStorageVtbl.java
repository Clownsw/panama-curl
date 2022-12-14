// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ILayoutStorageVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("LayoutScript"),
        Constants$root.C_POINTER$LAYOUT.withName("BeginMonitor"),
        Constants$root.C_POINTER$LAYOUT.withName("EndMonitor"),
        Constants$root.C_POINTER$LAYOUT.withName("ReLayoutDocfile"),
        Constants$root.C_POINTER$LAYOUT.withName("ReLayoutDocfileOnILockBytes")
    ).withName("ILayoutStorageVtbl");
    public static MemoryLayout $LAYOUT() {
        return ILayoutStorageVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        ILayoutStorageVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ILayoutStorageVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)ILayoutStorageVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return ILayoutStorageVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        ILayoutStorageVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        ILayoutStorageVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        ILayoutStorageVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ILayoutStorageVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ILayoutStorageVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return ILayoutStorageVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        ILayoutStorageVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        ILayoutStorageVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        ILayoutStorageVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, ILayoutStorageVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ILayoutStorageVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return ILayoutStorageVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        ILayoutStorageVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        ILayoutStorageVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor LayoutScript$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LayoutScript$MH = RuntimeHelper.downcallHandle(
        ILayoutStorageVtbl.LayoutScript$FUNC
    );
    public interface LayoutScript {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, int _x3);
        static MemorySegment allocate(LayoutScript fi, MemorySession session) {
            return RuntimeHelper.upcallStub(LayoutScript.class, fi, ILayoutStorageVtbl.LayoutScript$FUNC, session);
        }
        static LayoutScript ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, int __x3) -> {
                try {
                    return (int)ILayoutStorageVtbl.LayoutScript$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle LayoutScript$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LayoutScript"));
    public static VarHandle LayoutScript$VH() {
        return ILayoutStorageVtbl.LayoutScript$VH;
    }
    public static MemoryAddress LayoutScript$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.LayoutScript$VH.get(seg);
    }
    public static void LayoutScript$set( MemorySegment seg, MemoryAddress x) {
        ILayoutStorageVtbl.LayoutScript$VH.set(seg, x);
    }
    public static MemoryAddress LayoutScript$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.LayoutScript$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LayoutScript$set(MemorySegment seg, long index, MemoryAddress x) {
        ILayoutStorageVtbl.LayoutScript$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LayoutScript LayoutScript (MemorySegment segment, MemorySession session) {
        return LayoutScript.ofAddress(LayoutScript$get(segment), session);
    }
    static final FunctionDescriptor BeginMonitor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BeginMonitor$MH = RuntimeHelper.downcallHandle(
        ILayoutStorageVtbl.BeginMonitor$FUNC
    );
    public interface BeginMonitor {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(BeginMonitor fi, MemorySession session) {
            return RuntimeHelper.upcallStub(BeginMonitor.class, fi, ILayoutStorageVtbl.BeginMonitor$FUNC, session);
        }
        static BeginMonitor ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ILayoutStorageVtbl.BeginMonitor$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle BeginMonitor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BeginMonitor"));
    public static VarHandle BeginMonitor$VH() {
        return ILayoutStorageVtbl.BeginMonitor$VH;
    }
    public static MemoryAddress BeginMonitor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.BeginMonitor$VH.get(seg);
    }
    public static void BeginMonitor$set( MemorySegment seg, MemoryAddress x) {
        ILayoutStorageVtbl.BeginMonitor$VH.set(seg, x);
    }
    public static MemoryAddress BeginMonitor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.BeginMonitor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BeginMonitor$set(MemorySegment seg, long index, MemoryAddress x) {
        ILayoutStorageVtbl.BeginMonitor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static BeginMonitor BeginMonitor (MemorySegment segment, MemorySession session) {
        return BeginMonitor.ofAddress(BeginMonitor$get(segment), session);
    }
    static final FunctionDescriptor EndMonitor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EndMonitor$MH = RuntimeHelper.downcallHandle(
        ILayoutStorageVtbl.EndMonitor$FUNC
    );
    public interface EndMonitor {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(EndMonitor fi, MemorySession session) {
            return RuntimeHelper.upcallStub(EndMonitor.class, fi, ILayoutStorageVtbl.EndMonitor$FUNC, session);
        }
        static EndMonitor ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)ILayoutStorageVtbl.EndMonitor$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EndMonitor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EndMonitor"));
    public static VarHandle EndMonitor$VH() {
        return ILayoutStorageVtbl.EndMonitor$VH;
    }
    public static MemoryAddress EndMonitor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.EndMonitor$VH.get(seg);
    }
    public static void EndMonitor$set( MemorySegment seg, MemoryAddress x) {
        ILayoutStorageVtbl.EndMonitor$VH.set(seg, x);
    }
    public static MemoryAddress EndMonitor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.EndMonitor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EndMonitor$set(MemorySegment seg, long index, MemoryAddress x) {
        ILayoutStorageVtbl.EndMonitor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EndMonitor EndMonitor (MemorySegment segment, MemorySession session) {
        return EndMonitor.ofAddress(EndMonitor$get(segment), session);
    }
    static final FunctionDescriptor ReLayoutDocfile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReLayoutDocfile$MH = RuntimeHelper.downcallHandle(
        ILayoutStorageVtbl.ReLayoutDocfile$FUNC
    );
    public interface ReLayoutDocfile {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(ReLayoutDocfile fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ReLayoutDocfile.class, fi, ILayoutStorageVtbl.ReLayoutDocfile$FUNC, session);
        }
        static ReLayoutDocfile ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)ILayoutStorageVtbl.ReLayoutDocfile$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReLayoutDocfile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReLayoutDocfile"));
    public static VarHandle ReLayoutDocfile$VH() {
        return ILayoutStorageVtbl.ReLayoutDocfile$VH;
    }
    public static MemoryAddress ReLayoutDocfile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.ReLayoutDocfile$VH.get(seg);
    }
    public static void ReLayoutDocfile$set( MemorySegment seg, MemoryAddress x) {
        ILayoutStorageVtbl.ReLayoutDocfile$VH.set(seg, x);
    }
    public static MemoryAddress ReLayoutDocfile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.ReLayoutDocfile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReLayoutDocfile$set(MemorySegment seg, long index, MemoryAddress x) {
        ILayoutStorageVtbl.ReLayoutDocfile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReLayoutDocfile ReLayoutDocfile (MemorySegment segment, MemorySession session) {
        return ReLayoutDocfile.ofAddress(ReLayoutDocfile$get(segment), session);
    }
    static final FunctionDescriptor ReLayoutDocfileOnILockBytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReLayoutDocfileOnILockBytes$MH = RuntimeHelper.downcallHandle(
        ILayoutStorageVtbl.ReLayoutDocfileOnILockBytes$FUNC
    );
    public interface ReLayoutDocfileOnILockBytes {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(ReLayoutDocfileOnILockBytes fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ReLayoutDocfileOnILockBytes.class, fi, ILayoutStorageVtbl.ReLayoutDocfileOnILockBytes$FUNC, session);
        }
        static ReLayoutDocfileOnILockBytes ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)ILayoutStorageVtbl.ReLayoutDocfileOnILockBytes$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReLayoutDocfileOnILockBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReLayoutDocfileOnILockBytes"));
    public static VarHandle ReLayoutDocfileOnILockBytes$VH() {
        return ILayoutStorageVtbl.ReLayoutDocfileOnILockBytes$VH;
    }
    public static MemoryAddress ReLayoutDocfileOnILockBytes$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.ReLayoutDocfileOnILockBytes$VH.get(seg);
    }
    public static void ReLayoutDocfileOnILockBytes$set( MemorySegment seg, MemoryAddress x) {
        ILayoutStorageVtbl.ReLayoutDocfileOnILockBytes$VH.set(seg, x);
    }
    public static MemoryAddress ReLayoutDocfileOnILockBytes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ILayoutStorageVtbl.ReLayoutDocfileOnILockBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReLayoutDocfileOnILockBytes$set(MemorySegment seg, long index, MemoryAddress x) {
        ILayoutStorageVtbl.ReLayoutDocfileOnILockBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReLayoutDocfileOnILockBytes ReLayoutDocfileOnILockBytes (MemorySegment segment, MemorySession session) {
        return ReLayoutDocfileOnILockBytes.ofAddress(ReLayoutDocfileOnILockBytes$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


