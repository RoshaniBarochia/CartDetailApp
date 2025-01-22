package com.roshani.cartdetail.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BM\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u0006\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\nH\u0016J\u001e\u0010#\u001a\u00020\u00122\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000f\u00a8\u0006&"}, d2 = {"Lcom/roshani/cartdetail/adapters/CartSumChildAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/roshani/cartdetail/adapters/CartSumChildAdapter$MyViewHolder;", "productList", "Ljava/util/ArrayList;", "Lcom/roshani/cartdetail/model/Service;", "Lkotlin/collections/ArrayList;", "data", "", "price", "", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getPrice", "setPrice", "getProductList", "setProductList", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setList", "productListNew", "MyViewHolder", "app_debug"})
public final class CartSumChildAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.roshani.cartdetail.adapters.CartSumChildAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.roshani.cartdetail.model.Service> productList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.String> data;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.Integer> price;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick;
    
    public CartSumChildAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Service> productList, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> data, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> price) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.roshani.cartdetail.model.Service> getProductList() {
        return null;
    }
    
    public final void setProductList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Service> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.Integer> getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.roshani.cartdetail.adapters.CartSumChildAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.roshani.cartdetail.adapters.CartSumChildAdapter.MyViewHolder holder, int position) {
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Service> productListNew) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/roshani/cartdetail/adapters/CartSumChildAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/roshani/cartdetail/databinding/ItemCartBinding;", "(Lcom/roshani/cartdetail/databinding/ItemCartBinding;)V", "mBinding", "getMBinding", "()Lcom/roshani/cartdetail/databinding/ItemCartBinding;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable
        private final com.roshani.cartdetail.databinding.ItemCartBinding mBinding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.roshani.cartdetail.databinding.ItemCartBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.roshani.cartdetail.databinding.ItemCartBinding getMBinding() {
            return null;
        }
    }
}