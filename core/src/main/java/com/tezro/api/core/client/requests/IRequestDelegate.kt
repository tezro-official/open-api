package com.tezro.api.core.client.requests

import com.tezro.api.core.client.responses.Error

interface IRequestDelegate <T> {
    fun notifySuccess(response: T)
    fun notifyError(error: Error)
    fun setEnqueueBlock(enqueueBlock: () -> Unit): IRequestDelegate <T>
    fun setCancelBlock(cancelBlock: () -> Unit): IRequestDelegate <T>
}