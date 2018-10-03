/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.codahale.metrics.MetricRegistry;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.dropwizard.DropwizardExports;
import io.prometheus.client.hotspot.MemoryPoolsExports;
import io.prometheus.client.hotspot.StandardExports;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;

/**
 * The Class PrometheusConfig.
 */
@Configuration
@EnablePrometheusEndpoint
public class PrometheusConfig {
	
	/** The dropwizard metric registry. */
	@Autowired
	  private MetricRegistry dropwizardMetricRegistry;
	
	/**
	 * Instantiates a new prometheus config.
	 *
	 * @param dropwizardMetricRegistry the dropwizard metric registry
	 */
	public PrometheusConfig(MetricRegistry dropwizardMetricRegistry) {
		this.dropwizardMetricRegistry = dropwizardMetricRegistry;
	}
	
	/**
	 * Register prometheus collectors.
	 */
	@PostConstruct
	  public void registerPrometheusCollectors() {
	    CollectorRegistry.defaultRegistry.clear();
	    new StandardExports().register();
	    new MemoryPoolsExports().register();
	    new DropwizardExports(dropwizardMetricRegistry).register();
	  }

	}
