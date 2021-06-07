package com.tezro.api.shop.providers

import com.tezro.api.shop.service.IShopService
import java.lang.IllegalStateException
import kotlin.properties.Delegates


/**
 * Tezro shop main class.
 * Used to create different components for working with shops.
 *
 * @see IShopService
 */
object Shop {


    /**
     * Creates a new instance of shop service.
     *
     * Note: All components used by shop service are unique. Each time you create a new service
     * instance, these components will be created as well.
     *
     * For better performance, keep a single instance of this service through the life cycle of your app.
     * Note that shop service does not keep any states and it's developer's responsibility to cancel
     * and manage requests through the lifecycle of the app.
     *
     * The reason that singleton instance management is not handled by this library is because
     * different apps have different requirements. Also, this allows users to create and use different
     * services with different parameters.
     *
     * @param keyId Retrieve from credentials in Tezro app
     * @param secret Retrieve from credentials in Tezro app, not providing secret will disable
     * some of the requests
     * @param isTestMode Uses test service mode
     *
     * @return Returns a new instance of shop service
     *
     * @see IShopService
     */
    @JvmStatic
    fun initShopService(keyId: String, secret: String?, isTestMode: Boolean): IShopService
        = ServiceProviders.provideNewShopService(
            keyId,
            secret,
            isTestMode
        )

}