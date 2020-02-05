/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.costmanagement.v2018_05_31.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SubscriptionDimensions.
 */
public class SubscriptionDimensionsInner {
    /** The Retrofit service to perform REST calls. */
    private SubscriptionDimensionsService service;
    /** The service client containing this operation class. */
    private CostManagementClientImpl client;

    /**
     * Initializes an instance of SubscriptionDimensionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionDimensionsInner(Retrofit retrofit, CostManagementClientImpl client) {
        this.service = retrofit.create(SubscriptionDimensionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionDimensions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SubscriptionDimensionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.costmanagement.v2018_05_31.SubscriptionDimensions list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.CostManagement/dimensions")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Query("$expand") String expand, @Query("$skiptoken") String skiptoken, @Query("$top") Integer top, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the dimensions by subscription Id.
     *
     * @return the PagedList<DimensionInner> object if successful.
     */
    public PagedList<DimensionInner> list() {
        PageImpl<DimensionInner> page = new PageImpl<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<DimensionInner>(page) {
            @Override
            public Page<DimensionInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Lists the dimensions by subscription Id.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DimensionInner>> listAsync(final ServiceCallback<List<DimensionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists the dimensions by subscription Id.
     *
     * @return the observable to the List&lt;DimensionInner&gt; object
     */
    public Observable<Page<DimensionInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<DimensionInner>>, Page<DimensionInner>>() {
            @Override
            public Page<DimensionInner> call(ServiceResponse<List<DimensionInner>> response) {
                PageImpl<DimensionInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Lists the dimensions by subscription Id.
     *
     * @return the observable to the List&lt;DimensionInner&gt; object
     */
    public Observable<ServiceResponse<List<DimensionInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), filter, expand, skiptoken, top, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DimensionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DimensionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DimensionInner>> result = listDelegate(response);
                        List<DimensionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DimensionInner>> clientResponse = new ServiceResponse<List<DimensionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the dimensions by subscription Id.
     *
     * @param filter May be used to filter dimensions by properties/category, properties/usageStart, properties/usageEnd. Supported operators are 'eq','lt', 'gt', 'le', 'ge'.
     * @param expand May be used to expand the properties/data within a dimension category. By default, data is not included when listing dimensions.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N dimension data.
     * @return the PagedList<DimensionInner> object if successful.
     */
    public PagedList<DimensionInner> list(String filter, String expand, String skiptoken, Integer top) {
        PageImpl<DimensionInner> page = new PageImpl<>();
        page.setItems(listWithServiceResponseAsync(filter, expand, skiptoken, top).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<DimensionInner>(page) {
            @Override
            public Page<DimensionInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Lists the dimensions by subscription Id.
     *
     * @param filter May be used to filter dimensions by properties/category, properties/usageStart, properties/usageEnd. Supported operators are 'eq','lt', 'gt', 'le', 'ge'.
     * @param expand May be used to expand the properties/data within a dimension category. By default, data is not included when listing dimensions.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N dimension data.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DimensionInner>> listAsync(String filter, String expand, String skiptoken, Integer top, final ServiceCallback<List<DimensionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(filter, expand, skiptoken, top), serviceCallback);
    }

    /**
     * Lists the dimensions by subscription Id.
     *
     * @param filter May be used to filter dimensions by properties/category, properties/usageStart, properties/usageEnd. Supported operators are 'eq','lt', 'gt', 'le', 'ge'.
     * @param expand May be used to expand the properties/data within a dimension category. By default, data is not included when listing dimensions.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N dimension data.
     * @return the observable to the List&lt;DimensionInner&gt; object
     */
    public Observable<Page<DimensionInner>> listAsync(String filter, String expand, String skiptoken, Integer top) {
        return listWithServiceResponseAsync(filter, expand, skiptoken, top).map(new Func1<ServiceResponse<List<DimensionInner>>, Page<DimensionInner>>() {
            @Override
            public Page<DimensionInner> call(ServiceResponse<List<DimensionInner>> response) {
                PageImpl<DimensionInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Lists the dimensions by subscription Id.
     *
     * @param filter May be used to filter dimensions by properties/category, properties/usageStart, properties/usageEnd. Supported operators are 'eq','lt', 'gt', 'le', 'ge'.
     * @param expand May be used to expand the properties/data within a dimension category. By default, data is not included when listing dimensions.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N dimension data.
     * @return the observable to the List&lt;DimensionInner&gt; object
     */
    public Observable<ServiceResponse<List<DimensionInner>>> listWithServiceResponseAsync(String filter, String expand, String skiptoken, Integer top) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), filter, expand, skiptoken, top, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DimensionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DimensionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DimensionInner>> result = listDelegate(response);
                        List<DimensionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DimensionInner>> clientResponse = new ServiceResponse<List<DimensionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DimensionInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DimensionInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DimensionInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}