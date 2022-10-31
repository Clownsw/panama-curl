// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IPersistStorageVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetClassID"),
        Constants$root.C_POINTER$LAYOUT.withName("IsDirty"),
        Constants$root.C_POINTER$LAYOUT.withName("InitNew"),
        Constants$root.C_POINTER$LAYOUT.withName("Load"),
        Constants$root.C_POINTER$LAYOUT.withName("Save"),
        Constants$root.C_POINTER$LAYOUT.withName("SaveCompleted"),
        Constants$root.C_POINTER$LAYOUT.withName("HandsOffStorage")
    ).withName("IPersistStorageVtbl");
    public static MemoryLayout $LAYOUT() {
        return IPersistStorageVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IPersistStorageVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPersistStorageVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IPersistStorageVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IPersistStorageVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistStorageVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IPersistStorageVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IPersistStorageVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistStorageVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IPersistStorageVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetClassID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassID$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.GetClassID$FUNC
    );
    public interface GetClassID {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetClassID fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetClassID.class, fi, IPersistStorageVtbl.GetClassID$FUNC, session);
        }
        static GetClassID ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistStorageVtbl.GetClassID$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetClassID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetClassID"));
    public static VarHandle GetClassID$VH() {
        return IPersistStorageVtbl.GetClassID$VH;
    }
    public static MemoryAddress GetClassID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.GetClassID$VH.get(seg);
    }
    public static void GetClassID$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.GetClassID$VH.set(seg, x);
    }
    public static MemoryAddress GetClassID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.GetClassID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClassID$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.GetClassID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetClassID GetClassID (MemorySegment segment, MemorySession session) {
        return GetClassID.ofAddress(GetClassID$get(segment), session);
    }
    static final FunctionDescriptor IsDirty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsDirty$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.IsDirty$FUNC
    );
    public interface IsDirty {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(IsDirty fi, MemorySession session) {
            return RuntimeHelper.upcallStub(IsDirty.class, fi, IPersistStorageVtbl.IsDirty$FUNC, session);
        }
        static IsDirty ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistStorageVtbl.IsDirty$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsDirty$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsDirty"));
    public static VarHandle IsDirty$VH() {
        return IPersistStorageVtbl.IsDirty$VH;
    }
    public static MemoryAddress IsDirty$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.IsDirty$VH.get(seg);
    }
    public static void IsDirty$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.IsDirty$VH.set(seg, x);
    }
    public static MemoryAddress IsDirty$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.IsDirty$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsDirty$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.IsDirty$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsDirty IsDirty (MemorySegment segment, MemorySession session) {
        return IsDirty.ofAddress(IsDirty$get(segment), session);
    }
    static final FunctionDescriptor InitNew$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitNew$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.InitNew$FUNC
    );
    public interface InitNew {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(InitNew fi, MemorySession session) {
            return RuntimeHelper.upcallStub(InitNew.class, fi, IPersistStorageVtbl.InitNew$FUNC, session);
        }
        static InitNew ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistStorageVtbl.InitNew$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle InitNew$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InitNew"));
    public static VarHandle InitNew$VH() {
        return IPersistStorageVtbl.InitNew$VH;
    }
    public static MemoryAddress InitNew$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.InitNew$VH.get(seg);
    }
    public static void InitNew$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.InitNew$VH.set(seg, x);
    }
    public static MemoryAddress InitNew$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.InitNew$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InitNew$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.InitNew$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static InitNew InitNew (MemorySegment segment, MemorySession session) {
        return InitNew.ofAddress(InitNew$get(segment), session);
    }
    static final FunctionDescriptor Load$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Load$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.Load$FUNC
    );
    public interface Load {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(Load fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Load.class, fi, IPersistStorageVtbl.Load$FUNC, session);
        }
        static Load ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistStorageVtbl.Load$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Load$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Load"));
    public static VarHandle Load$VH() {
        return IPersistStorageVtbl.Load$VH;
    }
    public static MemoryAddress Load$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.Load$VH.get(seg);
    }
    public static void Load$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.Load$VH.set(seg, x);
    }
    public static MemoryAddress Load$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.Load$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Load$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.Load$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Load Load (MemorySegment segment, MemorySession session) {
        return Load.ofAddress(Load$get(segment), session);
    }
    static final FunctionDescriptor Save$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Save$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.Save$FUNC
    );
    public interface Save {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2);
        static MemorySegment allocate(Save fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Save.class, fi, IPersistStorageVtbl.Save$FUNC, session);
        }
        static Save ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2) -> {
                try {
                    return (int)IPersistStorageVtbl.Save$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Save$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Save"));
    public static VarHandle Save$VH() {
        return IPersistStorageVtbl.Save$VH;
    }
    public static MemoryAddress Save$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.Save$VH.get(seg);
    }
    public static void Save$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.Save$VH.set(seg, x);
    }
    public static MemoryAddress Save$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.Save$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Save$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.Save$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Save Save (MemorySegment segment, MemorySession session) {
        return Save.ofAddress(Save$get(segment), session);
    }
    static final FunctionDescriptor SaveCompleted$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SaveCompleted$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.SaveCompleted$FUNC
    );
    public interface SaveCompleted {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SaveCompleted fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SaveCompleted.class, fi, IPersistStorageVtbl.SaveCompleted$FUNC, session);
        }
        static SaveCompleted ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistStorageVtbl.SaveCompleted$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SaveCompleted$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SaveCompleted"));
    public static VarHandle SaveCompleted$VH() {
        return IPersistStorageVtbl.SaveCompleted$VH;
    }
    public static MemoryAddress SaveCompleted$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.SaveCompleted$VH.get(seg);
    }
    public static void SaveCompleted$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.SaveCompleted$VH.set(seg, x);
    }
    public static MemoryAddress SaveCompleted$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.SaveCompleted$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SaveCompleted$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.SaveCompleted$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SaveCompleted SaveCompleted (MemorySegment segment, MemorySession session) {
        return SaveCompleted.ofAddress(SaveCompleted$get(segment), session);
    }
    static final FunctionDescriptor HandsOffStorage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HandsOffStorage$MH = RuntimeHelper.downcallHandle(
        IPersistStorageVtbl.HandsOffStorage$FUNC
    );
    public interface HandsOffStorage {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(HandsOffStorage fi, MemorySession session) {
            return RuntimeHelper.upcallStub(HandsOffStorage.class, fi, IPersistStorageVtbl.HandsOffStorage$FUNC, session);
        }
        static HandsOffStorage ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistStorageVtbl.HandsOffStorage$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle HandsOffStorage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HandsOffStorage"));
    public static VarHandle HandsOffStorage$VH() {
        return IPersistStorageVtbl.HandsOffStorage$VH;
    }
    public static MemoryAddress HandsOffStorage$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.HandsOffStorage$VH.get(seg);
    }
    public static void HandsOffStorage$set( MemorySegment seg, MemoryAddress x) {
        IPersistStorageVtbl.HandsOffStorage$VH.set(seg, x);
    }
    public static MemoryAddress HandsOffStorage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStorageVtbl.HandsOffStorage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HandsOffStorage$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStorageVtbl.HandsOffStorage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static HandsOffStorage HandsOffStorage (MemorySegment segment, MemorySession session) {
        return HandsOffStorage.ofAddress(HandsOffStorage$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


