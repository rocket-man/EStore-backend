package com.estore.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication /*
						 * (exclude = { AzureTokenCredentialAutoConfiguration.class,
						 * ReactiveCommonsClientAutoConfiguration.class,
						 * SimpleDiscoveryClientAutoConfiguration.class,
						 * CommonsClientAutoConfiguration.class, HttpClientConfiguration.class,
						 * CommonsConfigAutoConfiguration.class,
						 * DiscoveryClientOptionalArgsConfiguration.class,
						 * AzureGlobalPropertiesAutoConfiguration.class,
						 * LoadBalancerDefaultMappingsProviderAutoConfiguration.class,
						 * CompositeDiscoveryClientAutoConfiguration.class,
						 * ServiceRegistryAutoConfiguration.class,
						 * LifecycleMvcEndpointAutoConfiguration.class,
						 * GatewayClassPathWarningAutoConfiguration.class,
						 * GatewayAutoConfiguration.class })
						 */
public class EStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EStoreApplication.class, args);
	}

	/*
	 * 
	 * org.springframework.boot.autoconfigure.context.
	 * ConfigurationPropertiesAutoConfiguration
	 * 
	 * com.azure.spring.cloud.autoconfigure.context.
	 * AzureTokenCredentialAutoConfiguration
	 * 
	 * org.springframework.cloud.client.ReactiveCommonsClientAutoConfiguration
	 * 
	 * org.springframework.boot.actuate.autoconfigure.availability.
	 * AvailabilityHealthContributorAutoConfiguration
	 * 
	 * org.springframework.boot.actuate.autoconfigure.info.
	 * InfoContributorAutoConfiguration
	 * 
	 * org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
	 * 
	 * org.springframework.cloud.client.discovery.simple.
	 * SimpleDiscoveryClientAutoConfiguration
	 * 
	 * org.springframework.boot.autoconfigure.context.
	 * PropertyPlaceholderAutoConfiguration
	 * 
	 * org.springframework.cloud.client.CommonsClientAutoConfiguration
	 * 
	 * org.springframework.boot.actuate.autoconfigure.metrics.integration.
	 * IntegrationMetricsAutoConfiguration
	 * 
	 * org.springframework.cloud.commons.httpclient.HttpClientConfiguration
	 * 
	 * org.springframework.boot.actuate.autoconfigure.endpoint.
	 * EndpointAutoConfiguration
	 * 
	 * org.springframework.cloud.commons.config.CommonsConfigAutoConfiguration
	 * 
	 * org.springframework.cloud.netflix.eureka.config.
	 * DiscoveryClientOptionalArgsConfiguration
	 * 
	 * com.azure.spring.cloud.autoconfigure.context.
	 * AzureGlobalPropertiesAutoConfiguration
	 * 
	 * org.springframework.boot.actuate.autoconfigure.web.server.
	 * ManagementContextAutoConfiguration
	 * 
	 * org.springframework.cloud.client.loadbalancer.
	 * LoadBalancerDefaultMappingsProviderAutoConfiguration
	 * 
	 * org.springframework.cloud.client.discovery.composite.
	 * CompositeDiscoveryClientAutoConfiguration
	 * 
	 * org.springframework.boot.actuate.autoconfigure.health.
	 * HealthContributorAutoConfiguration
	 * 
	 * org.springframework.cloud.client.serviceregistry.
	 * ServiceRegistryAutoConfiguration
	 * 
	 * org.springframework.cloud.autoconfigure.LifecycleMvcEndpointAutoConfiguration
	 * 
	 * org.springframework.boot.autoconfigure.availability.
	 * ApplicationAvailabilityAutoConfiguration
	 * 
	 * org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
	 */

}
