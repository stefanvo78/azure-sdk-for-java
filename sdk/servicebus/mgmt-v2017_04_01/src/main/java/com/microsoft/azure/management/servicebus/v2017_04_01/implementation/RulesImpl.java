/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicebus.v2017_04_01.Rules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.servicebus.v2017_04_01.Rule;

class RulesImpl extends WrapperImpl<RulesInner> implements Rules {
    private final ServiceBusManager manager;

    RulesImpl(ServiceBusManager manager) {
        super(manager.inner().rules());
        this.manager = manager;
    }

    public ServiceBusManager manager() {
        return this.manager;
    }

    @Override
    public RuleImpl define(String name) {
        return wrapModel(name);
    }

    private RuleImpl wrapModel(RuleInner inner) {
        return  new RuleImpl(inner, manager());
    }

    private RuleImpl wrapModel(String name) {
        return new RuleImpl(name, this.manager());
    }

    @Override
    public Observable<Rule> listBySubscriptionsAsync(final String resourceGroupName, final String namespaceName, final String topicName, final String subscriptionName) {
        RulesInner client = this.inner();
        return client.listBySubscriptionsAsync(resourceGroupName, namespaceName, topicName, subscriptionName)
        .flatMapIterable(new Func1<Page<RuleInner>, Iterable<RuleInner>>() {
            @Override
            public Iterable<RuleInner> call(Page<RuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RuleInner, Rule>() {
            @Override
            public Rule call(RuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Rule> getAsync(String resourceGroupName, String namespaceName, String topicName, String subscriptionName, String ruleName) {
        RulesInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName)
        .map(new Func1<RuleInner, Rule>() {
            @Override
            public Rule call(RuleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName, String topicName, String subscriptionName, String ruleName) {
        RulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName).toCompletable();
    }

}