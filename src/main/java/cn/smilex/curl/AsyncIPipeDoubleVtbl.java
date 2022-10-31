// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class AsyncIPipeDoubleVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Begin_Pull"),
        Constants$root.C_POINTER$LAYOUT.withName("Finish_Pull"),
        Constants$root.C_POINTER$LAYOUT.withName("Begin_Push"),
        Constants$root.C_POINTER$LAYOUT.withName("Finish_Push")
    ).withName("AsyncIPipeDoubleVtbl");
    public static MemoryLayout $LAYOUT() {
        return AsyncIPipeDoubleVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        AsyncIPipeDoubleVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, AsyncIPipeDoubleVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)AsyncIPipeDoubleVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return AsyncIPipeDoubleVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        AsyncIPipeDoubleVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, AsyncIPipeDoubleVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)AsyncIPipeDoubleVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return AsyncIPipeDoubleVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        AsyncIPipeDoubleVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, AsyncIPipeDoubleVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)AsyncIPipeDoubleVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return AsyncIPipeDoubleVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Begin_Pull$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Begin_Pull$MH = RuntimeHelper.downcallHandle(
        AsyncIPipeDoubleVtbl.Begin_Pull$FUNC
    );
    public interface Begin_Pull {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(Begin_Pull fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Begin_Pull.class, fi, AsyncIPipeDoubleVtbl.Begin_Pull$FUNC, session);
        }
        static Begin_Pull ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)AsyncIPipeDoubleVtbl.Begin_Pull$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Begin_Pull$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Begin_Pull"));
    public static VarHandle Begin_Pull$VH() {
        return AsyncIPipeDoubleVtbl.Begin_Pull$VH;
    }
    public static MemoryAddress Begin_Pull$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Begin_Pull$VH.get(seg);
    }
    public static void Begin_Pull$set( MemorySegment seg, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Begin_Pull$VH.set(seg, x);
    }
    public static MemoryAddress Begin_Pull$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Begin_Pull$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_Pull$set(MemorySegment seg, long index, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Begin_Pull$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_Pull Begin_Pull (MemorySegment segment, MemorySession session) {
        return Begin_Pull.ofAddress(Begin_Pull$get(segment), session);
    }
    static final FunctionDescriptor Finish_Pull$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Finish_Pull$MH = RuntimeHelper.downcallHandle(
        AsyncIPipeDoubleVtbl.Finish_Pull$FUNC
    );
    public interface Finish_Pull {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(Finish_Pull fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Finish_Pull.class, fi, AsyncIPipeDoubleVtbl.Finish_Pull$FUNC, session);
        }
        static Finish_Pull ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)AsyncIPipeDoubleVtbl.Finish_Pull$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Finish_Pull$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Finish_Pull"));
    public static VarHandle Finish_Pull$VH() {
        return AsyncIPipeDoubleVtbl.Finish_Pull$VH;
    }
    public static MemoryAddress Finish_Pull$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Finish_Pull$VH.get(seg);
    }
    public static void Finish_Pull$set( MemorySegment seg, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Finish_Pull$VH.set(seg, x);
    }
    public static MemoryAddress Finish_Pull$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Finish_Pull$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_Pull$set(MemorySegment seg, long index, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Finish_Pull$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_Pull Finish_Pull (MemorySegment segment, MemorySession session) {
        return Finish_Pull.ofAddress(Finish_Pull$get(segment), session);
    }
    static final FunctionDescriptor Begin_Push$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Begin_Push$MH = RuntimeHelper.downcallHandle(
        AsyncIPipeDoubleVtbl.Begin_Push$FUNC
    );
    public interface Begin_Push {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2);
        static MemorySegment allocate(Begin_Push fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Begin_Push.class, fi, AsyncIPipeDoubleVtbl.Begin_Push$FUNC, session);
        }
        static Begin_Push ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2) -> {
                try {
                    return (int)AsyncIPipeDoubleVtbl.Begin_Push$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Begin_Push$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Begin_Push"));
    public static VarHandle Begin_Push$VH() {
        return AsyncIPipeDoubleVtbl.Begin_Push$VH;
    }
    public static MemoryAddress Begin_Push$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Begin_Push$VH.get(seg);
    }
    public static void Begin_Push$set( MemorySegment seg, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Begin_Push$VH.set(seg, x);
    }
    public static MemoryAddress Begin_Push$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Begin_Push$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_Push$set(MemorySegment seg, long index, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Begin_Push$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_Push Begin_Push (MemorySegment segment, MemorySession session) {
        return Begin_Push.ofAddress(Begin_Push$get(segment), session);
    }
    static final FunctionDescriptor Finish_Push$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Finish_Push$MH = RuntimeHelper.downcallHandle(
        AsyncIPipeDoubleVtbl.Finish_Push$FUNC
    );
    public interface Finish_Push {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Finish_Push fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Finish_Push.class, fi, AsyncIPipeDoubleVtbl.Finish_Push$FUNC, session);
        }
        static Finish_Push ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)AsyncIPipeDoubleVtbl.Finish_Push$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Finish_Push$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Finish_Push"));
    public static VarHandle Finish_Push$VH() {
        return AsyncIPipeDoubleVtbl.Finish_Push$VH;
    }
    public static MemoryAddress Finish_Push$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Finish_Push$VH.get(seg);
    }
    public static void Finish_Push$set( MemorySegment seg, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Finish_Push$VH.set(seg, x);
    }
    public static MemoryAddress Finish_Push$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)AsyncIPipeDoubleVtbl.Finish_Push$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_Push$set(MemorySegment seg, long index, MemoryAddress x) {
        AsyncIPipeDoubleVtbl.Finish_Push$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_Push Finish_Push (MemorySegment segment, MemorySession session) {
        return Finish_Push.ofAddress(Finish_Push$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


