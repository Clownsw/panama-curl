// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IPrintDialogCallbackVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("InitDone"),
        Constants$root.C_POINTER$LAYOUT.withName("SelectionChange"),
        Constants$root.C_POINTER$LAYOUT.withName("HandleMessage")
    ).withName("IPrintDialogCallbackVtbl");
    public static MemoryLayout $LAYOUT() {
        return IPrintDialogCallbackVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IPrintDialogCallbackVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IPrintDialogCallbackVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPrintDialogCallbackVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IPrintDialogCallbackVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogCallbackVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogCallbackVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IPrintDialogCallbackVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IPrintDialogCallbackVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPrintDialogCallbackVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IPrintDialogCallbackVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogCallbackVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogCallbackVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IPrintDialogCallbackVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IPrintDialogCallbackVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPrintDialogCallbackVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IPrintDialogCallbackVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogCallbackVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogCallbackVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor InitDone$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitDone$MH = RuntimeHelper.downcallHandle(
        IPrintDialogCallbackVtbl.InitDone$FUNC
    );
    public interface InitDone {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(InitDone fi, MemorySession session) {
            return RuntimeHelper.upcallStub(InitDone.class, fi, IPrintDialogCallbackVtbl.InitDone$FUNC, session);
        }
        static InitDone ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPrintDialogCallbackVtbl.InitDone$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle InitDone$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InitDone"));
    public static VarHandle InitDone$VH() {
        return IPrintDialogCallbackVtbl.InitDone$VH;
    }
    public static MemoryAddress InitDone$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.InitDone$VH.get(seg);
    }
    public static void InitDone$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogCallbackVtbl.InitDone$VH.set(seg, x);
    }
    public static MemoryAddress InitDone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.InitDone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InitDone$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogCallbackVtbl.InitDone$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static InitDone InitDone (MemorySegment segment, MemorySession session) {
        return InitDone.ofAddress(InitDone$get(segment), session);
    }
    static final FunctionDescriptor SelectionChange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SelectionChange$MH = RuntimeHelper.downcallHandle(
        IPrintDialogCallbackVtbl.SelectionChange$FUNC
    );
    public interface SelectionChange {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(SelectionChange fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SelectionChange.class, fi, IPrintDialogCallbackVtbl.SelectionChange$FUNC, session);
        }
        static SelectionChange ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPrintDialogCallbackVtbl.SelectionChange$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SelectionChange$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SelectionChange"));
    public static VarHandle SelectionChange$VH() {
        return IPrintDialogCallbackVtbl.SelectionChange$VH;
    }
    public static MemoryAddress SelectionChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.SelectionChange$VH.get(seg);
    }
    public static void SelectionChange$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogCallbackVtbl.SelectionChange$VH.set(seg, x);
    }
    public static MemoryAddress SelectionChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.SelectionChange$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SelectionChange$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogCallbackVtbl.SelectionChange$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SelectionChange SelectionChange (MemorySegment segment, MemorySession session) {
        return SelectionChange.ofAddress(SelectionChange$get(segment), session);
    }
    static final FunctionDescriptor HandleMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HandleMessage$MH = RuntimeHelper.downcallHandle(
        IPrintDialogCallbackVtbl.HandleMessage$FUNC
    );
    public interface HandleMessage {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, long _x3, long _x4, java.lang.foreign.MemoryAddress _x5);
        static MemorySegment allocate(HandleMessage fi, MemorySession session) {
            return RuntimeHelper.upcallStub(HandleMessage.class, fi, IPrintDialogCallbackVtbl.HandleMessage$FUNC, session);
        }
        static HandleMessage ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, long __x3, long __x4, java.lang.foreign.MemoryAddress __x5) -> {
                try {
                    return (int)IPrintDialogCallbackVtbl.HandleMessage$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, __x4, (java.lang.foreign.Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle HandleMessage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HandleMessage"));
    public static VarHandle HandleMessage$VH() {
        return IPrintDialogCallbackVtbl.HandleMessage$VH;
    }
    public static MemoryAddress HandleMessage$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.HandleMessage$VH.get(seg);
    }
    public static void HandleMessage$set( MemorySegment seg, MemoryAddress x) {
        IPrintDialogCallbackVtbl.HandleMessage$VH.set(seg, x);
    }
    public static MemoryAddress HandleMessage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPrintDialogCallbackVtbl.HandleMessage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HandleMessage$set(MemorySegment seg, long index, MemoryAddress x) {
        IPrintDialogCallbackVtbl.HandleMessage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static HandleMessage HandleMessage (MemorySegment segment, MemorySession session) {
        return HandleMessage.ofAddress(HandleMessage$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


