package com.tezro.api.core.service.core

abstract class Service : IService {

    protected open val cancelBlocks by lazy {
        ArrayList<() -> Unit>()
    }

    override fun cancelAllRequests() {
        cancelBlocks.removeAll { cancelableBlock ->
            cancelableBlock.invoke()
            return@removeAll true
        }
    }

    protected open fun addCancelBlock(cancelBlock: () -> Unit) {
        cancelBlocks.add(cancelBlock)
    }

}