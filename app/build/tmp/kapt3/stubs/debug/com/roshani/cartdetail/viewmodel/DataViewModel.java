package com.roshani.cartdetail.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\n8F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/roshani/cartdetail/viewmodel/DataViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/roshani/cartdetail/repository/ApiRepository;", "(Lcom/roshani/cartdetail/repository/ApiRepository;)V", "_cCartItem", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Result;", "Lcom/roshani/cartdetail/model/CartItem;", "cartItem", "Landroidx/lifecycle/LiveData;", "getCartItem", "()Landroidx/lifecycle/LiveData;", "getApiData", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DataViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.roshani.cartdetail.repository.ApiRepository authRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kotlin.Result<com.roshani.cartdetail.model.CartItem>> _cCartItem = null;
    
    @javax.inject.Inject
    public DataViewModel(@org.jetbrains.annotations.NotNull
    com.roshani.cartdetail.repository.ApiRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlin.Result<com.roshani.cartdetail.model.CartItem>> getCartItem() {
        return null;
    }
    
    public final void getApiData() {
    }
}