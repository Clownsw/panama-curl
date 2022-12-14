// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IOleItemContainerVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("ParseDisplayName"),
        Constants$root.C_POINTER$LAYOUT.withName("EnumObjects"),
        Constants$root.C_POINTER$LAYOUT.withName("LockContainer"),
        Constants$root.C_POINTER$LAYOUT.withName("GetObjectA"),
        Constants$root.C_POINTER$LAYOUT.withName("GetObjectStorage"),
        Constants$root.C_POINTER$LAYOUT.withName("IsRunning")
    ).withName("IOleItemContainerVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleItemContainerVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleItemContainerVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleItemContainerVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IOleItemContainerVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleItemContainerVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleItemContainerVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IOleItemContainerVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleItemContainerVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleItemContainerVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IOleItemContainerVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor ParseDisplayName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ParseDisplayName$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.ParseDisplayName$FUNC
    );
    public interface ParseDisplayName {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(ParseDisplayName fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ParseDisplayName.class, fi, IOleItemContainerVtbl.ParseDisplayName$FUNC, session);
        }
        static ParseDisplayName ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IOleItemContainerVtbl.ParseDisplayName$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ParseDisplayName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParseDisplayName"));
    public static VarHandle ParseDisplayName$VH() {
        return IOleItemContainerVtbl.ParseDisplayName$VH;
    }
    public static MemoryAddress ParseDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.ParseDisplayName$VH.get(seg);
    }
    public static void ParseDisplayName$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.ParseDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress ParseDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.ParseDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParseDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.ParseDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ParseDisplayName ParseDisplayName (MemorySegment segment, MemorySession session) {
        return ParseDisplayName.ofAddress(ParseDisplayName$get(segment), session);
    }
    static final FunctionDescriptor EnumObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumObjects$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.EnumObjects$FUNC
    );
    public interface EnumObjects {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(EnumObjects fi, MemorySession session) {
            return RuntimeHelper.upcallStub(EnumObjects.class, fi, IOleItemContainerVtbl.EnumObjects$FUNC, session);
        }
        static EnumObjects ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleItemContainerVtbl.EnumObjects$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumObjects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnumObjects"));
    public static VarHandle EnumObjects$VH() {
        return IOleItemContainerVtbl.EnumObjects$VH;
    }
    public static MemoryAddress EnumObjects$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.EnumObjects$VH.get(seg);
    }
    public static void EnumObjects$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.EnumObjects$VH.set(seg, x);
    }
    public static MemoryAddress EnumObjects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.EnumObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumObjects$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.EnumObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumObjects EnumObjects (MemorySegment segment, MemorySession session) {
        return EnumObjects.ofAddress(EnumObjects$get(segment), session);
    }
    static final FunctionDescriptor LockContainer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LockContainer$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.LockContainer$FUNC
    );
    public interface LockContainer {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(LockContainer fi, MemorySession session) {
            return RuntimeHelper.upcallStub(LockContainer.class, fi, IOleItemContainerVtbl.LockContainer$FUNC, session);
        }
        static LockContainer ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IOleItemContainerVtbl.LockContainer$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle LockContainer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LockContainer"));
    public static VarHandle LockContainer$VH() {
        return IOleItemContainerVtbl.LockContainer$VH;
    }
    public static MemoryAddress LockContainer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.LockContainer$VH.get(seg);
    }
    public static void LockContainer$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.LockContainer$VH.set(seg, x);
    }
    public static MemoryAddress LockContainer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.LockContainer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockContainer$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.LockContainer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LockContainer LockContainer (MemorySegment segment, MemorySession session) {
        return LockContainer.ofAddress(LockContainer$get(segment), session);
    }
    static final FunctionDescriptor GetObjectA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectA$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.GetObjectA$FUNC
    );
    public interface GetObjectA {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5);
        static MemorySegment allocate(GetObjectA fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetObjectA.class, fi, IOleItemContainerVtbl.GetObjectA$FUNC, session);
        }
        static GetObjectA ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5) -> {
                try {
                    return (int)IOleItemContainerVtbl.GetObjectA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetObjectA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetObjectA"));
    public static VarHandle GetObjectA$VH() {
        return IOleItemContainerVtbl.GetObjectA$VH;
    }
    public static MemoryAddress GetObjectA$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.GetObjectA$VH.get(seg);
    }
    public static void GetObjectA$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.GetObjectA$VH.set(seg, x);
    }
    public static MemoryAddress GetObjectA$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.GetObjectA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetObjectA$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.GetObjectA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetObjectA GetObjectA (MemorySegment segment, MemorySession session) {
        return GetObjectA.ofAddress(GetObjectA$get(segment), session);
    }
    static final FunctionDescriptor GetObjectStorage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetObjectStorage$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.GetObjectStorage$FUNC
    );
    public interface GetObjectStorage {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(GetObjectStorage fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetObjectStorage.class, fi, IOleItemContainerVtbl.GetObjectStorage$FUNC, session);
        }
        static GetObjectStorage ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IOleItemContainerVtbl.GetObjectStorage$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetObjectStorage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetObjectStorage"));
    public static VarHandle GetObjectStorage$VH() {
        return IOleItemContainerVtbl.GetObjectStorage$VH;
    }
    public static MemoryAddress GetObjectStorage$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.GetObjectStorage$VH.get(seg);
    }
    public static void GetObjectStorage$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.GetObjectStorage$VH.set(seg, x);
    }
    public static MemoryAddress GetObjectStorage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.GetObjectStorage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetObjectStorage$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.GetObjectStorage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetObjectStorage GetObjectStorage (MemorySegment segment, MemorySession session) {
        return GetObjectStorage.ofAddress(GetObjectStorage$get(segment), session);
    }
    static final FunctionDescriptor IsRunning$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsRunning$MH = RuntimeHelper.downcallHandle(
        IOleItemContainerVtbl.IsRunning$FUNC
    );
    public interface IsRunning {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(IsRunning fi, MemorySession session) {
            return RuntimeHelper.upcallStub(IsRunning.class, fi, IOleItemContainerVtbl.IsRunning$FUNC, session);
        }
        static IsRunning ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleItemContainerVtbl.IsRunning$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsRunning$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsRunning"));
    public static VarHandle IsRunning$VH() {
        return IOleItemContainerVtbl.IsRunning$VH;
    }
    public static MemoryAddress IsRunning$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.IsRunning$VH.get(seg);
    }
    public static void IsRunning$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.IsRunning$VH.set(seg, x);
    }
    public static MemoryAddress IsRunning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleItemContainerVtbl.IsRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsRunning$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.IsRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsRunning IsRunning (MemorySegment segment, MemorySession session) {
        return IsRunning.ofAddress(IsRunning$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


