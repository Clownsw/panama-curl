// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IAdviseSinkVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("OnDataChange"),
        Constants$root.C_POINTER$LAYOUT.withName("OnViewChange"),
        Constants$root.C_POINTER$LAYOUT.withName("OnRename"),
        Constants$root.C_POINTER$LAYOUT.withName("OnSave"),
        Constants$root.C_POINTER$LAYOUT.withName("OnClose")
    ).withName("IAdviseSinkVtbl");
    public static MemoryLayout $LAYOUT() {
        return IAdviseSinkVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IAdviseSinkVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IAdviseSinkVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IAdviseSinkVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IAdviseSinkVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IAdviseSinkVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IAdviseSinkVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IAdviseSinkVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IAdviseSinkVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IAdviseSinkVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IAdviseSinkVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IAdviseSinkVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IAdviseSinkVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IAdviseSinkVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IAdviseSinkVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IAdviseSinkVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IAdviseSinkVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IAdviseSinkVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IAdviseSinkVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor OnDataChange$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnDataChange$MH = RuntimeHelper.downcallHandle(
        IAdviseSinkVtbl.OnDataChange$FUNC
    );
    public interface OnDataChange {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(OnDataChange fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnDataChange.class, fi, IAdviseSinkVtbl.OnDataChange$FUNC, session);
        }
        static OnDataChange ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    IAdviseSinkVtbl.OnDataChange$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnDataChange$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnDataChange"));
    public static VarHandle OnDataChange$VH() {
        return IAdviseSinkVtbl.OnDataChange$VH;
    }
    public static MemoryAddress OnDataChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnDataChange$VH.get(seg);
    }
    public static void OnDataChange$set( MemorySegment seg, MemoryAddress x) {
        IAdviseSinkVtbl.OnDataChange$VH.set(seg, x);
    }
    public static MemoryAddress OnDataChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnDataChange$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnDataChange$set(MemorySegment seg, long index, MemoryAddress x) {
        IAdviseSinkVtbl.OnDataChange$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnDataChange OnDataChange (MemorySegment segment, MemorySession session) {
        return OnDataChange.ofAddress(OnDataChange$get(segment), session);
    }
    static final FunctionDescriptor OnViewChange$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OnViewChange$MH = RuntimeHelper.downcallHandle(
        IAdviseSinkVtbl.OnViewChange$FUNC
    );
    public interface OnViewChange {

        void apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2);
        static MemorySegment allocate(OnViewChange fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnViewChange.class, fi, IAdviseSinkVtbl.OnViewChange$FUNC, session);
        }
        static OnViewChange ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2) -> {
                try {
                    IAdviseSinkVtbl.OnViewChange$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnViewChange$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnViewChange"));
    public static VarHandle OnViewChange$VH() {
        return IAdviseSinkVtbl.OnViewChange$VH;
    }
    public static MemoryAddress OnViewChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnViewChange$VH.get(seg);
    }
    public static void OnViewChange$set( MemorySegment seg, MemoryAddress x) {
        IAdviseSinkVtbl.OnViewChange$VH.set(seg, x);
    }
    public static MemoryAddress OnViewChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnViewChange$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnViewChange$set(MemorySegment seg, long index, MemoryAddress x) {
        IAdviseSinkVtbl.OnViewChange$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnViewChange OnViewChange (MemorySegment segment, MemorySession session) {
        return OnViewChange.ofAddress(OnViewChange$get(segment), session);
    }
    static final FunctionDescriptor OnRename$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnRename$MH = RuntimeHelper.downcallHandle(
        IAdviseSinkVtbl.OnRename$FUNC
    );
    public interface OnRename {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(OnRename fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnRename.class, fi, IAdviseSinkVtbl.OnRename$FUNC, session);
        }
        static OnRename ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    IAdviseSinkVtbl.OnRename$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnRename$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnRename"));
    public static VarHandle OnRename$VH() {
        return IAdviseSinkVtbl.OnRename$VH;
    }
    public static MemoryAddress OnRename$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnRename$VH.get(seg);
    }
    public static void OnRename$set( MemorySegment seg, MemoryAddress x) {
        IAdviseSinkVtbl.OnRename$VH.set(seg, x);
    }
    public static MemoryAddress OnRename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnRename$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnRename$set(MemorySegment seg, long index, MemoryAddress x) {
        IAdviseSinkVtbl.OnRename$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnRename OnRename (MemorySegment segment, MemorySession session) {
        return OnRename.ofAddress(OnRename$get(segment), session);
    }
    static final FunctionDescriptor OnSave$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnSave$MH = RuntimeHelper.downcallHandle(
        IAdviseSinkVtbl.OnSave$FUNC
    );
    public interface OnSave {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(OnSave fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnSave.class, fi, IAdviseSinkVtbl.OnSave$FUNC, session);
        }
        static OnSave ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    IAdviseSinkVtbl.OnSave$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnSave$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnSave"));
    public static VarHandle OnSave$VH() {
        return IAdviseSinkVtbl.OnSave$VH;
    }
    public static MemoryAddress OnSave$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnSave$VH.get(seg);
    }
    public static void OnSave$set( MemorySegment seg, MemoryAddress x) {
        IAdviseSinkVtbl.OnSave$VH.set(seg, x);
    }
    public static MemoryAddress OnSave$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnSave$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnSave$set(MemorySegment seg, long index, MemoryAddress x) {
        IAdviseSinkVtbl.OnSave$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnSave OnSave (MemorySegment segment, MemorySession session) {
        return OnSave.ofAddress(OnSave$get(segment), session);
    }
    static final FunctionDescriptor OnClose$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OnClose$MH = RuntimeHelper.downcallHandle(
        IAdviseSinkVtbl.OnClose$FUNC
    );
    public interface OnClose {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(OnClose fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnClose.class, fi, IAdviseSinkVtbl.OnClose$FUNC, session);
        }
        static OnClose ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    IAdviseSinkVtbl.OnClose$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnClose$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnClose"));
    public static VarHandle OnClose$VH() {
        return IAdviseSinkVtbl.OnClose$VH;
    }
    public static MemoryAddress OnClose$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnClose$VH.get(seg);
    }
    public static void OnClose$set( MemorySegment seg, MemoryAddress x) {
        IAdviseSinkVtbl.OnClose$VH.set(seg, x);
    }
    public static MemoryAddress OnClose$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAdviseSinkVtbl.OnClose$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnClose$set(MemorySegment seg, long index, MemoryAddress x) {
        IAdviseSinkVtbl.OnClose$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnClose OnClose (MemorySegment segment, MemorySession session) {
        return OnClose.ofAddress(OnClose$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


