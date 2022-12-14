// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IInternetSessionVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("RegisterNameSpace"),
        Constants$root.C_POINTER$LAYOUT.withName("UnregisterNameSpace"),
        Constants$root.C_POINTER$LAYOUT.withName("RegisterMimeFilter"),
        Constants$root.C_POINTER$LAYOUT.withName("UnregisterMimeFilter"),
        Constants$root.C_POINTER$LAYOUT.withName("CreateBinding"),
        Constants$root.C_POINTER$LAYOUT.withName("SetSessionOption"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSessionOption")
    ).withName("IInternetSessionVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetSessionVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetSessionVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInternetSessionVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetSessionVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetSessionVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetSessionVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetSessionVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetSessionVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetSessionVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetSessionVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor RegisterNameSpace$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterNameSpace$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.RegisterNameSpace$FUNC
    );
    public interface RegisterNameSpace {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, int _x4, java.lang.foreign.MemoryAddress _x5, int _x6);
        static MemorySegment allocate(RegisterNameSpace fi, MemorySession session) {
            return RuntimeHelper.upcallStub(RegisterNameSpace.class, fi, IInternetSessionVtbl.RegisterNameSpace$FUNC, session);
        }
        static RegisterNameSpace ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, int __x4, java.lang.foreign.MemoryAddress __x5, int __x6) -> {
                try {
                    return (int)IInternetSessionVtbl.RegisterNameSpace$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4, (java.lang.foreign.Addressable)__x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RegisterNameSpace$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegisterNameSpace"));
    public static VarHandle RegisterNameSpace$VH() {
        return IInternetSessionVtbl.RegisterNameSpace$VH;
    }
    public static MemoryAddress RegisterNameSpace$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.RegisterNameSpace$VH.get(seg);
    }
    public static void RegisterNameSpace$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.RegisterNameSpace$VH.set(seg, x);
    }
    public static MemoryAddress RegisterNameSpace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.RegisterNameSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegisterNameSpace$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.RegisterNameSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RegisterNameSpace RegisterNameSpace (MemorySegment segment, MemorySession session) {
        return RegisterNameSpace.ofAddress(RegisterNameSpace$get(segment), session);
    }
    static final FunctionDescriptor UnregisterNameSpace$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterNameSpace$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.UnregisterNameSpace$FUNC
    );
    public interface UnregisterNameSpace {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(UnregisterNameSpace fi, MemorySession session) {
            return RuntimeHelper.upcallStub(UnregisterNameSpace.class, fi, IInternetSessionVtbl.UnregisterNameSpace$FUNC, session);
        }
        static UnregisterNameSpace ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInternetSessionVtbl.UnregisterNameSpace$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnregisterNameSpace$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnregisterNameSpace"));
    public static VarHandle UnregisterNameSpace$VH() {
        return IInternetSessionVtbl.UnregisterNameSpace$VH;
    }
    public static MemoryAddress UnregisterNameSpace$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.UnregisterNameSpace$VH.get(seg);
    }
    public static void UnregisterNameSpace$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.UnregisterNameSpace$VH.set(seg, x);
    }
    public static MemoryAddress UnregisterNameSpace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.UnregisterNameSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnregisterNameSpace$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.UnregisterNameSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnregisterNameSpace UnregisterNameSpace (MemorySegment segment, MemorySession session) {
        return UnregisterNameSpace.ofAddress(UnregisterNameSpace$get(segment), session);
    }
    static final FunctionDescriptor RegisterMimeFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterMimeFilter$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.RegisterMimeFilter$FUNC
    );
    public interface RegisterMimeFilter {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(RegisterMimeFilter fi, MemorySession session) {
            return RuntimeHelper.upcallStub(RegisterMimeFilter.class, fi, IInternetSessionVtbl.RegisterMimeFilter$FUNC, session);
        }
        static RegisterMimeFilter ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IInternetSessionVtbl.RegisterMimeFilter$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RegisterMimeFilter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegisterMimeFilter"));
    public static VarHandle RegisterMimeFilter$VH() {
        return IInternetSessionVtbl.RegisterMimeFilter$VH;
    }
    public static MemoryAddress RegisterMimeFilter$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.RegisterMimeFilter$VH.get(seg);
    }
    public static void RegisterMimeFilter$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.RegisterMimeFilter$VH.set(seg, x);
    }
    public static MemoryAddress RegisterMimeFilter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.RegisterMimeFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegisterMimeFilter$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.RegisterMimeFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RegisterMimeFilter RegisterMimeFilter (MemorySegment segment, MemorySession session) {
        return RegisterMimeFilter.ofAddress(RegisterMimeFilter$get(segment), session);
    }
    static final FunctionDescriptor UnregisterMimeFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterMimeFilter$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.UnregisterMimeFilter$FUNC
    );
    public interface UnregisterMimeFilter {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(UnregisterMimeFilter fi, MemorySession session) {
            return RuntimeHelper.upcallStub(UnregisterMimeFilter.class, fi, IInternetSessionVtbl.UnregisterMimeFilter$FUNC, session);
        }
        static UnregisterMimeFilter ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInternetSessionVtbl.UnregisterMimeFilter$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnregisterMimeFilter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnregisterMimeFilter"));
    public static VarHandle UnregisterMimeFilter$VH() {
        return IInternetSessionVtbl.UnregisterMimeFilter$VH;
    }
    public static MemoryAddress UnregisterMimeFilter$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.UnregisterMimeFilter$VH.get(seg);
    }
    public static void UnregisterMimeFilter$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.UnregisterMimeFilter$VH.set(seg, x);
    }
    public static MemoryAddress UnregisterMimeFilter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.UnregisterMimeFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnregisterMimeFilter$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.UnregisterMimeFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnregisterMimeFilter UnregisterMimeFilter (MemorySegment segment, MemorySession session) {
        return UnregisterMimeFilter.ofAddress(UnregisterMimeFilter$get(segment), session);
    }
    static final FunctionDescriptor CreateBinding$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateBinding$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.CreateBinding$FUNC
    );
    public interface CreateBinding {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5, int _x6);
        static MemorySegment allocate(CreateBinding fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CreateBinding.class, fi, IInternetSessionVtbl.CreateBinding$FUNC, session);
        }
        static CreateBinding ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5, int __x6) -> {
                try {
                    return (int)IInternetSessionVtbl.CreateBinding$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateBinding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreateBinding"));
    public static VarHandle CreateBinding$VH() {
        return IInternetSessionVtbl.CreateBinding$VH;
    }
    public static MemoryAddress CreateBinding$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.CreateBinding$VH.get(seg);
    }
    public static void CreateBinding$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.CreateBinding$VH.set(seg, x);
    }
    public static MemoryAddress CreateBinding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.CreateBinding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateBinding$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.CreateBinding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateBinding CreateBinding (MemorySegment segment, MemorySession session) {
        return CreateBinding.ofAddress(CreateBinding$get(segment), session);
    }
    static final FunctionDescriptor SetSessionOption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSessionOption$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.SetSessionOption$FUNC
    );
    public interface SetSessionOption {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, int _x3, int _x4);
        static MemorySegment allocate(SetSessionOption fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetSessionOption.class, fi, IInternetSessionVtbl.SetSessionOption$FUNC, session);
        }
        static SetSessionOption ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, int __x3, int __x4) -> {
                try {
                    return (int)IInternetSessionVtbl.SetSessionOption$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetSessionOption$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetSessionOption"));
    public static VarHandle SetSessionOption$VH() {
        return IInternetSessionVtbl.SetSessionOption$VH;
    }
    public static MemoryAddress SetSessionOption$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.SetSessionOption$VH.get(seg);
    }
    public static void SetSessionOption$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.SetSessionOption$VH.set(seg, x);
    }
    public static MemoryAddress SetSessionOption$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.SetSessionOption$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetSessionOption$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.SetSessionOption$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetSessionOption SetSessionOption (MemorySegment segment, MemorySession session) {
        return SetSessionOption.ofAddress(SetSessionOption$get(segment), session);
    }
    static final FunctionDescriptor GetSessionOption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSessionOption$MH = RuntimeHelper.downcallHandle(
        IInternetSessionVtbl.GetSessionOption$FUNC
    );
    public interface GetSessionOption {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, int _x4);
        static MemorySegment allocate(GetSessionOption fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetSessionOption.class, fi, IInternetSessionVtbl.GetSessionOption$FUNC, session);
        }
        static GetSessionOption ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, int __x4) -> {
                try {
                    return (int)IInternetSessionVtbl.GetSessionOption$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSessionOption$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSessionOption"));
    public static VarHandle GetSessionOption$VH() {
        return IInternetSessionVtbl.GetSessionOption$VH;
    }
    public static MemoryAddress GetSessionOption$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.GetSessionOption$VH.get(seg);
    }
    public static void GetSessionOption$set( MemorySegment seg, MemoryAddress x) {
        IInternetSessionVtbl.GetSessionOption$VH.set(seg, x);
    }
    public static MemoryAddress GetSessionOption$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetSessionVtbl.GetSessionOption$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSessionOption$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetSessionVtbl.GetSessionOption$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSessionOption GetSessionOption (MemorySegment segment, MemorySession session) {
        return GetSessionOption.ofAddress(GetSessionOption$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


