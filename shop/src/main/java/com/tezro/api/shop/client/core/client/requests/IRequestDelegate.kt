package com.tezro.api.core.client.requests

interface IRequestDelegate <T, R> {
    fun notifySuccess(response: T)
    fun notifyError(error: R)
    fun setEnqueueBlock(enqueueBlock: () -> Unit): IRequestDelegate <T, R>
    fun setCancelBlock(cancelBlock: () -> Unit): IRequestDelegate <T, R>
}